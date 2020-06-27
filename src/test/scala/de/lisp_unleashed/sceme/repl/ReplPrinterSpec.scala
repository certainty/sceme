package de.lisp_unleashed.sceme.repl
import de.lisp_unleashed.sceme.parser.Ast
import org.specs2.mutable.Specification

class ReplPrinterSpec extends Specification {
  val printer      = new ReplPrinter(PrinterConfig.default)
  val shortPrinter = new ReplPrinter(PrinterConfig(2, 2))

  "print" >> {
    "chars" >> {
      pending
    }
    "strings" >> {
      val str = Ast.String("this is my \" string", None)
      printer.print(str) mustEqual "\"this is my \" string\""
      shortPrinter.print(str) mustEqual "\"th...\""
    }

    "numbers" >> {
      printer.print(Ast.Flonum(1.3, None)) mustEqual "1.3"
      printer.print(Ast.Fixnum(-3, None)) mustEqual "-3"
    }

    "booleans" >> {
      printer.print(Ast.Boolean(true, None)) mustEqual "#t"
      printer.print(Ast.Boolean(false, None)) mustEqual "#f"
    }

    "symbols" >> {
      printer.print(Ast.Symbol("Foo", None)) mustEqual "Foo"
    }

    "lists" >> {
      "proper" >> {
        val ls = Ast.ProperList(
          List(Ast.Boolean(true, None), Ast.Boolean(false, None), Ast.String("the string comes here", None)),
          None
        )

        printer.print(ls) mustEqual "'(#t #f \"the string comes here\")"
        shortPrinter.print(ls) mustEqual "'(#t #f ...)"
      }

      "improper" >> {
        val ls = Ast.ImproperList(
          List(Ast.Boolean(true, None), Ast.Boolean(false, None), Ast.String("the string comes here", None)),
          Ast.Boolean(true, None),
          None
        )

        printer.print(ls) mustEqual "'(#t #f \"the string comes here\" . #t)"
        shortPrinter.print(ls) mustEqual "'(#t #f ... . #t)"
      }

    }

    "vectors" >> {
      val vec = Ast.Vector(
        Vector(Ast.Boolean(true, None), Ast.Boolean(false, None), Ast.String("the string comes here", None)),
        None
      )

      printer.print(vec) mustEqual "'#(#t #f \"the string comes here\")"
      shortPrinter.print(vec) mustEqual "'#(#t #f ...)"
    }
  }
}
