package de.lisp_unleashed.sceme.interpreter
import de.lisp_unleashed.sceme.interpreter.Environment.Bindings
import de.lisp_unleashed.sceme.sexp.Value

class Context(environment: Environment) {
  @volatile private var env = environment

  def currentEnvironment: Environment = env

  def extendEnvironment(bindings: Bindings): Context = {
    env = env.extend(bindings)
    this
  }

  def extendEnvironment(bindings: Seq[(Value.Symbol, Value)]): Context =
    extendEnvironment(bindings.toMap)

  def shrinkEnvironment(): Unit = env.outer match {
    case Some(parent) => env = parent
    case _            => ()
  }
}
