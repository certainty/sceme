package de.lisp_unleashed.sceme
import de.lisp_unleashed.sceme.parser.{ Expression, ScemeParser }
import scala.util.Try

class Parser {
  private val parser = new ScemeParser

  def parse(input: String): Try[Expression] =
    Try(parser.parse(input))
}
