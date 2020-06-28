package de.lisp_unleashed.sceme

trait Environment {
  def outer: Option[Environment]
  def set(symbol: Symbol, datum: Value): Environment
  def find(symbol: Symbol): Option[Environment]
  def get(symbol: Symbol): Option[Value]
}

case class StandardEnvironment() extends Environment {
  val outer: Option[Environment] = None

  override def set(symbol: Symbol, datum: Value): Environment = this

  override def find(symbol: Symbol): Option[Environment] = None

  override def get(symbol: Symbol): Option[Value] = None
}
