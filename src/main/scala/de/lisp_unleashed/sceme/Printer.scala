package de.lisp_unleashed.sceme

import de.lisp_unleashed.sceme.syntax.Value

trait Printer {
  def print(datum: Value): String
  def printAll(data: Seq[Value]): String
}
