package de.lisp_unleashed.sceme

trait Environment {
  def outer: Option[Environment]
  def set(symbol: Symbol, datum: Value): Environment
  def find(symbol: Symbol): Option[Environment]
  def get(symbol: Symbol): Option[Value]
}
