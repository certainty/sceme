package de.lisp_unleashed.sceme

trait Environment {
  def outer: Option[Environment]
  def set(symbol: Value.Symbol, datum: Value): Environment
  def find(symbol: Value.Symbol): Option[Environment]
  def get(symbol: Value.Symbol): Option[Value]
}

case class DefaultEnvironment private (bindings: Map[Value.Symbol, Value], outer: Option[Environment])
    extends Environment {

  override def set(symbol: Value.Symbol, datum: Value): Environment =
    copy(bindings = (bindings + (symbol -> datum)))

  override def find(symbol: Value.Symbol): Option[Environment] =
    if (bindings.contains(symbol)) {
      Some(this)
    } else {
      outer.flatMap(_.find(symbol))
    }

  override def get(symbol: Value.Symbol): Option[Value] =
    bindings.get(symbol).orElse(outer.flatMap(_.get(symbol)))
}

object DefaultEnvironment {
  def apply(bindings: Map[Value.Symbol, Value]): DefaultEnvironment =
    DefaultEnvironment(bindings, None)

  def apply(bindings: Map[Value.Symbol, Value], outer: Environment): DefaultEnvironment =
    DefaultEnvironment(bindings, Some(outer))
}
