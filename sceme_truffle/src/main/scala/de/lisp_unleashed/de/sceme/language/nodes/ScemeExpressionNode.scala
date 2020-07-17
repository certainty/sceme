package de.lisp_unleashed.de.sceme.language.nodes

import com.oracle.truffle.api.nodes.NodeInfo
import de.lisp_unleashed.de.sceme.language.ScemeLanguage

@NodeInfo(language = ScemeLanguage.ID, description = "The base node for all expressions")
trait ScemeExpressionNode[@specialized +T] extends ScemeNode[T]
