package de.lisp_unleashed.sceme.interpreter.in_zio
import de.lisp_unleashed.sceme.interpreter.RuntimeError
import de.lisp_unleashed.sceme.parser.Location
import de.lisp_unleashed.sceme.syntax.Value.{ Callable, Procedure }
import de.lisp_unleashed.sceme.syntax._
import de.lisp_unleashed.sceme.{ Environment, Interpreter, ScemeRuntime }
import zio.ZIO

class ZIOInterpreter extends Interpreter[Program] {
  @inline private def value[T](t: T) = ZIO.succeed(t)

  override def interpret(data: Seq[Expression]): Program = eval(data).map(_.last)

  private def eval(data: Seq[Expression]): Instruction[List[Value]] = ZIO.collectAll(data.map(eval))

  def eval(datum: Expression): Instruction[Value] =
    datum match {
      case Literal(v)                        => value(v)
      case Variable(v)                       => evalVariable(v)
      case ProcedureCall(operator, operands) => evalApplication(operator, operands)
      case Lambda(formals, body, loc)        => evalLambda(formals, body, loc)
      case Quote(v)                          => value(v)
      case e                                 => ZIO.fail(new RuntimeError(s"Expression ${e} not yet supported", e.location))
    }

  private def evalVariable(sym: Value.Symbol): Instruction[Value] =
    ZIO.accessM[ScemeRuntime] { runtime =>
      runtime.currentEnvironment.get(sym) match {
        case Some(v) => ZIO.succeed(v)
        case None    => ZIO.fail(new RuntimeError(s"Unbound variable: ${sym.value}", sym.location))
      }
    }

  private def evalApplication(operator: Expression, operands: List[Expression]): Instruction[Value] =
    for {
      proc   <- evalOperator(operator)
      args   <- eval(operands)
      result <- applyProcedure(proc, args)
    } yield result

  private def applyProcedure(callable: Value.Callable, args: List[Value]): Instruction[Value] = callable match {
    case f: Value.ForeignLambda[Instruction] @unchecked => f.call(args)
    case f: Value.Procedure[Instruction] @unchecked if f.formals.size == args.size => {
      // TODO: this currently does not allow arguments to reference preceeding arguments
      val bindings: Environment.Bindings = f.formals.zip(args).toMap
      ZIO.access[ScemeRuntime](_.extendEnvironment(bindings)).bracket(rt => ZIO.succeed(rt.shrinkEnvironment())) { rt =>
        f.action.provide(rt)
      }
    }
    case _ => ZIO.fail(new RuntimeError("Incompatible amount of arguments", None))
  }

  private def evalOperator(operator: Expression): Instruction[Callable] =
    eval(operator).flatMap {
      case v: Callable => ZIO.succeed(v)
      case v           => ZIO.fail(new RuntimeError(s"Can't apply non procedure. ${v}", v.location))
    }

  private def evalLambda(
    formals: Seq[Expression],
    body: Seq[Expression],
    location: Option[Location]
  ): Instruction[Callable] =
    for {
      variables <- evalFormals(formals)
    } yield {
      Procedure(variables, eval(body).map(_.last), location)
    }

  private def evalFormals(formals: Seq[Expression]): Instruction[Seq[Value.Symbol]] =
    ZIO.collectAll(formals.map {
      case Variable(v) => ZIO.succeed(v)
      case v           => ZIO.fail(new RuntimeError("Lambda formals must be symbols", v.location))
    })

}
