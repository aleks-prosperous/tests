package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;

public class RecognitionCode39StandardBuildSingleImages
{

    private String _folder;

        @BeforeMethod
    public void SetupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Recognition\\Code39Standard");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Code39Standard")]
    public void test_Code39_Code39Standard_Standard_0a_jpg_Code39Standard()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_39, "0+A");
        BufferedImage imgStreamActual = gen.generateBarCodeImage();
        // Reading the generated image
        BarCodeReader reader = new BarCodeReader(imgStreamActual, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0+A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Code39_Code39Standard_Extended_0a_jpg_Code39Extended()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_39, "0+A");
        BufferedImage imgStreamActual = gen.generateBarCodeImage();
        // Reading the generated image
        BarCodeReader reader = new BarCodeReader(imgStreamActual, DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0a", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended_Code39Standard")]
    public void test_Code39_Code39Standard_Standard_Extended_0a_jpg_Code39Extended_Code39Standard()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_39, "0+A");
        BufferedImage imgStreamActual = gen.generateBarCodeImage();
        // Reading the generated image
        BarCodeReader reader = new BarCodeReader(imgStreamActual, DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0a", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_Code39_Code39Extended_Standard_0KA_jpg_Code39Standard()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_39_FULL_ASCII, "0+A");
        BufferedImage imgStreamActual = gen.generateBarCodeImage();
        // Reading the generated image
        BarCodeReader reader = new BarCodeReader(imgStreamActual, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0/KA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Code39_Code39Extended_Extended_0a_jpg_Code39Extended()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_39_FULL_ASCII, "0a");
        BufferedImage imgStreamActual = gen.generateBarCodeImage();
        // Reading the generated image
        BarCodeReader reader = new BarCodeReader(imgStreamActual, DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0a", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended_Code39Standard")]
    public void test_Code39_Code39Extended_Standard_Extended_0A_jpg_Code39Extended_Code39Standard()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_39_FULL_ASCII, "0a");
        BufferedImage imgStreamActual = gen.generateBarCodeImage();
        // Reading the generated image
        BarCodeReader reader = new BarCodeReader(imgStreamActual, DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0a", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
