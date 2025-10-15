//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33440.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="13.02.2013 11:28:50">
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


@Test(description = "Tests for Issue33440.")
public class Issue33440
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33440");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testTIF()
    {
        String path = Global.pathCombine(folder, "test.tif");
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("CKBR0000000192", reader.getFoundBarCodes()[0].getCodeText());
    }
}

