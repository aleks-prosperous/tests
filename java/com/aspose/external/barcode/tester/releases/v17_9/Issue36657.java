package com.aspose.external.barcode.tester.releases.v17_9;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue36657
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
        //[Category("UPCE")]
    public void testGenerationUPCE()
    {
            final String codetext = "555555";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("05555550", reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
                Assert.assertEquals("0", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCE2()
    {
            final String codetext = "012345";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("00123457", reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
                Assert.assertEquals("7", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCEFull()
    {
            final String codetext = "05555550";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCEFull2()
    {
            final String codetext = "0555555";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("05555550", reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
                Assert.assertEquals("0", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem1()
    {
            final String codetext = "1555555";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("15555557", reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
                Assert.assertEquals("7", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCEIncorrectNumberSystem()
    {
            final String codetext = "25555550";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("02555553", reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
                Assert.assertEquals("3", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem0_0()
    {
            final String codetext = "08995100";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem0_1()
    {
            final String codetext = "01599521";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem0_2()
    {
            final String codetext = "04843252";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem0_3()
    {
            final String codetext = "01839753";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem0_4()
    {
            final String codetext = "02204994";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem0_5()
    {
            final String codetext = "02433615";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem0_6()
    {
            final String codetext = "09878716";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem0_7()
    {
            final String codetext = "09877177";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem0_8()
    {
            final String codetext = "09849238";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem0_9()
    {
            final String codetext = "08101309";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem1_0()
    {
            final String codetext = "16419650";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem1_1()
    {
            final String codetext = "13531591";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem1_2()
    {
            final String codetext = "16150702";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem1_3()
    {
            final String codetext = "17610513";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem1_4()
    {
            final String codetext = "10123454";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem1_5()
    {
            final String codetext = "17298115";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem1_6()
    {
            final String codetext = "18525496";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem1_7()
    {
            final String codetext = "12867617";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem1_8()
    {
            final String codetext = "11624008";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("UPCE")]
    public void testGenerationUPCENumberSystem1_9()
    {
            final String codetext = "18344899";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.UPCE, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }
}
