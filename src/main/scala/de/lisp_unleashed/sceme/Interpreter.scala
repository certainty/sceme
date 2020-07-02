package de.lisp_unleashed.sceme

import de.lisp_unleashed.sceme.sexp.Expression

trait Interpreter[P] {
  def interpret(data: Seq[Expression]): P
}
