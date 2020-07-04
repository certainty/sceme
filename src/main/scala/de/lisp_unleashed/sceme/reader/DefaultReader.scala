package de.lisp_unleashed.sceme.reader
import java.io.InputStream
import java.util.UUID

import de.lisp_unleashed.sceme.parser.{ DataParser, DefaultSourceMapper, SourceMapper, SyntaxError }
import de.lisp_unleashed.sceme.sexp.Value
import de.lisp_unleashed.sceme.{ ReadError, Reader }
import org.parboiled2.{ ParseError, ParserInput }

import scala.util.{ Failure, Try }

class DefaultReader extends Reader {
  override def read(
    source: java.io.InputStream,
    inputId: String = UUID.randomUUID().toString
  ): Try[(Value, SourceMapper)] =
    doRead(source, inputId, parseDatum)

  override def readProgram(source: InputStream, inputId: String): Try[(Seq[Value], SourceMapper)] =
    doRead(source, inputId, parseProgram)

  private def mapError[T](v: Try[T], parser: DataParser, parserInput: ParserInput) = v match {
    case Failure(ex: ParseError) => Failure(new ReadError("Failed to read", SyntaxError(parser, parserInput, ex)))
    case other                   => other
  }

  private def parseDatum(parser: DataParser, parserInput: ParserInput): Try[Value] =
    mapError(parser.Datum.run(), parser, parserInput)

  private def parseProgram(parser: DataParser, parserInput: ParserInput): Try[Vector[Value]] =
    mapError(parser.Program.run(), parser, parserInput)

  private def doRead[T](source: java.io.InputStream, inputId: String, parse: (DataParser, ParserInput) => Try[T]) =
    for {
      parserInput <- Try(ParserInput(source.readAllBytes()))
      sourceMapper = new DefaultSourceMapper(inputId, parserInput)
      result <- parse(new DataParser(parserInput, inputId), parserInput)
    } yield (result, sourceMapper)

}
