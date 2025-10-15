//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue34027.cs" company="Aspose Pty Ltd" author="A. Gavriluk" date="16.01.2015 03:14:00">
//     Copyright (c) 2001-2014 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

@Test(description = "Tests for Issue34027.")
public class Issue34027
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34027");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String filename = Global.pathCombine(folder, "image.tif");
        final BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("2791RX593", reader.getFoundBarCodes()[0].getCodeText());
    }
}

