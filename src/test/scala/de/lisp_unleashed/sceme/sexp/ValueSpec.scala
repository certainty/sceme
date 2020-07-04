package de.lisp_unleashed.sceme.sexp

import org.specs2.mutable.Specification

class ValueSpec extends Specification {
  "equality" >> {
    Value.Boolean(true) mustEqual Value.Boolean(true)
    Value.Boolean(false) mustNotEqual Value.Boolean(true)

    Value.Symbol("foo") mustEqual Value.Symbol("foo")
    Value.Symbol("bar") mustNotEqual Value.Symbol("foo")
    Value.Symbol("foo").hashCode mustEqual Value.Symbol("foo").hashCode
  }
}
