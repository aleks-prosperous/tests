//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33393.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="23.10.2012 12:38:21">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33393.")
public class Issue33393
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33393");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void codabar_1()
    {
        String fileName = Global.pathCombine(folder, "codabar%20introduction.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODABAR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("40156", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void codabar_2()
    {
        String fileName = Global.pathCombine(folder, "codabar2.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODABAR);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0123456789", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void codabar_3()
    {
        String fileName = Global.pathCombine(folder, "codabar-egB.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODABAR);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("401", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void codabar_4()
    {
        String fileName = Global.pathCombine(folder, "codabar-egB2.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODABAR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("401", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void ISSN_1()
    {
        String fileName = Global.pathCombine(folder, "issn.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ISSN);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("17129842", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void ISSN_2()
    {
        String fileName = Global.pathCombine(folder, "ISSN+2%2017x27.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ISSN);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("12345679", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void ISSN_3()
    {
        String fileName = Global.pathCombine(folder, "Issn-barcode-explained.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ISSN);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("20493630", reader.getFoundBarCodes()[0].getCodeText());
    }
}

