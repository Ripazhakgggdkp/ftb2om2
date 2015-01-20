package com.ftb2om2.ftb2om2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Metadata {
    private String title;
    private String unicodeTitle;
    private String artist;
    private String unicodeArtist;
    private String creator;
    private String version;
    private String source;

    public Metadata() {
    }

    public Metadata(String title, String unicodeTitle, String artist, String unicodeArtist, String creator, String version, String source) {
        this.title = title;
        this.unicodeTitle = unicodeTitle;
        this.artist = artist;
        this.unicodeArtist = unicodeArtist;
        this.creator = creator;
        this.version = version;
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUnicodeTitle() {
        return unicodeTitle;
    }

    public void setUnicodeTitle(String unicodeTitle) {
        this.unicodeTitle = unicodeTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getUnicodeArtist() {
        return unicodeArtist;
    }

    public void setUnicodeArtist(String unicodeArtist) {
        this.unicodeArtist = unicodeArtist;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }    
}
