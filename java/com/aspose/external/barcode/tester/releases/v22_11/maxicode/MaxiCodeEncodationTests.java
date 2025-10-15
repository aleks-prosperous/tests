package com.aspose.external.barcode.tester.releases.v22_11.maxicode;

import com.aspose.barcode.auxiliary.StringExtensions;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;

public class MaxiCodeEncodationTests
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void maxiCode_ExtendedCodetext_Encodation_Test()
    {
        MaxiCodeExtCodetextBuilder textBuilder = new MaxiCodeExtCodetextBuilder();
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
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.MAXI_CODE, extCodetext);
        {
            generator.getParameters().getBarcode().getMaxiCode().setMaxiCodeEncodeMode(MaxiCodeEncodeMode.EXTENDED_CODETEXT);
            BufferedImage image = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(image, DecodeType.MAXI_CODE);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(str, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void maxiCode_Auto_Encodation_Test()
    {
        String codetext = "犬Right狗";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.MAXI_CODE, codetext);
        {
            generator.getParameters().getBarcode().getMaxiCode().setECIEncoding(ECIEncodings.UTF8);
            BufferedImage image = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(image, DecodeType.MAXI_CODE);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void maxiCode_AutoWithDefaultECI_Encodation_Test()
    {
        String codetext = "Hello!";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.MAXI_CODE, codetext);
        {
            BufferedImage image = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(image, DecodeType.MAXI_CODE);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void maxiCode_Bytes_Encodation_Test()
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
            BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.MAXI_CODE, codetextPart);
            {
                generator.getParameters().getBarcode().getMaxiCode().setMaxiCodeStructuredAppendModeBarcodeId(i + 1);
                generator.getParameters().getBarcode().getMaxiCode().setMaxiCodeStructuredAppendModeBarcodesCount(partsCount);
                generator.getParameters().getBarcode().getMaxiCode().setMaxiCodeEncodeMode(MaxiCodeEncodeMode.BYTES);
                BufferedImage image = generator.generateBarCodeImage();
                BarCodeReader reader = new BarCodeReader(image, DecodeType.MAXI_CODE);
                {
                    Assert.assertEquals(1, reader.readBarCodes().length);
                    decodedCodetext += reader.getFoundBarCodes()[0].getCodeText();
                }
            }
        }
        Assert.assertEquals(codetext, decodedCodetext);

    }
}
