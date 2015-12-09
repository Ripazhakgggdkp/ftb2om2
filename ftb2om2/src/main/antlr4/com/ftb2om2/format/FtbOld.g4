grammar FtbOld;

/* Lexical rules */

BPM_IDENTIFIER : 'BPM' ;
MILLISECOND : [0-9]+'.'*[0-9]+ ;
NUMBER : [0-9];
SEPARATOR : '-';

//Skips line breaks and the header
WS : [ \r\t\u000C\n]+ -> skip ;
HEADER : '###FILE ALREADY PARSED###' -> skip ;

//OldFtb Structure
map : bpm_entity* note_entity* EOF ;

//Notes
note_entity : note_millisecond '0' lane //Usual notes
            | longnote_start_millisecond SEPARATOR longnote_end_millisecond '0' lane; //Long notes

longnote_start_millisecond : MILLISECOND;
longnote_end_millisecond : MILLISECOND;
note_millisecond : MILLISECOND;
lane : NUMBER;

bpm_entity : BPM_IDENTIFIER bpm_millisecond bpm_value;
bpm_millisecond : MILLISECOND;
bpm_value : MILLISECOND;
