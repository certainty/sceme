package de.lisp_unleashed.sceme.interpreter.in_zio
import de.lisp_unleashed.sceme.Value.Callable
import de.lisp_unleashed.sceme.interpreter.RuntimeError
import de.lisp_unleashed.sceme.{ Environment, Interpreter, Value }
import zio.ZIO

class ZIOInterpreter extends Interpreter[Program] {
  override def interpret(data: Seq[Value]): Program = eval(data).map(_.last)

  private def eval(data: Seq[Value]): ZIO[Environment, Throwable, List[Value]] = ZIO.collectAll(data.map(eval))

  def eval(datum: Value): Instruction[Value] =
    datum match {
      case nil @ Value.ProperList(Nil, _)            => value(nil)
      case Value.Quote(v, _)                         => value(v)
      case Value.ProperList(operator :: operands, _) => applyProcedure(operator, operands)
      case v: Value.Symbol                           => referenceVariable(v)
      case v                                         => value(v)
    }

  @inline private def value[T](t: T) = ZIO.succeed(t)

  private def referenceVariable(sym: Value.Symbol): Instruction[Value] =
    ZIO.access[Environment](e => e.get(sym)).flatMap {
      case Some(v) => ZIO.succeed(v)
      case None    => ZIO.fail(new RuntimeError(s"Unbound variable: ${sym.value}", sym.location))
    }

  private def applyProcedure(operator: Value, operands: List[Value]): Instruction[Value] =
    for {
      proc   <- evalOperator(operator)
      args   <- eval(operands)
      result <- proc.call(args)
    } yield result

  private def evalOperator(operator: Value): Instruction[Callable[Instruction]] =
    eval(operator).flatMap {
      case v: Value.Callable[Instruction] @unchecked => ZIO.succeed(v)
      case v                                         => ZIO.fail(new RuntimeError(s"Can't apply non procedure. ${v}", v.location))
    }
}
