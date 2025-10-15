package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;


@Test(description = "Tests for Issue33179.")
public class Issue33179
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33179");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void testQR()
    {
            final String text = "Aspose.Barcode sample";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR, text);
        {
            BufferedImage bitmap = gen.generateBarCodeImage();
            {

                BarCodeReader reader = new BarCodeReader(bitmap);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
    public void testAztec()
    {
            final String text = "Aspose.Barcode sample";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AZTEC, text);
        {
            BufferedImage bitmap = gen.generateBarCodeImage();
            {

                BarCodeReader reader = new BarCodeReader(bitmap);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
    public void testDataMatrix()
    {
            final String text = "Aspose.Barcode sample";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
        {
            BufferedImage bitmap = gen.generateBarCodeImage();
            {

                BarCodeReader reader = new BarCodeReader(bitmap);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
    public void testPdf417()
    {
            final String text = "Aspose.Barcode sample";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.PDF_417, text);
        {
            BufferedImage bitmap = gen.generateBarCodeImage();
            {

                BarCodeReader reader = new BarCodeReader(bitmap);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void testQR_FromFile()
    {
        final String text = "Aspose.Barcode sample";

        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "aspose_qr.png"));
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
    public void testQR_FromFileWithErrors()
    {
            String text = "Aspose.Barcode sample";

        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "aspose_qr_witherror.png"));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testQR_FromFileWithErrors2()
    {
        final String text = "Aspose.Barcode sample";

        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "aspose_qr_witherror2.png"));
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testQR_FromFileWithErrors3()
    {
        final String text = "Aspose.Barcode sample";

        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "aspose_qr_witherror3.png"));
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }
}

