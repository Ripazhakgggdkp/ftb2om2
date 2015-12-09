package com.ftb2om2.reader;

import com.ftb2om2.model.BPM;
import com.ftb2om2.model.DefaultFormat;
import com.ftb2om2.model.Note;
import com.ftb2om2.util.ApproximateBpm;
import com.ftb2om2.format.FtbOldBaseListener;
import com.ftb2om2.format.FtbOldLexer;
import com.ftb2om2.format.FtbOldParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.IOException;

public class FtbOldReaderTree extends FtbOldBaseListener implements Reader {

    @Override
    public void read(File file, DefaultFormat storage) throws IOException {
        String x = file.getAbsolutePath();
        FtbOldLexer lexer = new FtbOldLexer( new ANTLRFileStream(file.getAbsolutePath()));
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        FtbOldParser parser = new FtbOldParser( tokens );
        FtbOldParser.MapContext context = parser.map();
        
        readNotes(context, storage);        
        readBpms(context, storage);
    }
    
    private void readNotes(FtbOldParser.MapContext context, DefaultFormat storage) {
        for(FtbOldParser.Note_entityContext ctx : context.note_entity()) {
            Short lane = (short) (Short.parseShort(ctx.lane().getText()) - 1);

            if (ctx.note_millisecond() != null) {
                Double ms = Double.parseDouble(ctx.note_millisecond().getText());
                Double duration = 0.0;

                storage.addNote(new Note(ms, duration, lane));
            }
            else {
                Double ms = Double.parseDouble(ctx.longnote_start_millisecond().getText());

                String start, end;
                start = ctx.longnote_start_millisecond().getText();
                end = ctx.longnote_end_millisecond().getText();
                Double duration = Double.parseDouble(end) - Double.parseDouble(start);
                storage.addNote(new Note(ms, duration, lane));
            }
        }                
    }
    
    private void readBpms(FtbOldParser.MapContext context, DefaultFormat storage) {
        double mainBpm = ApproximateBpm.approximate(storage.getNotes());
        
        for (FtbOldParser.Bpm_entityContext ctx : context.bpm_entity()) {
            Double ms = Double.parseDouble(ctx.bpm_millisecond().getText());
            Double bpm = Double.parseDouble(ctx.bpm_value().getText());

            storage.addBpm(new BPM(ms,mainBpm*bpm/120));
        }
    }
}