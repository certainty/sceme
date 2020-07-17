package de.lisp_unleashed.de.sceme.language.nodes
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import com.oracle.truffle.api.source
import com.oracle.truffle.api.source.SourceSection
import de.lisp_unleashed.de.sceme.language.ScemeLanguage

@NodeInfo(language = ScemeLanguage.ID, description = "The abstract base node literal values")
trait LiteralNode[T] extends ScemeExpressionNode[T] {
  @CompilationFinal protected def sourceSection: source.SourceSection
  @CompilationFinal protected def value: T
  override def execute(virtualFrame: VirtualFrame): T = value
  override def getSourceSection: source.SourceSection = sourceSection
}

class BooleanNode(protected val value: Boolean, protected val sourceSection: SourceSection) extends LiteralNode[Boolean]

class StringNode(protected val value: String, protected val sourceSection: SourceSection) extends LiteralNode[String]

class FixnumNode(protected val value: Long, protected val sourceSection: SourceSection) extends LiteralNode[Long]

class FlonumNode(protected val value: Double, protected val sourceSection: SourceSection) extends LiteralNode[Double]

class CharNode(protected val value: Char, protected val sourceSection: SourceSection) extends LiteralNode[Char]

class SymbolNode(protected val value: Symbol, protected val sourceSection: SourceSection) extends LiteralNode[Symbol]
