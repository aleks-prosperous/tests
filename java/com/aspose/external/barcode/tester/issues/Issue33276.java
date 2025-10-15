//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33276.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="07.06.2012 16:36:47">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.BarCodeException;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;


@Test(description = "Tests for Issue-33276.")
public class Issue33276
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Limited()
    {
        generateAndRecognize("1401234567890", "(01)14012345678908");
        generateWithException("2401234567890");
        generateAndRecognize("0401234AZ358", "(01)04012343580008");
        generateWithException("2401234AZ358");
        generateAndRecognize("TT", "(01)00000000000000");
        generateAndRecognize("0", "(01)00000000000000");
        generateAndRecognize("011401234567890", "(01)14012345678908");
        generateWithException("012401234567890");
        generateAndRecognize("010101234567890", "(01)01012345678904");
        generateAndRecognize("011501234567890", "(01)15012345678907");
        generateWithException("019876543222210");
    }

    private static void generateAndRecognize(String codetext, String resulttext)
    {
        BufferedImage bitmap = generateInMemory(codetext);
        recognizeInMemory(resulttext, bitmap);
    }

    private static BufferedImage generateInMemory(String codetext)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_LIMITED, codetext);
        return gen.generateBarCodeImage();
    }

    private static void generateWithException(String codetext)
    {
        try
        {
            BufferedImage bitmap = generateInMemory(codetext);
            Assert.fail("Must be exception.");
        } catch (BarCodeException ex)
        {
        }
    }

    private static void recognizeInMemory(String resulttext, BufferedImage bitmap)
    {
        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATABAR_LIMITED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(resulttext, reader.getFoundBarCodes()[0].getCodeText());
    }
}

