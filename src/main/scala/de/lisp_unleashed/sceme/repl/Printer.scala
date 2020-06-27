package de.lisp_unleashed.sceme.repl
import de.lisp_unleashed.sceme.parser.Ast

trait Printer {
  def print(datum: Ast.Datum): String
  def printAll(data: Seq[Ast.Datum]): String
}

case class PrinterConfig private (
  maxStringLength: Int,
  maxCollectionElements: Int // how many elements of a list are shown max
)

object PrinterConfig {
  val default: PrinterConfig = PrinterConfig(300, 50)

  def apply(maxStringLength: Int, maxCollectionElements: Int): PrinterConfig = {
    assert(maxCollectionElements > 0)
    assert(maxStringLength > 0)

    new PrinterConfig(maxCollectionElements, maxStringLength)
  }
}

class ReplPrinter(config: PrinterConfig) extends Printer {
  override def print(datum: Ast.Datum): String = {
    val builder = new StringBuilder
    print(datum, builder)
    builder.result()
  }

  override def printAll(data: Seq[Ast.Datum]): String = {
    val builder = new StringBuilder
    data.foreach(print(_, builder))
    builder.result()
  }

  private def print(datum: Ast.Datum, builder: StringBuilder): StringBuilder = datum match {
    case Ast.Char(value, _) => builder.append(charLiteral(value))
    case Ast.String(value, _) =>
      builder.append("\"")
      ellipsis(value, config.maxStringLength, builder)
      builder.append("\"")
    case Ast.Symbol(value, _) => builder.append(value)

    case Ast.Fixnum(value, _) => builder.append(value.toString())

    case Ast.Flonum(value, _) => builder.append(value.toString())

    case Ast.Boolean(value, _) =>
      if (value) {
        builder.append("#t")
      } else {
        builder.append("#f")
      }

    case Ast.ImproperList(values, tail, _) => {
      builder.append("'(")
      ellipsis(values, config.maxCollectionElements, builder)
      builder.append(" . ")
      print(tail, builder)
      builder.append(")")
    }
    case Ast.ProperList(ls, _) =>
      builder.append("'(")
      ellipsis(ls, config.maxCollectionElements, builder)
      builder.append(")")
    case Ast.Vector(v, _) =>
      builder.append("'#(")
      ellipsis(v, config.maxCollectionElements, builder)
      builder.append(")")

    case Ast.Abbreviation(prefix, value, _) =>
      builder.append(abbrevPrefix(prefix))
      print(value, builder)
  }

  private def ellipsis(str: String, length: Int, builder: StringBuilder): Unit = {
    if (str.length < length) {
      builder.appendAll(str)
    } else {
      builder.appendAll(str.take(length))
      builder.appendAll(ReplPrinter.ellipsisSuffix)
    }
    ()
  }

  private def ellipsis(ls: Seq[Ast.Datum], length: Int, builder: StringBuilder): Unit = {
    val elements     = ls.take(length)
    var elementsLeft = elements.length - 1

    elements.foreach { element =>
      print(element, builder)
      if (elementsLeft > 0) {
        builder.appendAll(" ")
        elementsLeft -= 1
      }
    }

    if (elements.length < ls.length) {
      builder.appendAll(" ")
      builder.appendAll(ReplPrinter.ellipsisSuffix)
    }
    ()
  }

  def abbrevPrefix(prefix: Ast.AbbreviationPrefix): String = prefix match {
    case Ast.Quote           => "'"
    case Ast.QuasiQuote      => "`"
    case Ast.Unquote         => ","
    case Ast.UnquoteSplicing => ",@"
  }

  private def charLiteral(ch: Char): String = ch match {
    case '\n'       => "#\\newline"
    case ' ' | '\t' => "#\\space"
    case other      => s"#\\$other"
  }

}

object ReplPrinter {
  private val ellipsisSuffix = "..."
}
