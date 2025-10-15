//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33708.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
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


@Test(description = "Tests for Issue33708.")
public class Issue33708
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33708");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void pharma1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "Output_net_5800_Pharmacode001.png"), DecodeType.PHARMACODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("333", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void pharma2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "Output_net_5800_Pharmacode002.png"), DecodeType.PHARMACODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("123456", reader.getFoundBarCodes()[0].getCodeText());
    }
}

