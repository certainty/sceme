package de.lisp_unleashed.sceme
import java.io.{ ByteArrayInputStream, InputStream }
import de.lisp_unleashed.sceme.parser.SourceMapper
import de.lisp_unleashed.sceme.sexp.Value
import scala.util.Try

class ReadError(message: String, cause: Throwable) extends Exception(message, cause)

trait Reader {
  def read(input: InputStream, inputId: String): Try[(Value, SourceMapper)]

  def readProgram(input: InputStream, inputId: String): Try[(Seq[Value], SourceMapper)]

  def read(input: String, inputId: String): Try[(Value, SourceMapper)] =
    read(new ByteArrayInputStream(input.getBytes()), inputId)

  def readProgram(input: String, inputId: String): Try[(Seq[Value], SourceMapper)] =
    readProgram(new ByteArrayInputStream(input.getBytes()), inputId)
}
