package com.ftb2om2.model;

public class BPM {

    private Double ms;
    private Double bpm;

    public BPM() {
    }
    
    public BPM(Double ms, Double bpm) {
        this.ms = ms;
        this.bpm = bpm;
    }

    public Double getMs() {
        return ms;
    }

    public void setMs(Double ms) {
        this.ms = ms;
    }

    public Double getBpm() {
        return bpm;
    }

    public void setBpm(Double bpm) {
        this.bpm = bpm;
    }
}
