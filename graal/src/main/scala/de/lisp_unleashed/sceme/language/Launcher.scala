package de.lisp_unleashed.sceme.language
import de.lisp_unleashed.sceme.language.parser.ScemeParser

object Launcher {
  def main(args: Array[String]): Unit =
    println(ScemeParser.parseDatum("234"))
}
