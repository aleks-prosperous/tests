//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33471.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="12.11.2012 14:45:35">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue-33471.")
public class Issue33471
{
    final String folder = Global.getTestDataFolder("Issues/Issue33471");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void recognize1()
    {
        String fileName = Global.pathCombine(folder, "Test2DBarcodeIssue1_1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        reader.getQualitySettings().setXDimension(XDimensionMode.USE_MINIMAL_X_DIMENSION);
        reader.getQualitySettings().setMinimalXDimension(5);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1812615-1245", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize2()
    {
        String fileName = Global.pathCombine(folder, "2DBarcodeIssue1_1.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1812615-1245", reader.getFoundBarCodes()[0].getCodeText());
    }
}

