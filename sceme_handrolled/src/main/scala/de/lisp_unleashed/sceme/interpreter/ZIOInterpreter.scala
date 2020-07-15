package de.lisp_unleashed.sceme.interpreter

import de.lisp_unleashed.sceme.{Parser, Printer}
import de.lisp_unleashed.sceme.interpreter.interpreter.Op
import de.lisp_unleashed.sceme.parser.Expression._
import de.lisp_unleashed.sceme.parser._
import de.lisp_unleashed.sceme.printer.{Configuration, DefaultPrinter}
import de.lisp_unleashed.sceme.runtime.Value
import de.lisp_unleashed.sceme.runtime.Value.{Callable, Procedure}
import zio.ZIO
import scala.util.Try

/**
 * This is the most simple of the execution schemes, the direct interpretation.
 * The interpreter executes the expression tree as it's read. Technically
 * it transforms it into ZIO actions but hat that's really a detail.
 * We could also have just directly translated to imperative scala.
 */
class ZIOInterpreter(printer: Printer) {
  private def eval(datum: Expression): Op[Value] =
    datum match {
      case Literal(v) => opLiteral(v)
      case Variable(v) => opReference(Value.Symbol(v.value))
      case Application(operator, operands, _) => opApply(operator, operands)
      case Lambda(formals, body, location) => obLambda(formals, body, location)
      case Quote(v, _) => opDatum(v)
      case Begin(exprs, _) => opSequence(exprs)
      case If(test, consequent, alternative, _) => opIf(test, consequent, alternative)
      case Assign(Variable(sym), value, _) => opSet(Value.Symbol(sym.value), value)
      case e => opError("UnsupportedExpr", s"The expression ${e} is not yet supported", None)
    }

  @inline private def opValue[T](t: T): Op[T] = ZIO.succeed(t)

  @inline private def opError[T](kind: String, message: String, location: Option[Location]): Op[T] =
    ZIO.fail(new RuntimeError(kind, message, location))

  @inline private def opError[T](runtimeError: RuntimeError): Op[T] = ZIO.fail(runtimeError)

  @inline private def opSequence(exprs: Seq[Expression]): Op[Value] = ZIO.collectAll(exprs.map(eval)).map(_.last)

  private def opLiteral(evaluating: SelfEvaluating[_]): Op[Value] = opDatum(evaluating)

  private def opDatum(datum: Syntax[_]): Op[Value] = datum match {
    case StringSyntax(value, _) => opValue(Value.String(value))
    case SymbolSyntax(value, _, _) => opValue(Value.Symbol(value))
    case BooleanSyntax(value, _) => opValue(Value.Boolean(value))
    case CharacterSyntax(value, _) => opValue(Value.Char(value))
    case FixnumSyntax(value, _) => opValue(Value.Fixnum(value))
    case FlonumSyntax(value, _) => opValue(Value.Flonum(value))
    case VectorSyntax(value, _) => {
      for {
        elements <- ZIO.collectAll(value.map(opDatum))
      } yield Value.Vector(elements.toVector)
    }
    case ProperListSyntax(value, _) => {
      for {
        elements <- ZIO.collectAll(value.map(opDatum))
      } yield Value.ProperList(elements)
    }
    case ImproperListSyntax((head, tail), _) => {
      for {
        evalHead <- ZIO.collectAll(head.map(opDatum))
        evalTail <- opDatum(tail)
      } yield Value.ImproperList(evalHead, evalTail)
    }
    case x => opError("Unsupported", s"${x} yet supported", None)
  }

  private def opReference(sym: Value.Symbol): Op[Value] =
    ZIO.accessM[Context] { runtime =>
      runtime.currentEnvironment.get(sym) match {
        case Some(v) => opValue(v)
        case None => opError(new UnboundVariableError(sym, None))
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

  private def opIf(test: Expression, consequent: Expression, alternative: Option[Expression]): Op[Value] =
    eval(test).flatMap {
      case Value.Boolean(false) if alternative.isDefined => eval(alternative.get)
      case Value.Boolean(false) => opValue(Value.Void)
      case _ => eval(consequent)
    }

  private def opApply(operator: Expression, operands: Vector[Expression]): Op[Value] =
    for {
      proc <- evalOperator(operator)
      args <- evalArguments(operands)
      result <- applyCallable(proc, args)
    } yield result

  private def evalOperator(operator: Expression): Op[Callable] =
    eval(operator).flatMap {
      case v: Callable => opValue(v)
      case v =>
        opError(
          new ArgumentError(
            s"Expected #<procedure> in operator position but got ${printer.print(v)}",
            None
          )
        )
    }

  private def evalArguments(data: Seq[Expression]): Op[Seq[Value]] = ZIO.collectAll(data.map(eval))

  private def applyCallable(callable: Value.Callable, args: Seq[Value]): Op[Value] = callable match {
    case f: Value.ForeignLambda@unchecked => ZIO.fromTry(Try(f.call(args.toList)))
    case f: Value.Procedure[Op]@unchecked if f.formals.size == args.size =>
      val bindings = f.formals.zip(args)
      ZIO.access[Context](_.extendEnvironment(bindings)).bracket(ctx => ZIO.succeed(ctx.shrinkEnvironment())) { ctx =>
        f.action.provide(ctx)
      }
    case f: Value.Procedure[Op]@unchecked =>
      opError(new ArityError(ExpectFixed(f.formals.size), args.size, None))

  }

  private def obLambda(
                        formals: Formals,
                        body: Seq[Expression],
                        location: Location
                      ): Op[Callable] = formals match {
    case FixedArity(args) => opValue(Procedure(args.map(x => Value.Symbol(x.value.value)), eval(Begin(body, location))))
    case _ => opError("Unsupported", "alternative Lambda syntax not yet supported", None)
  }
}

object ZIOInterpreter {
  private val parser = new Parser
  private val printer = new DefaultPrinter(Configuration.default)

  def interpret[T](source: String, context: Context): ZIO[T, Throwable, Value] =
    for {
      exprs <- ZIO.fromTry(parser.parse(StringSource(source)))
      result <- new ZIOInterpreter(printer).eval(exprs).provide(context)
    } yield result
}
