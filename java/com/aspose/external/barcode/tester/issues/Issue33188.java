//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33188.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="18.04.2012 14:04:35">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;


@Test(description = "Tests for Issue-33188.")
public class Issue33188
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        ////[Category("UPCA")]
    public void testUPCA() throws IOException
        {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCA, "1234567890");
        {
            ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
            {
                gen.save(imgStream, BarCodeImageFormat.JPEG);

                BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()), DecodeType.UPCA);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("123456789005", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
        ////[Category("UPCE")]
    public void testUPCE() throws IOException
        {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, "1234567890");
        {

            ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
            {
                gen.save(imgStream, BarCodeImageFormat.JPEG);

                BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()), DecodeType.UPCE);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("12345670", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
        ////[Category("EAN13")]
    public void testEAN13() throws IOException
        {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.EAN_13, "1234567890");
        {

            ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
            {
                gen.save(imgStream, BarCodeImageFormat.JPEG);

                BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()), DecodeType.EAN_13);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("1234567890005", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
        ////[Category("EAN8")]
    public void testEAN8() throws IOException
        {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.EAN_8, "1234567890");
        {

            ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
            {
                gen.save(imgStream, BarCodeImageFormat.JPEG);

                BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()), DecodeType.EAN_8);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("12345670", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }
}