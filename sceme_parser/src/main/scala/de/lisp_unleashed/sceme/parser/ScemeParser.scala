package de.lisp_unleashed.sceme.parser

// extract scheme expression tree from AST
class ScemeParser {
  def parse(datum: Syntax[_]): Expression = datum match {
    // self evaluating
    case v: FixnumSyntax     => Literal(v)
    case v: FlonumSyntax     => Literal(v)
    case v: BooleanSyntax    => Literal(v)
    case v: StringSyntax     => Literal(v)
    case v: CharacterSyntax  => Literal(v)
    case v: VectorSyntax     => Literal(v)
    case v: ByteVectorSyntax => Literal(v)
    // quotation
    // lambda expression
    // conditional
    // procedure call

  }

  def parse(sequence: Seq[Syntax[_]]): Expression = ???
}
