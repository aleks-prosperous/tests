package com.aspose.external.barcode.tester.releases.v17_5;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.DataMatrixEncodeMode;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;

@Test
public class Issue36531
{
    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testDataMatrixGeneratingTextEncoding1()
    {
        String text = "aim012";

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
        gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.TEXT);
        gen.setCodeText(text);

        BufferedImage image = gen.generateBarCodeImage();
        final BarCodeReader reader = new BarCodeReader(image, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testDataMatrixGeneratingTextEncodingEndingn1()
    {
        generateAndRecognize("ABC");
    }

    @Test
    public void testDataMatrixGeneratingTextEncodingEndingn2()
    {
        generateAndRecognize("abc");
    }

    @Test
    public void testDataMatrixGeneratingTextEncodingEndingn3()
    {
        generateAndRecognize("abcd");
    }

    @Test
    public void testDataMatrixGeneratingTextEncodingEndingn4()
    {
        generateAndRecognize("abcde");
    }

    @Test
    public void testDataMatrixGeneratingTextEncodingEndingn6()
    {
        generateAndRecognize("abcdef");
    }

    @Test
    public void testDataMatrixGeneratingTextEncodingEndingn7()
    {
        generateAndRecognize("abc=de");
    }

    @Test
    public void testDataMatrixGeneratingTextEncodingDiffSizes()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++)
        {
            sb.append((char) (i % 26 + 'a'));
            generateAndRecognize(sb.toString());
        }
    }

    @Test
    public void testDataMatrixGeneratingTextEncoding2()
    {
        generateAndRecognize("AIM012");
    }

    @Test
    public void testDataMatrixGeneratingTextEncoding3()
    {
        generateAndRecognize("AIM0123");
    }

    @Test
    public void testDataMatrixGeneratingTextEncoding4()
    {
        generateAndRecognize("aim012");
    }

    @Test
    public void testDataMatrixGeneratingTextEncoding5()
    {
        generateAndRecognize("aim0123");
    }

    @Test
    public void testDataMatrixGeneratingTextEncodingAllSymbols()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++)
        {
            sb.append((char) i);
        }
        generateAndRecognize(sb.toString());
    }

    @Test
    public void testDataMatrixGeneratingTextEncodingAllSymbolsDiffSized()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++)
        {
            sb.append((char) i);
        }

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 10; i++)
        {
            sb2.append((char) (i + 'A'));
            generateAndRecognize(sb2.toString() + sb.toString());
        }
    }

    @Test
    public void testDataMatrixGeneratingTextEncodingAllSymbolsDiffSized2()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++)
        {
            sb.append((char) i);
        }

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 10; i++)
        {
            sb2.append((char) (i + 'a'));
            generateAndRecognize(sb2.toString() + sb.toString());
        }
    }

    private void generateAndRecognize(String text)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
        gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.TEXT);
        gen.setCodeText(text);

        BufferedImage image = gen.generateBarCodeImage();
        final BarCodeReader reader = new BarCodeReader(image, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }
}