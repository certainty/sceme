package de.lisp_unleashed.sceme.parser

trait ScemeUnit

case class ScemeModule(expressions: Seq[Expression], source: ScemeSource) extends ScemeUnit
