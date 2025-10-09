package com.aspose.external.barcode.tester.generation;

import com.aspose.barcode.BarCodeException;
import com.aspose.barcode.InvalidCodeException;
import com.aspose.barcode.auxiliary.StringExtensions;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;

public class DataMatrixEncodationTests
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void AutoTest()
    {
        String str = "ABSFKJDBFw34732559487uKNFDkljehrikerhNOY*&^%&$%&^UTDYsjkafadjadfadafffffffffff";
        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, str);
        {
            bg.getParameters().getBarcode().getDataMatrix().setDataMatrixVersion(DataMatrixVersion.AUTO);
            BufferedImage img = bg.generateBarCodeImage();
            BarCodeReader r = new BarCodeReader(img, DecodeType.DATA_MATRIX);
            {
                BarCodeResult[] found = r.readBarCodes();
                Assert.assertEquals(1, found.length);
                Assert.assertEquals(str, found[0].getCodeText());
            }
        }
    }

    @Test
    public void ANSIX12_Encodation_Test()
    {
        for(String str : new String[]
                {
                        "1>35>LAQ>5",
                        "12TY23",
                        "12TY231",
                        "12TY2312",
                        "12TY23123",
                        "1231231231",
                        "123SD31>3123",
                        "1231231231231",
                        "123 231231KSD2",
                        "123123123123121",
                        "1231231231231212",
                        "1231 312312TY2123",
                        "1231231231231 1231",
                        "123 23DF31231212312",
                        "123123123123J21 3123",
                        "123123123123121231231",
                        "12312312 1231212312312",
                        "1231SDF2312312123123123",
                        "1231231231231>1231GF1231"
                })
        {
            BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, str);
            {
                bg.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.ANSIX12);
                BufferedImage img = bg.generateBarCodeImage();
                BarCodeReader r = new BarCodeReader(img, DecodeType.DATA_MATRIX);
                {
                    BarCodeResult[] found = r.readBarCodes();
                    Assert.assertEquals(1, found.length);
                    Assert.assertEquals(str, found[0].getCodeText());
                }
            }
        }
    }

    @Test
    public void ANSIX12_Encodation_Big_Test()
    {
        for(String str : new String[]
                {
                        "1>35>LAQ>5",
                        "12TY23",
                        "12TY231",
                        "12TY2312",
                        "12TY23123",
                        "1231231231",
                        "123SD31>3123",
                        "1231231231231",
                        "123 231231KSD2",
                        "123123123123121",
                        "1231231231231212",
                        "1231 312312TY2123",
                        "1231231231231 1231",
                        "123 23DF31231212312",
                        "123123123123J21 3123",
                        "123123123123121231231",
                        "12312312 1231212312312",
                        "1231SDF2312312123123123",
                        "1231231231231>1231GF1231"
                })
        {
            BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, str);
            {
                bg.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.ANSIX12);
                bg.getParameters().getBarcode().getDataMatrix().setDataMatrixVersion(DataMatrixVersion.ECC200_16x48);
                BufferedImage img = bg.generateBarCodeImage();
                BarCodeReader r = new BarCodeReader(img, DecodeType.DATA_MATRIX);
                {
                    BarCodeResult[] found = r.readBarCodes();
                    Assert.assertEquals(1, found.length);
                    Assert.assertEquals(str, found[0].getCodeText());
                }
            }
        }
    }

    @Test
    public void ANSIX12_Encodation_Incorrect_Data_Test()
    {
        boolean exceptionCatched = false;
        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, "12312312error3123123");
        {
            bg.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.ANSIX12);
            try
            {
                BufferedImage img = bg.generateBarCodeImage();
            }
            catch (BarCodeException e)
            {
                exceptionCatched = true;
            }
        }

        Assert.assertTrue(exceptionCatched);
    }

    @Test
    public void EDIFACT_Encodation_Test()
    {
        for(String str : new String[]
                {
                        "1>35>LAQ>5",
                        "A2TY2",
                        "A2TY23",
                        "A2TY231",
                        "A2TY2312",
                        "A2TY23123",
                        "B231231231",
                        "123S%31>3123",
                        "1231231231231",
                        "123 23%=31KSD2",
                        "12312(123123121",
                        "1231231231231212",
                        "1231 312312TY2123",
                        "1231231231+31 1231",
                        "123 23DF31231(12312",
                        "123123123123J21 3123",
                        "123=23123123121231231",
                        "12312312 1231212312312",
                        "1231%DF2312317123123123",
                        "12312!1231231>1231GF1231",
                        "UNA:+.? " +
                                "UNB+IATB:1+6XPPC:ZZ+LHPPC:ZZ+940101:0950+1" +
                                "UNH+1+PAORES:93:1:IA" +
                                "MSG+1:45" +
                                "IFT+3+XYZCOMPANY AVAILABILITY" +
                                "ERC+A7V:1:AMD" +
                                "IFT+3+NO MORE FLIGHTS" +
                                "ODI" +
                                "TVL+240493:1000::1220+FRA+JFK+DL+400+C" +
                                "PDI++C:3+Y::3+F::1" +
                                "APD+74C:0:::6++++++6X" +
                                "TVL+240493:1740::2030+JFK+MIA+DL+081+C" +
                                "PDI++C:4" +
                                "APD+EM2:0:1630::6+++++++DA" +
                                "UNT+13+1" +
                                "UNZ+1+1"
                })
        {
            BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, str);
            {
                bg.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.EDIFACT);
                bg.getParameters().getBarcode().getXDimension().setPixels(5);
                BufferedImage img = bg.generateBarCodeImage();
                BarCodeReader r = new BarCodeReader(img, DecodeType.DATA_MATRIX);
                {
                    BarCodeResult[] found = r.readBarCodes();
                    Assert.assertEquals(1, found.length);
                    Assert.assertEquals(str, found[0].getCodeText());
                }
            }
        }
    }


    @Test
    public void extendedCodetext_EncodeModes_Test()
    {
        // Format : \Encodation_scheme_name:text
        for(String str : new String[]
        {
            "\\edifact:A2TY2312",
                    "\\Edifact:123S%31>3123",
                    "\\EDIFACT:1231231231231",
                    "\\edifact:123=2312\\\\3123121231231",
                    "\\edifact:12312312 1231212312312",
                    "\\edifact:1231%DF2312123123123\\text:qweqweqwe",
                    "\\edifact:1231%DF23123173123123\\text:qweqweqwe",
                    "\\edifact:1231%DF231231712123123\\text:qweqweqwe",
                    "\\edifact:1231%DF2312317123123123\\text:qweqweqwe",
                    "\\edifact:1231%DF2312317123123123\\text:qweqweqweqweq",
                    "\\edifact:1231%DF2312317123123123\\text:qweqweqweqwe",
                    "\\edifact:1231%DF2312317123123123\\text:qweqweqweqw",
                    "\\edifact:1231%DF2312317123123123\\text:qweqweqweq",
                    "\\edifact:12331>\\c40:123123123",
                    "\\edifact:12331>GF1231\\c40:123123123",
                    "\\edifact:12331>1231231\\c40:123123123",
                    "\\edifact:12331>1231GF11\\c40:123123123",
                    "\\edifact:12331>1231GF123\\c40:123123123",
                    "\\edifact:12331>1231GF1231\\c40:123123123",
                    "\\edifact:123231>1231GF1231\\c40:123123123",
                    "\\edifact:1231231>1231GF1231\\c40:123123123",
                    "\\edifact:12312!1231231GF1231\\c40:123123123",
                    "\\edifact:12312!1231231>GF1231\\c40:123123123",
                    "\\edifact:12312!1231231>1231231\\c40:123123123",
                    "\\edifact:12312!1231231>1231GF11\\c40:123123123",
                    "\\edifact:12312!1231231>1231GF123\\c40:123123123",
                    "\\edifact:12312!1231231>1231GF1231\\c40:1231231231",
                    "\\edifact:12312!1231231>1231GF1231\\c40:12312312312",
                    "\\edifact:12312!1231231>1231GF1231\\c40:123123123123",
                    "\\edifact:12312!1231231>1231GF1231\\c40:1231231231231",
                    "\\edifact:12312!1231231>1231GF1231\\c40:123123123123123",
                    "\\edifact:12312!1231231>1231GF1231\\c40:1231231231231231",
                    "\\edifact:12312!1231231>1231GF1231\\c40:12312312312312312",
                    "\\x12:QWEQWEQWEQWEQWE\\edifact:1231%DF23123",
                    "\\x12:QWEQWEQWEQWEQW\\edifact:1231%DF23123",
                    "\\x12:QWEQWEQWEQWEQ\\edifact:1231%DF23123",
                    "\\x12:QWEQWEQWEQWE\\edifact:1231%DF23123",
                    "\\x12:QWEQWEQWEQW\\edifact:1231%DF23123",
                    "\\x12:QWEQWEQWEQ\\edifact:1231%DF23123",
                    "\\x12:QWEQWEQWE\\edifact:1231%DF23123",
                    "\\text:qweqweqweqweqwe\\edifact:1231%DF23123\\text:qweqweqwe",
                    "\\text:qweqweqweqweqw\\edifact:1231%DF23123\\text:qweqweqwe",
                    "\\text:qweqweqweqweq\\edifact:1231%DF23123\\text:qweqweqwe",
                    "\\text:qweqweqweqwe\\edifact:1231%DF23123\\text:qweqweqwe",
                    "\\text:qweqweqweqw\\edifact:1231%DF23123\\text:qweqweqwe",
                    "\\text:qweqweqweq\\edifact:1231%DF23123\\text:qweqweqwe",
                    "\\text:qweqweqwe\\edifact:1231%DF23123\\text:qweqweqwe",
                    "\\text:qweqweqwe\\edifact:1231%DF2312312312312",
                    "\\text:qweqweqwe\\edifact:1231%DF231231231231",
                    "\\text:qweqweqwe\\edifact:1231%DF23123123123",
                    "\\text:qweqweqwe\\edifact:1231%DF2312312312",
                    "\\text:qweqweqwe\\edifact:1231%DF231231231",
                    "\\text:qweqweqwe\\edifact:1231%DF23123123",
                    "\\text:qweqweqwe\\edifact:1231%DF2312312",
                    "\\c40:qweqweqwe\\edifact:1231%DF23123123123121",
                    "\\c40:qweqweqwe\\edifact:1231%DF2312312312312",
                    "\\c40:qweqweqwe\\edifact:1231%DF231231231231",
                    "\\c40:qweqweqwe\\edifact:1231%DF23123123123",
                    "\\c40:qweqweqwe\\edifact:1231%DF2312312312",
                    "\\c40:qweqweqwe\\edifact:1231%DF2312312312",
                    "\\c40:qweqweqweq\\edifact:1231%DF2312312312",
                    "\\c40:qweqweqweqw\\edifact:1231%DF2312312312",
                    "\\c40:qweqweqweqwe\\edifact:1231%DF2312312312",
                    "\\c40:qweqweqweqweq\\edifact:1231%DF2312312312",
                    "\\text:qweqweqwe\\edifact:1231%DF2312312312",
                    "\\text:qweqweqweq\\edifact:1231%DF2312312312",
                    "\\text:qweqweqweqw\\edifact:1231%DF2312312312",
                    "\\text:qweqweqweqwe\\edifact:1231%DF2312312312",
                    "\\text:qweqweqwe\\text:qweqweqwe\\edifact:1231%DF231231",
                    "\\text:qweqweqwe\\:qweqweqwe\\edifact:1231%DF231231",
                    "\\text:qweqweqwe\\qweqweqwe\\edifact:1231%DF231231",
                    "\\text:qweqweqwe\\text:qweqweqwe\\:1231%DF231231",
                    "\\text:qweqweqwe\\text:qweqweqwe\\1231%DF231231",
                    "datawithoutencodemode\\text:qweqweqwe\\edifact:1231%DF231231",
                    ":datawithoutencodemode\\text:qweqweqwe\\edifact:1231%DF231231",
                    "::datawithoutencodemode\\text:qweqweqwe\\edifact:1231%DF231231"
        })
        {
            BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, str);
            {
                bg.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.EXTENDED_CODETEXT);
                bg.getParameters().getBarcode().getXDimension().setPixels(5);
                BufferedImage img = bg.generateBarCodeImage();
                BarCodeReader r = new BarCodeReader(img, DecodeType.DATA_MATRIX);
                {
                    BarCodeResult[] found = r.readBarCodes();
                    Assert.assertEquals(1, found.length);
                    Assert.assertEquals(parseExtendedCodetext(str), found[0].getCodeText());
                }
            }
        }
    }

    @Test
    public void AutoEncodation_Test()
    {
        String codetext = "犬Right狗";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, codetext);
        {
            generator.getParameters().getBarcode().getDataMatrix().setECIEncoding(ECIEncodings.UTF8);
            generator.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.AUTO);
            BufferedImage image = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(image, DecodeType.DATA_MATRIX);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void ExtendedCodetext_Test()
    {
        DataMatrixExtCodetextBuilder codetextBuilder = new DataMatrixExtCodetextBuilder();

        codetextBuilder.addECICodetext(ECIEncodings.Win1251, "Привет!");
        codetextBuilder.addECICodetextWithEncodeMode(ECIEncodings.Win1251, DataMatrixEncodeMode.BYTES, "XXXX");
        codetextBuilder.addECICodetext(ECIEncodings.UTF8, "犬Right狗");
        codetextBuilder.addECICodetextWithEncodeMode(ECIEncodings.UTF8, DataMatrixEncodeMode.C40, "ABCDE");
        codetextBuilder.addECICodetext(ECIEncodings.Win1251, "Will");
        codetextBuilder.addPlainCodetext("test");
        codetextBuilder.addCodetextWithEncodeMode(DataMatrixEncodeMode.C40, "ABCDE");
        codetextBuilder.addPlainCodetext("1700000010");

        String codetext = codetextBuilder.getExtendedCodetext();
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, codetext);
        {
            generator.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.EXTENDED_CODETEXT);
            BufferedImage image = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(image, DecodeType.DATA_MATRIX);
            {
                reader.readBarCodes();
                Assert.assertEquals(1, reader.getFoundBarCodes().length);
                Assert.assertEquals("Привет!XXXX犬Right狗ABCDEWilltestABCDE1700000010", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    private static class TestCase
    {
        public TestCase(String codetext, String expected)
        {
            this.codetext = codetext;
            this.expected = expected;
        }

        public String getCodetext()
        {
            return codetext;
        }

        public void setCodetext(String value)
        {
            codetext = value;
        }
        private String codetext;

        public String getExpected()
        {
            return expected;
        }
        public void setExpected(String value)
        {
            expected = value;
        }
        private String expected;
    }

    @Test
    public void extendedCodetext_Backslashes_Test()
    {
        // Format : \Encodation_scheme_name:text
        for(TestCase testCase : new TestCase[]{
                new TestCase("\\text:\\text:qwe", "qwe"),
                new TestCase("\\text:\\qwe:","qwe:"),
                new TestCase("\\invalid:1231%DF2312123123123\\text:qweqweqwe","invalid:1231%DF2312123123123qweqweqwe"),
                new TestCase("\\\\invalid:1231%DF2312123123123\\text:qweqweqwe","\\invalid:1231%DF2312123123123qweqweqwe"),
                new TestCase("\\\\edifact:1231%DF2312123123123\\text:qweqweqwe","\\edifact:1231%DF2312123123123qweqweqwe"),
                new TestCase("\\edifact:1231%DF23123173123123\\\\\\text:qweqweqwe","1231%DF23123173123123\\qweqweqwe"),
                new TestCase("\\edifact:1231%DF231231712123123\\text:qweqweqwe\\\\","1231%DF231231712123123qweqweqwe\\"),
                new TestCase("\\edifact:1231%DF2312317123123123\\text:qweqweqwe\\\\\\","1231%DF2312317123123123qweqweqwe\\\\"),
                new TestCase("\\edifact:1231%DF2312317123123123\\text:qweqweqweqweq","1231%DF2312317123123123qweqweqweqweq"),
                new TestCase("\\edifact:1231%DF231\\\\2317123123123\\text:qweqweqweqwe","1231%DF231\\2317123123123qweqweqweqwe") })
        {
            BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, testCase.getCodetext());
            {
                bg.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.EXTENDED_CODETEXT);
                bg.getParameters().getBarcode().getXDimension().setPixels(5);
                BufferedImage img = bg.generateBarCodeImage();
                BarCodeReader r = new BarCodeReader(img, DecodeType.DATA_MATRIX);
                {
                    BarCodeResult[] found = r.readBarCodes();
                    Assert.assertEquals(1, found.length);
                    Assert.assertEquals(testCase.expected, found[0].getCodeText());
                }
            }
        }
    }

    @Test
    public void extendedCodetext_EmptyText_Test()
    {
        boolean exceptionCatched = false;
        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, "\\text:\\c40:\\auto:");
        {
            bg.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.EXTENDED_CODETEXT);
            bg.getParameters().getBarcode().getXDimension().setPixels(5);
            try
            {
                BufferedImage img = bg.generateBarCodeImage();
            }
            catch (InvalidCodeException e)
            {
                exceptionCatched = true;
            }
        }
        Assert.assertTrue(exceptionCatched);
    }

    @Test
    public void EDIFACT_Encodation_Big_Test()
    {
        for(String str : new String[]
                {
                        "1>35>LAQ>5",
                        "A2TY2",
                        "A2TY23",
                        "A2TY231",
                        "A2TY2312",
                        "A2TY23123",
                        "B231231231",
                        "123S%31>3123",
                        "1231231231231",
                        "123 23%=31KSD2",
                        "12312(123123121",
                        "1231231231231212",
                        "1231 312312TY2123",
                        "1231231231+31 1231",
                        "123 23DF31231(12312",
                        "123123123123J21 3123",
                        "123=23123123121231231",
                        "12312312 1231212312312",
                        "1231%DF2312317123123123",
                        "12312!1231231>1231GF1231"
                })
        {
            BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, str);
            {
                bg.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.EDIFACT);
                bg.getParameters().getBarcode().getDataMatrix().setDataMatrixVersion(DataMatrixVersion.ECC200_48x48);
                bg.getParameters().getBarcode().getXDimension().setPixels(5);
                BufferedImage img = bg.generateBarCodeImage();
                BarCodeReader r = new BarCodeReader(img, DecodeType.DATA_MATRIX);
                {
                    BarCodeResult[] found = r.readBarCodes();
                    Assert.assertEquals(1, found.length);
                    Assert.assertEquals(str, found[0].getCodeText());
                }
            }
        }
    }

    private static String parseExtendedCodetext(String extendedCodetext)
    {
        String res = "";
        String[] rawSegments = extendedCodetext.split("(?<!\\\\)\\\\(?!\\\\)");
        for (String rawSegment : rawSegments)
        {
            if (rawSegment != null && !rawSegment.equals(""))
            {
                int splitterPos = rawSegment.indexOf(':');

                String rawMode = StringExtensions.substring(rawSegment, 0, Math.max(0, splitterPos));
                String rawText = StringExtensions.substring(rawSegment, splitterPos + 1, rawSegment.length() - (splitterPos + 1));

                res += StringExtensions.replace(rawText, "\\\\", "\\");
            }
        }
        return res;
    }
}
