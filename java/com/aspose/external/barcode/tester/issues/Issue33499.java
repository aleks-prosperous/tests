//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33499.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="04.04.2013 17:57:12">
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
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33499.")
public class Issue33499
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33499");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testEAN13UPCA()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "upca-19.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("221099825965", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testEAN13Bookland()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "barcode.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("9785845910912", reader.getFoundBarCodes()[0].getCodeText());
    }
}

