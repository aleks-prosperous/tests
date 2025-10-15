//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33560.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="07.06.2012 16:36:47">
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


@Test(description = "Tests for Issue-33560.")
public class Issue33560
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33560");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testWorking()
    {
        String fileName = Global.pathCombine(folder, "working.tiff");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("QES37488", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("AUTOMATEDAPPROVAL", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void testFailing()
    {
        String fileName = Global.pathCombine(folder, "failing.tiff");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("QES37484", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("AUTOMATEDAPPROVAL", reader.getFoundBarCodes()[1].getCodeText());
    }
}

