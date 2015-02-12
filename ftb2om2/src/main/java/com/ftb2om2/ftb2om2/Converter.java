package com.ftb2om2.ftb2om2;

import java.io.File;
import java.io.IOException;

public class Converter {

    private Reader reader;
    private Writer writer;

    private String name;

    public Converter(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void Convert(String inputFilePath, String outputFilePath, String name, Integer volume, Metadata metadata) throws IOException {
        this.name = name;
        File inputFile = new File(inputFilePath);
        File outputFile = new File(outputFilePath + "\\" + name + ".osu");
        reader.read(inputFile);
        writer.write(outputFile, metadata, volume, reader);
    }
}
