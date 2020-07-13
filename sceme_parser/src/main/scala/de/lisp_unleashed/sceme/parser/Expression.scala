package de.lisp_unleashed.sceme.parser


// expressions
sealed trait Expression

object Expression {
  final case class Literal(value: SelfEvaluating) extends Expression

  sealed trait Quotation extends Expression
  final case class Quote(datum: Syntax[_]) extends Quotation
  final case class QuasiQuote(datum: Syntax[_]) extends Quotation

  final case class Variable(value: SymbolSyntax) extends Expression
  final case class Lambda(formals: Either[Pair, SymbolSyntax], body: Seq[Expression], sourceInformation: SourceInformation) extends Expression
  final case class Application(operator: Expression, operands: Vector[Expression], sourceInformation: SourceInformation) extends Expression
  final case class If(test: Expression, consequent: Expression, alternate: Option[Expression]) extends Expression
  final case class Assign(identifier: SymbolSyntax, value: Expression) extends Expression
  final case class Begin(seq: Seq[Expression]) extends Expression

  sealed trait Definition extends Expression
  final case class Define(identifier: SymbolSyntax, formals: Pair, body: Seq[Expression]) extends Definition
  final case class DefineValues(formals: Pair, body: Seq[Expression]) extends Definition
}

