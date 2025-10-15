package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;


@Test(description = "Tests for Issue14979.")
public class Issue14979
{
    private final static String Folder = Global.getIssuesTestImagePath("Issue14979");

    private static final String FirstText = "0123456789";
    private static final String SecondText = "01234567890123456789";

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("DataMatrix")]
    public void Generate0123456789() throws IOException
        {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, FirstText);
        gen.save(Global.getTempFolder("0123456789datamatrix.png"));
    }

        @Test
        //[Category("DataMatrix")]
    public void Generate01234567890123456789() throws IOException
        {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, SecondText);
        gen.save(Global.getTempFolder("01234567890123456789datamatrix.png"));
    }

        @Test
        //[Category("DataMatrix")]
    public void testFirst()
    {
            final String fileName = "0123456789datamatrix.png";
        String path = Global.pathCombine(Folder, fileName);

        BarCodeReader reader = new BarCodeReader(path);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(FirstText, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void testSecond()
    {
            final String fileName = "01234567890123456789datamatrix.png";
        String path = Global.pathCombine(Folder, fileName);

        BarCodeReader reader = new BarCodeReader(path);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(SecondText, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void GenerateAndTestFirst()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, FirstText);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(FirstText, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void GenerateAndTestSecond()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, SecondText);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(SecondText, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }
}

