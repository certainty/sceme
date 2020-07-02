package de.lisp_unleashed.sceme.interpreter.zio_interpreter
import de.lisp_unleashed.sceme.interpreter.{ ArgumentError, DefaultEnvironment }
import de.lisp_unleashed.sceme.interpreter.zio_interpreter.Prelude.Types.{ FxPlus, TypeOf }
import de.lisp_unleashed.sceme.sexp.Value
import de.lisp_unleashed.sceme.sexp.Value.{ Fixnum, ForeignLambda }
import zio.ZIO

object Prelude {

  object Types {
    def typeOf(v: Value): String = v match {
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
      case _                     => "Internal"
    }

    object TypeOf extends ForeignLambda[Op] {
      override def call(args: Seq[Value]): Op[Value] = args match {
        case Seq(v) => ZIO.succeed(Value.Symbol(typeOf(v), None))
        case _      => ZIO.succeed(Value.Symbol("Unknown", None))
      }
    }

    object FxPlus extends ForeignLambda[Op] {
      override def call(args: Seq[Value]): Op[Value] = {
        var result = BigInt(0)

        args.foreach {
          case Fixnum(v, _) => result += v
          case _            => throw new ArgumentError("Expected #<fixnum> but got #{v}", None)
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
