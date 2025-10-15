//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33590.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="28.08.2013 13:31:15">
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


@Test(description = "Tests for Issue33590.")
public class Issue33590
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33590");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test2Barcodes()
    {
        String fileName = Global.pathCombine(folder, "scan_POD_Consignment_3587822_tif.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("3587822", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("3587822", reader.getFoundBarCodes()[1].getCodeText());
    }
}
