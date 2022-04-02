grammar GeneticsParser;
import GeneticsLexer;

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

field: LABEL | PHENOTYPE |DOM | CODOMINANCE | LOCATION | GENOTYPE;

computations: FIND  field  id ';'
              | PRED  id+ ';'
              | ESTIMATE  id  number';'
              | CREATE id '=' CROSS id CROSS_OPERATION id ';';

flow_structure: IF  condition  THEN  statements+?  ELSE  statements  END ';'
                | condition '?' condition ':' statements ';'
                | WHILE  condition  DO  statements+  END ';' ;

condition: id operator id
         | id operator expresion;

io: PRINT  id ';'
  | PRINT  field  LPAREN (ALL | id) RPAREN ';';

