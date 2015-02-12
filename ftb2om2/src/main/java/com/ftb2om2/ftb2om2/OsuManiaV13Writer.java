package com.ftb2om2.ftb2om2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OsuManiaV13Writer implements Writer {
    
    private Integer hitsoundVolume;    
    private OutputStreamWriter streamWriter;

    private void AppendGeneralInfo(File osuFile, Metadata metadata) throws IOException {
        streamWriter = new OutputStreamWriter(new FileOutputStream(osuFile, false), "UTF-8");
        InputStream topHeaders = getClass().getResourceAsStream("/TopHeaders");
        InputStreamReader isr = new InputStreamReader(topHeaders);
        BufferedReader read = new BufferedReader(isr);
        String line;

        streamWriter.write("osu file format v13\n\n");

        while ((line = read.readLine()) != null) {
            streamWriter.write(line + "\n");
        }

        streamWriter.write("\n");

        streamWriter.write("[Metadata]\n");
        streamWriter.write("Title:" + metadata.getTitle() + "\n");
        streamWriter.write("TitleUnicode:" + metadata.getUnicodeTitle() + "\n");
        streamWriter.write("Artist:" + metadata.getArtist() + "\n");
        streamWriter.write("ArtistUnicode:" + metadata.getUnicodeArtist() + "\n");
        streamWriter.write("Creator:" + metadata.getCreator() + "\n");
        streamWriter.write("Version:" + metadata.getVersion() + "\n");
        streamWriter.write("Source:" + metadata.getSource() + "\n");
        streamWriter.write("Tags:\n");
        streamWriter.write("BeatmapID:0\n");
        streamWriter.write("BeatmapSetID:-1\n");

        streamWriter.write("\n");

        InputStream bottomHeaders = getClass().getResourceAsStream("/BottomHeaders");
        isr = new InputStreamReader(bottomHeaders);
        read = new BufferedReader(isr);

        while ((line = read.readLine()) != null) {
            streamWriter.write(line + "\n");
        }

        streamWriter.write("\n");
        streamWriter.write("\n");

        read.close();
        streamWriter.close();
    }

    @Override
    public void write(File osuFile, Metadata metadata) throws IOException {
        //Adds "General" Section to the difficulty file
        AppendGeneralInfo(osuFile, metadata);

        //Adds converted Timing Points
        streamWriter = new OutputStreamWriter(new FileOutputStream(osuFile, true), "UTF-8");
        StringBuilder sb;
        streamWriter.write("[TimingPoints]\n");
        for (BPM bpm : bpms) {
            sb = new StringBuilder();
            sb.append(bpm.getMs().longValue());
            sb.append(",");
            //Osu style bpm by dividing 60000
            sb.append((60000 / ((bpm.getBpm() > 0) ? bpm.getBpm() : 15)));
            sb.append(",4,1,0," + hitsoundVolume + ",1,0\n");
            streamWriter.write(sb.toString());
        }
        for (Multiplier multiplier : multipliers) {
            sb = new StringBuilder();
            sb.append(multiplier.getMs().longValue());
            sb.append(",-");
            //Osu style SV
            sb.append((1 / ((multiplier.getMultiplier() > 0) ? multiplier.getMultiplier() : 0.10) * 100));
            sb.append(",4,1,0,").append(hitsoundVolume).append(",0,0\n");
            streamWriter.write(sb.toString());
        }
        streamWriter.write("\n\n");

        //Adds converted Hit Objects
        streamWriter.write("[HitObjects]\n");
        for (Note note : notes) {
            sb = new StringBuilder();
            int ftbLane = note.getLane();
            int osuLane = 0;
            switch (ftbLane) {
                case 0:
                    osuLane = 36;
                    break;
                case 1:
                    osuLane = 109;
                    break;
                case 2:
                    osuLane = 182;
                    break;
                case 3:
                    osuLane = 256;
                    break;
                case 4:
                    osuLane = 329;
                    break;
                case 5:
                    osuLane = 402;
                    break;
                case 6:
                    osuLane = 475;
                    break;
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
            streamWriter.write(sb.toString());
        }
        streamWriter.close();
    }
}
