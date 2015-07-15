/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftb2om2.model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Ripazhakgggdkp
 */
public class DefaultFormat {
    
    private List<BPM> bpms;
    private List<Multiplier> multipliers;
    private List<Note> notes;
    private Metadata metadata;

    public DefaultFormat() {
        bpms = new LinkedList<>();
        multipliers = new LinkedList<>();
        notes = new LinkedList<>();
        metadata = new Metadata();                
    }
    
    public void addBpm(BPM bpm) {
        bpms.add(bpm);
    }
    
    public void addMultiplier(Multiplier multiplier) {
        multipliers.add(multiplier);
    }
    
    public void addNote(Note note) {
        notes.add(note);
    }

    public List<BPM> getBpms() {
        return bpms;
    }

    public void setBpms(List<BPM> bpms) {
        this.bpms = bpms;
    }

    public List<Multiplier> getMultipliers() {
        return multipliers;
    }

    public void setMultipliers(List<Multiplier> multipliers) {
        this.multipliers = multipliers;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
    
    public void clear() {
        notes.clear();
        multipliers.clear();
        bpms.clear();
        metadata = null;
    }
    
    
    
}
