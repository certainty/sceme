package de.lisp_unleashed.sceme
import de.lisp_unleashed.sceme.parser.Location
import scala.Predef.{ String => ScalaString }
import scala.{ Boolean => ScalaBoolean, Vector => ScalaVector, List => ScalaList, Char => ScalaChar }

sealed trait Value {
  def location: Option[Location]
}

object Value {
  sealed trait Simple extends Value

  sealed trait Compound extends Value

  case class Symbol(value: ScalaString, location: Option[Location]) extends Simple

  case class Boolean(value: ScalaBoolean, location: Option[Location]) extends Simple

  case class Char(value: ScalaChar, location: Option[Location]) extends Simple

  case class String(value: ScalaString, location: Option[Location]) extends Simple

  case class Fixnum(value: BigInt, location: Option[Location]) extends Simple

  case class Flonum(value: BigDecimal, location: Option[Location]) extends Simple

  case class Void(location: Option[Location]) extends Simple

  case class ProperList(value: ScalaList[Value], location: Option[Location]) extends Compound

  case class ImproperList(values: ScalaList[Value], last: Value, location: Option[Location]) extends Compound

  case class Vector(value: ScalaVector[Value], location: Option[Location]) extends Compound

  case class Procedure[F[_]](f: Seq[Value] => F[MultipleValues], location: Option[Location]) extends Value

  case class MultipleValues(values: Seq[Value], location: Option[Location]) extends Value

  sealed trait AbbreviationPrefix
  case object Quote           extends AbbreviationPrefix
  case object QuasiQuote      extends AbbreviationPrefix
  case object Unquote         extends AbbreviationPrefix
  case object UnquoteSplicing extends AbbreviationPrefix

  case class Abbreviation(prefix: AbbreviationPrefix, value: Value, location: Option[Location]) extends Compound
}
