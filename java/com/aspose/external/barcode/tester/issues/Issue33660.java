//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33660.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="12.06.2013 12:24:37">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
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


@Test(description = "Tests for Issue33660.")
public class Issue33660
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33660");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void QR()
    {
        String filename = Global.pathCombine(folder, "bigQR.png");
        final BarCodeReader reader = new BarCodeReader(filename, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("REF 123", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void aztec()
    {
        String filename = Global.pathCombine(folder, "bigAztec.png");
        final BarCodeReader reader = new BarCodeReader(filename, DecodeType.AZTEC);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("REF 123", reader.getFoundBarCodes()[0].getCodeText());
    }
}

