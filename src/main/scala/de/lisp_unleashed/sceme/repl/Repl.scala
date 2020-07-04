package de.lisp_unleashed.sceme.repl
import de.lisp_unleashed.sceme.interpreter.zio_interpreter.Primitives

trait Repl[T] {
  def run(): T
}

object Repl {
  val environment = Primitives.env
}
