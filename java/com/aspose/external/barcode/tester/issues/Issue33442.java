package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33442.")
public class Issue33442
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33442");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testOrignalImage()
    {
        String fileName = Global.pathCombine(folder, "qrcode.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1101897673", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testIdialImage()
    {
        String fileName = Global.pathCombine(folder, "2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1101897673", reader.getFoundBarCodes()[0].getCodeText());
    }
}

