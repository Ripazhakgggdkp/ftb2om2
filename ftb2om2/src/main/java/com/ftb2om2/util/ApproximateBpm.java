/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftb2om2.util;

import com.ftb2om2.model.Note;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Ripazhakgggdkp
 */
public class ApproximateBpm {

    public static double approximate(List<Note> notes) {
    //TODO: Redo properly, refactor and make it readable

        //Tries to find the frequency in the difference of every ms in the file
        List<Double> noteTimes = new ArrayList<>();
        boolean bpmFound = false;
        double approximateBPM = 0;
        LinkedHashMap<Double, Integer> differenceFrequency = new LinkedHashMap<>();
        String readLine;

        for (Note note : notes) {
            noteTimes.add(note.getMs());
            if (noteTimes.size() == 2) {
                Double difference = noteTimes.get(1) - noteTimes.get(0);
                if (differenceFrequency.get(difference) != null && difference != 0) {
                    differenceFrequency.put(difference, differenceFrequency.get(difference) + 1);
                } else {
                    differenceFrequency.put(difference, 1);
                }
                noteTimes.clear();
            }
        }

        //Sorts Map to get the most frequent entry        
        Map<Double, Integer> sorted = differenceFrequency.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        Map.Entry<Double, Integer> entry = sorted.entrySet().iterator().next();

        Double mostFrequentDifference = entry.getKey();

        double snap = 0.125;

        //Tries to get a possible bpm in between 100 and 200
        while (approximateBPM < 100 || approximateBPM > 200 && snap
                != 32) {
            approximateBPM = 60000 / (mostFrequentDifference * snap);
            snap = snap * 2;
        }

        return Math.round(approximateBPM);

    }
}
