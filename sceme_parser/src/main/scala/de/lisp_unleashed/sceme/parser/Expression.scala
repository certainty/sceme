package de.lisp_unleashed.sceme.parser

/*
 * Expressions are higher order constructs, that have an external represntation in terms of `Syntax`.
 * The `ScemeParser` creates `Expression` out of a well structured stream of Syntax.
 */
sealed trait Expression extends SourceInformation

object Expression {
  final case class Literal(value: SelfEvaluating[_]) extends Expression {
    val location: Location = value.location
  }

  final case class Variable(value: SymbolSyntax) extends Expression {
      val location: Location = value.location
  }

  final case class If(test: Expression, consequent: Expression, alternate: Option[Expression], location: Location) extends Expression

  final case class Assign(identifier: Variable, value: Expression, location: Location)                             extends Expression

  final case class Begin(seq: Seq[Expression], location: Location)                                                 extends Expression

  final case class Application(operator: Expression, operands: Vector[Expression], location: Location) extends Expression

  sealed trait Quotation                                    extends Expression
  final case class Quote(datum: Syntax[_], location: Location)                  extends Quotation
  final case class QuasiQuote(datum: Expression, location: Location)            extends Quotation
  final case class Unquote(datum: Expression, location: Location)               extends Quotation
  final case class UnquoteSplicing(datum: List[Expression], location: Location) extends Quotation


  final case class Lambda(formals: Formals, body: Seq[Expression], location: Location) extends Expression

  sealed trait Definition extends Expression

  final case class Define(identifier: SymbolSyntax, expr: Expression, location: Location)
      extends Definition

  final case class DefineProcedure(identifier: SymbolSyntax,
                                   formals: Formals,
                                   body: Seq[Expression],
                                   location: Location)
      extends Definition

  final case class DefineValues(formals: Formals, body: Seq[Expression], location: Location)
      extends Definition

  sealed trait Formals
  final case class Single(expr: Variable)                         extends Formals
  final case class Variadic(args: List[Variable], rest: Variable) extends Formals
  final case class FixedArity(args: List[Variable])               extends Formals
}
