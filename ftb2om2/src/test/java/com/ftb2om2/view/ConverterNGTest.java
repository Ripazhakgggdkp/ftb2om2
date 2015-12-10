/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftb2om2.view;

import com.ftb2om2.model.DefaultFormat;
import com.ftb2om2.model.Metadata;
import com.ftb2om2.reader.FtbAirReader;
import com.ftb2om2.reader.FtbAirReaderTree;
import com.ftb2om2.reader.FtbOldReaderTree;
import com.ftb2om2.reader.FtbOldReader;
import com.ftb2om2.writer.OsuManiaV14Writer;
import java.io.File;
import org.apache.commons.io.FileUtils;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author Ripazhakgggdkp
 */
public class ConverterNGTest {
    
    public ConverterNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of convert method, of class Converter.
     */
    @Test(enabled = false)
    public void FtbAirToOsuMania() throws Exception {        
        System.out.println("Testing conversion between FtBAir and o!m");
        String x = getClass().getResource("/").getPath();
        String inputFilePath = getClass().getResource("/ftbAirTest1.txt").getPath();
        String outputFilePath = getClass().getResource("/").getPath();
        String name = "osuTestOutput1";
        Integer volume = 100;
        Metadata metadata = new Metadata("", "", "", "", "", "");
        Converter instance = new Converter(new FtbAirReader(), new OsuManiaV14Writer());
        instance.convert(inputFilePath, outputFilePath, name, volume, metadata);
        // TODO review the generated test code and remove the default call to fail.
        File correctOutput = new File(getClass().getResource("/osuCorrectOutput1.osu").getPath());
        File generatedOutput = new File(getClass().getResource("/osuTestOutput1.osu").getPath());
        assertTrue(FileUtils.contentEquals(correctOutput, generatedOutput));
    }
    @Test(enabled = false)
    public void FtbOldToOsuMania() throws Exception {
        System.out.println("Testing conversion between FtbClassic and o!m");
        String x = getClass().getResource("/").getPath();
        String inputFilePath = getClass().getResource("/ftbOldTest1.txt").getPath();
        String outputFilePath = getClass().getResource("/").getPath();
        String name = "osuTestOutput2";
        Integer volume = 100;
        Metadata metadata = new Metadata("", "", "", "", "", "");
        Converter instance = new Converter(new FtbOldReader(), new OsuManiaV14Writer());
        instance.convert(inputFilePath, outputFilePath, name, volume, metadata);
        // TODO review the generated test code and remove the default call to fail.
        File correctOutput = new File(getClass().getResource("/osuCorrectOutput2.osu").getPath());
        File generatedOutput = new File(getClass().getResource("/osuTestOutput2.osu").getPath());
        assertTrue(FileUtils.contentEquals(correctOutput, generatedOutput));        
    }
    @Test(enabled = true)
    public void FtbOldTreeToOsuMania() throws Exception {
        System.out.println("Testing conversion between FtbClassic and o!m");
        String x = getClass().getResource("/").getPath();
        String inputFilePath = getClass().getResource("/ftbOldTest1.txt").getPath();
        String outputFilePath = getClass().getResource("/").getPath();
        String name = "osuTestOutput2";
        Integer volume = 100;
        Metadata metadata = new Metadata("", "", "", "", "", "");
        Converter instance = new Converter(new FtbOldReader(), new OsuManiaV14Writer());
        instance.convert(inputFilePath, outputFilePath, name, volume, metadata);
        // TODO review the generated test code and remove the default call to fail.
        File correctOutput = new File(getClass().getResource("/osuCorrectOutput2.osu").getPath());
        File generatedOutput = new File(getClass().getResource("/osuTestOutput2.osu").getPath());
        assertTrue(FileUtils.contentEquals(correctOutput, generatedOutput));
    }
    @Test(enabled = true)
    public void FtbOldReaderTreeToOsuMania() throws Exception {
        System.out.println("Testing conversion between FtbClassic and o!m");
        String x = getClass().getResource("/").getPath();
        String inputFilePath = getClass().getResource("/ftbOldTest1.txt").getPath();
        String outputFilePath = getClass().getResource("/").getPath();
        String name = "osuTestOutput2";
        Integer volume = 100;
        Metadata metadata = new Metadata("", "", "", "", "", "");
        Converter instance = new Converter(new FtbOldReaderTree(), new OsuManiaV14Writer());
        instance.convert(inputFilePath, outputFilePath, name, volume, metadata);
        // TODO review the generated test code and remove the default call to fail.
        File correctOutput = new File(getClass().getResource("/osuCorrectOutput2.osu").getPath());
        File generatedOutput = new File(getClass().getResource("/osuTestOutput2.osu").getPath());
        assertTrue(FileUtils.contentEquals(correctOutput, generatedOutput));
    }
    @Test(enabled = true)
    public void FtbAirReaderTreeToOsuMania() throws Exception {
        System.out.println("Testing conversion between FtBAir and o!m");
        String x = getClass().getResource("/").getPath();
        String inputFilePath = getClass().getResource("/ftbAirTest1.txt").getPath();
        String outputFilePath = getClass().getResource("/").getPath();
        String name = "osuTestOutput1";
        Integer volume = 100;
        Metadata metadata = new Metadata("", "", "", "", "", "");
        Converter instance = new Converter(new FtbAirReaderTree(), new OsuManiaV14Writer());
        instance.convert(inputFilePath, outputFilePath, name, volume, metadata);
        // TODO review the generated test code and remove the default call to fail.
        File correctOutput = new File(getClass().getResource("/osuCorrectOutput1.osu").getPath());
        File generatedOutput = new File(getClass().getResource("/osuTestOutput1.osu").getPath());
        assertTrue(FileUtils.contentEquals(correctOutput, generatedOutput));
    }
}
