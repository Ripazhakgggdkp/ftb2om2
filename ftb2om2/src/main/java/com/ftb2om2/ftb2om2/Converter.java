package com.ftb2om2.ftb2om2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import javax.imageio.IIOException;

public abstract class Converter {

    protected String name;
    protected List<Note> notes;
    protected List<BPM> bpms;
    protected Integer hitsoundVolume;
    protected List<Multiplier> multipliers;
    protected BufferedReader reader;
    protected PrintWriter writer;
    protected OutputStreamWriter streamWriter;

    public Converter() {
        this.bpms = new LinkedList<>();
        this.notes = new LinkedList<>();
        this.multipliers = new LinkedList<>();
    }

    public void Convert(String inputFile, String outputFile, String name, Integer volume, Metadata metadata) throws IOException {
        this.name = name;
        File ftbFile = new File(inputFile);
        File osuFile = new File(outputFile + "\\" + name + ".osu");
        hitsoundVolume = volume;
        Read(ftbFile);
        Write(osuFile, metadata);
    }

    public void Read(File ftbFile) throws IOException {
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

    public abstract void Write(File osuFile, Metadata metadata) throws IOException;
}
