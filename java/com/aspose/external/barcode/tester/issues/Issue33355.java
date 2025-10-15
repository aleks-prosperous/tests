//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33355.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="12.11.2012 14:45:35">
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


@Test(description = "Tests for Issue-33355.")
public class Issue33355
{
    final String folder = Global.getTestDataFolder("Issues/Issue33355");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void recognize1()
    {
        String fileName = Global.pathCombine(folder, "aspose.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("è0100012345678905", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize2()
    {
        String fileName = Global.pathCombine(folder, "barcodeGS1_DatamatrixBytescout.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("<FNC1>0100012345678905", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize3()
    {
        String fileName = Global.pathCombine(folder, "barcodeGS1DataMatrixTerryburton.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("<FNC1>0100012345678905", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
    public void Recognize4()
    {
        String fileName = Global.pathCombine(folder, "with5_1_GS1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.GS_1_DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)00012345678905", reader.getFoundBarCodes()[0].getCodeText());
    }
}

