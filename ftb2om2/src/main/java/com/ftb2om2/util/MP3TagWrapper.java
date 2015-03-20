package com.ftb2om2.util;

import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.io.IOException;

public class MP3TagWrapper {

    private String title;
    private String unicodeTitle;
    private String artist;
    private String unicodeArtist;

    public MP3TagWrapper() {
    }

    public void fillTags(String path) throws IOException, UnsupportedTagException, InvalidDataException {
        Mp3File mp3 = new Mp3File(path);
        if (mp3.hasId3v1Tag()) {
            ID3v1 id3v1Tag = mp3.getId3v1Tag();
            title = id3v1Tag.getTitle();
            unicodeTitle = id3v1Tag.getTitle();
            artist = id3v1Tag.getArtist();
            unicodeArtist = id3v1Tag.getArtist();
        }
        if (mp3.hasId3v2Tag()) {
            ID3v2 id3v2Tag = mp3.getId3v2Tag();
            title = id3v2Tag.getTitle();
            unicodeTitle = id3v2Tag.getTitle();
            artist = id3v2Tag.getArtist();
            unicodeArtist = id3v2Tag.getArtist();
        }
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
}
