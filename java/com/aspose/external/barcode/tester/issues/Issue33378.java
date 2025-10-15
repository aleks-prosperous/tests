//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33378.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="23.10.2012 12:38:21">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;


@Test(description = "Tests for Issue33378.")
public class Issue33378
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test39()
    {
        generateAndRecognize(EncodeTypes.CODE_39, DecodeType.CODE_39, "BG10.99/657552/C", true);
        generateAndRecognize(EncodeTypes.CODE_39, DecodeType.CODE_39_FULL_ASCII, "BG10.99/657552/C", false);
        generateAndRecognize(EncodeTypes.CODE_39, new MultyDecodeType(DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII), "BG10.99/657552/C", "BG10.99/657552#", true);
        generateAndRecognize(EncodeTypes.CODE_39_FULL_ASCII, DecodeType.CODE_39_FULL_ASCII, "BG10.99/657552/C", true);
        generateAndRecognize(EncodeTypes.CODE_39_FULL_ASCII, new MultyDecodeType(DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII), "BG10.99/657552/C", true);
    }

    private static void generateAndRecognize(BaseEncodeType symbology, BaseDecodeType readtype, String codetext, boolean equal)
    {
        BufferedImage bitmap = generateInMemory(symbology, codetext);
        recognizeInMemory(readtype, codetext, bitmap, equal);
    }

    private static void generateAndRecognize(BaseEncodeType symbology, BaseDecodeType readtype, String codetext, String expectedCodeText, boolean equal)
    {
        BufferedImage bitmap = generateInMemory(symbology, codetext);
        recognizeInMemory(readtype, expectedCodeText, bitmap, equal);
    }

    private static BufferedImage generateInMemory(BaseEncodeType symbology, String codetext)
    {
        BarcodeGenerator gen = new BarcodeGenerator(symbology, codetext);
        return gen.generateBarCodeImage();
    }

    private static void recognizeInMemory(BaseDecodeType readtype, String codetext, BufferedImage bitmap, boolean equal)
    {
        BarCodeReader reader = new BarCodeReader(bitmap, readtype);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        if (equal)
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        else
            Assert.assertNotEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
    }
}

