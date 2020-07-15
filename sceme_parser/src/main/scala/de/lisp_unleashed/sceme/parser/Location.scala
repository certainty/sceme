package de.lisp_unleashed.sceme.parser

case class Location(lineNumber: Int, start: Int, stop: Int)

trait SourceInformation {
  def location: Location
}

