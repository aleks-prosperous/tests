//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33702.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.barcode.generation.EnableChecksum;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;
import java.io.File;


@Test(description = "Tests for Issue33760.")
public class Issue33760
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33760");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void Syntetic()
    {
        Assert.assertTrue(generateAndRecognize(EncodeTypes.EAN_13, DecodeType.EAN_13, "1234567890128") >= 99);
        Assert.assertTrue(generateAndRecognize(EncodeTypes.CODE_128, DecodeType.CODE_128, "123456789012") >= 99);
        Assert.assertTrue(generateAndRecognize(EncodeTypes.CODE_39, DecodeType.CODE_39, "ABC35") >= 99);
        Assert.assertTrue(generateAndRecognize(EncodeTypes.RM_4_SCC, DecodeType.RM_4_SCC, "ABC35T144") >= 99);
    }

    private static double generateAndRecognize(BaseEncodeType symbology, BaseDecodeType readtype, String codetext)
    {
        BufferedImage bitmap = generateInMemory(symbology, codetext);
        return RecognizeInMemory(readtype, codetext, bitmap);
    }

    private static BufferedImage generateInMemory(BaseEncodeType symbology, String codetext)
    {
        BarcodeGenerator gen = new BarcodeGenerator(symbology, codetext);
        {
            gen.getParameters().getBarcode().setChecksumEnabled(EnableChecksum.DEFAULT);
            return gen.generateBarCodeImage();
        }
    }

    private static double RecognizeInMemory(BaseDecodeType readtype, String codetext, BufferedImage bitmap)
    {
        BarCodeReader reader = new BarCodeReader(bitmap, readtype);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.DEFAULT);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            return reader.getFoundBarCodes()[0].getReadingQuality();
        }
    }

        @Test
    public void EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "barcode_ean13.jpg"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5000204892734", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getReadingQuality() > 50);
        }
    }

        @Test
    public void Postal()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "sample.gif"), DecodeType.RM_4_SCC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IV23ZE9Z", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getReadingQuality() > 50);
        }
    }
}

