//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33253.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="07.06.2012 16:36:47">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;


@Test(description = "Tests for Issue-33253.")
public class Issue33253
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    //>>>>>>>> #region  BarCodeRecognitionChecksumException

    @Test
    public void test_Code3993OK()
    {
        generateAndRecognize(EncodeTypes.CODE_39, DecodeType.CODE_39, "ALL MY STUFF 124");
        generateAndRecognize(EncodeTypes.CODE_39, DecodeType.CODE_39_FULL_ASCII, "ALL MY STUFF 124");
        generateAndRecognize(EncodeTypes.CODE_39, DecodeType.ALL_SUPPORTED_TYPES, "ALL MY STUFF 124");

        generateAndRecognize(EncodeTypes.CODE_39_FULL_ASCII, DecodeType.CODE_39, "ALL MY STUFF 124");
        generateAndRecognize(EncodeTypes.CODE_39_FULL_ASCII, DecodeType.CODE_39_FULL_ASCII, "ALL MY STUFF 124");
        generateAndRecognize(EncodeTypes.CODE_39_FULL_ASCII, DecodeType.CODE_39_FULL_ASCII, "505 My Road Drive");
        generateAndRecognize(EncodeTypes.CODE_39_FULL_ASCII, DecodeType.ALL_SUPPORTED_TYPES, "ALL MY STUFF 124");
        generateAndRecognize(EncodeTypes.CODE_39_FULL_ASCII, DecodeType.ALL_SUPPORTED_TYPES, "505 My Road Drive");

        generateAndRecognize(EncodeTypes.CODE_93, DecodeType.CODE_93, "ALL MY STUFF 124");
        generateAndRecognize(EncodeTypes.CODE_93, DecodeType.ALL_SUPPORTED_TYPES, "ALL MY STUFF 124");

        generateAndRecognize(EncodeTypes.CODE_93, DecodeType.CODE_93, "ALL MY STUFF 124");
        generateAndRecognize(EncodeTypes.CODE_93, DecodeType.ALL_SUPPORTED_TYPES, "ALL MY STUFF 124");
        generateAndRecognize(EncodeTypes.CODE_93, DecodeType.ALL_SUPPORTED_TYPES, "505 My Road Drive");
    }

     @Test
    public void test_Code3993Fail()
    {
        generateAndRecognize(EncodeTypes.CODE_39_FULL_ASCII, new MultyDecodeType(DecodeType.CODE_128, DecodeType.AUSTRALIA_POST), "ALL MY STUFF 124", false);

        generateAndRecognize(EncodeTypes.CODE_93, new MultyDecodeType(DecodeType.CODE_93, DecodeType.AUSTRALIA_POST), "505 My Road Drive", true);
        generateAndRecognize(EncodeTypes.CODE_93, new MultyDecodeType(DecodeType.CODE_128, DecodeType.AUSTRALIA_POST), "ALL MY STUFF 124", false);
    }

    private static void generateAndRecognize(BaseEncodeType symbology, BaseDecodeType readtype, String codetext)
    {
        BufferedImage bitmap = generateInMemory(symbology, codetext);
        recognizeInMemory(readtype, codetext, bitmap, true);
    }

    private static void generateAndRecognize(SymbologyEncodeType symbology, BaseDecodeType readtype, String codetext, boolean OKrecognition)
    {
        BufferedImage bitmap = generateInMemory(symbology, codetext);
        recognizeInMemory(readtype, codetext, bitmap, OKrecognition);
    }

    private static BufferedImage generateInMemory(BaseEncodeType symbology, String codetext)
    {
        BarcodeGenerator gen = new BarcodeGenerator(symbology, codetext);
        {
            gen.getParameters().getBarcode().setChecksumEnabled(EnableChecksum.DEFAULT);
            return gen.generateBarCodeImage();
        }
    }

    private static void recognizeInMemory(BaseDecodeType readtype, String codetext, BufferedImage bitmap, boolean OKrecognition)
    {
        BarCodeReader reader = new BarCodeReader(bitmap, readtype);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.DEFAULT);
            if (!OKrecognition)
                Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
            else
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
    }
}

