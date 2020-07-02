package de.lisp_unleashed.sceme.interpreter
import de.lisp_unleashed.sceme.parser.{ Location, SourceMapper }
import de.lisp_unleashed.sceme.sexp.Value

class RuntimeError(errorType: String, message: String, location: Option[Location]) extends Exception {
  override def getMessage: String = s"${errorType}: $message at $location"

  def fullMessage(sourceMapper: SourceMapper, prefix: String = ""): String = {
    val loc    = location.map(sourceMapper.renderLocation)
    val source = location.map(sourceMapper.renderLinePosition(_, prefix))

    s"""${errorType}: $message at ${loc.getOrElse("")}
       |
       |${source}
       |""".stripMargin
  }
}

class UnboundVariableError(sym: Value.Symbol)
    extends RuntimeError("UnboundVariable", s"${sym.value} is unbound", sym.location)

class ArityError(expected: Int, actual: Int, location: Option[Location])
    extends RuntimeError(
      "ArityError",
      s"Invalid number of arguments. Expected ${expected} but got ${actual}.",
      location
    )

class ArgumentError(message: String, location: Option[Location])
    extends RuntimeError("ArgumentError", message, location)
