package de.lisp_unleashed.sceme
import de.lisp_unleashed.sceme.ZIOCompiler.{ Program, ProgramT }
import de.lisp_unleashed.sceme.parser.Location
import zio.ZIO

trait Compiler[T] {
  def compile(data: Seq[Value]): T
}

class RuntimeError(message: String, location: Option[Location]) extends Exception {
  override def getMessage: String = s"RuntimeError: $message at $location"
}

class ZIOCompiler extends Compiler[Program] {
  override def compile(data: Seq[Value]): Program =
    ZIO.collectAll(data.map(compileSingle)).map(_.last)

  def compileSingle(datum: Value): ProgramT[Value] =
    datum match {
      case Value.ProperList(Nil, _)                  => ZIO.succeed(datum)
      case Value.ProperList(operator :: operands, _) => compileApplication(operator, operands)
      case s: Value.Symbol                           => compileReference(s)
      case v                                         => ZIO.succeed(v)
    }

  private def compileReference(sym: Value.Symbol): ProgramT[Value] =
    ZIO.access[Environment](e => e.get(sym)).flatMap {
      case Some(v) => ZIO.succeed(v)
      case None    => ZIO.fail(new RuntimeError(s"Unbound variable: ${sym.value}", sym.location))
    }

  private def compileApplication(operator: Value, operands: List[Value]): ProgramT[Value] =
    for {
      proc   <- compileOperator(operator)
      args   <- ZIO.collectAll(operands.map(compileSingle))
      result <- proc(args)
    } yield result

  private def compileOperator(operator: Value): ProgramT[Seq[Value] => ProgramT[Value]] =
    compileSingle(operator).flatMap {
      case v: Value.Procedure[ProgramT] @unchecked => ZIO.succeed(v.f)
      case v                                       => ZIO.fail(new RuntimeError(s"Can't apply non procedure. ${v}", v.location))
    }
}

object ZIOCompiler {
  type Program     = ProgramT[Value]
  type ProgramT[T] = ZIO[Environment, Throwable, T]
}
