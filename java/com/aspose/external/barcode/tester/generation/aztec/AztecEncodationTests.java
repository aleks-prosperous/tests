package com.aspose.external.barcode.tester.generation.aztec;

import com.aspose.barcode.auxiliary.StringExtensions;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;

public class AztecEncodationTests
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
    public void test_Aztec_ExtendedCodetext_Encodation_Test()
    {
        AztecExtCodetextBuilder textBuilder = new AztecExtCodetextBuilder();
        textBuilder.addECICodetext(ECIEncodings.Win1251, "Will");
        textBuilder.addECICodetext(ECIEncodings.UTF8, "犬Right狗");
        textBuilder.addPlainCodetext("t\\e\\\\st");
        textBuilder.addECICodetext(ECIEncodings.Win1251, "привет");
        textBuilder.addECICodetext(ECIEncodings.UTF16BE, "犬Power狗");
        textBuilder.addPlainCodetext("test");
        String extCodetext = textBuilder.getExtendedCodetext();
        String str = extCodetext.replace("\\000022", "");
        str = str.replace("\\000025", "");
        str = str.replace("\\000026", "");
        str = str.replace("\\000003", "");

        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.AZTEC, extCodetext);
        {
            generator.getParameters().getBarcode().getAztec().setAztecEncodeMode(AztecEncodeMode.EXTENDED_CODETEXT);
            BufferedImage image = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(image, DecodeType.AZTEC);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(str, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void test_Aztec_Auto_Encodation_Test()
    {
        String codetext = "犬Right狗";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.AZTEC, codetext);
        {
            generator.getParameters().getBarcode().getAztec().setECIEncoding(ECIEncodings.UTF8);
            BufferedImage image = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(image, DecodeType.AZTEC);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void test_Aztec_AutoWithDefaultECI_Encodation_Test()
    {
        String codetext = "Hello!";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.AZTEC, codetext);
        {
            BufferedImage image = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(image, DecodeType.AZTEC);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void test_Aztec_Bytes_Encodation_Test()
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
            BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.AZTEC, codetextPart);
            {
                generator.getParameters().getBarcode().getAztec().setStructuredAppendBarcodeId(i + 1);
                generator.getParameters().getBarcode().getAztec().setStructuredAppendBarcodesCount(partsCount);
                generator.getParameters().getBarcode().getAztec().setStructuredAppendFileId("ABCD");
                generator.getParameters().getBarcode().getAztec().setAztecEncodeMode(AztecEncodeMode.BYTES);
                BufferedImage image = generator.generateBarCodeImage();
                BarCodeReader reader = new BarCodeReader(image, DecodeType.AZTEC);
                {
                    Assert.assertEquals(1, reader.readBarCodes().length);
                    Assert.assertEquals(i + 1, reader.getFoundBarCodes()[0].getExtended().getAztec().getStructuredAppendBarcodeId());
                    Assert.assertEquals(partsCount, reader.getFoundBarCodes()[0].getExtended().getAztec().getStructuredAppendBarcodesCount());
                    Assert.assertEquals("ABCD", reader.getFoundBarCodes()[0].getExtended().getAztec().getStructuredAppendFileId());
                    decodedCodetext += reader.getFoundBarCodes()[0].getCodeText();
                }
            }
        }
        Assert.assertEquals(codetext, decodedCodetext);

    }
}
