package de.lisp_unleashed.sceme.parser

// expressions
sealed trait Expression

object Expression {
  final case class Literal(value: SelfEvaluating[_]) extends Expression

  sealed trait Quotation                                    extends Expression
  final case class Quote(datum: Syntax[_])                  extends Quotation
  final case class QuasiQuote(datum: Expression)            extends Quotation
  final case class Unquote(datum: Expression)               extends Quotation
  final case class UnquoteSplicing(datum: List[Expression]) extends Quotation

  sealed trait Formals
  final case class Single(expr: Variable)                         extends Formals
  final case class Variadic(args: List[Variable], rest: Variable) extends Formals
  final case class FixedArity(args: List[Variable])               extends Formals

  final case class Variable(value: SymbolSyntax) extends Expression

  final case class Lambda(formals: Formals, body: Seq[Expression], sourceInformation: SourceInformation)
      extends Expression
  final case class Application(operator: Expression, operands: Vector[Expression], sourceInformation: SourceInformation)
      extends Expression
  final case class If(test: Expression, consequent: Expression, alternate: Option[Expression]) extends Expression
  final case class Assign(identifier: Variable, value: Expression)                             extends Expression
  final case class Begin(seq: Seq[Expression])                                                 extends Expression

  sealed trait Definition extends Expression

  final case class Define(identfier: SymbolSyntax, expr: Expression, sourceInformation: SourceInformation)
      extends Definition

  final case class DefineProcedure(identifier: SymbolSyntax,
                                   formals: Formals,
                                   body: Seq[Expression],
                                   sourceInformation: SourceInformation)
      extends Definition

  final case class DefineValues(formals: Pair, body: Seq[Expression], sourceInformation: SourceInformation)
      extends Definition
}
