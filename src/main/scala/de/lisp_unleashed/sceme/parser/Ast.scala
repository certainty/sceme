package de.lisp_unleashed.sceme.parser

case class Location(sourceId: String, index: Int, line: Int, column: Int)

object Location {
  def apply(index: Int, line: Int, column: Int): Location = Location("", index, line, column)
}

object Ast {
  sealed trait Expression {
    def location: Option[Location]
  }

  sealed trait Literal extends Expression

  sealed trait Constant extends Literal

  case class Variable(name: String, location: Option[Location]) extends Expression

  case class ProcedureCall(operator: Expression, operands: Vector[Expression], location: Option[Location])
      extends Expression

  case class Lambda(variables: Vector[Variable], body: Vector[Expression], location: Option[Location])
      extends Expression

  case class Assignment(variable: Variable, expr: Expression, location: Option[Location]) extends Expression

  case class Quoted(datum: Expression)

  case class BooleanValue(value: Boolean, location: Option[Location])  extends Constant
  case class CharValue(value: Char, location: Option[Location])        extends Constant
  case class StringValue(value: String, location: Option[Location])    extends Constant
  case class IntegerValue(value: BigInt, location: Option[Location])   extends Constant
  case class FloatValue(value: BigDecimal, location: Option[Location]) extends Constant
}
