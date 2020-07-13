package de.lisp_unleashed.sceme.parser

import de.lisp_unleashed.sceme.parser.Expression.{If, Literal, Variable}

// extract scheme expression tree from AST
class ScemeParser {
  def parse(sequence: Seq[Syntax[_]]): Expression = ???

  def parse(datum: Sexp): Expression = datum match {
    // self evaluating
    case v: FixnumSyntax     => Literal(v)
    case v: FlonumSyntax     => Literal(v)
    case v: BooleanSyntax    => Literal(v)
    case v: StringSyntax     => Literal(v)
    case v: CharacterSyntax  => Literal(v)
    case v: VectorSyntax     => Literal(v)
    case v: ByteVectorSyntax => Literal(v)
    case v: SymbolSyntax     => Variable(v)
    // TODO: handle imports and modules
    // quotation
    case form @ ProperListSyntax(SymbolSyntax("quote", _, _) :: _, _) => parseQuotation(form)
    // lambda expression
    case form @ ProperListSyntax(SymbolSyntax("lambda", _, _) :: _, _) => parseLambda(form)
    // conditional
    case form @ ProperListSyntax(SymbolSyntax("if", _, _) :: _, _) => parseConditional(form)
    // assign
    case form @ ProperListSyntax(SymbolSyntax("set!", _, _) :: _, _) => parseAssign(form)
    // definition
    case form @ ProperListSyntax(SymbolSyntax("define", _, _) :: _, _) => parseDefine(form)
    case form @ ProperListSyntax(SymbolSyntax("define-values", _, _) :: _, _) => parseDefineValues(form)
    // TODO: add derived expressions like cond here as well for now? Since we don't have macros

    // application
    case form @ ProperListSyntax(_ : SymbolSyntax :: _, _) => parseApplication(form)
  }
  private def parseQuotation(syntax: ProperListSyntax) = ???

  private def parseLambda(syntax: ProperListSyntax) = ???

  private def parseConditional(syntax: ProperListSyntax) = syntax.value match {
    case List(_, test, consequent) => If(parse(test), parse(consequent), None)
    case List(_, test, consequent, alternate) => If(parse(test), parse(consequent), Some(parse(alternate)))
    case _ => ???
  }

  private def parseAssign(syntax: ProperListSyntax) = ???

  private def parseDefine(syntax: ProperListSyntax) = ???

  private def parseDefineValues(syntax: ProperListSyntax) = ???

  private def parseApplication(syntax: ProperListSyntax) = ???

}
