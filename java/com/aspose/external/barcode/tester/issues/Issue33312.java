//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33312.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="29.08.2012 15:43:46">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue-33312.")
public class Issue33312
{
    final String folder = Global.getTestDataFolder("Issues/Issue33312");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void recognize1()
    {
        String fileName = Global.pathCombine(folder, "gs1-128-16.jpg");
        BarCodeReader reader = new BarCodeReader(fileName);
        reader.getBarcodeSettings().setStripFNC(false);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("<FNC1>60L7JTz8ta<FNC1>24Hmv0wC5aQg<FNC1>60L7JTz8ta", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize2()
    {
        String fileName = Global.pathCombine(folder, "gs1-128-16.jpg");
        BarCodeReader reader = new BarCodeReader(fileName);
        reader.getBarcodeSettings().setStripFNC(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("60L7JTz8ta24Hmv0wC5aQg60L7JTz8ta", reader.getFoundBarCodes()[0].getCodeText());
    }
}

