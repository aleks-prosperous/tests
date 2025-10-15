//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33307.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="28.08.2012 13:08:16">
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


@Test(description = "Tests for Issue-33307.")
public class Issue33307
{
    final String folder = Global.getTestDataFolder("Issues/Issue33307");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String fileName = Global.pathCombine(folder, "datamatrix.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("DataMatrix", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
    public void test2()
    {
        String fileName = Global.pathCombine(folder, "7301.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.lexil.ru", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test3()
    {
        String fileName = Global.pathCombine(folder, "barcode_datamatrix.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("www.sample.org.uk/blog", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test4()
    {
        String fileName = Global.pathCombine(folder, "1_datamatrix_F_O9lKtIMJmdtpGF.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("http://digitalconsumption.com/forum/633-Data-Matrix-QR-Codes-and-Nokia", reader.getFoundBarCodes()[0].getCodeText());
    }
}

