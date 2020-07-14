package de.lisp_unleashed.sceme.printer

import de.lisp_unleashed.sceme.runtime.Value
import org.specs2.mutable.Specification

class DefaultPrinterSpec extends Specification {
  val printer      = new DefaultPrinter(Configuration.default)
  val shortPrinter = new DefaultPrinter(Configuration(2, 2))

  "print" >> {
    "chars" >> {
      pending
    }
    "strings" >> {
      val str = Value.String("this is my \" string")
      printer.print(str) mustEqual "\"this is my \" string\""
      shortPrinter.print(str) mustEqual "\"th...\""
    }

    "numbers" >> {
      printer.print(Value.Flonum(1.3)) mustEqual "1.3"
      printer.print(Value.Fixnum(-3)) mustEqual "-3"
    }

    "booleans" >> {
      printer.print(Value.Boolean(true)) mustEqual "#t"
      printer.print(Value.Boolean(false)) mustEqual "#f"
    }

    "symbols" >> {
      printer.print(Value.Symbol("Foo")) mustEqual "Foo"
    }

    "lists" >> {
      "proper" >> {
        val ls = Value.ProperList(
          List(Value.Boolean(true), Value.Boolean(false), Value.String("the string comes here")),
        )

        printer.print(ls) mustEqual "'(#t #f \"the string comes here\")"
        shortPrinter.print(ls) mustEqual "'(#t #f ...)"
      }

      "improper" >> {
        val ls = Value.ImproperList(
          (
            List(Value.Boolean(true), Value.Boolean(false), Value.String("the string comes here")),
            Value.Boolean(true)
          ),
        )

        printer.print(ls) mustEqual "'(#t #f \"the string comes here\" . #t)"
        shortPrinter.print(ls) mustEqual "'(#t #f ... . #t)"
      }

    }

    "vectors" >> {
      val vec = Value.Vector(
        Vector(Value.Boolean(true), Value.Boolean(false), Value.String("the string comes here")),
      )

      printer.print(vec) mustEqual "'#(#t #f \"the string comes here\")"
      shortPrinter.print(vec) mustEqual "'#(#t #f ...)"
    }
  }
}
