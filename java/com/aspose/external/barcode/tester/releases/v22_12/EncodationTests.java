package com.aspose.external.barcode.tester.releases.v22_12;

import com.aspose.barcode.auxiliary.StringExtensions;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodationTests
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void AutoMode_BytesTest() throws Exception
    {
        StringBuilder strBld = new StringBuilder();
        for (int i = 0; i < 256; ++i)
            strBld.append((char)i);
        String lStr = strBld.toString();
        int lChunkSize = 20;
        for (int i = 0; i < (lStr.length() / lChunkSize); ++i)
        {
            String lorig = StringExtensions.substring(lStr, i * lChunkSize, lChunkSize);
            if (StringExtensions.isNullOrEmpty(lorig)) break;

            BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DOT_CODE, lorig);
            BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), DecodeType.DOT_CODE);
            reader.readBarCodes();
            if (!lorig.equals(reader.getFoundBarCodes()[0].getCodeText()))
                throw new Exception("Generation and recognition is not the same!");
        }
    }

    @Test
    public void MacrosTest()
    {
        List<String> codetextsList = new ArrayList<>(Arrays.asList(
        "[)>\u001E05\u001DCodetextWithMacros05\u001E\u0004",
                "[)>\u001E06\u001DCodetextWithMacros06\u001E\u0004",
                "[)>\u001E12\u001DCodetextWithMacros12\u001E\u0004",
                "[)>\u001E25\u001DCodetextWithMacrosXX\u001E\u0004" ));
        DotCodeExtCodetextBuilder codetextBuilder = new DotCodeExtCodetextBuilder();

        codetextBuilder.addPlainCodetext(codetextsList.get(0));
        codetextBuilder.addFNC3SymbolSeparator();
        codetextBuilder.addPlainCodetext(codetextsList.get(1));
        codetextBuilder.addFNC3SymbolSeparator();
        codetextBuilder.addPlainCodetext(codetextsList.get(2));
        codetextBuilder.addFNC3SymbolSeparator();
        codetextBuilder.addPlainCodetext(codetextsList.get(3));
        String codetext = codetextBuilder.getExtendedCodetext();
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DOT_CODE, codetext);
        {
            generator.getParameters().getBarcode().getDotCode().setDotCodeEncodeMode(DotCodeEncodeMode.EXTENDED_CODETEXT);
            BufferedImage image = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(image, DecodeType.DOT_CODE);
            {
                Assert.assertEquals(4, reader.readBarCodes().length);
                Assert.assertEquals(codetextsList.get(3), reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(codetextsList.get(0), reader.getFoundBarCodes()[1].getCodeText());
                Assert.assertEquals(codetextsList.get(1), reader.getFoundBarCodes()[2].getCodeText());
                Assert.assertEquals(codetextsList.get(2), reader.getFoundBarCodes()[3].getCodeText());
            }
        }
    }

    @Test
    public void SeventeenTenTest()
    {
        String codetext = "66666617009922104444aaaaaaaa5555517009922104444aaaaaaaa55555170099221055555aaaaaaa666666170099221055555";

        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DOT_CODE, codetext);
        {
            BufferedImage image = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(image, DecodeType.DOT_CODE);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void ExtendedCodetextTest()
    {
        DotCodeExtCodetextBuilder codetextBuilder = new DotCodeExtCodetextBuilder();

        codetextBuilder.addPlainCodetext("[)>\u001E05\u001DCodetextWithMacros05\u001E\u0004");
        codetextBuilder.addFNC3SymbolSeparator();
        codetextBuilder.addFNC1FormatIdentifier();
        codetextBuilder.addECICodetext(ECIEncodings.Win1251, "Will");
        codetextBuilder.addFNC1FormatIdentifier();
        codetextBuilder.addECICodetext(ECIEncodings.UTF8, "犬Right狗");
        codetextBuilder.addStructuredAppendMode(1, 35);
        codetextBuilder.addFNC3SymbolSeparator();
        codetextBuilder.addFNC3ReaderInitialization();
        codetextBuilder.addECICodetext(ECIEncodings.Win1251, "привет");
        codetextBuilder.addECICodetext(ECIEncodings.UTF16BE, "犬Power狗");
        codetextBuilder.addPlainCodetext("test");
        codetextBuilder.addStructuredAppendMode(2, 3);
        codetextBuilder.addFNC3SymbolSeparator();
        codetextBuilder.addPlainCodetext("1700000010");
        codetextBuilder.addStructuredAppendMode(35, 35);

        String codetext = codetextBuilder.getExtendedCodetext();
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DOT_CODE, codetext);
        {
            generator.getParameters().getBarcode().getDotCode().setDotCodeEncodeMode(DotCodeEncodeMode.EXTENDED_CODETEXT);
            BufferedImage image = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(image, DecodeType.DOT_CODE);
            {
                reader.readBarCodes();
                Assert.assertEquals(4, reader.readBarCodes().length);
                Assert.assertEquals("1700000010", reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(35, reader.getFoundBarCodes()[0].getExtended().getDotCode().getDotCodeStructuredAppendModeBarcodeId());
                Assert.assertEquals(35, reader.getFoundBarCodes()[0].getExtended().getDotCode().getDotCodeStructuredAppendModeBarcodesCount());
                Assert.assertEquals("[)>\u001E05\u001DCodetextWithMacros05\u001E\u0004", reader.getFoundBarCodes()[1].getCodeText());
                Assert.assertEquals("Will<FNC1>犬Right狗", reader.getFoundBarCodes()[2].getCodeText());
                Assert.assertEquals(1, reader.getFoundBarCodes()[2].getExtended().getDotCode().getDotCodeStructuredAppendModeBarcodeId());
                Assert.assertEquals(35, reader.getFoundBarCodes()[2].getExtended().getDotCode().getDotCodeStructuredAppendModeBarcodesCount());
                Assert.assertEquals("привет犬Power狗test", reader.getFoundBarCodes()[3].getCodeText());
                Assert.assertEquals(2, reader.getFoundBarCodes()[3].getExtended().getDotCode().getDotCodeStructuredAppendModeBarcodeId());
                Assert.assertEquals(3, reader.getFoundBarCodes()[3].getExtended().getDotCode().getDotCodeStructuredAppendModeBarcodesCount());
            }
        }
    }

    @Test
    public void ReaderInitTest()
    {
        String codetext = "Sample codetext";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DOT_CODE, codetext);
        {
            generator.getParameters().getBarcode().getDotCode().setReaderInitialization(true);
            BufferedImage image = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(image, DecodeType.DOT_CODE);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(true, reader.getFoundBarCodes()[0].getExtended().getDotCode().getDotCodeIsReaderInitialization());

            }
        }
    }

    @Test
    public void DotCode_Auto_Encodation_Test()
    {
        String codetext = "犬Right狗";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DOT_CODE, codetext);
        {
            generator.getParameters().getBarcode().getDotCode().setECIEncoding(ECIEncodings.UTF8);
            BufferedImage image = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(image, DecodeType.DOT_CODE);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void DotCode_AutoWithDefaultECI_Encodation_Test()
    {
        String codetext = "Hello!";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DOT_CODE, codetext);
        {
            BufferedImage image = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(image, DecodeType.DOT_CODE);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void WithFormatIdentifierTest()
    {
        String codetext = "20<FNC1>Test";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DOT_CODE, codetext);
        {
            BufferedImage image = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(image, DecodeType.DOT_CODE);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }
    @Test
    public void FormatIdentifierTest()
    {
        String codetext = "2041";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DOT_CODE, codetext);
        {
            BufferedImage image = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(image, DecodeType.DOT_CODE);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void DotCode_Bytes_Encodation_Test()
    {
        StringBuilder sb = new StringBuilder(256);
        for (int i = 0; i < 256; ++i)
            sb.append((char)i);
        String codetext = sb.toString();
        String decodedCodetext = "";

        int partsCount = 4;
        int partLength = codetext.length() / partsCount;
        for (int i = 0; i < partsCount; i++)
        {
            String codetextPart = StringExtensions.substring(codetext, i * partLength, partLength);
            BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DOT_CODE, codetextPart);
            {
                generator.getParameters().getBarcode().getDotCode().setDotCodeStructuredAppendModeBarcodeId(i + 1);
                generator.getParameters().getBarcode().getDotCode().setDotCodeStructuredAppendModeBarcodesCount(partsCount);
                generator.getParameters().getBarcode().getDotCode().setDotCodeEncodeMode(DotCodeEncodeMode.BYTES);
                BufferedImage image = generator.generateBarCodeImage();
                BarCodeReader reader = new BarCodeReader(image, DecodeType.DOT_CODE);
                {
                    Assert.assertEquals(1, reader.readBarCodes().length);
                    Assert.assertEquals(i + 1, reader.getFoundBarCodes()[0].getExtended().getDotCode().getDotCodeStructuredAppendModeBarcodeId());
                    Assert.assertEquals(partsCount, reader.getFoundBarCodes()[0].getExtended().getDotCode().getDotCodeStructuredAppendModeBarcodesCount());
                    decodedCodetext += reader.getFoundBarCodes()[0].getCodeText();
                }
            }
        }
        Assert.assertEquals(codetext, decodedCodetext);
    }

    @Test
    public void GS1DotCodeTests()
    {
        List<String> codetextsList = new ArrayList<>(Arrays.asList("(21)040033662410207(37)1(400)7019590754",
                    "(01)12345678901231",
                    "(01)98898765432106(3202)012345"));
        for (int i = 0; i < codetextsList.size(); i++) {
            String codetext = codetextsList.get(i);
            BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.GS_1_DOT_CODE, codetext);
            {
                BufferedImage image = generator.generateBarCodeImage();
                BarCodeReader reader = new BarCodeReader(image, DecodeType.GS_1_DOT_CODE);
                {
                    Assert.assertEquals(1, reader.readBarCodes().length);
                    Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                }
            }
        }
    }
}
