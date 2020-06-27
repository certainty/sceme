package de.lisp_unleashed.sceme.parser
import scala.{ Boolean => ScalaBoolean, Char => ScalaChar, List => ScalaList, Vector => ScalaVector }
import scala.Predef.{ String => ScalaString }

case class Location(sourceId: String, index: Int, line: Int, column: Int)

object Location {
  def apply(index: Int, line: Int, column: Int): Location = Location("", index, line, column)
}

object Ast {
  sealed trait Datum {
    def location: Option[Location]
  }

  type Program = Seq[Ast.Datum]

  sealed trait SimpleDatum   extends Datum
  sealed trait CompoundDatum extends Datum

  case class Symbol(value: ScalaString, location: Option[Location]) extends SimpleDatum

  case class Boolean(value: ScalaBoolean, location: Option[Location]) extends SimpleDatum

  case class Char(value: ScalaChar, location: Option[Location]) extends SimpleDatum

  case class String(value: ScalaString, location: Option[Location]) extends SimpleDatum

  case class Fixnum(value: BigInt, location: Option[Location]) extends SimpleDatum

  case class Flonum(value: BigDecimal, location: Option[Location]) extends SimpleDatum

  case class ProperList(value: ScalaList[Datum], location: Option[Location]) extends CompoundDatum

  case class ImproperList(values: ScalaList[Datum], last: Datum, location: Option[Location]) extends CompoundDatum

  case class Vector(value: ScalaVector[Datum], location: Option[Location]) extends CompoundDatum

  sealed trait AbbreviationPrefix
  case object Quote           extends AbbreviationPrefix
  case object QuasiQuote      extends AbbreviationPrefix
  case object Unquote         extends AbbreviationPrefix
  case object UnquoteSplicing extends AbbreviationPrefix

  case class Abbreviation(prefix: AbbreviationPrefix, value: Datum, location: Option[Location]) extends CompoundDatum
}
