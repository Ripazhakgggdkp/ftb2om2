/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftb2om2.reader;

import com.ftb2om2.model.BPM;
import com.ftb2om2.model.DefaultFormat;
import com.ftb2om2.model.Note;
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
 * @author Jamil
 */
public class FtbOldReader implements Reader {

    private final DefaultFormat storage = new DefaultFormat();
    private BufferedReader reader;
    private double mainBpm = 120;

    private double approximateBPM(BufferedReader reader) {
        //TODO: Redo properly, refactor and make it readable
        
        //Tries to find the frequency in the difference of every ms in the file
        List<Double> noteTimes = new ArrayList<>();
        boolean bpmFound = false;
        double approximateBPM = 0;
        LinkedHashMap<Double, Integer> differenceFrequency = new LinkedHashMap<>();
        String readLine;
        try {
            readLine = reader.readLine();
            while (readLine != null) {
                if (readLine.startsWith("BPM") || readLine.startsWith("###")) {
                } else {
                    String[] noteData = readLine.split(" ");
                    String[] noteTimeData = noteData[0].split("-");
                    Long l = Math.round(Double.parseDouble(noteTimeData[0]));
                    noteTimes.add(l.doubleValue());
                }
                if (noteTimes.size() == 2) {
                    Double difference = noteTimes.get(1) - noteTimes.get(0);
                    if (differenceFrequency.get(difference) != null && difference != 0) {
                        differenceFrequency.put(difference, differenceFrequency.get(difference) + 1);
                    } else {
                        differenceFrequency.put(difference, 1);
                    }
                    noteTimes.clear();
                }
                readLine = reader.readLine();
            }
            reader.reset();
        } catch (Exception ex) {
        }
        
        //Sorts Map to get the most frequent entry        
        Map<Double,Integer> sorted = differenceFrequency.entrySet().stream()
                                   .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                                   .limit(1)
                                   .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        
        Map.Entry<Double,Integer> entry = sorted.entrySet().iterator().next();    
        
        Double mostFrequentDifference = entry.getKey();
        
        double snap = 0.125;
        
        //Tries to get a possible bpm in between 100 and 200
        while (approximateBPM < 100 || approximateBPM > 200 && snap != 32) {
            approximateBPM = 60000 / (mostFrequentDifference * snap);
            snap = snap * 2;
        }
        return approximateBPM;
    }

    @Override
    public void read(File file) throws IOException {
        reader = new BufferedReader(new FileReader(file));
        mainBpm = approximateBPM(reader);
        String readLine;
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
                    boolean bpmFound = false;
                    ListIterator<BPM> bpmIterator = storage.getBpms().listIterator(storage.getBpms().size());
                    while (bpmIterator.hasPrevious()) {
                        BPM bpm = bpmIterator.previous();
                        if (bpm.getMs() <= noteTimeStart) {
                            double noteTimeLength = (noteTimeEnd - noteTimeStart);
                            beatLength = noteTimeLength * bpm.getBpm() / 60000;
                            bpmFound = true;
                        }
                        if (bpmFound) {
                            break;
                        }
                    }
                }
                storage.addNote(new Note(
                        noteTimeStart,
                        beatLength,
                        (short) (Short.parseShort(noteData[2]) - 1)));
            }
        }
    }

    @Override
    public DefaultFormat getStorage() {
        return storage;
    }

    @Override
    public void clear() {
        storage.clear();
    }
}
