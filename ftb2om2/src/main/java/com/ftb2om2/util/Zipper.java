/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftb2om2.util;

import com.ftb2om2.model.Difficulty;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.imageio.IIOException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class Zipper {

    private void addToZip(String path, String name, ZipOutputStream zos) throws IOException {
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        ZipEntry zipEntry = new ZipEntry(name);
        zos.putNextEntry(zipEntry);

        byte[] bytes = new byte[1024];
        int length;
        while ((length = fis.read(bytes)) >= 0) {
            zos.write(bytes, 0, length);
        }
        zos.closeEntry();
        fis.close();
    }
    
    public void createOSZ(String mp3Path, String outputPath, List<Difficulty> difficulty) throws IOException {
        FileOutputStream fos = new FileOutputStream(outputPath + "\\" + FilenameUtils.getBaseName(mp3Path) + ".osz");
        ZipOutputStream zos = new ZipOutputStream(fos);
        
        addToZip(mp3Path, "Audio.mp3", zos);
        
        difficulty.forEach((file) -> {
            try {
                addToZip(outputPath + "\\" + file.getDifficultyName()+ ".osu", file.getDifficultyName() + ".osu", zos);
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);                
            }
        });

        zos.close();
        fos.close();
    }
}
