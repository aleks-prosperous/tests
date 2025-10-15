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


@Test(description = "Tests for Issue33819.")
public class Issue33819
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    private void testGenerationAndRecognitionOfText(String text)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR, text);
            BufferedImage bitmap = gen.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.QR);//improved test performance with DecodeType.QR
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testSimpleText()
    {
        String text = "A";
        testGenerationAndRecognitionOfText(text);
    }

    @Test
    public void test2953Text()
    {
        String text = "";
        for (int i = 0; i < 2953; i++)
        {
            text += "A";
        }
        testGenerationAndRecognitionOfText(text);
    }

    @Test
    public void test2954Text()
    {
        String text = "";
        for (int i = 0; i < 2954; i++)
        {
            text += "A";
        }
        testGenerationAndRecognitionOfText(text);
    }

    @Test
    public void test4296Text()
    {
        String text = "";
        for (int i = 0; i < 4296; i++)
        {
            text += "A";
        }
        testGenerationAndRecognitionOfText(text);
    }
}

