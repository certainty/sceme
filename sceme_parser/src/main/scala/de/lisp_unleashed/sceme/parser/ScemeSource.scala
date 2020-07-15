package de.lisp_unleashed.sceme.parser
import java.net.URI
import org.antlr.v4.runtime.{CharStreams, CodePointCharStream}

sealed trait ScemeSource {
  def stream: CodePointCharStream
}

case class StringSource(input: String) extends ScemeSource {
  override def stream: CodePointCharStream = CharStreams.fromString(input)
}

case class URISource(uri: URI) extends ScemeSource {
  override def stream: CodePointCharStream = {
    CharStreams.fromReader(scala.io.Source.fromFile(uri).reader())
  }
}

case class ReaderSource(reader: java.io.Reader) extends ScemeSource {
  override def stream: CodePointCharStream = CharStreams.fromReader(reader)
}

