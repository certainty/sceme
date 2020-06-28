package de.lisp_unleashed.sceme.repl

import de.lisp_unleashed.sceme.{ DefaultEnvironment, Environment }

trait Repl[T] {
  def run(): T
}

object Repl {
  val environment = DefaultEnvironment(Map.empty, Environment.standard)
}
