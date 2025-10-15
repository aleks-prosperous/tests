//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33346.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="23.10.2012 12:38:21">
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


@Test(description = "Tests for Issue33346.")
public class Issue33346
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33346");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void try_()
    {
        String fileName = Global.pathCombine(folder, "image004.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("4601234567893", reader.getFoundBarCodes()[0].getCodeText());
    }
}

