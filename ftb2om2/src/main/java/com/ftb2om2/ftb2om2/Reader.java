package com.ftb2om2.ftb2om2;

import com.ftb2om2.model.Multiplier;
import com.ftb2om2.model.Note;
import com.ftb2om2.model.BPM;
import java.io.File;
import java.io.IOException;
import java.util.List;

public interface Reader {

    public void read(File file) throws IOException;

    public List<BPM> getBpms();

    public List<Multiplier> getMultipliers();

    public List<Note> getNotes();
}
