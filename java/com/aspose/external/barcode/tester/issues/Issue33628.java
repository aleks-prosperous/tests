//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33628.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="12.08.2013 10:21:41">
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


@Test(description = "Tests for Issue33628.")
public class Issue33628
{
    final String folder = Global.getTestDataFolder("Issues/Issue33628");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void testMinusAngle()
    {
        String filename = Global.pathCombine(folder, "img0Small.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1-ZAF-PER-009", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testMinusAngle2()
    {
        String filename = Global.pathCombine(folder, "img0sm.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("138979|13897901.ACT", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testMinusAngle3()
    {
        String filename = Global.pathCombine(folder, "d1.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10801050100", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testPlusAngle()
    {
        String filename = Global.pathCombine(folder, "img0SmallSkew.bmp");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1-ZAF-PER-009", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testFilter0()
    {
        String filename = Global.pathCombine(folder, "aspose0.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdeZXX", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testFilter90()
    {
        String filename = Global.pathCombine(folder, "aspose90.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdeZXX", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testFilter180()
    {
        String filename = Global.pathCombine(folder, "aspose180.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdeZXX", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testFilter270()
    {
        String filename = Global.pathCombine(folder, "aspose270.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdeZXX", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testRect0()
    {
        String filename = Global.pathCombine(folder, "DM_Rotated0.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("The 83-year-old Bulger faces a maximum sentence of up to life, plus 30 years in prison.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testRect90()
    {
        String filename = Global.pathCombine(folder, "DM_Rotated90.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A woman identified as a Saudi Arabian princess has been accused of holding a domestic servant against her will at her condominium in Irvine, California.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testRect180()
    {
        String filename = Global.pathCombine(folder, "DM_Rotated180.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Read this story in Spanish at CNNMexico.com.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testRect270()
    {
        String filename = Global.pathCombine(folder, "DM_Rotated270.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("The 2020 rover mission to Mars is considered essential to meeting President Barack Obama\\'s challenge to send a manned mission to the planet in the 2030s.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

