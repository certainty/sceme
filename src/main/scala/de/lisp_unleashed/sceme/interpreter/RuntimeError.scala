package de.lisp_unleashed.sceme.interpreter

import de.lisp_unleashed.sceme.parser.{ Location, SourceMapper }

class RuntimeError(message: String, location: Option[Location]) extends Exception {
  override def getMessage: String = s"RuntimeError: $message at $location"

  def fullMessage(sourceMapper: SourceMapper): String = {
    val loc = location.map(sourceMapper.renderLocation(_))
    //val source = location.map(sourceMapper.renderLinePosition(_))
    s"RuntimeError: $message ${loc.getOrElse("")}"
  }
}
