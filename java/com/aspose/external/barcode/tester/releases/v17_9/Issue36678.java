package com.aspose.external.barcode.tester.releases.v17_9;

import com.aspose.barcode.BarCodeException;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;

public class Issue36678
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
        ////[Category("DatabarLimited")]
    public void testDatabarLimitedWithIncorrectCodeText()
    {
            final String codetext = "(01)2123456789123";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_LIMITED, codetext);
        {
            try
            {
                BufferedImage bitmap = gen.generateBarCodeImage();
                Assert.fail("Must be exception, because codetext isn't correct.");
            }
            catch (BarCodeException e)
            {
            }
        }
    }

        @Test
        ////[Category("DatabarLimited")]
    public void testDatabarLimitedWithIncorrectCodeTextShort()
    {
            final String codetext = "(01)20000000005";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_LIMITED, codetext);
        {
            try
            {
                BufferedImage bitmap = gen.generateBarCodeImage();
                Assert.fail("Must be exception, because codetext isn't correct.");
            }
            catch (BarCodeException e)
            {
            }
        }
    }

        @Test
        ////[Category("DatabarLimited")]
    public void testDatabarLimitedWithIncorrectCodeTextAll()
    {
            final String end = "000000000000";
            final String start = "(01)";
        for (int i = 2; i <= 9; i++)
        {
            String codetext = start + i + end;
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_LIMITED, codetext);
            {
                try
                {
                    BufferedImage bitmap = gen.generateBarCodeImage();
                    Assert.fail("Must be exception, because codetext isn't correct.");
                }
                catch (BarCodeException e)
                {
                }
            }
        }
    }

        @Test
        ////[Category("DatabarLimited")]
    public void testDatabarLimitedWithCorrectCodeText1()
    {
            final String codetext = "(01)08888888888888";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_LIMITED, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_LIMITED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.DATABAR_LIMITED, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        ////[Category("DatabarLimited")]
    public void testDatabarLimitedWithCorrectCodeText2()
    {
            final String codetext = "(01)17777777777779";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_LIMITED, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_LIMITED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.DATABAR_LIMITED, reader.getFoundBarCodes()[0].getCodeType());
        }
    }




        @Test
        ////[Category("DatabarLimited")]
    public void testDatabarLimitedWithCorrectCodeText2xxxxxxxxxx()
    {
            final String codetext = "(01)11234567891238";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_LIMITED, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_LIMITED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.DATABAR_LIMITED, reader.getFoundBarCodes()[0].getCodeType());
        }
    }
}
