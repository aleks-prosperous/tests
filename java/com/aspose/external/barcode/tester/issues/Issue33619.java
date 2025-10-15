//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33619.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="23.08.2013 16:43:22">
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


@Test(description = "Tests for Issue33619.")
public class Issue33619
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33619");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void Correct()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "Image (2).png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("+++5533302-01", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Incorrect1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "pods 1.6.13 001.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("+++5093756-01", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Incorrect2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "pods 1.6.13 002.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5089118", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Incorrect1_Deskew()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "podsDeskew1.bmp"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("+++5093756-01", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Incorrect2_Deskew()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "podsDeskew2.bmp"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5089118", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Truncated1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "pods1truncated.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("+++5093756-01", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Truncated2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "pods2truncated.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5089118", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

