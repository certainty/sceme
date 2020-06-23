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
    def print: ScalaString
  }

  sealed trait SimpleDatum   extends Datum
  sealed trait CompoundDatum extends Datum

  case class Symbol(value: ScalaString, location: Option[Location]) extends SimpleDatum {
    override def print: ScalaString = value
  }

  case class Boolean(value: ScalaBoolean, location: Option[Location]) extends SimpleDatum {
    override def print: ScalaString = value match {
      case true  => "#t"
      case false => "#f"
    }
  }

  case class Char(value: ScalaChar, location: Option[Location]) extends SimpleDatum {
    override def print: ScalaString = value match {
      case '\n'       => "#\\newline"
      case ' ' | '\t' => "#\\space"
      case other      => s"#\\$other"
    }
  }

  case class String(value: ScalaString, location: Option[Location]) extends SimpleDatum {
    override def print: ScalaString = s""""${value}""""
  }

  case class Fixnum(value: BigInt, location: Option[Location]) extends SimpleDatum {
    override def print: ScalaString = value.toString()
  }

  case class Flonum(value: BigDecimal, location: Option[Location]) extends SimpleDatum {
    override def print: ScalaString = value.toString()
  }

  case class ProperList(value: ScalaList[Datum], location: Option[Location]) extends CompoundDatum {
    override def print: ScalaString = value.map(_.print).mkString("(", " ", ")")
  }

  case class ImproperList(values: ScalaList[Datum], last: Datum, location: Option[Location]) extends CompoundDatum {
    override def print: ScalaString = s"""(${values.map(_.print).mkString(" ")} . ${last.print})"""
  }

  case class Abbreviation(prefix: ScalaString, value: Datum, location: Option[Location]) extends CompoundDatum {
    override def print: ScalaString = s"""$prefix${value.print}"""
  }

  case class Vector(value: ScalaVector[Datum], location: Option[Location]) extends CompoundDatum {
    override def print: ScalaString = value.map(_.print).mkString("#(", " ", ")")
  }
}
