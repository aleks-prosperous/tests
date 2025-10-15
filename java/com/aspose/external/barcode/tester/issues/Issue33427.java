//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33427.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="13.02.2013 11:28:50">
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


@Test(description = "Tests for Issue33427.")
public class Issue33427
{
    final String folder = Global.getTestDataFolder("Issues/Issue33427");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testAllSupportedTypes()
    {
        final String fileName = "image004.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("4601234567893", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.EAN_13, reader.getFoundBarCodes()[0].getCodeType());
    }
}

