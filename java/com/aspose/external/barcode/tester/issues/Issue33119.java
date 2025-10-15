// Copyright (c) 2001-2011 Aspose Pty Ltd. All Rights Reserved.
package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;


@Test(description = "Tests for Issue-33119.")
public class Issue33119
{
    private final String readFolder = Global.getTestDataFolder("Issues" + java.io.File.separator + "Issue33119");
    private final String writeFolder = Global.getGeneratedImagesFolder("Issues" + java.io.File.separator + "Issue33119");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void generateAndRecognize() throws IOException
    {
        final String file = "code.png";
        final String text = "001-99999976-20111213-163641-00-0203-10853-10853-20111213-163641-0";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODABAR, text);
        {
            gen.save(writeFolder +file);
        }

        BarCodeReader reader = new BarCodeReader(writeFolder + file, DecodeType.CODABAR);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void tryRecognizeSampleImage()
    {
        final String text = "001-99999976-20111213-163641-00-0203-10853-10853-20111213-163641-0";
        final String file = "sample_bw.bmp";
        String fullPath = Global.pathCombine(readFolder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODABAR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void demo()
    {
        final String text = "001-99999976-20111213-163641-00-0203-10853-10853-20111213-163641-0";
        final String file = "sample.jpg";
        String fullPath = Global.pathCombine(readFolder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODABAR);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void demoWithoutSpecifyBarCodeReadType2()
    {
        final String text = "001-99999976-20111213-163641-00-0203-10853-10853-20111213-163641-0";
        final String file = "sample.jpg";
        String fullPath = Global.pathCombine(readFolder, file);
        BarCodeReader reader = new BarCodeReader(fullPath);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void demoRotated()
    {
        final String text = "001-99999976-20111213-163641-00-0203-10853-10853-20111213-163641-0";
        final String file = "sample_rotated.jpg";
        String fullPath = Global.pathCombine(readFolder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODABAR);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }
}

