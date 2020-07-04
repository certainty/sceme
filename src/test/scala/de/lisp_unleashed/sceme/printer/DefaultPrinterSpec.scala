package de.lisp_unleashed.sceme.printer

import de.lisp_unleashed.sceme.sexp.Value
import org.specs2.mutable.Specification

class DefaultPrinterSpec extends Specification {
  val printer      = new DefaultPrinter(Configuration.default)
  val shortPrinter = new DefaultPrinter(Configuration(2, 2))

  "print" >> {
    "chars" >> {
      pending
    }
    "strings" >> {
      val str = Value.String("this is my \" string", None)
      printer.print(str) mustEqual "\"this is my \" string\""
      shortPrinter.print(str) mustEqual "\"th...\""
    }

    "numbers" >> {
      printer.print(Value.Flonum(1.3, None)) mustEqual "1.3"
      printer.print(Value.Fixnum(-3, None)) mustEqual "-3"
    }

    "booleans" >> {
      printer.print(Value.Boolean(true, None)) mustEqual "#t"
      printer.print(Value.Boolean(false, None)) mustEqual "#f"
    }

    "symbols" >> {
      printer.print(Value.Symbol("Foo", None)) mustEqual "Foo"
    }

    "lists" >> {
      "proper" >> {
        val ls = Value.ProperList(
          List(Value.Boolean(true, None), Value.Boolean(false, None), Value.String("the string comes here", None)),
          None
        )

        printer.print(ls) mustEqual "'(#t #f \"the string comes here\")"
        shortPrinter.print(ls) mustEqual "'(#t #f ...)"
      }

      "improper" >> {
        val ls = Value.ImproperList(
          (
            List(Value.Boolean(true, None), Value.Boolean(false, None), Value.String("the string comes here", None)),
            Value.Boolean(true, None)
          ),
          None
        )

        printer.print(ls) mustEqual "'(#t #f \"the string comes here\" . #t)"
        shortPrinter.print(ls) mustEqual "'(#t #f ... . #t)"
      }

    }

    "vectors" >> {
      val vec = Value.Vector(
        Vector(Value.Boolean(true, None), Value.Boolean(false, None), Value.String("the string comes here", None)),
        None
      )

      printer.print(vec) mustEqual "'#(#t #f \"the string comes here\")"
      shortPrinter.print(vec) mustEqual "'#(#t #f ...)"
    }
  }
}
