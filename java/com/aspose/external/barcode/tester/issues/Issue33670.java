//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33670.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="30.09.2013 13:07:00">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.InverseImageMode;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33670.")
public class Issue33670
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33670");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void UserImage()
    {
        String filename = Global.pathCombine(folder, "datamatrix-generator.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("bartoli.giacomo@email.it", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void DMInvert()
    {
        String filename = Global.pathCombine(folder, "DMInvert.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("INVERT IMAGE TEST", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void QRInvert()
    {
        String filename = Global.pathCombine(folder, "QRInvert.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.QR);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("INVERT IMAGE TEST", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void PDF417Invert()
    {
        String filename = Global.pathCombine(folder, "PDF417Invert.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("INVERT IMAGE TEST", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Code128Invert()
    {
        String filename = Global.pathCombine(folder, "Code128Invert.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("INVERT IMAGE TEST", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void DMInvert4bpp()
    {
        String filename = Global.pathCombine(folder, "DMInvert4bpp.bmp");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("INVERT IMAGE TEST", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void QRInvert1bpp()
    {
        String filename = Global.pathCombine(folder, "QRInvert1bpp.bmp");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.QR);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("INVERT IMAGE TEST", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

