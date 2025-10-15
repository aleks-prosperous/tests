//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33677.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="30.09.2013 13:07:00">
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


@Test(description = "Tests for Issue33677.")
public class Issue33677
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33677");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void noException()
    {
        String filename = Global.pathCombine(folder, "image004.gif");
        final BarCodeReader reader = new BarCodeReader(filename, DecodeType.QR);
        try
        {
            Assert.assertEquals(reader.readBarCodes().length, 0);
        } catch (RuntimeException ex)
        {
            Assert.fail("Exception raised - " + ex.getMessage());
        }
    }
}

