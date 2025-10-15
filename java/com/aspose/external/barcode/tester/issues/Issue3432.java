//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue3432.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="01.08.2012 18:50:34">
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


@Test(description = "Tests for Issue-3432.")
public class Issue3432
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("MicroPdf417")]
    public void test_Issue3432_MicroPDF417_png_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue3432\\MicroPDF417.png"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("MicroPDF417", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MicroPdf417")]
    public void test_Issue3432_MicroPDF417_2_png_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue3432\\MicroPDF417_2.png"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("MicroPDF417", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("MicroPDF417", reader.getFoundBarCodes()[1].getCodeText());
        }
    }
}

