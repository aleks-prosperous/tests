package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33780.")
public class Issue33780
{
    String folder = Global.getIssuesTestImagePath(this.getClass().getSimpleName());

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testPlanet()
    {
        String fileName = Global.pathCombine(folder, "planet-10.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PLANET);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("06385319551", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("4", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
    }

    @Test
    public void testPostnet()
    {
        String fileName = Global.pathCombine(folder, "postnet-1.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.POSTNET);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("31372", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("4", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
    }
}

