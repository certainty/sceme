package de.lisp_unleashed.sceme.parser
import org.parboiled2.ParserInput

trait SourceMapper {
  def id: String
  def source: String
  def renderLocation(location: Location): String
  def renderLinePosition(location: Location, prefix: String = ""): String
}

class DefaultSourceMapper(val id: String, val parserInput: ParserInput) extends SourceMapper {
  override def source: String =
    parserInput.sliceString(0, parserInput.length)

  override def renderLocation(location: Location): String =
    s"(line ${location.line}, column ${location.column})"

  override def renderLinePosition(location: Location, prefix: String): String =
    parserInput.getLine(location.line).replace("\r", "") + "\n" + prefix + (" " * (location.column - 1)) + "^"
}
