grammar FtbOld;

/* Lexical rules */

BPM_IDENTIFIER : 'BPM' ;
DIGIT : [0-9];
NUMBER : DIGIT+;
DECIMAL : NUMBER'.'NUMBER;
SEPARATOR : '-';
NULL : '0';

//Skips line breaks and the header
WS : [ \r\t\u000C\n]+ -> skip ;
HEADER : '###FILE ALREADY PARSED###' -> skip ;

//OldFtb Structure
map : bpm_entity* note_entity* EOF ;

//Notes
note_entity : note_millisecond note_null lane //Usual notes
            | longnote_start_millisecond SEPARATOR longnote_end_millisecond note_null lane; //Long notes

longnote_start_millisecond : number;
longnote_end_millisecond : number;
note_millisecond : number;
lane : number;
note_null : number;

bpm_entity : BPM_IDENTIFIER bpm_millisecond bpm_value;
bpm_millisecond : number;
bpm_value : number;

number : DIGIT | NUMBER | DECIMAL;
