package de.lisp_unleashed.sceme

import de.lisp_unleashed.sceme.Environment.Bindings

class ScemeRuntime(environment: Environment) {
  @volatile
  private var env = environment

  def currentEnvironment: Environment = env

  def extendEnvironment(bindings: Bindings): ScemeRuntime = {
    env = env.extend(bindings)
    this
  }

  def shrinkEnvironment(): Unit = env.outer match {
    case Some(parent) => env = parent
    case _            => ()
  }
}
