package com.ftb2om2.writer;

import com.ftb2om2.reader.Reader;
import com.ftb2om2.model.Metadata;
import java.io.File;
import java.io.IOException;

public interface Writer {
    public void write(File osuFile, Metadata metadata, Integer hitsoundVolume, String difficultyName, Reader reader) throws IOException;    
}
