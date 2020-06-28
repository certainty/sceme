package de.lisp_unleashed.sceme.repl

trait Repl[T] {
  def run(): T
}
