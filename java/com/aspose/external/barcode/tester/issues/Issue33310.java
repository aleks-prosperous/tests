package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33310.")
public class Issue33310
{
    final String folder = Global.getTestDataFolder("Issues/Issue33310");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void recognizeOriginal()
    {
        String fileName = Global.pathCombine(folder, "Pharmacode-sample.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PHARMACODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("100831", reader.getFoundBarCodes()[0].getCodeText());
    }
}

