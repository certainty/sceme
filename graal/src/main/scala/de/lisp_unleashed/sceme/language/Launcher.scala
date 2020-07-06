package de.lisp_unleashed.sceme.language

import de.lisp_unleashed.sceme.language.parser.TheParser

object Launcher {
  def main(args: Array[String]): Unit =
    println(new TheParser().parser("234"))
}
