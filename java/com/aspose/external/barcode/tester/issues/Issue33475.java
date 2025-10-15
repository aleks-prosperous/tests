//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33475.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="26.03.2013 12:20:18">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.aspose.barcode.barcoderecognition.RecognitionHints;


@Test(description = "Tests for Issue-33475.")
public class Issue33475
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33475");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_19_Normal()
    {
        String fileName = Global.pathCombine(folder, "19_normal.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1303DOEL04922;24;10;;FA658322846EB4DE130156C6DF503899;", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_44_Normal()
    {
        String fileName = Global.pathCombine(folder, "44_normal.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1303DOEL04922;24;16;;B339BC290E04205D8173C159D7874B2B;", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_64_Normal()
    {
        String fileName = Global.pathCombine(folder, "64_normal.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1303DOEL04922;24;32;ADIMELEC:T-17;242A5260F71A3881571010AD185C1C53;", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_73_Normal()
    {
        String fileName = Global.pathCombine(folder, "73_normal.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1303DOEL04922;24;42;;FB8F08C8ED41A142EBF45AB34AF2E40B;", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_19_Full()
    {
        String fileName = Global.pathCombine(folder, "19_2013032508044284.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1303DOEL04922;24;10;;FA658322846EB4DE130156C6DF503899;", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_44_Full()
    {
        String fileName = Global.pathCombine(folder, "44_2013032508051142.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1303DOEL04922;24;16;;B339BC290E04205D8173C159D7874B2B;", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_64_Full()
    {
        String fileName = Global.pathCombine(folder, "64_2013032508052902.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1303DOEL04922;24;32;ADIMELEC:T-17;242A5260F71A3881571010AD185C1C53;", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_73_Full()
    {
        String fileName = Global.pathCombine(folder, "73_2013032508053549.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1303DOEL04922;24;42;;FB8F08C8ED41A142EBF45AB34AF2E40B;", reader.getFoundBarCodes()[0].getCodeText());
    }
}

