//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33545.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="07.06.2012 16:36:47">
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


@Test(description = "Tests for Issue-33545.")
public class Issue33545
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    //>>>>>>>> #region  ISSN

    @Test
    public void ISSN()
    {
        generateAndRecognizeISSN("9771144875007", "1144875X");
        generateAndRecognizeISSN("ADBCDEZ456733TT", "45673306");
        generateAndRecognizeISSN("97722", "22000003");
        generateAndRecognizeISSN("977221234567899", "22123458");
        generateAndRecognizeISSN("1234567", "12345679");
    }

    private static void generateAndRecognizeISSN(String codetext, String returnCodetext)
    {
        BufferedImage bitmap = generateInMemory(EncodeTypes.ISSN, codetext);
        recognizeInMemory(DecodeType.ISSN, returnCodetext, bitmap);
    }

    //<<<<<<<< #endregion 

    //>>>>>>>> #region  ISBN

    @Test
    public void ISBN()
    {
        generateAndRecognizeISBN("9771144875007", "9789771144878");
        generateAndRecognizeISBN("ADBCDEZ456733TT", "9784567330008");
        generateAndRecognizeISBN("08352", "9780835200004");
        generateAndRecognizeISBN("977221234567899", "9789772212347");
        generateAndRecognizeISBN("1234567", "9781234567002");
    }

    private static void generateAndRecognizeISBN(String codetext, String returnCodetext)
    {
        BufferedImage bitmap = generateInMemory(EncodeTypes.ISBN, codetext);
        recognizeInMemory(DecodeType.ISBN, returnCodetext, bitmap);
    }

    //<<<<<<<< #endregion 

    //>>>>>>>> #region  ISMN

    @Test
    public void ISMN()
    {
        generateAndRecognizeISMN("9790345246805", "9790345246805");
        generateAndRecognizeISMN("ADBC333456733TT", "9793334567332");
        generateAndRecognizeISMN("083452", "9790834520003");
        generateAndRecognizeISMN("24567899", "9792456789905");
        generateAndRecognizeISMN("1234567", "9791234567001");
    }

    private static void generateAndRecognizeISMN(String codetext, String returnCodetext)
    {
        BufferedImage bitmap = generateInMemory(EncodeTypes.ISMN, codetext);
        recognizeInMemory(DecodeType.ISMN, returnCodetext, bitmap);
    }

    //<<<<<<<< #endregion 

    private static BufferedImage generateInMemory(BaseEncodeType symbology, String codetext)
    {
        BarcodeGenerator gen = new BarcodeGenerator(symbology, codetext);
        return gen.generateBarCodeImage();
    }

    private static void recognizeInMemory(BaseDecodeType readtype, String codetext, BufferedImage bitmap)
    {
        BarCodeReader reader = new BarCodeReader(bitmap, readtype);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
    }
}

