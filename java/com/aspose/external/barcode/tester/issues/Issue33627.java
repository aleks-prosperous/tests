//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33627.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="12.08.2013 10:21:41">
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


@Test(description = "Tests for Issue33627.")
public class Issue33627
{
    final String folder = Global.getTestDataFolder("Issues/Issue33627");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testRotatedBig()
    {
        String filename = Global.pathCombine(folder, "IMG0.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1-ZAF-PER-009", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testRotatedSmall()
    {
        String filename = Global.pathCombine(folder, "img0Small.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1-ZAF-PER-009", reader.getFoundBarCodes()[0].getCodeText());
    }
}

