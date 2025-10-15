//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33275.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="07.06.2012 16:36:47">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;


@Test(description = "Tests for Issue-33275.")
public class Issue33275
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_OmniDirectional()
    {
        generateAndRecognize("2401234567890", "(01)24012345678905", EncodeTypes.DATABAR_OMNI_DIRECTIONAL, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        generateAndRecognize("2401234AZ358", "(01)24012343580002", EncodeTypes.DATABAR_OMNI_DIRECTIONAL, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        generateAndRecognize("TT", "(01)00000000000000", EncodeTypes.DATABAR_OMNI_DIRECTIONAL, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        generateAndRecognize("0", "(01)00000000000000", EncodeTypes.DATABAR_OMNI_DIRECTIONAL, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        generateAndRecognize("012401234567890", "(01)24012345678905", EncodeTypes.DATABAR_OMNI_DIRECTIONAL, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        generateAndRecognize("010101234567890", "(01)01012345678904", EncodeTypes.DATABAR_OMNI_DIRECTIONAL, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        generateAndRecognize("019999999999999", "(01)99999999999997", EncodeTypes.DATABAR_OMNI_DIRECTIONAL, DecodeType.DATABAR_OMNI_DIRECTIONAL);
    }

    @Test
    public void test_Truncated()
    {
        generateAndRecognize("2401234567890", "(01)24012345678905", EncodeTypes.DATABAR_TRUNCATED, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        generateAndRecognize("2401234AZ358", "(01)24012343580002", EncodeTypes.DATABAR_TRUNCATED, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        generateAndRecognize("TT", "(01)00000000000000", EncodeTypes.DATABAR_TRUNCATED, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        generateAndRecognize("0", "(01)00000000000000", EncodeTypes.DATABAR_TRUNCATED, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        generateAndRecognize("012401234567890", "(01)24012345678905", EncodeTypes.DATABAR_TRUNCATED, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        generateAndRecognize("010101234567890", "(01)01012345678904", EncodeTypes.DATABAR_TRUNCATED, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        generateAndRecognize("019999999999999", "(01)99999999999997", EncodeTypes.DATABAR_TRUNCATED, DecodeType.DATABAR_OMNI_DIRECTIONAL);
    }

    private static void generateAndRecognize(String codetext, String resulttext, BaseEncodeType symbology, BaseDecodeType readType)
    {
        BufferedImage bitmap = generateInMemory(codetext, symbology);
        recognizeInMemory(resulttext, bitmap, readType);
    }

    private static BufferedImage generateInMemory(String codetext, BaseEncodeType symbology)
    {
        BarcodeGenerator gen = new BarcodeGenerator(symbology, codetext);
        return gen.generateBarCodeImage();
    }

    private static void recognizeInMemory(String resulttext, BufferedImage bitmap, BaseDecodeType readType)
    {
        BarCodeReader reader = new BarCodeReader(bitmap, readType);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(resulttext, reader.getFoundBarCodes()[0].getCodeText());
    }
}

