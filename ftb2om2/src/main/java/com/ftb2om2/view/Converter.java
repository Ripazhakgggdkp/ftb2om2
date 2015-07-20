package com.ftb2om2.view;

import com.ftb2om2.model.DefaultFormat;
import com.ftb2om2.reader.Reader;
import com.ftb2om2.writer.Writer;
import com.ftb2om2.model.Metadata;
import java.io.File;
import java.io.IOException;

public class Converter {

    private final Reader reader;
    private final Writer writer;
    private final DefaultFormat storage;
    private String name;

    public Converter(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
        this.storage = new DefaultFormat();
    }

    public void convert(String inputFilePath, String outputFilePath, String name, Integer volume, Metadata metadata) throws IOException {
        storage.clear();        
        this.name = name;
        File inputFile = new File(inputFilePath);
        File outputFile = new File(outputFilePath + "\\" + name + ".osu");
        reader.read(inputFile, storage);
        writer.write(outputFile, metadata, volume, name, storage);
    }
}
