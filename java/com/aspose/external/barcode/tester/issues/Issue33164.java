// Copyright (c) 2001-2011 Aspose Pty Ltd. All Rights Reserved.

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;


@Test(description = "Tests for Issue-33164.")
public class Issue33164
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void testMarginException_1() throws IOException
        {
        ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
        {
            BarcodeGenerator barcodeGenerator = new BarcodeGenerator(EncodeTypes.QR);
            barcodeGenerator.setCodeText("78EED");
            barcodeGenerator.getParameters().getBarcode().getPadding().getBottom().setMillimeters(0.5f);
            barcodeGenerator.save(imgStream, BarCodeImageFormat.JPEG);

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()));
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("78EED", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
    public void testMarginException_2() throws IOException
        {
        ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR);
            {
                gen.setCodeText("78EED");
                gen.getParameters().getBarcode().getPadding().getTop().setMillimeters(0);
                gen.save(imgStream, BarCodeImageFormat.JPEG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()));
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("78EED", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
    public void testMarginException_3() throws IOException
        {
        ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR);
            {
                gen.setCodeText("78EED");
                gen.getParameters().getBarcode().getPadding().getLeft().setMillimeters(0);
                gen.save(imgStream, BarCodeImageFormat.JPEG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()));
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("78EED", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
    public void testMarginException_4() throws IOException
        {
        ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR);
            {
                gen.setCodeText("78EED");
                gen.getParameters().getBarcode().getPadding().getLeft().setMillimeters(1);
                gen.save(imgStream, BarCodeImageFormat.JPEG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()));
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("78EED", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
    public void testMarginException_5() throws IOException
        {
        ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR);
            {
                gen.setCodeText("78EED");
                gen.getParameters().getBarcode().getPadding().getRight().setMillimeters(3);
                gen.save(imgStream, BarCodeImageFormat.JPEG);
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()));
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("78EED", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }
}

