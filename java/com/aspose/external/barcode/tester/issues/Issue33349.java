//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33349.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="23.10.2012 12:38:21">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33349.")
public class Issue33349
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33349");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void TryAztec1()
    {
        String fileName = Global.pathCombine(folder, "Image5.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.AZTEC);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9223372036854775807", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void TryAztec2()
    {
        String fileName = Global.pathCombine(folder, "Image7.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9223372036854775807", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void TryAztecSmall1()
    {
        String fileName = Global.pathCombine(folder, "im5.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.AZTEC);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9223372036854775807", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void TryAztecSmall2()
    {
        String fileName = Global.pathCombine(folder, "im7.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9223372036854775807", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

