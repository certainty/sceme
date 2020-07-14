package de.lisp_unleashed.sceme.printer
import de.lisp_unleashed.sceme.Printer
import de.lisp_unleashed.sceme.runtime.Value

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
    case Value.Char(value) => builder.append(charLiteral(value))
    case Value.String(value) =>
      builder.append("\"")
      ellipsis(value, config.maxStringLength, builder)
      builder.append("\"")
    case Value.Symbol(value) => builder.append(value)

    case Value.Fixnum(value) => builder.append(value.toString())

    case Value.Flonum(value) => builder.append(value.toString())

    case num: Value.Number[_] => builder.appendAll(num.value.toString)

    case Value.Boolean(value) =>
      if (value) {
        builder.append("#t")
      } else {
        builder.append("#f")
      }

    case Value.ImproperList((values, tail)) => {
      builder.append("'(")
      ellipsis(values, config.maxCollectionElements, builder)
      builder.append(" . ")
      print(tail, builder)
      builder.append(")")
    }
    case Value.ProperList(Nil) => builder.appendAll("'()")

    case Value.ProperList(ls) =>
      builder.append("'(")
      ellipsis(ls, config.maxCollectionElements, builder)
      builder.append(")")
    case Value.Vector(v) =>
      builder.append("'#(")
      ellipsis(v, config.maxCollectionElements, builder)
      builder.append(")")

    case Value.Void => builder.appendAll("#<void>")

    case Value.Procedure(_, _) => builder.appendAll("#<procedure>")

    case _: Value.ForeignLambda => builder.appendAll("#<procedure>")

    case Value.MultipleValues(values) => {
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
