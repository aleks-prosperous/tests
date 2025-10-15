//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33305.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="07.06.2012 16:36:47">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.barcode.generation.EnableChecksum;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;


@Test(description = "Tests for Issue-33305.")
public class Issue33305
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Generation_OK()
    {
        generateAndRecognize(EncodeTypes.SWISS_POST_PARCEL, DecodeType.SWISS_POST_PARCEL, "981234567890123456");
        generateAndRecognize(EncodeTypes.SWISS_POST_PARCEL, DecodeType.SWISS_POST_PARCEL, "989912345678901234", "989912345678901234");
        generateAndRecognize(EncodeTypes.SWISS_POST_PARCEL, DecodeType.SWISS_POST_PARCEL, "981234560000000000", "981234560000000000");
        generateAndRecognize(EncodeTypes.SWISS_POST_PARCEL, DecodeType.SWISS_POST_PARCEL, "981234567890123456111111", "981234567890123456");
        generateAndRecognize(EncodeTypes.SWISS_POST_PARCEL, DecodeType.SWISS_POST_PARCEL, "98123456", "RN981234569CH");
        generateAndRecognize(EncodeTypes.SWISS_POST_PARCEL, DecodeType.SWISS_POST_PARCEL, "981234562", "RN981234569CH");
        generateAndRecognize(EncodeTypes.SWISS_POST_PARCEL, DecodeType.SWISS_POST_PARCEL, "RM999123456CH", "RM999123458CH");
        generateAndRecognize(EncodeTypes.SWISS_POST_PARCEL, DecodeType.SWISS_POST_PARCEL, "RM999123456", "RM999123458CH");
        generateAndRecognize(EncodeTypes.SWISS_POST_PARCEL, DecodeType.SWISS_POST_PARCEL, "M999123456", "RM999123458CH");
        generateAndRecognize(EncodeTypes.SWISS_POST_PARCEL, DecodeType.SWISS_POST_PARCEL, "999123456CH", "RN999123458CH");
        generateAndRecognize(EncodeTypes.SWISS_POST_PARCEL, DecodeType.SWISS_POST_PARCEL, "Rt999123456CH", "RT999123458CH");
        generateAndRecognize(EncodeTypes.SWISS_POST_PARCEL, DecodeType.SWISS_POST_PARCEL, "Rtt9t9t9123456CH", "RT999123458CH");
    }

    private static void generateAndRecognize(BaseEncodeType symbology, BaseDecodeType readtype, String codetext)
    {
        BufferedImage bitmap = generateInMemory(symbology, codetext);
        recognizeInMemory(readtype, codetext, bitmap);
    }

    // readCodetext for ex need for Interleaved where 0 can possibly be added
    private static void generateAndRecognize(BaseEncodeType symbology, BaseDecodeType readtype, String codetext, String readCodetext)
    {
        BufferedImage bitmap = generateInMemory(symbology, codetext);
        recognizeInMemory(readtype, readCodetext, bitmap);
    }

    private static BufferedImage generateInMemory(BaseEncodeType symbology, String codetext)
    {
        BarcodeGenerator gen = new BarcodeGenerator(symbology, codetext);
        {
            gen.getParameters().getBarcode().setChecksumEnabled(EnableChecksum.DEFAULT);
            return gen.generateBarCodeImage();
        }
    }

    private static void recognizeInMemory(BaseDecodeType readtype, String codetext, BufferedImage bitmap)
    {
        BarCodeReader reader = new BarCodeReader(bitmap, readtype);
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.DEFAULT);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
    }
}

