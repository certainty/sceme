package de.lisp_unleashed.sceme.parser

//sealed trait SExpression
//sealed trait Atom extends SExpression
//
//object SExpression {
//  case class List(elements: Seq[SExpression])               extends SExpression
//  case class DottedList(car: SExpression, cdr: SExpression) extends SExpression
//  case class Symbol(value: String)                          extends Atom
//  case class String(value: scala.Predef.String)             extends Atom
//  case class FixNum(value: Long)                            extends Atom
//  case class FlowNum(value: Float)                          extends Atom
//}

case class Location(sourceId: String, index: Int, line: Int, column: Int)

object Location {
  def apply(index: Int, line: Int, column: Int): Location = Location("", index, line, column)
}

object Ast {
  sealed trait Expression {
    def location: Option[Location]
  }

  sealed trait Atom                                                   extends Expression
  case class BooleanValue(value: Boolean, location: Option[Location]) extends Atom
}
