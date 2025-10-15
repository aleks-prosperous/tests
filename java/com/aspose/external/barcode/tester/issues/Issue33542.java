//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33542.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="23.10.2012 12:38:21">
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


@Test(description = "Tests for Issue33542.")
public class Issue33542
{
    final String folder = Global.getTestDataFolder("Issues/Issue33542");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void ISSN()
    {
        String fileName = Global.pathCombine(folder, "issn_2.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ISSN);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("12345679", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void ISMN()
    {
        String fileName = Global.pathCombine(folder, "ismn_barcode.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ISMN);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("9790123456785", reader.getFoundBarCodes()[0].getCodeText());
    }
}

