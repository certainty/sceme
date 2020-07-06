// TODO: add entry points: https://github.com/graalvm/simplelanguage/blob/e3e82664dd4b2d91a8d80dc462fa72bf0399aa14/language/src/main/java/com/oracle/truffle/sl/parser/SimpleLanguage.g4

grammar Sceme;

sexpr
    : datum* EOF
    ;

datum
    : simple_datum  //| compound_datum
    ;

simple_datum
    : bool | number // | character | string | symbol
    ;

bool
    : TRUE | FALSE
    ;

TRUE
    : '#t'
    ;

FALSE
    : '#f'
    ;


number
    : INTEGER_VALUE_PART FLOAT_VALUE_PART?
    ;

INTEGER_VALUE_PART
    : SIGN? INTEGER_PART
    ;

fragment INTEGER_PART
    : ZERO | (DIGIT19 DIGIT*)
    ;

FLOAT_VALUE_PART
    : (FRACTIONAL_PART EXPONENT_PART?) | EXPONENT_PART
    ;

fragment FRACTIONAL_PART
    : '.' DIGIT+
    ;

fragment EXPONENT_PART
    : EXPONENT_INDICATOR SIGN? DIGIT+
    ;

fragment EXPONENT_INDICATOR
    : 'e' | 'E'
    ;

fragment SIGN
    : ('+' | '-')
    ;

fragment DIGIT19
    : ('1' .. '9')
    ;

fragment DIGIT
    : ZERO | DIGIT19
    ;
fragment ZERO
    : '0'
    ;
