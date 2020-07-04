package de.lisp_unleashed.sceme.sexp
import de.lisp_unleashed.sceme.parser.Location

/**
 * Core expressions + some syntactic extensions that we support natively
 */
sealed trait Expression extends Sexp

object Expression {

  /**
   *  Core expressions
   * */
  case class Literal(value: Value) extends Expression {
    val location: Option[Location] = value.location
  }

  case class Variable(name: Value.Symbol) extends Expression {
    val location: Option[Location] = name.location
  }

  case class Quote(value: Value, location: Option[Location]) extends Expression

  case class ProcedureCall(operator: Expression, operands: Vector[Expression]) extends Expression {
    val location: Option[Location] = operator.location
  }

  case class Lambda(formals: Vector[Variable], body: Vector[Expression], location: Option[Location]) extends Expression

  case class If(test: Expression, consequent: Expression, alternative: Expression, location: Option[Location])
      extends Expression

  case class Set(test: Variable, value: Expression, location: Option[Location]) extends Expression

  case class CallCC(body: Expression, location: Option[Location]) extends Expression

  /**
   * Syntactic extensions
   */
  case class QuasiQuote(value: Value) extends Expression {
    val location: Option[Location] = value.location
  }

  case class Unquote(value: Expression, location: Option[Location]) extends Expression

  case class Begin(seq: Seq[Expression], location: Option[Location]) extends Expression

  case class UnquoteSplicing(value: Expression) extends Expression {
    val location: Option[Location] = value.location
  }

}
