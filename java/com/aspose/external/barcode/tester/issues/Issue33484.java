//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33484.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="04.04.2013 17:57:12">
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


@Test(description = "Tests for Issue33484.")
public class Issue33484
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33484");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_NET4CP()
    {
        String fileName = Global.pathCombine(folder, "net4cp_qr.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("VO POLI BEREZA STOYALA", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_NET4REGULAR()
    {
        String fileName = Global.pathCombine(folder, "net4regular_aztec.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.AZTEC);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("VIYDU YTROM YA V POLE S KONEM", reader.getFoundBarCodes()[0].getCodeText());
    }
}

