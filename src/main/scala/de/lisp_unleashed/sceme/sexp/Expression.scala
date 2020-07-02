package de.lisp_unleashed.sceme.sexp
import de.lisp_unleashed.sceme.parser.Location

sealed trait Expression extends Sexp

object Expression {
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

  case class ProcedureCall(operator: Expression, operands: Vector[Expression]) extends Expression {
    val location: Option[Location] = operator.location
  }

  case class Lambda(formals: Vector[Variable], body: Vector[Expression], location: Option[Location]) extends Expression
}
