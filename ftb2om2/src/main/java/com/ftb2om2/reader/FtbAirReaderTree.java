package com.ftb2om2.reader;


import com.ftb2om2.format.FtbAirLexer;
import com.ftb2om2.format.FtbAirParser;
import com.ftb2om2.format.FtbOldBaseListener;
import com.ftb2om2.format.FtbOldLexer;
import com.ftb2om2.format.FtbOldParser;
import com.ftb2om2.model.BPM;
import com.ftb2om2.model.DefaultFormat;
import com.ftb2om2.model.Multiplier;
import com.ftb2om2.model.Note;
import com.ftb2om2.reader.Reader;
import java.io.File;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class FtbAirReaderTree extends FtbOldBaseListener implements Reader {

    @Override
    public void read(File file, DefaultFormat storage) throws IOException {
        FtbAirLexer lexer = new FtbAirLexer(new ANTLRFileStream(file.getAbsolutePath()));
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        FtbAirParser parser = new FtbAirParser( tokens );
        FtbAirParser.MapContext context = parser.map();
        
        readNotes(context, storage);
        readMultipliers(context, storage);
        readBpms(context, storage);   
        
    }
    private void readNotes(FtbAirParser.MapContext context, DefaultFormat storage) {
        for (FtbAirParser.Note_entityContext note : context.notes().note_entity())  {
            Short lane = (short) (Short.parseShort(note.note_lane().getText()));
            Double ms = Double.parseDouble(note.note_millisecond().getText());
            Double duration = Double.parseDouble(note.note_duration().getText());
            storage.addNote(new Note(ms, duration, lane));
        }        
    }
    
    private void readBpms(FtbAirParser.MapContext context, DefaultFormat storage ) {
        for (FtbAirParser.Bpm_entityContext bpm : context.bpms().bpm_entity()) {
            Double ms = Double.parseDouble(bpm.bpm_millisecond().getText());
            Double value = Double.parseDouble(bpm.bpm_value().getText());
            storage.addBpm(new BPM(ms,value));
        }
    }
    
    private void readMultipliers(FtbAirParser.MapContext context, DefaultFormat storage) {
        for (FtbAirParser.Speed_entityContext speed : context.speeds().speed_entity()) {
            Double ms = Double.parseDouble(speed.speed_millisecond().getText());
            Double value = Double.parseDouble(speed.speed_value().getText());
            storage.addMultiplier(new Multiplier(ms,value));
        }
    }
}
