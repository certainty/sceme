package de.lisp_unleashed.sceme.reader
import java.util.UUID

import de.lisp_unleashed.sceme.parser.{ DataParser, DefaultSourceMapper, SourceMapper, SyntaxError }
import de.lisp_unleashed.sceme.sexp.Value
import de.lisp_unleashed.sceme.{ ReadError, Reader }
import org.parboiled2.{ ParseError, ParserInput }

import scala.util.{ Failure, Success }

class DefaultReader extends Reader {
  override def read(
    source: String,
    inputId: String = UUID.randomUUID().toString
  ): Either[ReadError, (Value, SourceMapper)] = {
    val parserInput  = ParserInput(source)
    val sourceMapper = new DefaultSourceMapper(inputId, parserInput)
    val parser       = new DataParser(parserInput, inputId)

    parser.Datum.run() match {
      case Success(value)          => Right((value, sourceMapper))
      case Failure(ex: ParseError) => Left(new ReadError("Failed to read", SyntaxError(parser, parserInput, ex)))
      case Failure(ex)             => Left(new ReadError("Failed to read", ex))
    }
  }
}
