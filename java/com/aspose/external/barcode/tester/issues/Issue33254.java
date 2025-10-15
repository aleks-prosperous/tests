package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EnableChecksum;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;


@Test(description = "Tests for Issue-33254.")
public class Issue33254
{
    final String folder = Global.getTestDataFolder("Issues/Issue33254");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Generation_OK()
    {
        generateAndRecognize("66");
        generateAndRecognize("77");
        generateAndRecognize("102");
        generateAndRecognize("505");
        generateAndRecognize("1234");
        generateAndRecognize("16958");
        generateAndRecognize("56988");
        generateAndRecognize("101220");
        generateAndRecognize("123249");
        generateAndRecognize("44");
        generateAndRecognize("55");
    }

    @Test
    public void test_Generation_Fail_VectorizedLine()
    {
        generateAndRecognize("3", false);
        generateAndRecognize("7", false);
    }

    @Test
    public void test_Recognition_Horizontal()
    {
        final String file = "aspose_horizontal.png";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.PHARMACODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("4570", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Recognition_Vertical()
    {
        final String file = "aspose_vertical.png";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.PHARMACODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("4570", reader.getFoundBarCodes()[0].getCodeText());
    }

    private static void generateAndRecognize(String codetext)
    {
        BufferedImage bitmap = generateInMemory(codetext);
        recognizeInMemory(codetext, bitmap, true);
    }

    private static void generateAndRecognize(String codetext, boolean OKrecognition)
    {
        BufferedImage bitmap = generateInMemory(codetext);
        recognizeInMemory(codetext, bitmap, OKrecognition);
    }

    private static BufferedImage generateInMemory(String codetext)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.PHARMACODE, codetext);
        {
            gen.getParameters().getBarcode().setChecksumEnabled(EnableChecksum.DEFAULT);
            return gen.generateBarCodeImage();
        }
    }

    private static void recognizeInMemory(String codetext, BufferedImage bitmap, boolean OKrecognition)
    {
        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.PHARMACODE);
        if (!OKrecognition)
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        else
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

