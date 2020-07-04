package de.lisp_unleashed.sceme
import de.lisp_unleashed.sceme.parser.{ ExpressionParser, SourceMapper }
import de.lisp_unleashed.sceme.reader.DefaultReader
import de.lisp_unleashed.sceme.sexp.Expression

import scala.util.Try

class Parser(reader: Reader) {
  private val parser = new ExpressionParser

  def parse(input: String, id: String): Try[(Expression, SourceMapper)] =
    for {
      (ast, sm) <- reader.readProgram(input, id)
      ast       <- parser.parse(ast.toList)
    } yield (ast, sm)
}

object Parser {
  val default: Parser = new Parser(new DefaultReader)
}
