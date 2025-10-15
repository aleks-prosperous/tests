//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33497.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="04.04.2013 17:57:12">
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


@Test(description = "Tests for Issue33497.")
public class Issue33497
{
    private String folder = Global.getTestDataFolder("Issues/Issue33497");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void testDM1()
    {
        String fileName = Global.pathCombine(folder, "d1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10801050100", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testDM2()
    {
        String fileName = Global.pathCombine(folder, "d1.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10801050100", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testJPG()
    {
        String fileName = Global.pathCombine(folder, "big_skew.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10801050100", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testOriginal()
    {
        String fileName = Global.pathCombine(folder, "Didnt_Find_BarCode.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10801050100", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

