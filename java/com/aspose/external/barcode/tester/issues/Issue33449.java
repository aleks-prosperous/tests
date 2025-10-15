//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33449.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="13.02.2013 11:28:50">
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


@Test(description = "Tests for Issue33449.")
public class Issue33449
{
    final String folder = Global.getTestDataFolder("Issues/Issue33449");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void testQR()
    {
            String fileName = "qr.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("||08|44523776|0105000012526|BOLOGNESI ELISA|BLGLSE74R69C980L|050|A8|A800350|", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testIMG0()
    {
            String fileName = "IMG0.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("||08|44523776|0105000012526|BOLOGNESI ELISA|BLGLSE74R69C980L|050|A8|A800350|", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

