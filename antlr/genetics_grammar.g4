grammar genetics_grammar;

program: statements+ EOF;

statements: declaration | assigments | flow_structure | computations | io;

id: alpanum+;
declaration: type  id (','  id)?';';
type: genes | parent | generation | bool | string | number;
genes: 'genes';
parent: 'parents';
generation: 'generation';

WS: ( '\t' | ' ' | '\r' | '\n' )+ -> skip;
DQ: '"';
LPAREN: '(';
RPAREN: ')';
BIGALPHA: 'A'..'Z';
SMALLALPHA: 'a'..'z';
DIGIT: [0-9];

bool: true|false;
true: 'true';
false: 'false';
string: alpanum+;
number: DIGIT? '.' DIGIT*;

alpha: BIGALPHA | SMALLALPHA;
alpanum: alpha | DIGIT | alpha ;
char: '/'|'?'|'.'|';';
operator: '>'|'<'|'<='|'>='|'=='|'!='|and|or;
and: 'and';
or: 'or';
expresion: (DQ string DQ) | bool | number | string;

assigments: set field id '=' expresion ';'
            | dom ':'  id  '->'  id ';'
            | set field id '=' computations ';';

set: 'set';
field: label | phenotype| dom | codominance | location | genotype ;
label: 'label';
dom: 'dom';
phenotype: 'phenotype';
genotype: 'genotype';
codominance: 'codominance';
location: 'location';

computations: find  field  id ';'
              | create  id  '='  cross  id  'x'  id ';'
              | pred  id+ ';'
              | estimate  id  number';';
find: 'find';
create: 'create';
cross: 'cross';
pred: 'predecessor';
estimate: 'estimate';

flow_structure: if  condition  then  statements+?  else  statements  end ';'
                | condition '?' condition ':' statements ';'
                | while  condition  do  statements+  end ';' ;
if: 'if';
then: 'then';
else: 'else';
end: 'end';
while: 'while';
do: 'do';
condition: id operator id
         | id operator expresion;

io: print  id ';'
  | print  field  '(' (all | id) ')' ';';

print: 'print';
all: 'all';