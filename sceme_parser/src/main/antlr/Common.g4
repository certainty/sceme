lexer grammar Common;

WS: WHITESPACE -> skip;
fragment INTRALINE_WS: ' ' | '\t';
fragment WHITESPACE: INTRALINE_WS | LINE_ENDING;
fragment LINE_ENDING: '\r' '\n' | '\n' | '\r';

COMMENT: (LINE_COMMENT | NESTED_COMMENT) -> skip;
fragment LINE_COMMENT:  (';' .*? LINE_ENDING);
fragment NESTED_COMMENT: '#|' .*? '|#';

fragment DIRECTIVE: '#!fold-case' | '#!no-fold-case';

// boolean
BOOL_TRUE: '#true' | '#t';
BOOL_FALSE: '#false' | '#f';

// character
NAMED_CHAR_LITERAL: '#\\' CHARACTER_NAME;
HEX_CHAR_LITERAL: '#\\x' HEX_SCALAR_VALUE;
UNICODE_CHAR_LITERAL: '#\\u' HEXDIGIT? HEXDIGIT? HEXDIGIT? HEXDIGIT;
CHAR_LITERAL: '#\\' ANY_CHARACTER_VALUE;

CHARACTER_NAME
    : 'alarm' | 'backspace' | 'delete' | 'escape' | 'newline' | 'null' | 'return' | 'space' | 'tab';

ANY_CHARACTER_VALUE: [\u0000-\uFFFE];

// Identifier
IDENTIFIER: INITIAL SUBSEQUENT* ;
DELIMITED_IDENTIFIER: VERTICAL_LINE SYMBOL_ELEMENT* VERTICAL_LINE;
SYMBOL_ELEMENT: INLINE_HEX_ESCAPE | MNEMONIC_ESCAPE | ~[|\\];

fragment INITIAL: LETTER | SPECIAL_INITIAL;
fragment SPECIAL_INITIAL: '!'|'$'|'%'|'&'|'*'|'/'|':'|'<'|'='|'>'|'?'|'^'|'_'|'~';
fragment SUBSEQUENT: INITIAL | DIGIT | SPECIAL_SUBSEQUENT;
fragment SPECIAL_SUBSEQUENT: EXPLICIT_SIGN | '.' | '@';
fragment EXPLICIT_SIGN: '+' | '-';

PECULIAR_IDENTIFIER
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

fragment MNEMONIC_ESCAPE: '\\' ('a' | 'b' | 't' | 'n' | 'r');
fragment INLINE_HEX_ESCAPE: '\\x' HEX_SCALAR_VALUE;
fragment HEX_SCALAR_VALUE: HEXDIGIT+;
fragment HEXDIGIT: DIGIT | [a-f] | [A-F];
fragment DIGIT: [0-9];

fragment LETTER: [a-z] | [A-Z];

fragment L_PAREN: '(';
fragment R_PAREN: ')';
fragment VERTICAL_LINE: '|';

