package com.ftb2om2.reader;

import com.ftb2om2.model.Multiplier;
import com.ftb2om2.model.Note;
import com.ftb2om2.model.BPM;
import com.ftb2om2.model.DefaultFormat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FtbAirReader implements Reader {

    private final DefaultFormat storage = new DefaultFormat();
    private BufferedReader reader;

    public FtbAirReader() {
    }

    @Override
    public void read(File file) throws IOException {
        reader = new BufferedReader(new FileReader(file));

        String line = reader.readLine();
        String[] vars = line.split(" ");

        if ("$~DIFF".equalsIgnoreCase(vars[0])) {

            line = reader.readLine();
            while (!"!~BPMS".equalsIgnoreCase(line)) {
                line = reader.readLine();
            }

            line = reader.readLine();
            while (!"!~END".equalsIgnoreCase(line)) {
                vars = line.split(" ");
                BPM bpm = new BPM();
                bpm.setMs(Double.parseDouble(vars[0]));
                bpm.setBpm(Double.parseDouble(vars[1]));
                storage.addBpm(bpm);
                line = reader.readLine();
            }

            line = reader.readLine();
            while (!"!~SPEEDS".equalsIgnoreCase(line)) {
                line = reader.readLine();
            }

            line = reader.readLine();
            while (!"!~END".equalsIgnoreCase(line)) {
                vars = line.split(" ");
                Multiplier multiplier = new Multiplier();
                multiplier.setMs(Double.parseDouble(vars[0]));
                multiplier.setMultiplier(Double.parseDouble(vars[1]));
                storage.addMultiplier(multiplier);
                line = reader.readLine();
            }

            line = reader.readLine();
            while (!"!~NOTES".equalsIgnoreCase(line)) {
                line = reader.readLine();
            }

            line = reader.readLine();
            while (!"!~END".equalsIgnoreCase(line)) {
                vars = line.split(" ");
                Note note = new Note();
                note.setMs(Double.parseDouble(vars[0]));
                note.setDuration(Double.parseDouble(vars[1]));
                note.setLane(Short.parseShort(vars[2]));
                storage.addNote(note);
                line = reader.readLine();
            }
        } else {
            throw new IOException("The file isn't the correct format!");
        }
        reader.close();
    }

    @Override
    public void clear() {
        storage.clear();
    }

    @Override
    public DefaultFormat getStorage() {
        return storage;
    }
}
