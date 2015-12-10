grammar FtbAir;

/* Lexical rules */

//Utilities to match numbers

DIGIT : [0-9];
NUMBER : DIGIT+;
DECIMAL : NUMBER'.'NUMBER;

//Utility to match any word
IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9]* ;

DIFF_IDENTIFIER : '$~DIFF';
BPMS_IDENTIFIER : '!~BPMS';
END_IDENTIFIER : '!~END';
LAYERS_IDENTIFIER: '!~LAYERS';
LAYER_NAME : IDENTIFIER ;
EFFECTS_IDENTIFIER : '!~EFFECTS' ;
SPEEDS_IDENTIFIER : '!~SPEEDS';
ANNOTATIONS_IDENTIFIER : '!~ANNOTATIONS';
NOTES_IDENTIFIER : '!~NOTES';
FILE_END_IDENTIFIER : '$~END';

//Skips line breaks and the header
WS : [ \r\t\u000C\n]+ -> skip ;


//Air FtB Structure
map : difficulty bpms layers effects speeds annotations notes EOF ;

difficulty : DIFF_IDENTIFIER difficulty_number;

bpms : BPMS_IDENTIFIER bpm_entity* END_IDENTIFIER;

layers : LAYERS_IDENTIFIER layer_entity* END_IDENTIFIER;

effects: EFFECTS_IDENTIFIER END_IDENTIFIER;

speeds: SPEEDS_IDENTIFIER speed_entity* END_IDENTIFIER;

annotations: ANNOTATIONS_IDENTIFIER END_IDENTIFIER;

notes: NOTES_IDENTIFIER note_entity* END_IDENTIFIER FILE_END_IDENTIFIER;

//DIifficulty
difficulty_number : number;

//Note
note_entity : note_millisecond note_duration note_lane note_color note_null;
note_millisecond : number;
note_duration : number;
note_lane : number;
note_color : number;
//This is always 0
note_null : number;

//Speed
speed_entity : speed_millisecond speed_value;
speed_millisecond : number;
speed_value : number;


//Layer
layer_entity : layer_number layer_color layer_name;
layer_number : number;
layer_color : number;
layer_name : IDENTIFIER;

//BPM
bpm_entity : bpm_millisecond bpm_value;
bpm_millisecond : number;
bpm_value : number;

//Defines numbers
number: DIGIT | NUMBER | DECIMAL;