package de.lisp_unleashed.sceme.interpreter
import de.lisp_unleashed.sceme.parser.{ Location, SourceMapper }
import de.lisp_unleashed.sceme.sexp.Value

class RuntimeError(errorType: String, message: String, location: Option[Location], sourceMapper: Option[SourceMapper])
    extends Exception {
  override def getMessage: String = {
    val locInfo = location.flatMap(loc => sourceMapper.map(_.renderLocation(loc)))
    val source  = location.flatMap(loc => sourceMapper.map(_.renderLinePosition(loc, "")))

    s"""${errorType}: $message at ${locInfo.getOrElse("")}
       |
       |${source.getOrElse("")}
       |""".stripMargin
  }
}

class UnboundVariableError(sym: Value.Symbol, sourceMapper: Option[SourceMapper])
    extends RuntimeError("UnboundVariable", s"${sym.value} is unbound", sym.location, sourceMapper)

class ArityError(expected: Int, actual: Int, location: Option[Location], sourceMapper: Option[SourceMapper])
    extends RuntimeError(
      "ArityError",
      s"Invalid number of arguments. Expected ${expected} but got ${actual}.",
      location,
      sourceMapper
    )

class ArgumentError(message: String, location: Option[Location], sourceMapper: Option[SourceMapper])
    extends RuntimeError("ArgumentError", message, location, sourceMapper)
