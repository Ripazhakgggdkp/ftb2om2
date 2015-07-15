package com.ftb2om2.reader;

import com.ftb2om2.model.DefaultFormat;
import java.io.File;
import java.io.IOException;

public interface Reader {

    public void read(File file) throws IOException;
    
    public DefaultFormat getStorage();

    public void clear();
}
