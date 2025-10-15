//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33644.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="12.08.2013 10:21:41">
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


@Test(description = "Tests for Issue33644.")
public class Issue33644
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33644");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void extractedPDF417()
    {
        String filename = Global.pathCombine(folder, "2TestPDF417_1.png");
        final BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("E20101021041945805000", reader.getFoundBarCodes()[0].getCodeText());
    }
}

