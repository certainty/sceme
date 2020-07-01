package de.lisp_unleashed.sceme.interpreter.in_zio
import de.lisp_unleashed.sceme.DefaultEnvironment
import de.lisp_unleashed.sceme.interpreter.RuntimeError
import de.lisp_unleashed.sceme.interpreter.in_zio.Prelude.Types.{ FxPlus, TypeOf }
import de.lisp_unleashed.sceme.parser.Location
import de.lisp_unleashed.sceme.syntax.Value.{ Fixnum, ForeignLambda }
import de.lisp_unleashed.sceme.syntax.{ RuntimeValue, Value }
import zio.ZIO

object Prelude {

  object Errors {
    def error[T](message: String, location: Option[Location] = None): Instruction[T] =
      ZIO.fail(new RuntimeError(message, location))
  }

  object Types {
    def typeOf(v: RuntimeValue): String = v match {
      case _: Value.Fixnum       => "Fixnum"
      case _: Value.Flonum       => "Flonum"
      case _: Value.String       => "String"
      case _: Value.Char         => "Char"
      case _: Value.Boolean      => "Boolean"
      case _: Value.Callable     => "Procedure"
      case _: Value.ProperList   => "Pair"
      case _: Value.ImproperList => "Pair"
      case _: Value.Vector       => "Vector"
      case _: Value.Void         => "Void"
      case _: Value.Symbol       => "Symbol"
    }

    object TypeOf extends ForeignLambda[Instruction] {
      override def call(args: Seq[Value]): Instruction[Value] = args match {
        case Seq(v: RuntimeValue) => ZIO.succeed(Value.Symbol(typeOf(v), None))
        case _                    => ZIO.succeed(Value.Symbol("Unknown", None))
      }
    }

    object FxPlus extends ForeignLambda[Instruction] {
      override def call(args: Seq[Value]): Instruction[Value] = {
        var result = BigInt(0)

        args.foreach {
          case Fixnum(v, _) => result += v
          case _            => throw new RuntimeError("Oh Oh", None)
        }

        ZIO.succeed(Value.apply(result))
      }

    }
  }

  def env = DefaultEnvironment(
    Map(
      Value.Symbol("typeOf", None) -> TypeOf,
      Value.Symbol("fx+", None)    -> FxPlus
    ),
    None
  )
}
