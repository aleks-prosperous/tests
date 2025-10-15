//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue15656.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="01.08.2012 18:50:34">
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


@Test(description = "Tests for Issue-15656.")
public class Issue15656
{
    private final String folder = Global.getTestDataFolder("Issues/Issue15656");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String fullPath = Global.pathCombine(folder, "TestCode39.bmp");
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.EAN_8);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("12345670", reader.getFoundBarCodes()[0].getCodeText());
    }
}

