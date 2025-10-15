// Copyright (c) 2001-2011 Aspose Pty Ltd. All Rights Reserved.

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

//import com.aspose.barcode.barcoderecognition.RecognitionHints;


@Test(description = "Tests for Issue-33165.")
public class Issue33165
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33165");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void demo()
    {
        String fileName = Global.pathCombine(folder, "unreadable.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("G201-02431550", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testRotatedAndCutted()
    {
        String fileName = Global.pathCombine(folder, "unreadable_cutted_rotated.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("G201-02431550", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testCutted()
    {
        String fileName = Global.pathCombine(folder, "unreadable_cutted.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("G201-02431550", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testRotated()
    {
        String fileName = Global.pathCombine(folder, "unreadable_rotated.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("G201-02431550", reader.getFoundBarCodes()[0].getCodeText());
    }
}

