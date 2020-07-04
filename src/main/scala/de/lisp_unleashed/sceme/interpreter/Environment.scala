package de.lisp_unleashed.sceme.interpreter

import de.lisp_unleashed.sceme.interpreter.Environment.Bindings
import de.lisp_unleashed.sceme.sexp.Value

import scala.collection.mutable

trait Environment {
  def outer: Option[Environment]
  def set(symbol: Value.Symbol, datum: Value): Environment
  def find(symbol: Value.Symbol): Option[Environment]
  def get(symbol: Value.Symbol): Option[Value]
  def extend(bindings: Bindings): Environment
}

object Environment {
  type Bindings = Map[Value.Symbol, Value]
}

case class DefaultEnvironment private (outer: Option[Environment]) extends Environment {
  private val env: mutable.Map[Value.Symbol, Value] = mutable.Map.empty

  override def set(symbol: Value.Symbol, datum: Value): Environment = {
    env.update(symbol, datum)
    this
  }

  override def find(symbol: Value.Symbol): Option[Environment] =
    if (env.contains(symbol)) {
      Some(this)
    } else {
      outer.flatMap(_.find(symbol))
    }

  override def get(symbol: Value.Symbol): Option[Value] =
    env.get(symbol).orElse(outer.flatMap(_.get(symbol)))

  override def extend(bindings: Bindings): Environment =
    DefaultEnvironment(bindings, this)
}

object DefaultEnvironment {
  def apply(bindings: Map[Value.Symbol, Value]): DefaultEnvironment = {
    val env = new DefaultEnvironment(None)
    bindings.foreach {
      case (x, y) => env.set(x, y)
    }
    env
  }

  def apply(bindings: Map[Value.Symbol, Value], outer: Environment): DefaultEnvironment = {
    val env = new DefaultEnvironment(Some(outer))
    bindings.foreach {
      case (x, y) => env.set(x, y)
    }
    env
  }
}
