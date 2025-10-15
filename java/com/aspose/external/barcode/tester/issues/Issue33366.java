//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33366.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="12.11.2012 14:45:35">
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


@Test(description = "Tests for Issue-33366.")
public class Issue33366
{
    final String folder = Global.getTestDataFolder("Issues/Issue33366");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void recognize()
    {
        String fileName = Global.pathCombine(folder, "ean8-16.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_8);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("31350693", reader.getFoundBarCodes()[0].getCodeText());
    }
}

