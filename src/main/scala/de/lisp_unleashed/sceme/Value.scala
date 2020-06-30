package de.lisp_unleashed.sceme
import de.lisp_unleashed.sceme.Value.{ Procedure, Symbol }
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

  sealed trait Callable[F[_]] extends Value {
    def call(args: Seq[Value]): F[Value]
  }

  trait ForeignFunction[F[_]] extends Callable[F] with RuntimeValue {
    override def location: Option[Location] = None
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

  case class ImproperList(values: ScalaList[Value], last: Value, location: Option[Location])
      extends Compound
      with RuntimeValue

  case class Vector(value: ScalaVector[Value], location: Option[Location]) extends Compound with RuntimeValue

  case class Procedure[F[_]](f: Seq[Value] => F[Value], location: Option[Location])
      extends Callable[F]
      with RuntimeValue {
    override def call(args: Seq[Value]): F[Value] = f(args)
  }

  case class MultipleValues(values: Seq[Value], location: Option[Location]) extends Value

  case class Quote(value: Value, location: Option[Location]) extends Compound

  case class QuasiQuote(value: Value, location: Option[Location]) extends Compound

  case class Unquote(value: Value, location: Option[Location]) extends Compound

  case class UnquoteSplicing(value: Value, location: Option[Location]) extends Compound
}

object ValueOps {
  def symbol(str: ScalaString): Symbol =
    Value.Symbol(str, None)

  def lambda[F[_]](impl: Seq[Value] => F[Value]): Procedure[F] =
    Procedure(impl, None)
}
