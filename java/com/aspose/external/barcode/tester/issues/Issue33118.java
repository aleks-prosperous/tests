// Copyright (c) 2001-2011 Aspose Pty Ltd. All Rights Reserved.
package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.DataMatrixEncodeMode;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;


@Test(description = "Tests for Issue-33118.")
public class Issue33118
{
    final String folder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue33118");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void DemoBigText() throws IOException
        {
        String codeText = "";
        for (int i=0; i<21; i++)
        {
            for (int j = 0; j < 10; j++) codeText += '0' + j;
            for (int j = 'a'; j <= 'z'; j++) codeText += (char)j;
            for (int j = 'A'; j <= 'Z'; j++) codeText += (char)j;
        }
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, codeText);
        {
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            {
                gen.save(stream, BarCodeImageFormat.PNG);

                BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(stream.toByteArray()), DecodeType.DATA_MATRIX);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codeText, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
    public void Demo1pngASCII() throws IOException
        {
            final String codeText = "A|2760192803|276a15nApV|AA|276|56751|001|001|1|gLS Germany|xxxxxxxxxx|000000000000000|Im xxxx|1|xxxxx||36361001230|4770|010|                                                                                                                                                                                   |";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, codeText);
        {
            gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.ASCII);
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            {
                gen.save(stream, BarCodeImageFormat.PNG);
                gen.save(Global.getTempFolder("1dmASCII.png"));

                BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(stream.toByteArray()), DecodeType.DATA_MATRIX);
                {
                    Assert.assertEquals(reader.readBarCodes().length, 1);
                    Assert.assertEquals(codeText, reader.getFoundBarCodes()[0].getCodeText());
                }
            }
        }
    }

        @Test
    public void Demo1pngFull() throws IOException
        {
            final String codeText = "A|2760192803|276a15nApV|AA|276|56751|001|001|1|gLS Germany|xxxxxxxxxx|000000000000000|Im xxxx|1|xxxxx||36361001230|4770|010|                                                                                                                                                                                   |";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, codeText);
        {
            gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.BYTES);
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            {
                gen.save(stream, BarCodeImageFormat.PNG);
                gen.save(Global.getTempFolder("1dmFull.png"));
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(stream.toByteArray()), DecodeType.DATA_MATRIX);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codeText, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
    public void Demo2pngASCII() throws IOException
        {
            final String codeText = "A|2760192803|276a15nApV|AA|276|56751|001|001|1|gLS Germany|xxxxxxxxxx||Im xxxx|1|xxxxx||36361001229|4770|010|                                                                                                                                                                                                  |";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, codeText);
        {
            gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.ASCII);
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            {
                gen.save(stream, BarCodeImageFormat.PNG);
                gen.save(Global.getTempFolder("2dmASCII.png"));

                BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(stream.toByteArray()), DecodeType.DATA_MATRIX);
                {
                    Assert.assertEquals(reader.readBarCodes().length, 1);
                    Assert.assertEquals(codeText, reader.getFoundBarCodes()[0].getCodeText());
                }
            }
        }
    }

        @Test
    public void Demo2pngFull() throws IOException
    {
        final String codeText = "A|2760192803|276a15nApV|AA|276|56751|001|001|1|gLS Germany|xxxxxxxxxx||Im xxxx|1|xxxxx||36361001229|4770|010|                                                                                                                                                                                                  |";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, codeText);
        {
            gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.BYTES);
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            {
                gen.save(stream, BarCodeImageFormat.PNG);
                gen.save(Global.getTempFolder("2dmASCII.png"));
            }

            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(stream.toByteArray()), DecodeType.DATA_MATRIX);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codeText, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }
}