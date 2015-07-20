/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftb2om2.reader;

import com.ftb2om2.model.BPM;
import com.ftb2om2.model.DefaultFormat;
import com.ftb2om2.model.Note;
import com.ftb2om2.util.ApproximateBpm;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Ripazhakgggdkp
 */
public class FtbOldReader implements Reader {

    private BufferedReader reader;
    private double mainBpm = 120;

    private void readNotes(File file, DefaultFormat storage) {
        String readLine;
        try {
            reader = new BufferedReader(new FileReader(file));
            readLine = reader.readLine();
            while (readLine != null) {
                if (readLine.startsWith("BPM") || readLine.startsWith("###")) {
                } else {
                    String[] noteData = readLine.split(" ");
                    String[] noteTimeData = noteData[0].split("-");
                    double beatLength = 0;
                    double noteTimeStart = (double) Math.round(Double.parseDouble(noteTimeData[0]));
                    if (noteTimeData.length > 1) {
                        int noteTimeEnd = (int) Math.round(Double.parseDouble(noteTimeData[1]));
                        beatLength = noteTimeEnd - noteTimeStart;
                    }
                    storage.addNote(new Note(
                            noteTimeStart,
                            beatLength,
                            (short) (Short.parseShort(noteData[2]) - 1)));
                }
                readLine = reader.readLine();
            }
            reader.close();
        } catch (Exception ex) {
        }
    }

    @Override
    public void read(File file, DefaultFormat storage) throws IOException {
        String readLine;        
        
        readNotes(file,storage);        
        mainBpm = ApproximateBpm.approximate(storage.getNotes());
        storage.getNotes().clear();
        
        reader = new BufferedReader(new FileReader(file));
        while ((readLine = reader.readLine()) != null) {
            if (readLine.startsWith("###")) {
            } else if (readLine.startsWith("BPM")) {
                String[] bpmData = readLine.split(" ");
                storage.addBpm(new BPM(
                        Double.parseDouble(bpmData[1]),
                        mainBpm * Double.parseDouble(bpmData[2]) / 120
                ));
            } else {
                String[] noteData = readLine.split(" ");
                String[] noteTimeData = noteData[0].split("-");
                double beatLength = 0;
                double noteTimeStart = (double) Math.round(Double.parseDouble(noteTimeData[0]));
                if (noteTimeData.length > 1) {
                    int noteTimeEnd = (int) Math.round(Double.parseDouble(noteTimeData[1]));
                    beatLength = noteTimeEnd - noteTimeStart;
                }
                storage.addNote(new Note(
                        noteTimeStart,
                        beatLength,
                        (short) (Short.parseShort(noteData[2]) - 1)));
            }
        }
    }
}
