lexer grammar GeneticsLexer;

WS: ( '\t' | ' ' | '\r' | '\n' )+ -> skip;

LPAREN: '(';
RPAREN: ')';
COOMA: ',';
SEMICOLON: ';';
SYMBOLS: '/'|'?'|'.'|';';
DQ:'"';

COMMENT: '/*' .*? '*/';
LINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN);

BIGALPHA: 'A'..'Z';
SMALLALPHA: 'a'..'z';
NUMBER: '-'? DIGIT '.' [0-9] + EXP? | '-'? DIGIT EXP | '-'? DIGIT;
fragment DIGIT:'0' | [1-9] [0-9]*;
//NO leading zeros
fragment EXP: [Ee] [+\-]? DIGIT;

fragment ESC: '\\' . ;
STRING: '"' ( ESC | ~[\\"\r\n] )* '"';

TRUE: 'true';
FALSE: 'false';
AND: 'and';
OR: 'or';
CROSS_OPERATION: 'x';

//types
GENES: 'genes';
PARENT: 'parents';
GENERATION :'generation';

SET: 'set';
//fields
DOM: 'dom';
PHENOTYPE: 'phenotype';
CODOMINANCE: 'codominance';
LOCATION: 'location';
LABEL: 'label';
GENOTYPE: 'genotype';

//computations
FIND: 'find';
CREATE: 'create';
CROSS: 'cross';
PRED: 'pred';
ESTIMATE: 'estimate';

//keywrods
IF: 'if';
THEN: 'then';
ELSE: 'else';
END: 'end';
WHILE: 'while';
DO: 'do';

//io
ALL: 'all';
PRINT: 'print';


