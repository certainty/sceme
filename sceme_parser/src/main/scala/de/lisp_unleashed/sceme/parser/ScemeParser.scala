package de.lisp_unleashed.sceme.parser

import de.lisp_unleashed.sceme.parser.Expression.{If, Lambda, Literal, Variable}

class ParseError(message: String, sourceInformation: SourceInformation) extends Exception(message) {
  val getSourceInformation: SourceInformation = sourceInformation
}

// extract scheme expression tree from AST
class ScemeParser {
  def parse(input: String): Expression = {
    parse(ScemeReader.read(input))
  }

  def parse(reader: java.io.Reader): Expression = {
    parse(ScemeReader.read(reader))
  }

  def parse(sequence: Seq[Syntax[_]]): Expression = ???

  def parse(datum: Syntax[_]): Expression = datum match {
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
    case form @ ProperListSyntax((_ : SymbolSyntax) :: _, _) => parseApplication(form)
    case _ => parseError(datum, "None")
  }
  private def ensureSymbol(syntax: Syntax[_]): SymbolSyntax = syntax match {
    case s: SymbolSyntax => s
    case _ => parseError(syntax, "Symbol")
  }

  private def parseQuotation(syntax: ProperListSyntax) = ???

  private def parseLambda(syntax: ProperListSyntax) = syntax.value match {
    case _ :: (s : SymbolSyntax) :: body => Lambda(Right(s), parseBody(body), syntax.sourceSection)
    case _ :: ProperListSyntax(symbols, source) :: body => {
      symbols.foreach(ensureSymbol)
      Lambda(Left(ProperListSyntax(symbols, source)), parseBody(body), syntax.sourceSection)
    }
    case _ :: ImproperListSyntax((symbols, last), source) :: body => {
      symbols.foreach(ensureSymbol)
      ensureSymbol(last)
      Lambda(Left(ImproperListSyntax((symbols, last), source)), parseBody(body), syntax.sourceSection)
    }
    case _ => parseError(syntax, "Lambda expression")
  }

  private def parseBody(commandOrDef: List[Syntax[_]]): Seq[Expression] = {
    commandOrDef.map(parse)
  }

  private def parseConditional(syntax: ProperListSyntax) = syntax.value match {
    case List(_, test, consequent) => If(parse(test), parse(consequent), None)
    case List(_, test, consequent, alternate) => If(parse(test), parse(consequent), Some(parse(alternate)))
    case _ => parseError(syntax, "(if test consequent alternate)")
  }

  private def parseAssign(syntax: ProperListSyntax) = ???

  private def parseDefine(syntax: ProperListSyntax) = ???

  private def parseDefineValues(syntax: ProperListSyntax) = ???

  private def parseApplication(syntax: ProperListSyntax) = ???

  private def parseError[T](unexpected: Syntax[_], expected: String, message: String = ""): T = {
    throw new ParseError(s"${message} Unexpected form: ${unexpected}. Expected ${expected}.", unexpected.sourceSection)
  }
}
