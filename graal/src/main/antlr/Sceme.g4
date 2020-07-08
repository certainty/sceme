// TODO: add entry points: https://github.com/graalvm/simplelanguage/blob/e3e82664dd4b2d91a8d80dc462fa72bf0399aa14/language/src/main/java/com/oracle/truffle/sl/parser/SimpleLanguage.g4

grammar Sceme;

datum
    : simple_datum
    //| compound_datum
    ;

simple_datum
    : BOOLEAN
    | NUMBER
    | CHARACTER
    | STRING
//    | symbol
//    | bytevctor
    ;


// Lexer

BOOLEAN: BOOL_TRUE | BOOL_FALSE;
fragment BOOL_TRUE: '#t' | '#true';
fragment BOOL_FALSE: '#f' | '#false';

// Character
CHARACTER
    : '#\\' CHARACTER_NAME
    | '#x\\' HEX_SCALAR_VALUE
    | '#\\' ANY_CHARACTER_VALUE
    ;

fragment CHARACTER_NAME
    : 'alarm' | 'backspace' | 'delete' | 'escape' | 'newline' | 'null' | 'return' | 'space' | 'tab';

fragment ANY_CHARACTER_VALUE: [\u0000-\uFFFE];

STRING: '"' STRING_ELEMENT* '"';

fragment STRING_ELEMENT
    : ~[\\"]
    | MNEMONIC_ESCAPE
    | '\\"'
    | '\\\\'
    | '\\' INTRALINE_WS* LINE_ENDING INTRALINE_WS*
    | INLINE_HEX_ESCAPE
    ;

// Numbers
NUMBER
    : NUM_2
    | NUM_8
    | NUM_10
    | NUM_16
    ;

fragment NUM_2: PREFIX_2 COMPLEX_2;
fragment PREFIX_2
    : RADIX_2 EXACTNESS
    | EXACTNESS RADIX_2
    ;

fragment COMPLEX_2
    : REAL_2
    | REAL_2 '@' REAL_2
    | REAL_2 '+' UREAL_2 'i'
    | REAL_2 '-' UREAL_2 'i'
    | REAL_2 '+' 'i'
    | REAL_2 '-' 'i'
    | REAL_2 INFNAN 'i'
    | '+' UREAL_2 'i'
    | '-' UREAL_2 'i'
    | INFNAN 'i'
    | '+' 'i'
    | '-' 'i'
    ;

fragment REAL_2
    : SIGN UREAL_2
    | INFNAN
    ;

fragment UREAL_2
    : UINTEGER_2 '/' UINTEGER_2
    | UINTEGER_2
    | DECIMAL_2
    ;

fragment UINTEGER_2: DIGIT_2+;

fragment DECIMAL_2
    : UINTEGER_2 SUFFIX
    | '.' DIGIT_2+ SUFFIX
    | DIGIT_2+ '.' DIGIT_2* SUFFIX
    ;

fragment NUM_8: PREFIX_8 COMPLEX_8;
fragment PREFIX_8
    : RADIX_8 EXACTNESS
    | EXACTNESS RADIX_8
    ;

fragment COMPLEX_8
    : REAL_8
    | REAL_8 '@' REAL_8
    | REAL_8 '+' UREAL_8 'i'
    | REAL_8 '-' UREAL_8 'i'
    | REAL_8 '+' 'i'
    | REAL_8 '-' 'i'
    | REAL_8 INFNAN 'i'
    | '+' UREAL_8 'i'
    | '-' UREAL_8 'i'
    | INFNAN 'i'
    | '+' 'i'
    | '-' 'i'
    ;

fragment REAL_8
    : SIGN UREAL_8
    | INFNAN
    ;

fragment UREAL_8
    : UINTEGER_8 '/' UINTEGER_8
    | UINTEGER_8
    | DECIMAL_8
    ;

fragment UINTEGER_8: DIGIT_8+;

fragment DECIMAL_8
    : UINTEGER_8 SUFFIX
    | '.' DIGIT_8+ SUFFIX
    | DIGIT_8+ '.' DIGIT_8* SUFFIX
    ;

fragment NUM_10: PREFIX_10 COMPLEX_10;
fragment PREFIX_10
    : RADIX_10 EXACTNESS
    | EXACTNESS RADIX_10
    ;

fragment COMPLEX_10
    : REAL_10
    | REAL_10 '@' REAL_10
    | REAL_10 '+' UREAL_10 'i'
    | REAL_10 '-' UREAL_10 'i'
    | REAL_10 '+' 'i'
    | REAL_10 '-' 'i'
    | REAL_10 INFNAN 'i'
    | '+' UREAL_10 'i'
    | '-' UREAL_10 'i'
    | INFNAN 'i'
    | '+' 'i'
    | '-' 'i'
    ;

fragment REAL_10
    : SIGN UREAL_10
    | INFNAN
    ;

fragment UREAL_10
    : UINTEGER_10 '/' UINTEGER_10
    | UINTEGER_10
    | DECIMAL_10
    ;

fragment UINTEGER_10: DIGIT_10+;

fragment DECIMAL_10
    : UINTEGER_10 SUFFIX
    | '.' DIGIT_10+ SUFFIX
    | DIGIT_10+ '.' DIGIT_10* SUFFIX
    ;

fragment NUM_16: PREFIX_16 COMPLEX_16;
fragment PREFIX_16
    : RADIX_16 EXACTNESS
    | EXACTNESS RADIX_16
    ;

fragment COMPLEX_16
    : REAL_16
    | REAL_16 '@' REAL_16
    | REAL_16 '+' UREAL_16 'i'
    | REAL_16 '-' UREAL_16 'i'
    | REAL_16 '+' 'i'
    | REAL_16 '-' 'i'
    | REAL_16 INFNAN 'i'
    | '+' UREAL_16 'i'
    | '-' UREAL_16 'i'
    | INFNAN 'i'
    | '+' 'i'
    | '-' 'i'
    ;

fragment REAL_16
    : SIGN UREAL_16
    | INFNAN
    ;

fragment UREAL_16
    : UINTEGER_16 '/' UINTEGER_16
    | UINTEGER_16
    | DECIMAL_16
    ;

fragment UINTEGER_16: DIGIT_16+;

fragment DECIMAL_16
    : UINTEGER_16 SUFFIX
    | '.' DIGIT_16+ SUFFIX
    | DIGIT_16+ '.' DIGIT_16* SUFFIX
    ;

fragment SUFFIX: (EXPONENT_MARKER SIGN DIGIT_10+)?;
fragment EXPONENT_MARKER: 'e';
fragment SIGN: '+'? | '-'?;
fragment INFNAN: '+inf.0' | '-inf.0' | '+nan.0' | '-nan.0';
fragment EXACTNESS: '#i'? | '#e'?;

fragment RADIX_2: '#b';
fragment RADIX_8: '#0';
fragment RADIX_10: '#d'?;
fragment RADIX_16: '#x';
fragment DIGIT_2: [0-1];
fragment DIGIT_8: [0-8];
fragment DIGIT_10: DIGIT;
fragment DIGIT_16: DIGIT_10 [a-f];

// End Numbers

IDENTIFIER: INITIAL SUBSEQUENT* | VERTICAL_LINE SYMBOL_ELEMENT* VERTICAL_LINE | PECULIAR_IDENTIFIER;

fragment SYMBOL_ELEMENT: INLINE_HEX_ESCAPE | MNEMONIC_ESCAPE | ~[|\\];
fragment INITIAL: LETTER | SPECIAL_INITIAL;
fragment SPECIAL_INITIAL: '!'|'$'|'%'|'&'|'*'|'/'|':'|'<'|'='|'>'|'?'|'^'|'_'|'~';
fragment SUBSEQUENT: INITIAL | DIGIT | SPECIAL_SUBSEQUENT;
fragment SPECIAL_SUBSEQUENT: EXPLICIT_SIGN | '.' | '@';
fragment EXPLICIT_SIGN: '+' | '-';

fragment PECULIAR_IDENTIFIER
    : EXPLICIT_SIGN
    | EXPLICIT_SIGN SIGN_SUBSEQUENT SUBSEQUENT*
    | EXPLICIT_SIGN '.' DOT_SUBSEQUENT SUBSEQUENT*
    | '.' DOT_SUBSEQUENT SUBSEQUENT*
    ;

fragment DOT_SUBSEQUENT
    : SIGN_SUBSEQUENT
    | '.'
    ;

fragment SIGN_SUBSEQUENT
    : INITIAL
    | EXPLICIT_SIGN
    | '@'
    ;

fragment LINE_COMMENT: ';' ~[rn]*;
fragment DIRECTIVE
    : '#!fold-case'
    | '#!no-fold-case';

fragment INTRALINE_WS: ' ' | '\t';
fragment WHITESPACE: INTRALINE_WS | LINE_ENDING;

fragment ATMOSPHERE
    : WHITESPACE
    | DIRECTIVE
    ;

fragment LINE_ENDING: '\r' '\n' | '\n' | '\r';
fragment LETTER: [a-z] | [A-Z];
fragment DIGIT: [0-9];
fragment HEXDIGIT: DIGIT | [a-f];
fragment HEX_SCALAR_VALUE: HEXDIGIT+;
fragment INLINE_HEX_ESCAPE: '\\x' HEX_SCALAR_VALUE;
fragment MNEMONIC_ESCAPE: '\\' ('a' | 'b' | 't' | 'n' | 'r');
fragment VERTICAL_LINE: '|';
