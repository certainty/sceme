package de.lisp_unleashed.sceme

trait Printer {
  def print(datum: Value): String
  def printAll(data: Seq[Value]): String
}
