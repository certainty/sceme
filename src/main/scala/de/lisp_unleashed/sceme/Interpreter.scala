package de.lisp_unleashed.sceme
import de.lisp_unleashed.sceme.parser.{ Location, SourceMapper }

trait Interpreter[P] {
  def interpret(data: Seq[Value]): P
}
