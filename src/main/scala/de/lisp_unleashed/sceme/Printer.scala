package de.lisp_unleashed.sceme

import de.lisp_unleashed.sceme.sexp.Value

trait Printer {
  def print(datum: Value): String
  def printAll(data: Seq[Value]): String
}
