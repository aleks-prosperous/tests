package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33543.")
public class Issue33543
{
    final String folder = Global.getTestDataFolder("Issues/Issue33543");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void testRecognition()
    {
        String fileName = Global.pathCombine(folder, "Page1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("DE11C50C-162D-4840-9723-A85754F562A1", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
    public void testRecognitionAllTypes()
    {
        String fileName = Global.pathCombine(folder, "Page1.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("DE11C50C-162D-4840-9723-A85754F562A1", reader.getFoundBarCodes()[0].getCodeText());
    }
}

