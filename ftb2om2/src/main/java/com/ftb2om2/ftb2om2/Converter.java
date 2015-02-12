package com.ftb2om2.ftb2om2;

import java.io.File;
import java.io.IOException;

public abstract class Converter {
    
    private Reader reader;
    private Writer writer;
    
    private String name;
    

    public Converter(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void Convert(String inputFile, String outputFile, String name, Integer volume, Metadata metadata) throws IOException {
        this.name = name;
        File ftbFile = new File(inputFile);
        File osuFile = new File(outputFile + "\\" + name + ".osu");
        reader.read();Read(ftbFile);
        Write(osuFile, metadata);
    }       
}
