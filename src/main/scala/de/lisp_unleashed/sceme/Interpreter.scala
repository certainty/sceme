package de.lisp_unleashed.sceme

trait Interpreter[P] {
  def interpret(data: Seq[Value]): P
}
