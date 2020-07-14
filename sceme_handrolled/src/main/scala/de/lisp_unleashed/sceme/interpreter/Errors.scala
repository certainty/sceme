package de.lisp_unleashed.sceme.interpreter
import de.lisp_unleashed.sceme.parser.SourceInformation
import de.lisp_unleashed.sceme.runtime.Value

class RuntimeError(errorType: String, message: String, location: Option[SourceInformation]) extends Exception {
  override def getMessage: String =
    s"""${errorType}: $message at ${location.getOrElse("")}
       |""".stripMargin
}

class UnboundVariableError(sym: Value.Symbol, location: Option[SourceInformation])
    extends RuntimeError("UnboundVariable", s"${sym.value} is unbound", location)

object UnboundVariableError {
  def apply(sym: Value.Symbol): UnboundVariableError =
    new UnboundVariableError(sym, None)
}

sealed trait ExpectedArity
case class Variadic(atLeast: Int) extends ExpectedArity
case class ExpectFixed(num: Int)  extends ExpectedArity

class ArityError(expected: ExpectedArity, actual: Int, location: Option[SourceInformation])
    extends RuntimeError(
      "ArityError",
      s"Invalid number of arguments. Expected ${expected} but got ${actual}.",
      location
    )

object ArityError {
  def apply(
    expected: ExpectedArity,
    actual: Int,
    location: Option[SourceInformation] = None,
  ): ArityError =
    new ArityError(expected, actual, location)

}

class ArgumentError(message: String, location: Option[SourceInformation])
    extends RuntimeError("ArgumentError", message, location)

object ArgumentError {
  def apply(
    message: String,
    location: Option[SourceInformation] = None,
  ): ArgumentError =
    new ArgumentError(message, location)
}
