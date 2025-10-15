//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33702.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
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
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.Pdf417CompactionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;


@Test(description = "Tests for Issue33760.")
public class Issue33767
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void syntetic()
    {
        generateAndRecognize(EncodeTypes.PDF_417, DecodeType.PDF_417, "tst\rsts\r");
        generateAndRecognize(EncodeTypes.PDF_417, DecodeType.PDF_417, "test0t");
        generateAndRecognize(EncodeTypes.PDF_417, DecodeType.PDF_417, "AaA");
        generateAndRecognize(EncodeTypes.PDF_417, DecodeType.PDF_417, "AaAsAsAssAsssAsA");
    }

    private static void generateAndRecognize(BaseEncodeType symbology, BaseDecodeType readtype, String codetext)
    {
        BufferedImage bitmap = generateInMemory(symbology, codetext);
        recognizeInMemory(readtype, codetext, bitmap);
    }

    private static BufferedImage generateInMemory(BaseEncodeType symbology, String codetext)
    {
        BarcodeGenerator gen = new BarcodeGenerator(symbology, codetext);
        {
            gen.getParameters().getBarcode().getPdf417().setPdf417CompactionMode(Pdf417CompactionMode.TEXT);
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

