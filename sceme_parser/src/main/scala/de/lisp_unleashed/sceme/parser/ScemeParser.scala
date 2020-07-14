package de.lisp_unleashed.sceme.parser

import de.lisp_unleashed.sceme.parser.Expression._

class ParseError(message: String, sourceInformation: SourceInformation) extends Exception(message) {
  def getSourceInformation: SourceInformation = sourceInformation
}

class NotYetSupportedException(str: String) extends Exception(str)

// extract scheme expression tree from AST
class ScemeParser {
  def parse(input: String): Expression =
    parse(ScemeReader.read(input))

  def parse(reader: java.io.Reader): Expression =
    parse(ScemeReader.read(reader))

  def parse(sequence: Seq[Syntax[_]]): Expression = ???

  def parse(datum: Syntax[_]): Expression = datum match {
    // self evaluating
    case v: SymbolSyntax      => Variable(v)
    case v: SelfEvaluating[_] => Literal(v)
    case form @ ProperListSyntax((sym: SymbolSyntax) :: _, _) =>
      sym.value match {
        case "quote"         => parseQuotation(form)
        case "quasiquote"    => parseQuasiQuotation(form)
        case "lambda"        => parseLambda(form)
        case "if"            => parseConditional(form)
        case "set!"          => parseAssign(form)
        case "define"        => parseDefine(form)
        case "define-values" => parseDefineValues(form)
        case _               => parseApplication(form)
      }
    case form: ProperListSyntax => parseApplication(form)
    case _                      => parseError(datum, "None")

  }

  private def parseVariable(syntax: Syntax[_]): Variable = syntax match {
    case v: SymbolSyntax => Variable(v)
    case _               => parseError(syntax, "Symbol")
  }

  private def parseQuotation(syntax: ProperListSyntax): Quote = syntax.value match {
    case List(_, rest) => Quote(rest)
    case _             => parseError(syntax, "(quote datum)")
  }

  private def parseQuasiQuotation(syntax: ProperListSyntax): QuasiQuote = syntax.value match {
    case List(_, ls: ProperListSyntax)   => QuasiQuote(parseQuasiQuotePattern(ls))
    case List(_, ls: ImproperListSyntax) => QuasiQuote(parseQuasiQuotePattern(ls))
    case List(_, v: SelfEvaluating[_])   => QuasiQuote(Literal(v))
    case _                               => parseError(syntax, "(quasiquote form)")
  }

  private def parseQuasiQuotePattern(syntax: Syntax[_]): Expression = syntax.value match {
    case ProperListSyntax(List(s: SymbolSyntax, rest), _) if s.value == "unquote" =>
      QuasiQuote(Unquote(parse(rest)))
    case ProperListSyntax(List(s: SymbolSyntax, ls: ProperListSyntax), _) if s.value == "unquote-splicing" =>
      QuasiQuote(UnquoteSplicing(ls.value.map(parse)))
    case _ => notYetSupported("Nested quasiquote patterns")
  }

  private def parseLambda(syntax: ProperListSyntax): Lambda = syntax.value match {
    case _ :: (s: SymbolSyntax) :: body =>
      Lambda(Single(Variable(s)), parseBody(body), syntax.sourceSection)

    case _ :: ProperListSyntax(symbols, _) :: body =>
      val formals = FixedArity(symbols.map(parseVariable))
      Lambda(formals, parseBody(body), syntax.sourceSection)

    case _ :: ImproperListSyntax((symbols, last), _) :: body =>
      val formals = Variadic(symbols.map(parseVariable), parseVariable(last))
      Lambda(formals, parseBody(body), syntax.sourceSection)

    case _ => parseError(syntax, "Lambda expression")
  }

  private def parseBody(commandOrDef: List[Syntax[_]]): Seq[Expression] =
    commandOrDef.map(parse)

  private def parseConditional(syntax: ProperListSyntax) = syntax.value match {
    case List(_, test, consequent)            => If(parse(test), parse(consequent), None)
    case List(_, test, consequent, alternate) => If(parse(test), parse(consequent), Some(parse(alternate)))
    case _                                    => parseError(syntax, "(if test consequent alternate)")
  }

  private def parseAssign(syntax: ProperListSyntax): Assign = syntax.value match {
    case List(_, identifier, value) => Assign(parseVariable(identifier), parse(value))
    case _                          => parseError(syntax, "(set! identifier expression)")
  }

  private def parseApplication(syntax: ProperListSyntax): Application = syntax.value match {
    case operator :: operands => Application(parse(operator), operands.map(parse).toVector, syntax.sourceSection)
    case _                    => parseError(syntax, "(operator operands ...)")
  }

  private def parseDefine(syntax: ProperListSyntax): Definition = syntax.value match {
    //(define (x y . z) foo)
    case List(_, ProperListSyntax((identifier: SymbolSyntax) :: ImproperListSyntax((head, tail), _) :: body, _)) =>
      val formals = Variadic(head.map(parseVariable), parseVariable(tail))
      DefineProcedure(identifier, formals, body.map(parse), syntax.sourceSection)

    //(define (x y z) foo)
    case List(_, ProperListSyntax((identifier: SymbolSyntax) :: (args: ProperListSyntax) :: body, _)) =>
      val formals = FixedArity(args.value.map(parseVariable))
      DefineProcedure(identifier, formals, body.map(parse), syntax.sourceSection)

    //(define x foo)
    case List(_, identifier: SymbolSyntax, expr) => Define(identifier, parse(expr), syntax.sourceSection)
    case _                                       => parseError(syntax, "definition")
  }

  private def parseDefineValues(syntax: ProperListSyntax): Definition = syntax match {
    case _ => notYetSupported("define-values")
  }

  private def parseError[T](unexpected: Syntax[_], expected: String, message: String = ""): T =
    throw new ParseError(s"${message} Unexpected form: ${unexpected}. Expected ${expected}.", unexpected.sourceSection)

  private def notYetSupported[T](message: String): T =
    throw new NotYetSupportedException(message)
}
