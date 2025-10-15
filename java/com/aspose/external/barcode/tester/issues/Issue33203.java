// Copyright (c) 2001-2011 Aspose Pty Ltd. All Rights Reserved.
package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue-33203.")
public class Issue33203
{
    final String folder = Global.getTestDataFolder("Issues/Issue33203");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testRecognizeCutted()
    {
        String filename = Global.pathCombine(folder, "10_cutted.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.CODE_39_FULL_ASCII);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("A2453-0", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.CODE_39_FULL_ASCII, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void demo()
    {
        String filename = Global.pathCombine(folder, "10.jpg");
        BarCodeReader reader = new BarCodeReader(filename);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("A2453-0", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.CODE_39, reader.getFoundBarCodes()[0].getCodeType());
    }
}

