//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33747.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
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

import java.io.File;


@Test(description = "Tests for Issue33747.")
public class Issue33747
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33747");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void dMRotatedFirst()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "Image20131127143157945_.png"), DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("3-43774-RLE-001", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void dMRotatedFirst_2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "IMG20131127143157945_.png"), DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("3-43774-RLE-001", reader.getFoundBarCodes()[0].getCodeText());
    }
}

