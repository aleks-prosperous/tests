package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue21110.")
public class Issue21110
{
    private final String folder = Global.getTestDataFolder("Issues/Issue21110");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void original()
    {
        String fileName = Global.pathCombine(folder, "IMGOriginal.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("E20101021041945805000", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void scanned()
    {
        String fileName = Global.pathCombine(folder, "IMGScanned.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("E20101021041945805000", reader.getFoundBarCodes()[0].getCodeText());
    }
}

