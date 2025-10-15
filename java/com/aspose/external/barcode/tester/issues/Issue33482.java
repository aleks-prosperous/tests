package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33482.")
public class Issue33482
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33482");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        String fileName = Global.pathCombine(folder, "images2.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("123456L", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testFixed()
    {
        String fileName = Global.pathCombine(folder, "images2_fixed.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("123456L", reader.getFoundBarCodes()[0].getCodeText());
    }
}

