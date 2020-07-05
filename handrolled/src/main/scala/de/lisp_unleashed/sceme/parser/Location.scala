package de.lisp_unleashed.sceme.parser

case class Location(sourceId: String, index: Int, line: Int, column: Int)

object Location {
  def apply(index: Int, line: Int, column: Int): Location = Location("", index, line, column)
}
