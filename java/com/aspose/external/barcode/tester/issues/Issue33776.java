package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33776.")
public class Issue33776
{
    String folder = Global.getIssuesTestImagePath(this.getClass().getSimpleName());

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testEAN13_300()
    {
        String fileName = Global.pathCombine(folder, "IMG0.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1000001422220", reader.getFoundBarCodes()[0].getCodeText());
    }
}

