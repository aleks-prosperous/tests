package com.aspose.external.barcode.tester.releases.v17_5;

import com.aspose.barcode.auxiliary.Global;
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
import java.io.File;

@Test
public class Issue36525
{
    /**
     * <p>
     * Path to folder with files for testing Issue36525.
     * </p>
     */
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36525");

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

    public void testDataMatrixGenerating_C40Encoding1()
    {
        generateAndRecognize("AIM012");
    }

    @Test

    public void testDataMatrixGeneratingC40Encoding2()
    {
        generateAndRecognize("AIM01234");
    }

    @Test
    public void testDataMatrixGeneratingC40Encoding3()
    {
        generateAndRecognize("AIM0123");
    }

    @Test
    public void testDataMatrixGeneratingC40Encoding4()
    {
        generateAndRecognize("AB=");
    }

    @Test
    public void testDataMatrixGeneratingC40Encoding5()
    {
        generateAndRecognize("ABCD");
    }

    @Test
    public void testDataMatrixGeneratingC40Encoding6()
    {
        generateAndRecognize("==");
    }

    @Test
    public void testDataMatrixGeneratingC40Encoding7()
    {
        generateAndRecognize("A=C");
    }

    @Test
    public void testDataMatrixGeneratingC40Encoding8()
    {
        generateAndRecognize("AB=D");
    }

    @Test
    public void testDataMatrixGeneratingC40Encoding9()
    {
        generateAndRecognize(String.valueOf((char) 127));
    }

    @Test
    public void testDataMatrixGeneratingC40EncodingLastChars()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 120; i < 128; i++)
        {
            sb.append((char) i);
        }
        generateAndRecognize(sb.toString());
    }

    @Test
    public void testDataMatrixGeneratingC40EncodingAllSymbols()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++)
        {
            sb.append((char) i);
        }
        generateAndRecognize(sb.toString());
    }

    @Test
    public void testDataMatrixGeneratingC40EncodingAllSymbolsLong()
    {
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < 10; x++)
        {
            for (int i = 0; i < 128; i++)
            {
                sb.append((char) i);
            }
        }
        generateAndRecognize(sb.toString());
    }

    @Test
    public void testDataMatrixGeneratingC40EncodingAllSymbolsDiffSized()
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
    public void test_DataMatrixGenerating_FullEncoding()
    {
        final String text = "*DEMO*012345";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
        gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.BYTES);

        BufferedImage image = gen.generateBarCodeImage();
        final BarCodeReader reader = new BarCodeReader(image, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Reading_C40_GeneratedByVinta()
    {
        String fileName = Global.pathCombine(folder, "vintaGenerated.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("*DEMO*012345", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Reading_C40_GeneratedByVintaDemoABC()
    {
        String fileName = Global.pathCombine(folder, "vintaGenerated_DemoABC.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("*DEMO*ABC", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Reading_C40_GeneratedBoyCoUa_DemoABC()
    {
        String fileName = Global.pathCombine(folder, "generator_boycoua_DEMOABC.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("*DEMO*ABC", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Reading_C40_GeneratedBoyCoUa_1()
    {
        String fileName = Global.pathCombine(folder, "generator_boycoua_1.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Reading_C40_GeneratedBoyCoUa_ABe()
    {
        String fileName = Global.pathCombine(folder, "generator_boycoua_AB=.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("AB=", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Reading_C40_GeneratedBoyCoUa_ABCDEFG()
    {
        String fileName = Global.pathCombine(folder, "generator_boycoua_ABCDEFG.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("ABCDEFG", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Reading_C40_GeneratedBoyCoUa_ABCDEFGH()
    {
        String fileName = Global.pathCombine(folder, "generator_boycoua_ABCDEFGH.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("ABCDEFGH", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Reading_C40_GeneratedBoyCoUa_ABCDEFGHI()
    {
        String fileName = Global.pathCombine(folder, "generator_boycoua_ABCDEFGHI.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("ABCDEFGHI", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Reading_C40_GeneratedBoyCoUa_ABCDEFGHIJ()
    {
        String fileName = Global.pathCombine(folder, "generator_boycoua_ABCDEFGHIJ.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("ABCDEFGHIJ", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Reading_C40_GeneratedBoyCoUa_ABCD()
    {
        String fileName = Global.pathCombine(folder, "generator_boycoua_ABCD.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("ABCD", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testDataMatrixGeneratingC40Encoding_Endingn_1()
    {
        generateAndRecognize("ABC");
    }

    private void generateAndRecognize(String text)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
        gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.C40);

        BufferedImage image = gen.generateBarCodeImage();
        final BarCodeReader reader = new BarCodeReader(image, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }
}
