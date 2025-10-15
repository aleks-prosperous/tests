package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33289.")
public class Issue33289
{
    final String folder = Global.getTestDataFolder("Issues/Issue33289");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testNativepng_java_adapted()
    {
        String fileName = Global.pathCombine(folder, "babar123.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
    }
}

