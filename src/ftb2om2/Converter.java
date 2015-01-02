package ftb2om2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import javax.imageio.IIOException;

public class Converter {

    private String name;
    private final List<Note> notes;
    private final List<BPM> bpms;
    private Integer hitsoundVolume;
    private List<Multiplier> multipliers;
    private BufferedReader reader;
    private PrintWriter writer;

    public Converter() {
        this.bpms = new LinkedList<>();
        this.notes = new LinkedList<>();
        this.multipliers = new LinkedList<>();
    }

    public void Convert(String inputFile, String outputFile, String name, Integer volume) throws IOException {
        this.name = name;
        File ftbFile = new File(inputFile);
        File osuFile = new File(outputFile + "\\" + name + ".osu");
        hitsoundVolume = volume;
        Read(ftbFile);
        
        //Adds "General" Section to the difficulty file
        AppendGeneralInfo(osuFile);
        
        Write(osuFile);
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
        }
        else {
            throw new IOException("The file isn't the correct format!");
        }
    }

    public void Write(File osuFile) throws IOException {
        writer = new PrintWriter(new BufferedWriter(new FileWriter(osuFile,true)));
        StringBuilder sb;
        writer.write("[TimingPoints]\n");
        for (BPM bpm : bpms) {
            sb = new StringBuilder();
            sb.append(bpm.getMs().longValue());
            sb.append(",");            
            //Osu style bpm by dividing 60000
            sb.append((60000 / ((bpm.getBpm() > 0) ? bpm.getBpm() : 15)));
            sb.append(",4,1,0," + hitsoundVolume + ",1,0\n");
            writer.write(sb.toString());
        }
        for (Multiplier multiplier : multipliers) {
            sb = new StringBuilder();
            sb.append(multiplier.getMs().longValue());
            sb.append(",-");            
            //Osu style SV
            sb.append((1 / ((multiplier.getMultiplier() > 0) ? multiplier.getMultiplier() : 0.10) * 100));
            sb.append(",4,1,0," + hitsoundVolume + ",0,0\n");
            writer.write(sb.toString());
        }
        writer.write("\n\n");
        writer.write("[HitObjects]\n");
        for (Note note : notes) {
            sb = new StringBuilder();
            int ftbLane = note.getLane();
            int osuLane = 0;
            switch (ftbLane) {
                case 0: osuLane = 36; break; 
                case 1: osuLane = 109; break;
                case 2: osuLane = 182; break;
                case 3: osuLane = 256; break;
                case 4: osuLane = 329; break;
                case 5: osuLane = 402; break;
                case 6: osuLane = 475; break;
            }
            sb.append(osuLane);
            sb.append(",192,");
            sb.append(note.getMs().longValue());
            sb.append(",");
            boolean isLong = false;
            if (note.getDuration() == 0) {
                sb.append("1,");
            } else {
                sb.append("128,");
                isLong = true;
            }
            sb.append("0,");
            if (isLong) {
                long conversion = (long) (note.getMs() + note.getDuration());
                sb.append(conversion);
                sb.append(":0:0:0:0:");
            } else {
                sb.append("0:0:0:0:");
            }
            sb.append("\n");
            writer.write(sb.toString());
        }
        writer.close();
    }
    private void AppendGeneralInfo(File osuFile) throws IOException {
        writer = new PrintWriter(new BufferedWriter(new FileWriter(osuFile,false)));
        InputStream generalFile = getClass().getResourceAsStream("/resources/General");
        InputStreamReader isr = new InputStreamReader(generalFile);
        BufferedReader read = new BufferedReader(isr);
        String line;
        while ((line = read.readLine()) != null) {
            writer.println(line);
        }     
        writer.println();
        writer.println();
        read.close();
        writer.close();
    }
}
