package de.lisp_unleashed.sceme.interpreter
import de.lisp_unleashed.sceme.interpreter.interpreter.Op
import de.lisp_unleashed.sceme.parser.{ Location, SourceMapper }
import de.lisp_unleashed.sceme.printer.{ Configuration, DefaultPrinter }
import de.lisp_unleashed.sceme.sexp.Expression._
import de.lisp_unleashed.sceme.sexp.Value.{ Callable, Procedure }
import de.lisp_unleashed.sceme.sexp._
import de.lisp_unleashed.sceme.{ Parser, Printer }
import zio.ZIO

import scala.util.Try

/**
 * This is the most simple of the execution schemes, the direct interpretation.
 * The interpreter executes the expression tree as it's read. Technically
 * it transforms it into ZIO actions but hat that's really a detail.
 * We could also have just directly translated to imperative scala.
 */
class ZIOInterpreter(printer: Printer, sourceMapper: Option[SourceMapper]) {
  private def eval(datum: Expression): Op[Value] =
    datum match {
      case Literal(v)                           => opValue(v)
      case Variable(v)                          => opReference(v)
      case ProcedureCall(operator, operands)    => opApply(operator, operands)
      case Lambda(formals, body, loc)           => obLambda(formals, body, loc)
      case Quote(v, _)                          => opValue(v)
      case Begin(exprs, _)                      => opSequence(exprs)
      case If(test, consequent, alternative, _) => opIf(test, consequent, alternative)
      case Set(Variable(sym), value, _)         => opSet(sym, value)
      case e                                    => opError("UnsupportedExpr", s"The expression ${e} is not yet supported", e.location)
    }

  @inline private def opValue[T](t: T): Op[T] = ZIO.succeed(t)

  @inline private def opError[T](kind: String, message: String, location: Option[Location]): Op[T] =
    ZIO.fail(new RuntimeError(kind, message, location, sourceMapper))

  @inline private def opError[T](runtimeError: RuntimeError): Op[T] = ZIO.fail(runtimeError)

  @inline private def opSequence(exprs: Seq[Expression]): Op[Value] = ZIO.collectAll(exprs.map(eval)).map(_.last)

  private def opReference(sym: Value.Symbol): Op[Value] =
    ZIO.accessM[Context] { runtime =>
      runtime.currentEnvironment.get(sym) match {
        case Some(v) => opValue(v)
        case None    => opError(new UnboundVariableError(sym, sourceMapper))
      }
    }

  private def opSet(variable: Value.Symbol, expr: Expression): Op[Value] =
    ZIO.accessM[Context] { ctx =>
      val env = ctx.currentEnvironment.find(variable).getOrElse(ctx.currentEnvironment)

      for {
        value <- eval(expr)
      } yield {
        env.set(variable, value)
        value
      }
    }

  private def opIf(test: Expression, consequent: Expression, alternative: Expression): Op[Value] =
    eval(test).flatMap {
      case Value.Boolean(false, _) => eval(alternative)
      case _                       => eval(consequent)
    }

  private def opApply(operator: Expression, operands: Vector[Expression]): Op[Value] =
    for {
      proc   <- evalOperator(operator)
      args   <- evalArguments(operands)
      result <- applyCallable(proc, args)
    } yield result

  private def evalOperator(operator: Expression): Op[Callable] =
    eval(operator).flatMap {
      case v: Callable => opValue(v)
      case v =>
        opError(
          new ArgumentError(
            s"Expected #<procedure> in operator position but got ${printer.print(v)}",
            v.location,
            sourceMapper
          )
        )
    }

  private def evalArguments(data: Seq[Expression]): Op[Seq[Value]] = ZIO.collectAll(data.map(eval))

  private def applyCallable(callable: Value.Callable, args: Seq[Value]): Op[Value] = callable match {
    case f: Value.ForeignLambda @unchecked => ZIO.fromTry(Try(f.call(args)))
    case f: Value.Procedure[Op] @unchecked if f.formals.size == args.size =>
      val bindings = f.formals.zip(args)
      ZIO.access[Context](_.extendEnvironment(bindings)).bracket(ctx => ZIO.succeed(ctx.shrinkEnvironment())) { ctx =>
        f.action.provide(ctx)
      }
    case f: Value.Procedure[Op] @unchecked =>
      opError(new ArityError(Fixed(f.formals.size), args.size, f.location, sourceMapper))

  }

  private def obLambda(
    formals: Seq[Variable],
    body: Seq[Expression],
    location: Option[Location]
  ): Op[Callable] =
    opValue(Procedure(formals.map(_.name), eval(Begin(body, None)), location))

}

object ZIOInterpreter {
  private val parser  = Parser.default
  private val printer = new DefaultPrinter(Configuration.default)

  def interpret[T](source: String, sourceId: String, context: Context): ZIO[T, Throwable, Value] =
    for {
      (exprs, sm) <- ZIO.fromTry(parser.parse(source, sourceId))
      result      <- new ZIOInterpreter(printer, Some(sm)).eval(exprs).provide(context)
    } yield result
}
