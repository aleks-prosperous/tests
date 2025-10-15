//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33515.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="12.11.2012 14:45:35">
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


@Test(description = "Tests for Issue-33515.")
public class Issue33515
{
    final String folder = Global.getTestDataFolder("Issues/Issue33515");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void Original()
    {
        String fileName = Global.pathCombine(folder, "IMG0.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("138979|13897901.ACT", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void OriginalCut()
    {
        String fileName = Global.pathCombine(folder, "img0sm.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("138979|13897901.ACT", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void OriginalCutRotated()
    {
        String fileName = Global.pathCombine(folder, "img0smRotated.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("138979|13897901.ACT", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

