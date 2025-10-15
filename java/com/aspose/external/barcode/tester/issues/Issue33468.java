package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33468.")
public class Issue33468
{
    final String folder = Global.getTestDataFolder("Issues/Issue33468");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test17Symbols()
    {
        String path = Global.pathCombine(folder, "TestQR.png");
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1234567890123456p", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test18Symbols()
    {
        String path = Global.pathCombine(folder, "1234567890123456pa.png");
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1234567890123456pa", reader.getFoundBarCodes()[0].getCodeText());
    }
}

