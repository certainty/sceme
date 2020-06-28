package de.lisp_unleashed.sceme.repl

import de.lisp_unleashed.sceme.{ Environment, StandardEnvironment, Value }

case class ReplEnvironment() extends Environment {
  override def outer: Option[Environment] = Some(StandardEnvironment())

  override def set(symbol: Symbol, datum: Value): Environment = this

  override def find(symbol: Symbol): Option[Environment] = None

  override def get(symbol: Symbol): Option[Value] = None
}
