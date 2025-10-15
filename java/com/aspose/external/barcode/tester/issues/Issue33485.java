//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33485.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="12.11.2012 14:45:35">
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


@Test(description = "Tests for Issue-33485.")
public class Issue33485
{
    final String folder = Global.getTestDataFolder("Issues/Issue33485");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void recognize()
    {
        String fileName = Global.pathCombine(folder, "win8-net4cp.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.AZTEC);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0123456789 Unicode (UTF-8), CodePage: 65001", reader.getFoundBarCodes()[0].getCodeText());
    }
}

