//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33501.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="04.04.2013 17:57:12">
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


@Test(description = "Tests for Issue33501.")
public class Issue33501
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33501");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void DM_1()
    {
        String fileName = Global.pathCombine(folder, "document_datamatrix.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        reader.getBarcodeSettings().setStripFNC(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("What about your 10,000 promises ?", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void DM_2()
    {
        String fileName = Global.pathCombine(folder, "2DBarcodeIssue1_2.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        reader.getBarcodeSettings().setStripFNC(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1812615-1255", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void DM_3()
    {
        String fileName = Global.pathCombine(folder, "Sample1.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        reader.getBarcodeSettings().setStripFNC(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("10747990100", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void DM_4()
    {
        String fileName = Global.pathCombine(folder, "Sample2.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        reader.getBarcodeSettings().setStripFNC(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("10747990100", reader.getFoundBarCodes()[0].getCodeText());
    }
}

