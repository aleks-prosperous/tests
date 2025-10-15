package com.aspose.external.barcode.tester.releases.v19_6;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.Code128DataPortion;
import com.aspose.barcode.barcoderecognition.Code128SubType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;

public class ApiTests_19_6
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void Detect_QR_Encoding_Test()
    {
        String codetext = "侊侚侔俍偀倢俿倞偆";// non-kanji utf-16 test string

        BufferedImage qrTestImg;
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.QR);
        {
            generator.setCodeText(codetext, StandardCharsets.UTF_8);
            qrTestImg = generator.generateBarCodeImage();
        }
        BarCodeReader reader = new BarCodeReader(qrTestImg);
        {
            reader.getBarcodeSettings().setDetectEncoding(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }

        reader = new BarCodeReader(qrTestImg);
        {
            reader.getBarcodeSettings().setDetectEncoding(false);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText(StandardCharsets.UTF_8));
        }

        reader = new BarCodeReader(qrTestImg);
        {
            reader.getBarcodeSettings().setDetectEncoding(false);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertNotEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void GetCodeText_Detect_QR_Encoding_Test()
    {
        String codetext = "侊侚侔俍偀倢俿倞偆";// non-kanji utf-16 test string

        BufferedImage qrTestImg;
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.QR, codetext);
        {
            generator.setCodeText(codetext, StandardCharsets.UTF_8);
            qrTestImg = generator.generateBarCodeImage();
        }

        BarCodeReader reader = new BarCodeReader(qrTestImg);
        {
            reader.getBarcodeSettings().setDetectEncoding(false);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText(StandardCharsets.UTF_8));
        }
    }

    @Test
    public void GetCodeText_Basic_Test()
    {
        final String codetext = "0555555";
        BufferedImage testImg;
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            testImg = generator.generateBarCodeImage();
        }
        BarCodeReader reader = new BarCodeReader(testImg);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getExtended().getOneD().getValue());
        }
    }

    @Test
    public void GetCodeText_WithCheckSum_Test()
    {
        final String codetext = "05555550";
        BufferedImage testImg;
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            testImg = generator.generateBarCodeImage();
        }
        BarCodeReader reader = new BarCodeReader(testImg);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
        reader = new BarCodeReader(testImg);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertNotEquals(codetext, reader.getFoundBarCodes()[0].getExtended().getOneD().getValue());
        }
    }

    @Test
    public void GetCheckSum_Test()
    {
        final String codetext = "05555550";
        BufferedImage testImg;
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            testImg = generator.generateBarCodeImage();
        }
        BarCodeReader reader = new BarCodeReader(testImg);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

    @Test
    public void GetAngle_Test()
    {
        final String codetext = "05555550";
        BufferedImage testImg;
        float angle = 90;
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            generator.getParameters().setRotationAngle(angle);
            testImg = generator.generateBarCodeImage();
        }
        BarCodeReader reader = new BarCodeReader(testImg);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(angle, reader.getFoundBarCodes()[0].getRegion().getAngle(), 0.5f);
        }
    }

    @Test
    public void GetCodeBytes_Test()
    {
        final String codetext = "9638507";
        byte[] codeBytes = new byte[8];
        for (int i = 0; i < codetext.length(); i++)
        {
            codeBytes[i] = (byte)((char)codetext.charAt(i));
        }
        codeBytes[7] = (byte)'4';

        BufferedImage testImg;
        float angle = 90;
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.EAN_8, codetext);
        {
            generator.getParameters().setRotationAngle(angle);
            testImg = generator.generateBarCodeImage();
        }
        BarCodeReader reader = new BarCodeReader(testImg);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codeBytes, reader.getFoundBarCodes()[0].getCodeBytes());
        }
    }

    @Test
    public void GetCodeBytes_WithChecksum_Test()
    {
        final String codetext = "05555550";
        byte[] codeBytes = new byte[8];
        for (int i = 0; i < codetext.length(); i++)
        {
            codeBytes[i] = (byte)((char)codetext.charAt(i));
        }

        BufferedImage testImg;
        float angle = 90;
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            generator.getParameters().setRotationAngle(angle);
            testImg = generator.generateBarCodeImage();
        }
        BarCodeReader reader = new BarCodeReader(testImg);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codeBytes, reader.getFoundBarCodes()[0].getCodeBytes());
        }
    }

    @Test
    public void GetMacroPdf417FileID_Test()
    {
        BufferedImage testImg;
        int fileId = 2;
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417);
        {
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(fileId);
            testImg = generator.generateBarCodeImage();
        }
        BarCodeReader reader = new BarCodeReader(testImg);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(fileId, Integer.parseInt(reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID()));
        }
    }

    @Test
    public void GetMacroPdf417SegmentID_Test()
    {
        BufferedImage testImg;
        int segmentId = 2;
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417);
        {
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(1);
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentID(segmentId);
            testImg = generator.generateBarCodeImage();
        }
        BarCodeReader reader = new BarCodeReader(testImg);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(segmentId, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
        }
    }

    @Test
    public void GetMacroPdf417SegmentsCount_Test()
    {
        BufferedImage testImg;
        int segmentsCount = 1;
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417);
        {
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(1);
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentsCount(segmentsCount);
            testImg = generator.generateBarCodeImage();
        }
        BarCodeReader reader = new BarCodeReader(testImg);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(segmentsCount, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
        }
    }

    @Test
    public void GetCode128DataPortions_Test()
    {
        BufferedImage testImg;
        String codetextPart1 = "0123456789";
        String codetextPart2 = "Hello";
        String codetext = codetextPart1 + codetextPart2;
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_128, codetext);
        {
            testImg = generator.generateBarCodeImage();
        }
        BarCodeReader reader = new BarCodeReader(testImg);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Code128DataPortion[] actual = reader.getFoundBarCodes()[0].getExtended().getCode128().getCode128DataPortions();
            Assert.assertEquals(Code128SubType.CODE_SET_C, actual[0].getCode128SubType());
            Assert.assertEquals(codetextPart1, actual[0].getData());
            Assert.assertEquals(Code128SubType.CODE_SET_B, actual[1].getCode128SubType());
            Assert.assertEquals(codetextPart2, actual[1].getData());
        }
    }

    @Test
    public void GetCodeTypeName_Test()
    {
        BufferedImage testImg;
        String codetext = "0123456789";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_128, codetext);
        {
            testImg = generator.generateBarCodeImage();
        }
        BarCodeReader reader = new BarCodeReader(testImg);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Code128", reader.getFoundBarCodes()[0].getCodeTypeName());
        }
    }

    @Test
    public void GetCodeType_Test()
    {
        BufferedImage testImg;
        String codetext = "0123456789";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_128, codetext);
        {
            testImg = generator.generateBarCodeImage();
        }
        BarCodeReader reader = new BarCodeReader(testImg);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Code128", reader.getFoundBarCodes()[0].getCodeType().getTypeName());
        }
    }
}
