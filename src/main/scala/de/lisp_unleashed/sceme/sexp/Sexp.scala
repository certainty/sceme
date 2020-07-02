package de.lisp_unleashed.sceme.sexp
import de.lisp_unleashed.sceme.parser.Location

trait Sexp {
  def location: Option[Location]
}
