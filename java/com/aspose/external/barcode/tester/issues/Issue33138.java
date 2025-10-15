// Copyright (c) 2001-2011 Aspose Pty Ltd. All Rights Reserved.
package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue-33138.")
public class Issue33138
{
    final String folder = Global.getTestDataFolder("Issues/Issue33138");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void RecognizeInNormalMode()
    {
        String fileName = Global.pathCombine(folder, "p1_1.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("D5  00212588", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void RecognizeInEditedPicture()
    {
        String fileName = Global.pathCombine(folder, "p1_1-edited.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("D5  00212588", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void RecognizeInCuttedPicture()
    {
        String fileName = Global.pathCombine(folder, "p1-1.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("D5  00212588", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

