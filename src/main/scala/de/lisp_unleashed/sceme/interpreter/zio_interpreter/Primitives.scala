package de.lisp_unleashed.sceme.interpreter.zio_interpreter
import de.lisp_unleashed.sceme.interpreter.{ ArgumentError, ArityError, DefaultEnvironment }
import de.lisp_unleashed.sceme.sexp.Value
import de.lisp_unleashed.sceme.sexp.Value.{ Callable, Fixnum, ForeignLambda }
import zio.ZIO

object Primitives {
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
        case _            => throw new ArgumentError("Expected #<fixnum> but got #{v}", None, None)
      }

      ZIO.succeed(Value.apply(result))
    }
  }

  object EqualP extends ForeignLambda[Op] {
    override def call(args: Seq[Value]): Op[Value] = args match {
      case Seq(x, y) => isEqual(x, y).map(Value.Boolean(_, None))
      case s         => ZIO.fail(new ArityError(2, s.size, None, None))
    }

    private def isEqual(lhs: Value, rhs: Value): Op[Boolean] = (lhs, rhs) match {
      case (_: Callable, _)                           => ZIO.fail(new ArgumentError("Can't test precedures for equality", None, None))
      case (_, _: Callable)                           => ZIO.fail(new ArgumentError("Can't test precedures for equality", None, None))
      case (Value.Boolean(x, _), Value.Boolean(y, _)) => ZIO.succeed(x == y)
      case (Value.Char(x, _), Value.Char(y, _))       => ZIO.succeed(x == y)
      case (Value.String(x, _), Value.String(y, _))   => ZIO.succeed(x == y)
      case (Value.Fixnum(x, _), Value.Fixnum(y, _))   => ZIO.succeed(x == y)
      case (Value.Void(_), Value.Void(_))             => ZIO.succeed(true)
      case _                                          => ZIO.fail(new ArgumentError("Non atomic values are not yet supported by equal?", None, None))
    }
  }

  def env = DefaultEnvironment(
    Map(
      Value.Symbol("typeOf", None) -> TypeOf,
      Value.Symbol("fx+", None)    -> FxPlus,
      Value.Symbol("equal?", None) -> EqualP
    )
  )
}
