package de.lisp_unleashed.sceme.syntax
import de.lisp_unleashed.sceme.parser.Location

sealed trait Expression {
  def location: Option[Location]
}

case class Literal(value: Value) extends Expression {
  val location: Option[Location] = value.location
}

case class Variable(name: Value.Symbol) extends Expression {
  val location: Option[Location] = name.location
}

case class Quote(value: Value) extends Expression {
  val location: Option[Location] = value.location
}

case class QuasiQuote(value: Value) extends Expression {
  val location: Option[Location] = value.location
}

case class Unquote(value: Expression) extends Expression {
  val location: Option[Location] = value.location
}

case class UnquoteSplicing(value: Expression) extends Expression {
  val location: Option[Location] = value.location
}

case class ProcedureCall(operator: Expression, operands: List[Expression]) extends Expression {
  val location: Option[Location] = operator.location
}

case class Lambda(formals: Seq[Variable], body: Seq[Expression], location: Option[Location]) extends Expression
