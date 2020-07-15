package de.lisp_unleashed.sceme
import de.lisp_unleashed.sceme.parser.{Expression, ScemeParser, ScemeSource}

import scala.util.Try

class Parser {
  private val parser = new ScemeParser

  def parse(input: ScemeSource): Try[Expression] =
    Try(parser.parse(input))
}
