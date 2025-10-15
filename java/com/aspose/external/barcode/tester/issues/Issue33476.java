//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33476.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="26.03.2013 12:20:18">
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


@Test(description = "Tests for Issue-33476.")
public class Issue33476
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33476");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void test1()
    {
        String fileName = Global.pathCombine(folder, "sam1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10747990100", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test2()
    {
        String fileName = Global.pathCombine(folder, "sam2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10747990100", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test3()
    {
        String fileName = Global.pathCombine(folder, "Sample1.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10747990100", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test4()
    {
        String fileName = Global.pathCombine(folder, "Sample2.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10747990100", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

