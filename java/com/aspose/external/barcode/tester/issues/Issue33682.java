//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33682.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.10.2013 16:51:28">
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


@Test(description = "Tests for Issue33682.")
public class Issue33682
{
    final String folder = Global.getTestDataFolder("Issues/Issue33682");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testRM4SCC1()
    {
        String filename = Global.pathCombine(folder, "test_clean.jpg");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.RM_4_SCC);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("N101HU9Z", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("X", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
    }

    @Test
    public void testRM4SCC2()
    {
        String filename = Global.pathCombine(folder, "large_clean_3.jpg");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.RM_4_SCC);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("N101HU9Z", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("X", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
    }
}

