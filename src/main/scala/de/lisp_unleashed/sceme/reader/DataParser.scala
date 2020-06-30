package de.lisp_unleashed.sceme.reader
import de.lisp_unleashed.sceme.Value
import de.lisp_unleashed.sceme.parser.PositionTracking
import org.parboiled2.CharPredicate.{ Digit, Digit19, HexDigit }
import org.parboiled2._

// https://people.csail.mit.edu/jaffer/r5rs_9.html

/*
At a very fundamental level we only need to be able to parse <Datum>.
The AST for that will be walked and turned into values in a later phase.

<datum> --> <simple datum> | <compound datum>
<simple datum> --> <boolean> | <number>
     | <character> | <string> |  <symbol>
<symbol> --> <identifier>
<compound datum> --> <list> | <vector>
<list> --> (<datum>*) | (<datum>+ . <datum>)
       | <abbreviation>
<abbreviation> --> <abbrev prefix> <datum>
<abbrev prefix> --> ' | ` | , | ,@
<vector> --> #(<datum>*)
 */

trait Program { this: Parser with Datum with Ignored =>
  def Program = rule {
    Ignored.* ~ trackPos ~ Datum.+ ~ Ignored.* ~ EOI ~> ((_, p) => p.toVector)
  }
}

trait Datum extends PositionTracking { this: Parser with Ignored with Tokens with Numbers with Strings =>
  def Datum: Rule1[Value] = rule { Ignored.* ~ SimpleDatum | CompoundDatum }

  def SimpleDatum = rule { BoolLiteral | NumberLiteral | CharacterLiteral | StringLiteral | SymbolLiteral }

  def BoolLiteral = rule {
    Ignored.* ~ trackPos ~ Keyword("#t") ~> ((location) => Value.Boolean(true, location)) |
      Ignored.* ~ trackPos ~ Keyword("#f") ~> ((location) => Value.Boolean(false, location))
  }

  def SymbolLiteral = rule {
    Ignored.* ~ trackPos ~ capture(Identifier) ~>
      ((pos, identifier) => Value.Symbol(identifier, pos))
  }

  def CompoundDatum = rule { ListLiteral | VectorLiteral }

  def ListLiteral = rule { ProperList | ImproperList | Abbreviation }

  def ProperList = rule {
    Ignored.* ~ trackPos ~ atomic(ch('(') ~ Ignored.* ~ Datum.* ~ Ignored.* ~ ch(')')) ~>
      ((pos, dat) => Value.ProperList(dat.toList, pos))
  }

  def ImproperList = rule {
    Ignored.* ~ trackPos ~ atomic(
      ch('(') ~ Ignored.* ~ Datum.+ ~ Ignored.* ~ ch('.') ~ Ignored.* ~ Datum ~ Ignored.* ~ ch(')')
    ) ~>
      ((pos, h, t) => Value.ImproperList((h.toList, t), pos))
  }

  def Abbreviation = rule {
    Ignored.* ~ (Quote | QuasiQuote | Unquote | UnquoteSplicing)
  }

  def Quote = rule {
    trackPos ~ atomic(ch('\'') ~ Datum) ~> ((pos, datum) => Value.Quote(datum, pos))
  }

  def QuasiQuote = rule {
    trackPos ~ atomic(ch('`') ~ Datum) ~> ((pos, datum) => Value.QuasiQuote(datum, pos))
  }

  def Unquote = rule {
    trackPos ~ atomic(ch(',') ~ Datum) ~> ((pos, datum) => Value.Unquote(datum, pos))
  }

  def UnquoteSplicing = rule {
    trackPos ~ atomic(str(",@") ~ Datum) ~> ((pos, datum) => Value.UnquoteSplicing(datum, pos))
  }

  def VectorLiteral = rule {
    Ignored.* ~ trackPos ~ atomic(str("#(") ~ Ignored.* ~ Datum.* ~ Ignored.* ~ ch(')')) ~>
      ((pos, data) => Value.Vector(data.toVector, pos))
  }
}

trait Tokens extends PositionTracking { this: Parser with Ignored =>
  def Identifier         = rule { (Initial ~ Subsequent.*) | PeculiarIdentifier }
  def Initial            = rule { CharPredicate.Alpha | SpecialInitial }
  def PeculiarIdentifier = rule { atomic(ch('+') | ch('-') | str("...")) }
  def SpecialInitial     = CharPredicate("!$%&*/:<=>?^_~")
  def Subsequent         = rule { Initial | Digit | SpecialSubsequent }
  def SpecialSubsequent  = CharPredicate("+-.@")

  def Keyword(s: String) = rule { atomic(Ignored.* ~ s ~ Ignored.*) }
}

trait Ignored extends PositionTracking { this: Parser =>
  val WhiteSpace     = CharPredicate("\u0009\u0020")
  def CRLF           = rule { '\u000D' ~ '\u000A' }
  val LineTerminator = CharPredicate("\u000A")

  def Ignored     = rule { quiet(WhiteSpace | (CRLF | LineTerminator) ~ trackNewLine | Comment) }
  def Comment     = rule { ";" ~ CommentChar.* }
  def CommentChar = rule { !(CRLF | LineTerminator) ~ ANY }

  def ws(char: Char): Rule0 = rule { quiet(Ignored.* ~ ch(char) ~ Ignored.*) }
  def ws(s: String): Rule0  = rule { quiet(Ignored.* ~ str(s) ~ Ignored.*) }
}

trait Strings extends StringBuilding with PositionTracking { this: Parser with Tokens with Ignored =>

  def CharacterLiteral = rule {
    Ignored.* ~ trackPos ~ atomic(quiet(str("#\\")) ~ SingleCharacter) ~> ((location, c) => Value.Char(c, location))
  }

  def SingleCharacter = rule {
    str("space") ~> (() => ' ') |
      str("newline") ~> (() => '\n') |
      Unicode ~> ((code) => code.asInstanceOf[Char]) |
      capture(ANY) ~> ((c) => c(0))
  }

  def StringLiteral = rule {
    Ignored.* ~ trackPos ~ '"' ~ clearSB() ~ Characters ~ '"' ~ push(sb.toString) ~ Ignored.* ~>
      ((location, s) => Value.String(s, location))
  }

  def Characters      = rule { (NormalCharacter | '\\' ~ EscapedChar).* }
  def NormalCharacter = rule { !(QuoteBackslash | LineTerminator) ~ ANY ~ appendSB() }
  val QuoteBackslash  = CharPredicate("\"\\")

  def EscapedChar = rule {
    QuoteBackslash ~ appendSB() |
      'b' ~ appendSB('\b') |
      'f' ~ appendSB('\f') |
      'n' ~ appendSB('\n') |
      'r' ~ appendSB('\r') |
      't' ~ appendSB('\t') |
      Unicode ~> { code =>
        sb.append(code.asInstanceOf[Char]);
        ()
      }
  }

  def Unicode = rule { 'u' ~ capture(4 times HexDigit) ~> (Integer.parseInt(_, 16)) }
}

trait Numbers { this: Parser with Ignored =>
  def NumberLiteral = rule {
    atomic(trackPos ~ IntegerValuePart ~ FloatValuePart.? ~ Ignored.*) ~>
      ((location, intPart, floatPart) => {
        floatPart.map { f =>
          Value.Flonum(BigDecimal(intPart + f), location)
        }.getOrElse(Value.Fixnum(BigInt(intPart), location))
      })
  }

  def FloatValuePart = rule { atomic(capture(FractionalPart ~ ExponentPart.? | ExponentPart)) }

  def FractionalPart = rule { '.' ~ Digit.+ }

  def IntegerValuePart = rule { capture(NegativeSign.? ~ IntegerPart) }

  def IntegerPart = rule { ch('0') | NonZeroDigit ~ Digit.* }

  def ExponentPart = rule { ExponentIndicator ~ Sign.? ~ Digit.+ }

  def ExponentIndicator = rule { ch('e') | ch('E') }

  def Sign = rule { ch('-') | '+' }

  val NegativeSign = '-'

  val NonZeroDigit = Digit19

  def Digit = rule { ch('0') | NonZeroDigit }
}

case class SyntaxError(parser: Parser, input: ParserInput, originalError: ParseError) extends Exception(originalError) {
  lazy val formattedError: String = formattedError()

  def formattedError(showPosition: Boolean = true): String =
    if (showPosition)
      parser.formatError(originalError)
    else
      parser.formatError(originalError, formatter = new ErrorFormatter(showPosition = false, showLine = false))

  override def getMessage = s"Syntax error while parsing sceme source. $formattedError"
}
// TODO:
// 1. Improve parser errors by using atomic and named rules
// 2. Think about removing location from Ast.Datum, which allows us to turn most Datums into value classes. Instead
//    have the parser create a location map during parsing that correlates parsed data with location (and also source-mapper)
class DataParser(val input: ParserInput, val sourceId: String)
    extends Parser
    with Ignored
    with Numbers
    with Strings
    with Tokens
    with Datum
    with Program {
  override def parseLocations: Boolean = true
}
