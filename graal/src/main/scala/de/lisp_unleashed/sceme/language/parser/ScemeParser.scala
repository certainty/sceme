package de.lisp_unleashed.sceme.language.parser
import org.antlr.v4.runtime.{ CharStreams, CommonTokenStream }

object ScemeParser {
  def main(args: Array[String]): Unit = {
    println(parseProgram("(define x 1)"))
    println("Done")
  }

  def parseProgram(source: String): gen.ScemeParser.ProgramContext = {
    val stream      = CharStreams.fromString(source)
    val tokenStream = new CommonTokenStream(new gen.ScemeLexer(stream))
    val scemeParser = new gen.ScemeParser(tokenStream)

    scemeParser.program()
  }

  def parseDatum(source: String): gen.ScemeParser.DatumContext = {
    val stream      = CharStreams.fromString(source)
    val tokenStream = new CommonTokenStream(new gen.ScemeLexer(stream))
    val scemeParser = new gen.ScemeParser(tokenStream)

    scemeParser.datum()
    // use visitor to create runtime values
  }
}
