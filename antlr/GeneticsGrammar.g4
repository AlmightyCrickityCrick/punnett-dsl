grammar GeneticsGrammar;

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

program: statements+ EOF;
statements: declaration | assigments | flow_structure | computations | io;

id: alpanum+;
declaration: type  id (','  id)?';';
type: GENES | PARENT | GENERATION | bool | string | number;

bool: TRUE | FALSE;
string: STRING;
number: NUMBER;

alpha: BIGALPHA | SMALLALPHA;
alpanum: alpha | NUMBER | alpha ;
operator: '>' | '<' | '<=' | '>=' | '==' | '!=' | AND | OR;
expresion: bool | number | string | alpha+;

assigments: SET field id '=' expresion ';'
            | DOM ':'  id  '->'  id ';'
            | SET field id '=' computations ';';

field: LABEL | PHENOTYPE | DOM | CODOMINANCE | LOCATION | GENOTYPE;

computations: FIND  field  id ';'
              | PRED  id+ ';'
              | ESTIMATE  id  number ';'
              | CROSS id CROSS_OPERATION id ';' ;

flow_structure: IF  condition  THEN  statements+?  ELSE  statements  END ';'
                | condition '?' condition ':' statements ';'
                | WHILE  condition  DO  statements+  END ';' ;

condition: id operator id
         | id operator expresion;

io: PRINT  id ';'
  | PRINT  field  LPAREN (ALL | id) RPAREN ';';

