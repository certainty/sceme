package de.lisp_unleashed.sceme
import de.lisp_unleashed.sceme.parser.{ ExpressionParser, SourceMapper }
import de.lisp_unleashed.sceme.sexp.Expression
import scala.util.Try

class Parser(reader: Reader) {
  val parser = new ExpressionParser

  def parse(input: String, id: String): Try[(Expression, SourceMapper)] =
    for {
      (datum, sm) <- reader.tryRead(input, id)
      ast         <- parser.parse(datum)
    } yield (ast, sm)
}
