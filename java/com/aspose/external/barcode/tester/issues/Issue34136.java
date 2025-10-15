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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


@Test(description = "Tests for Issue34136.")
public class Issue34136
{
    final String folder = Global.getIssuesTestImagePath("Issue34136");

        @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


        @Test
    public void testMicroQR1()
    {
        String fileName = Global.pathCombine(folder, "testMicroQR.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.MICRO_QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Mobilio", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testMicroQR2()
    {
        String fileName = Global.pathCombine(folder, "qr_microqr.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.MICRO_QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testMicroQR3()
    {
        String fileName = Global.pathCombine(folder, "3.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.MICRO_QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("17520034110099031000011229", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testDetectEncodingEnabled() throws IOException
        {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR);
        gen.setCodeText("Слово", StandardCharsets.UTF_8);
        gen.save(ms, BarCodeImageFormat.PNG);

        BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.QR);
            reader.getBarcodeSettings().setDetectEncoding(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Слово", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
    public void testDetectEncodingDisabled() throws IOException
    {
        String codetext = "侊侚侔俍偀倢俿倞偆";// non-kanji utf-16 test string
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR);
        gen.setCodeText(codetext, StandardCharsets.UTF_8);
        gen.save(ms, BarCodeImageFormat.PNG);

        BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.QR);
        {
            reader.getBarcodeSettings().setDetectEncoding(false);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText(StandardCharsets.UTF_8));
        }
    }
}

