//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33491.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="04.04.2013 17:57:12">
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


@Test(description = "Tests for Issue33481.")
public class Issue33491
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33491");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void test1()
    {
        String fileName = Global.pathCombine(folder, "111ean13.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0012345678905", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test2()
    {
        String fileName = Global.pathCombine(folder, "barcode_ean13.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0075678164125", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test3()
    {
        String fileName = Global.pathCombine(folder, "11949849541036280448barcode_ean13.svg.med.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0075678164125", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

