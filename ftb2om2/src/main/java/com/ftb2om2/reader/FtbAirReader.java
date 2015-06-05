package com.ftb2om2.reader;

import com.ftb2om2.model.Multiplier;
import com.ftb2om2.model.Note;
import com.ftb2om2.model.BPM;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FtbAirReader implements Reader {

    private final List<Note> notes;
    private final List<BPM> bpms;
    private final List<Multiplier> multipliers;
    private BufferedReader reader;

    public FtbAirReader() {
        this.bpms = new LinkedList<>();
        this.notes = new LinkedList<>();
        this.multipliers = new LinkedList<>();
    }

    @Override
    public void read(File ftbFile) throws IOException {
        reader = new BufferedReader(new FileReader(ftbFile));

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
                bpms.add(bpm);
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
                multipliers.add(multiplier);
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
                notes.add(note);
                line = reader.readLine();
            }
        } else {
            throw new IOException("The file isn't the correct format!");
        }
        reader.close();
    }

    @Override
    public List<Note> getNotes() {
        return notes;
    }

    @Override
    public List<Multiplier> getMultipliers() {
        return multipliers;
    }

    @Override
    public List<BPM> getBpms() {
        return bpms;
    }

    @Override
    public void clear() {
        notes.clear();
        bpms.clear();
        multipliers.clear();
    }
}
