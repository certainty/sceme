package de.lisp_unleashed.sceme.language.parser
import com.oracle.truffle.api.source.Source
import org.antlr.v4.runtime.{ CharStreams, CodePointCharStream, CommonTokenStream }

object ScemeParser {
  def parseProgram(source: Source): gen.ScemeParser.ProgramContext = {
    val stream: CodePointCharStream = CharStreams.fromReader(source.getReader)
    doParse(stream, _.program())
  }

  def parseProgram(source: String): gen.ScemeParser.ProgramContext = {
    val stream = CharStreams.fromString(source)
    doParse(stream, _.program())
  }

  def parseDatum(source: String): gen.ScemeParser.DatumContext = {
    val stream = CharStreams.fromString(source)
    doParse(stream, _.datum())
  }

  private def doParse[T](sourceStream: CodePointCharStream, parse: gen.ScemeParser => T): T = {
    val tokenStream = new CommonTokenStream(new gen.ScemeLexer(sourceStream))
    val scemeParser = new gen.ScemeParser(tokenStream)
    parse(scemeParser)
  }
}
