package de.lisp_unleashed.sceme
import de.lisp_unleashed.sceme.Reader.Result
import de.lisp_unleashed.sceme.parser.SourceMapper

import scala.util.Try

class ReadError(message: String, cause: Throwable) extends Exception(message, cause)

trait Reader {
  def read(string: String, inputId: String): Result
  def tryRead(string: String, inputId: String): Try[(Value, SourceMapper)] =
    read(string, inputId).toTry
}

object Reader {
  type Result = Either[ReadError, (Value, SourceMapper)]
}
