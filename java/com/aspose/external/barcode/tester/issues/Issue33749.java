//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33749.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
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


@Test(description = "Tests for Issue33749.")
public class Issue33749
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33749");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void dMRotatedSecond()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "IMG20131128115919618.png"), DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("3-43891-RLE-001", reader.getFoundBarCodes()[0].getCodeText());
    }
}

