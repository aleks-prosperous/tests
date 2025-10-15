//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue15564.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="06.06.2013 12:43:13">
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


@Test(description = "Tests for Issue15564.")
public class Issue15564
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue15564");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void QR()
    {
        String fileName = Global.pathCombine(folder, "qr.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("BURNS2/J", reader.getFoundBarCodes()[0].getCodeText());
    }
}

