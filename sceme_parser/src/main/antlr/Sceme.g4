// https://small.r7rs.org/attachment/r7rs.pdf
grammar Sceme;
import Common, Numbers;

program: datum* EOF;

datum
    : simple_datum
    | compound_datum;

simple_datum: bool | character | string | number | bytevector | symbol;

compound_datum: proper_list | improper_list | vector | abbreviation;

symbol
    : IDENTIFIER            # symbolNormal
    | DELIMITED_IDENTIFIER  # symbolDelimited
    | PECULIAR_IDENTIFIER   # symbolPeculiar
    ;

bool
    : BOOL_TRUE  # boolTrue
    | BOOL_FALSE # boolFalse
    ;

character
    : NAMED_CHAR_LITERAL   # characterNamed
    | HEX_CHAR_LITERAL     # characterHexLiteral
    | UNICODE_CHAR_LITERAL # characterUnicodeLiteral
    | CHAR_LITERAL         # characterCharLiteral
    ;

string: STRING;

number
    : fixnum
    | flonum
    ;

fixnum
    : FIXNUM_2  # fixnumBin
    | FIXNUM_8  # fixnumOct
    | FIXNUM_10 # fixnumDec
    | FIXNUM_16 # fixnumHex
    ;

flonum
    : FLONUM_2  # flonumBin
    | FLONUM_8  # flonumOct
    | FLONUM_10 # flonumDec
    | FLONUM_16 # flonumHex
    ;

bytevector: BYTEVECTOR;

// compound
proper_list: '(' datum* ')';

improper_list: '(' improper_head '.' improper_tail ')';
improper_head: datum+;
improper_tail: datum;

vector
    : '#(' datum* ')'
    ;

abbreviation: abbrev_prefix datum;
abbrev_prefix
    :'\''     # abbrevQuote
    | '`'     # abbrevQuasiQuote
    | ','     # abbrevUnquote
    | ',@'    # abbrevUnquoteSplicing
    ;
