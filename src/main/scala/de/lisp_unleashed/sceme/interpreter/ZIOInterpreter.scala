package de.lisp_unleashed.sceme.interpreter

import de.lisp_unleashed.sceme.interpreter.zio_interpreter.{ Op, Program }
import de.lisp_unleashed.sceme.parser.Location
import de.lisp_unleashed.sceme.sexp.Expression._
import de.lisp_unleashed.sceme.sexp.Value.{ Callable, Procedure }
import de.lisp_unleashed.sceme.sexp._
import de.lisp_unleashed.sceme.{ Interpreter, Printer }
import zio.ZIO

class ZIOInterpreter(printer: Printer) extends Interpreter[Program] {
  override def interpret(data: Seq[Expression]): Program = eval(data).map(_.last)

  private def eval(data: Seq[Expression]): Op[Seq[Value]] = ZIO.collectAll(data.map(eval))

  private def eval(datum: Expression): Op[Value] =
    datum match {
      case Literal(v)                        => opValue(v)
      case Variable(v)                       => opReference(v)
      case ProcedureCall(operator, operands) => opApply(operator, operands)
      case Lambda(formals, body, loc)        => obLambda(formals, body, loc)
      case Quote(v)                          => opValue(v)
      case e                                 => ZIO.fail(new RuntimeError("Unsupported Expression", s"Expression ${e} not yet supported", e.location))
    }

  @inline private def opValue[T](t: T): Op[T] = ZIO.succeed(t)

  private def opReference(sym: Value.Symbol): Op[Value] =
    ZIO.accessM[Context] { runtime =>
      runtime.currentEnvironment.get(sym) match {
        case Some(v) => ZIO.succeed(v)
        case None    => ZIO.fail(new UnboundVariableError(sym))
      }
    }

  private def opApply(operator: Expression, operands: Vector[Expression]): Op[Value] =
    for {
      proc   <- evalOperator(operator)
      args   <- eval(operands)
      result <- applyCallable(proc, args)
    } yield result

  private def evalOperator(operator: Expression): Op[Callable] =
    eval(operator).flatMap {
      case v: Callable => opValue(v)
      case v =>
        ZIO.fail(
          new ArgumentError(s"Expected #<procedure> in operator position but got ${printer.print(v)}", v.location)
        )
    }

  private def applyCallable(callable: Value.Callable, args: Seq[Value]): Op[Value] = callable match {
    case f: Value.ForeignLambda[Op] @unchecked => f.call(args)
    case f: Value.Procedure[Op] @unchecked if f.formals.size == args.size =>
      val bindings = f.formals.zip(args)
      ZIO.access[Context](_.extendEnvironment(bindings)).bracket(ctx => ZIO.succeed(ctx.shrinkEnvironment())) { ctx =>
        f.action.provide(ctx)
      }
    case f: Value.Procedure[Op] @unchecked =>
      ZIO.fail(new ArityError(f.formals.size, args.size, f.location))
  }

  private def obLambda(
    formals: Seq[Variable],
    body: Seq[Expression],
    location: Option[Location]
  ): Op[Callable] =
    opValue(Procedure(formals.map(_.name), eval(body).map(_.last), location))

}
