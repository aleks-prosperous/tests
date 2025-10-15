//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33490.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="04.04.2013 17:57:12">
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


@Test(description = "Tests for Issue33480.")
public class Issue33490
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33490");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testIntegralWindow_1()
    {
        String fileName = Global.pathCombine(folder, "BarCodeWiz-UPC-EAN-Barcode-Fonts_cqf2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.UPCA);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("123456780019", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testIntegralWindow_2()
    {
        String fileName = Global.pathCombine(folder, "barcodecards.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("100251", reader.getFoundBarCodes()[0].getCodeText());
    }
}

