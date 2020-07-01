package de.lisp_unleashed.sceme.syntax

import de.lisp_unleashed.sceme.parser.Location

import scala.Predef.{ String => ScalaString }
import scala.{
  Boolean => ScalaBoolean,
  Char => ScalaChar,
  List => ScalaList,
  Symbol => ScalaSymbol,
  Vector => ScalaVector
}

sealed trait Value {
  def location: Option[Location]
}

sealed trait RuntimeValue

object Value {
  sealed trait Simple extends Value with RuntimeValue

  sealed trait Compound extends Value

  sealed trait Callable extends Value

  trait ForeignLambda[F[_]] extends Callable with RuntimeValue {
    override def location: Option[Location] = None
    def call(args: Seq[Value]): F[Value]
  }

  object ForeignLambda {
    def apply[F[_]](f: Seq[Value] => F[Value]): ForeignLambda[F] =
      new ForeignLambda[F] {
        override def call(args: Seq[Value]): F[Value] = f(args)
      }
  }

  case class Symbol(value: ScalaString, location: Option[Location]) extends Simple {
    override def canEqual(that: Any): ScalaBoolean = that match {
      case _: Symbol => true
      case _         => false
    }

    override def equals(o: Any): ScalaBoolean = o match {
      case Symbol(v, _) => v == value
      case _            => false
    }

    override val hashCode: Int = ScalaSymbol(value).hashCode
  }

  case class Boolean(value: ScalaBoolean, location: Option[Location]) extends Simple

  case class Char(value: ScalaChar, location: Option[Location]) extends Simple

  case class String(value: ScalaString, location: Option[Location]) extends Simple

  trait Number[T] {
    def value: T
  }

  case class Fixnum(value: BigInt, location: Option[Location]) extends Simple with Number[BigInt]

  case class Flonum(value: BigDecimal, location: Option[Location]) extends Simple with Number[BigDecimal]

  case class Void(location: Option[Location]) extends Simple

  case class ProperList(value: ScalaList[Value], location: Option[Location]) extends Compound with RuntimeValue

  case class ImproperList(value: (ScalaList[Value], Value), location: Option[Location])
      extends Compound
      with RuntimeValue

  case class Vector(value: ScalaVector[Value], location: Option[Location]) extends Compound with RuntimeValue

  case class Procedure[F[_]](formals: Seq[Value.Symbol], action: F[Value], location: Option[Location])
      extends Callable
      with RuntimeValue

  case class MultipleValues(values: Seq[Value], location: Option[Location]) extends Value

  def apply(n: BigInt): Fixnum     = Fixnum(n, None)
  def apply(n: BigDecimal): Flonum = Flonum(n, None)
}
