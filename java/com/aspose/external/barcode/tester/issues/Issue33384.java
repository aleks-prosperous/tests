package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33384.")
public class Issue33384
{
    final String folder = Global.getTestDataFolder("Issues/Issue33384");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String fileName = Global.pathCombine(folder, "UPC-E.gif");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("05623365", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testConcreteType()
    {
        String fileName = Global.pathCombine(folder, "UPC-E.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.UPCE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("05623365", reader.getFoundBarCodes()[0].getCodeText());
    }
}

