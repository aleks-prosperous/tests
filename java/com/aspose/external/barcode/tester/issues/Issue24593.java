//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue24593.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="07.06.2012 16:36:47">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;


@Test(description = "Tests for Issue-24593.")
public class Issue24593
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testDataMatrix()
    {
        BufferedImage bitmap;
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, "*TST2011010401000001000010000011000000110000");
        bitmap = gen.generateBarCodeImage();

        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("*TST2011010401000001000010000011000000110000", reader.getFoundBarCodes()[0].getCodeText());
    }
}

