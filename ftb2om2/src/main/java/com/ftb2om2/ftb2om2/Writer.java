package com.ftb2om2.ftb2om2;

import java.io.File;
import java.io.IOException;

public interface Writer {
    public void write(File osuFile, Metadata metadata, Integer hitsoundVolume, Reader reader) throws IOException;    
}
