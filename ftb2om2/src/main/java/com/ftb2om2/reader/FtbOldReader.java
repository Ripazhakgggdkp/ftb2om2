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
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author Ripazhakgggdkp
 */
public class FtbOldReader implements Reader {

    private final DefaultFormat storage = new DefaultFormat();
    private BufferedReader reader;
    private final int mainBpm = 120;

    @Override
    public void read(File file) throws IOException {
        reader = new BufferedReader(new FileReader(file));
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
                            //estabas convirtiendo esto a iterador alrevez
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
