package de.lisp_unleashed.sceme
import de.lisp_unleashed.sceme.runtime.Value

trait Printer {
  def print(datum: Value): String
  def printAll(data: Seq[Value]): String
}
