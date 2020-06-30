package de.lisp_unleashed.sceme.interpreter.in_zio
import de.lisp_unleashed.sceme.Value.{ Fixnum, ForeignFunction }
import de.lisp_unleashed.sceme.ValueOps.symbol
import de.lisp_unleashed.sceme.interpreter.RuntimeError
import de.lisp_unleashed.sceme.interpreter.in_zio.Prelude.NumericOps.{ AddFix, MultFix }
import de.lisp_unleashed.sceme.parser.Location
import de.lisp_unleashed.sceme.{ DefaultEnvironment, Value }
import zio.ZIO

object Prelude {
  object Errors {
    def error[T](message: String, location: Option[Location] = None): Instruction[T] =
      ZIO.fail(new RuntimeError(message, location))
  }

  object TypeChecks {
    def ensureType[T <: Value](s: Seq[Value], message: String): Instruction[Seq[T]] = s match {
      case s if allSameType[T](s) => ZIO.succeed(s.asInstanceOf[Seq[T]])
      case (head +: _)            => Errors.error(message, head.location)
    }

    def allSameType[T <: Value](s: Seq[Value]): Boolean =
      s.forall(_.isInstanceOf[T @unchecked])
  }

  object NumericOps {
    // No numeric tower yet
    object AddFix extends ForeignFunction[Instruction] {
      override def call(args: Seq[Value]): Instruction[Fixnum] =
        for {
          numbers <- TypeChecks.ensureType[Fixnum](args, "Invalid type. Expected sequence of Fixnum")
        } yield {
          Value.Fixnum(numbers.map(_.value).sum, None)
        }
    }

    object MultFix extends ForeignFunction[Instruction] {
      override def call(args: Seq[Value]): Instruction[Fixnum] =
        for {
          numbers <- TypeChecks.ensureType[Fixnum](args, "Invalid type. Expected sequence of Fixnum")
        } yield {
          Value.Fixnum(numbers.map(_.value).product, None)
        }
    }
  }

  def env = DefaultEnvironment(
    Map(
      symbol("+") -> AddFix,
      symbol("*") -> MultFix
    ),
    None
  )
}
