package de.lisp_unleashed.sceme.interpreter.in_zio
import de.lisp_unleashed.sceme.Value.ForeignFunction
import de.lisp_unleashed.sceme.ValueOps.symbol
import de.lisp_unleashed.sceme.interpreter.in_zio.Prelude.NumericOps.{ Add, Sub }
import de.lisp_unleashed.sceme.{ DefaultEnvironment, Value }

object Prelude {
  object NumericOps {
    private def allSameType[T <: Value](s: Seq[Value]): Boolean =
      s.forall(_.isInstanceOf[T])

    object Add extends ForeignFunction[Program] {
      override def call(args: Seq[Value]): Program[Value.Number] = {
        assert(allSameType[Number](args))
        ???
      }
    }

    object Sub extends ForeignFunction[Program] {
      override def call(args: Seq[Value]): Program[Value.Number] = {
        assert(allSameType[Number](args))
        ???
      }
    }
  }

  def env = DefaultEnvironment(
    Map(
      symbol("+") -> Add,
      symbol("-") -> Sub,
    ),
    None
  )
}
