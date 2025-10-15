package com.aspose.external.barcode.tester.releases.v17_8;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue36651
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("GS1Code128")]
    public void testGenerationGS1Code128()
    {
            final String codetext = "(01)98765432104324";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_CODE_128, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.GS_1_CODE_128);
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.GS_1_CODE_128, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("Code128")]
        //[Category("AllSupportedTypes")]
    public void testGenerationCode128WithAllSupportedTypes()
    {
            final String codetext = "8765432104324";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_128, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("Code128")]
        //[Category("GS1Code128")]
    public void testGenerationCode128AndRecognizeGS1Code128()
    {
            final String codetext = "8765432104324";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_128, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.GS_1_CODE_128);
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("GS1Code128")]
        //[Category("AllSupportedTypes")]
    public void testGenerationGS1Code128WithAllSupportedTypes()
    {
            final String codetext = "(01)98765432104324";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_CODE_128, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.SCC_14, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("GS1Code128")]
        //[Category("EAN14")]
    public void testGenerationGS1Code128AndRecognizeEAN14()
    {
            final String codetext = "(01)98765432104324";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_CODE_128, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.EAN_14);
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.EAN_14, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("GS1Code128")]
        //[Category("EAN14")]
    public void testGenerationGS1Code128AndRecognizeWithEAN14()
    {
            final String codetext = "(01)98765432104324";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_CODE_128, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.GS_1_CODE_128, DecodeType.CODE_128, DecodeType.EAN_14);
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.EAN_14, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("GS1Code128")]
        //[Category("SCC14")]
    public void testGenerationGS1Code128AndRecognizeSCC14()
    {
            final String codetext = "(01)98765432104324";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_CODE_128, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.SCC_14);
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.SCC_14, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("GS1Code128")]
        //[Category("SCC14")]
    public void testGenerationGS1Code128AndRecognizeWithSCC14()
    {
            final String codetext = "(01)98765432104324";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_CODE_128, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.GS_1_CODE_128, DecodeType.CODE_128, DecodeType.SCC_14, DecodeType.EAN_14);
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.SCC_14, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("GS1Code128")]
        //[Category("SCC14")]
    public void testGenerationGS1Code128AndRecognizeWithSCC14_2()
    {
            final String codetext = "(01)98765432104324";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_CODE_128, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.SCC_14, DecodeType.EAN_14);
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.SCC_14, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void testGenerationGS1Code128_2()
    {
            final String codetext = "(00)108528960018123006";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_CODE_128, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.GS_1_CODE_128);
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.GS_1_CODE_128, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("GS1Code128")]
        //[Category("AllSupportedTypes")]
    public void testGenerationGS1Code128WithAllSupportedTypes_2()
    {
            final String codetext = "(00)108528960018123006";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_CODE_128, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.SSCC_18, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("GS1Code128")]
        //[Category("SSCC18")]
    public void testGenerationGS1Code128AndRecognizeSSCC18()
    {
            final String codetext = "(00)108528960018123006";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_CODE_128, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.SSCC_18);
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.SSCC_18, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("GS1Code128")]
        //[Category("SSCC18")]
    public void testGenerationGS1Code128AndRecognizeWithSSCC18()
    {
            final String codetext = "(00)108528960018123006";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_CODE_128, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.GS_1_CODE_128, DecodeType.CODE_128, DecodeType.SCC_14, DecodeType.EAN_14, DecodeType.SSCC_18);
            {
                reader.setQualitySettings(QualitySettings.getHighPerformance());
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.SSCC_18, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }
}
