package com.aspose.external.barcode.tester.releases.v17_8;

import com.aspose.barcode.BarCodeException;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;

public class Issue36650
{
    @BeforeMethod
    public void setUp()
    {
//        LicenseAssistant.setupLicense();
    }

        @Test
        ////[Category("EAN14")]
    public void testGenerationEAN14WithoutAI()
    {
            final String codetext = "12345678901231";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.EAN_14, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.EAN_14);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)" + codetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.EAN_14, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        ////[Category("EAN14")]
    public void testGenerationEAN14WithAI()
    {
            final String codetext = "(01)12345678901231";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.EAN_14, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.EAN_14);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.EAN_14, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        ////[Category("SCC14")]
    public void testGenerationSCC14WithoutAI()
    {
            final String codetext = "12345678901231";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.SCC_14, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.SCC_14);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)" + codetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.SCC_14, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        ////[Category("SCC14")]
    public void testGenerationSCC14WithAI()
    {
            final String codetext = "(01)12345678901231";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.SCC_14, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.SCC_14);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.SCC_14, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        ////[Category("SSCC18")]
    public void testGenerationSSCC18WithoutAI()
    {
            final String codetext = "108528960018123006";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.SSCC_18, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.SSCC_18);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)" + codetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.SSCC_18, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        ////[Category("SSCC18")]
    public void testGenerationSSCC18WithAI()
    {
            final String codetext = "(00)108528960018123006";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.SSCC_18, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.SSCC_18);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.SSCC_18, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        ////[Category("EAN14")]
    public void testMoreOpenBrackets()
    {
        try
        {
                final String codetext = "(01)12(345678901231";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.EAN_14, codetext);
            {
                BufferedImage barcode = gen.generateBarCodeImage();
            }
        }
        catch (BarCodeException e)
        {
            return;
        }
        Assert.fail("BarCodeException expected");
    }

        @Test
        ////[Category("EAN14")]
    public void testMoreCloseBrackets()
    {
        try
        {
                final String codetext = "(01)12345)678901231";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.EAN_14, codetext);
            {
                BufferedImage barcode = gen.generateBarCodeImage();
            }
        }
        catch (BarCodeException e)
        {
            return;
        }
        Assert.fail("BarCodeException expected");
    }

        @Test
        ////[Category("EAN14")]
    public void testLessOpenBrackets()
    {
        try
        {
                final String codetext = "01)12345678901231";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.EAN_14, codetext);
            {
                BufferedImage barcode = gen.generateBarCodeImage();
            }
        }
        catch (BarCodeException e)
        {
            return;
        }
        Assert.fail("BarCodeException expected");
    }

        @Test
        ////[Category("EAN14")]
    public void testLessOpenBrackets2()
    {
        try
        {
                final String codetext = ")0112345678901231";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.EAN_14, codetext);
            {
                BufferedImage barcode = gen.generateBarCodeImage();
            }
        }
        catch (BarCodeException e)
        {
            return;
        }
        Assert.fail("BarCodeException expected");
    }

        @Test
        ////[Category("EAN14")]
    public void testLessCloseBrackets()
    {
        try
        {
                final String codetext = "(0112345678901231";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.EAN_14, codetext);
            {
                BufferedImage barcode = gen.generateBarCodeImage();
            }
        }
        catch (BarCodeException e)
        {
            return;
        }
        Assert.fail("BarCodeException expected");
    }

        @Test
        ////[Category("EAN14")]
    public void testIncorrectBracketsOrder()
    {
        try
        {
                final String codetext = ")01(12345678901231";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.EAN_14, codetext);
            {
                BufferedImage barcode = gen.generateBarCodeImage();
            }
        }
        catch (BarCodeException e)
        {
            return;
        }
        Assert.fail("BarCodeException expected");
    }

        @Test
        ////[Category("EAN14")]
    public void testIncorrectAI()
    {
        try
        {
                final String codetext = "(02)12345678901231";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.EAN_14, codetext);
            {
                BufferedImage barcode = gen.generateBarCodeImage();
            }
        }
        catch (BarCodeException e)
        {
            return;
        }
        Assert.fail("BarCodeException expected");
    }

        @Test
        ////[Category("SCC14")]
    public void testIncorrectAISCC14()
    {
        try
        {
                final String codetext = "(02)12345678901231";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.SCC_14, codetext);
            {
                BufferedImage barcode = gen.generateBarCodeImage();
            }
        }
        catch (BarCodeException e)
        {
            return;
        }
        Assert.fail("BarCodeException expected");
    }

        @Test
        ////[Category("SSCC18")]
    public void testIncorrectAISSCC18()
    {
        try
        {
                final String codetext = "(01)108528960018123006";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.SSCC_18, codetext);
            {
                BufferedImage barcode = gen.generateBarCodeImage();
            }
        }
        catch (BarCodeException e)
        {
            return;
        }
        Assert.fail("BarCodeException expected");
    }
}
