package de.lisp_unleashed.sceme.printer
import de.lisp_unleashed.sceme.{ Printer, Value }

class DefaultPrinter(config: Configuration) extends Printer {
  override def print(datum: Value): String = {
    val builder = new StringBuilder
    print(datum, builder)
    builder.result()
  }

  override def printAll(data: Seq[Value]): String = {
    val builder = new StringBuilder
    data.foreach(print(_, builder))
    builder.result()
  }

  private def print(datum: Value, builder: StringBuilder): StringBuilder = datum match {
    case Value.Char(value, _) => builder.append(charLiteral(value))
    case Value.String(value, _) =>
      builder.append("\"")
      ellipsis(value, config.maxStringLength, builder)
      builder.append("\"")
    case Value.Symbol(value, _) => builder.append(value)

    case Value.Fixnum(value, _) => builder.append(value.toString())

    case Value.Flonum(value, _) => builder.append(value.toString())

    case Value.Boolean(value, _) =>
      if (value) {
        builder.append("#t")
      } else {
        builder.append("#f")
      }

    case Value.ImproperList(values, tail, _) => {
      builder.append("'(")
      ellipsis(values, config.maxCollectionElements, builder)
      builder.append(" . ")
      print(tail, builder)
      builder.append(")")
    }
    case Value.ProperList(Nil, _) => builder.appendAll("'()")

    case Value.ProperList(ls, _) =>
      builder.append("'(")
      ellipsis(ls, config.maxCollectionElements, builder)
      builder.append(")")
    case Value.Vector(v, _) =>
      builder.append("'#(")
      ellipsis(v, config.maxCollectionElements, builder)
      builder.append(")")

    case Value.Quote(value, _) =>
      builder.append('\'')
      print(value, builder)

    case Value.QuasiQuote(value, _) =>
      builder.append('`')
      print(value, builder)

    case Value.Unquote(value, _) =>
      builder.append(',')
      print(value, builder)

    case Value.UnquoteSplicing(value, _) =>
      builder.append(",@")
      print(value, builder)

    case Value.Void(_) => builder.appendAll("#<void>")

    case Value.Procedure(_, _) => builder.appendAll("#<procedure>")

    case Value.MultipleValues(values, _) => {
      values.foreach { v =>
        print(v, builder)
        builder.append("\n")
      }
      builder
    }
  }

  private def ellipsis(str: String, length: Int, builder: StringBuilder): Unit = {
    if (str.length < length) {
      builder.appendAll(str)
    } else {
      builder.appendAll(str.take(length))
      builder.appendAll(DefaultPrinter.ellipsisSuffix)
    }
    ()
  }

  private def ellipsis(ls: Seq[Value], length: Int, builder: StringBuilder): Unit = {
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
      builder.appendAll(DefaultPrinter.ellipsisSuffix)
    }
    ()
  }

  private def charLiteral(ch: Char): String = ch match {
    case '\n'       => "#\\newline"
    case ' ' | '\t' => "#\\space"
    case other      => s"#\\$other"
  }

}

object DefaultPrinter {
  private val ellipsisSuffix = "..."
}
