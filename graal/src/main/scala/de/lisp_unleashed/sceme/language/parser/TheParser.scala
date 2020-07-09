package de.lisp_unleashed.sceme.language.parser
import de.lisp_unleashed.sceme.language.parser.gen.{ ScemeLexer, ScemeParser }
import org.antlr.v4.runtime.{ CharStreams, CommonTokenStream }

class TheParser {
  def parser(source: String): ScemeParser.ProgramContext = {
    val stream      = CharStreams.fromString(source)
    val tokenStream = new CommonTokenStream(new ScemeLexer(stream))
    val scemeParser = new ScemeParser(tokenStream)

    scemeParser.program()
  }
}
