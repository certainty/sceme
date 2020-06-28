package de.lisp_unleashed.sceme

import de.lisp_unleashed.sceme.Value.MultipleValues
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
      case v                                         => ZIO.succeed(v)
    }

  private def compileApplication(operator: Value, operands: List[Value]): ProgramT[Value] =
    for {
      proc   <- compileOperator(operator)
      args   <- ZIO.collectAll(operands.map(compileSingle))
      result <- proc(args)
    } yield result

  private def compileOperator(operator: Value): ProgramT[Seq[Value] => ProgramT[MultipleValues]] =
    compileSingle(operator).flatMap {
      case v: Value.Procedure[ProgramT] @unchecked => ZIO.succeed(v.f)
      case v                                       => ZIO.fail(new RuntimeError("Can't apply non procedure", v.location))
    }
}

object ZIOCompiler {
  type Program     = ProgramT[Value]
  type ProgramT[T] = ZIO[Environment, Exception, T]
}
