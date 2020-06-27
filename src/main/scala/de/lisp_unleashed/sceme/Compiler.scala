package de.lisp_unleashed.sceme

import de.lisp_unleashed.sceme.ZIOCompiler.Program
import zio.ZIO

trait Compiler[T] {
  def compile(data: Seq[Value]): T
}

class ZIOCompiler extends Compiler[Program] {
  override def compile(data: Seq[Value]): Program = {}

  def compileSingle(datum: Value): Program =
    datum match {
      case Value.EmptyList(_)                => ZIO.succeed(datum)
      case Value.Symbol(s, _)                => ZIO.succeed(datum)
      case Value.ProperList(head :: tail, _) => compileProcedure(head, tail)
    }

  private def compileProcedure(operator: Value, operands: List[Value]): Program[Value] = {
    val op   = compileSingle(operator)
    val args = ZIO.collectAll(operands.map(compileSingle))

    op.flatMap {
      case Value.Procedure(f, _) =>
        args.flatMap { args =>
          f.apply(args)
          ZIO.succeed(f.apply(args))
        }

    }
  }

}

object ZIOCompiler {
  type Program     = ProgramT[Value]
  type ProgramT[T] = ZIO[Environment, Exception, T]
}
