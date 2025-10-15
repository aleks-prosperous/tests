//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33277.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="03.07.2012 14:20:27">
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


@Test(description = "Tests for Issue-33277.")
public class Issue33277
{
    final String folder = Global.getTestDataFolder("Issues/Issue33277");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testNoQuietZone()
    {
        String fileName = Global.pathCombine(folder, "IMG1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("||20|||fabbri srl||512|08", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testQuietZone1()
    {
        String fileName = Global.pathCombine(folder, "qr.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("||20|||fabbri srl||512|08", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testQuietZone2()
    {
        String fileName = Global.pathCombine(folder, "qr2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("||20|||fabbri srl||512|08", reader.getFoundBarCodes()[0].getCodeText());
    }
}

