package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33357.")
public class Issue33357
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33357");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void demo()
    {
        final String text = "barcode.tec-it.com";
        String fileName = Global.pathCombine(folder, "Capture.PNG");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void demoBadQuietZone()
    {
        final String text = "barcode.tec-it.com";
        String fileName = Global.pathCombine(folder, "Capture_badquietzone.PNG");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }
}

