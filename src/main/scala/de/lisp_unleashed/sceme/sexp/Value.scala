package de.lisp_unleashed.sceme.sexp
import de.lisp_unleashed.sceme.parser.Location

sealed trait Value extends Sexp

object Value {
  sealed trait Simple extends Value

  sealed trait Compound extends Value

  sealed trait Callable extends Value

  trait ForeignLambda[F[_]] extends Callable {
    override def location: Option[Location] = None
    def call(args: Seq[Value]): F[Value]
  }

  object ForeignLambda {
    def apply[F[_]](f: Seq[Value] => F[Value]): ForeignLambda[F] =
      new ForeignLambda[F] {
        override def call(args: Seq[Value]): F[Value] = f(args)
      }
  }

  case class Symbol(value: scala.Predef.String, location: Option[Location]) extends Simple {
    override def canEqual(that: Any): scala.Boolean = that match {
      case _: Symbol => true
      case _         => false
    }

    override def equals(o: Any): scala.Boolean = o match {
      case Symbol(v, _) => v == value
      case _            => false
    }

    override val hashCode: Int = value.hashCode
  }

  case class Boolean(value: scala.Boolean, location: Option[Location]) extends Simple

  case class Char(value: scala.Char, location: Option[Location]) extends Simple

  case class String(value: scala.Predef.String, location: Option[Location]) extends Simple

  trait Number[T] {
    def value: T
  }

  case class Fixnum(value: BigInt, location: Option[Location]) extends Simple with Number[BigInt]

  case class Flonum(value: BigDecimal, location: Option[Location]) extends Simple with Number[BigDecimal]

  case class Void(location: Option[Location]) extends Simple

  case class ProperList(value: scala.List[Value], location: Option[Location]) extends Compound

  case class ImproperList(value: (scala.List[Value], Value), location: Option[Location]) extends Compound

  case class Vector(value: scala.Vector[Value], location: Option[Location]) extends Compound

  case class Procedure[F[_]](formals: Seq[Value.Symbol], action: F[Value], location: Option[Location]) extends Callable

  case class MultipleValues(values: Seq[Value], location: Option[Location]) extends Value

  def apply(n: BigInt): Fixnum = Fixnum(n, None)

  def apply(n: BigDecimal): Flonum = Flonum(n, None)
}
