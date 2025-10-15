//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33197.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="27.04.2012 16:53:13">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;


@Test(description = "Tests for Issue-33197.")
public class Issue33197
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33197");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testProblem_1() throws IOException
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.PDF_417, "Aspose.BarCode Sample.[83157778315777] Generation OK.");
        ByteArrayOutputStream imgStream = new ByteArrayOutputStream();

        gen.save(imgStream, BarCodeImageFormat.BMP);

        final BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()), DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Aspose.BarCode Sample.[83157778315777] Generation OK.", reader.getFoundBarCodes()[0].getCodeText());


    }

    @Test
    public void testProblem_2()
    {
        String fileName = Global.pathCombine(folder, "TempImage.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Aspose.BarCode Sample.[83157778315777] Generation OK.", reader.getFoundBarCodes()[0].getCodeText());
    }
}