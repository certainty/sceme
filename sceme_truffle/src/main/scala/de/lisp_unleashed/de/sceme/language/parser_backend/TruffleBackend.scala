package de.lisp_unleashed.de.sceme.language.parser_backend

import com.oracle.truffle.api.source.SourceSection
import de.lisp_unleashed.de.sceme.language.TruffleSourceScemeSource
import de.lisp_unleashed.de.sceme.language.nodes._
import de.lisp_unleashed.sceme.parser.Expression.Literal
import de.lisp_unleashed.sceme.parser._

/* Translate the generic Sceme AST into a truffle Tree */
class TruffleBackend(module: ScemeModule) {
  private val truffleSource: TruffleSourceScemeSource = {
    module.source match {
      case s: TruffleSourceScemeSource => s
    }
  }

  def toTruffle: Seq[ScemeNode[_]] =
    walk(module.expressions)

  private def walk(exprs: Seq[Expression]): Seq[ScemeNode[_]] =
    exprs.map(walk)

  private def walk(expr: Expression): ScemeNode[_] = expr match {
    case l: Literal => createLiteral(l.value)
    case _          => throw new Exception("not supported")

  }

  private def createLiteral(value: SelfEvaluating[_]): LiteralNode[_] = value match {
    case SymbolSyntax(value, _, location) => new SymbolNode(Symbol(value), sourceSection(location))
    case StringSyntax(value, location)    => new StringNode(value, sourceSection(location))
    case FixnumSyntax(value, location)    => new FixnumNode(value, sourceSection(location))
    case FlonumSyntax(value, location)    => new FlonumNode(value, sourceSection(location))
    case BooleanSyntax(value, location)   => new BooleanNode(value, sourceSection(location))
    case CharacterSyntax(value, location) => new CharNode(value, sourceSection(location))
    case _                                => throw new Exception("Not supported")
  }

  private def sourceSection(location: Location): SourceSection =
    ScemeNode.createSourceSection(truffleSource, location)

}
