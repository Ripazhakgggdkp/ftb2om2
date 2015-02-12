/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftb2om2.ftb2om2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Ripazhakgggdkp
 */
public class FtbAirReader implements Reader {

    private String name;
    private List<Note> notes;
    private List<BPM> bpms;
    private Integer hitsoundVolume;
    private List<Multiplier> multipliers;
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

        if (vars[0].equalsIgnoreCase("$~DIFF")) {
            while (!(line = reader.readLine()).equalsIgnoreCase("!~BPMS")) {
            }
            while (!(line = reader.readLine()).equalsIgnoreCase("!~END")) {
                vars = line.split(" ");
                BPM bpm = new BPM();
                bpm.setMs(Double.parseDouble(vars[0]));
                bpm.setBpm(Double.parseDouble(vars[1]));
                bpms.add(bpm);
            }
            while (!reader.readLine().equalsIgnoreCase("!~SPEEDS")) {
            }
            while (!(line = reader.readLine()).equalsIgnoreCase("!~END")) {
                vars = line.split(" ");
                Multiplier multiplier = new Multiplier();
                multiplier.setMs(Double.parseDouble(vars[0]));
                multiplier.setMultiplier(Double.parseDouble(vars[1]));
                multipliers.add(multiplier);
            }
            while (!reader.readLine().equalsIgnoreCase("!~NOTES")) {
            }
            while (!(line = reader.readLine()).equalsIgnoreCase("!~END")) {
                vars = line.split(" ");
                Note note = new Note();
                note.setMs(Double.parseDouble(vars[0]));
                note.setDuration(Double.parseDouble(vars[1]));
                note.setLane(Short.parseShort(vars[2]));
                notes.add(note);
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
}
