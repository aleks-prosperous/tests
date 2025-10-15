package com.aspose.external.barcode.tester.releases.v22_11.maxicode;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.MaxiCodeExtCodetextBuilder;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;

public class Issue37844
{
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void MaxiCode_With_UnicodeCodetext()
    {
        String text = "[)>\\x1e01\\x1d96917480000\\x1d840\\x1d003\\x1d1Z94369249\\x1dUPSN\\x1d39Y1F0\\x1e07A0OOI4C%\"JD* R% Y:Y / FKQ / +:E6AF0 + A(\\x1c, \"I\\x1cG&:KZLP\\x1e\\x04";

        String firstHalf = text.substring(0, text.length() / 2);
        String firstHalfDecoded = "";
        MaxiCodeExtCodetextBuilder textBuilder = new MaxiCodeExtCodetextBuilder();
        textBuilder.addECICodetext(ECIEncodings.UTF8, firstHalf);
        String firstHalfCodetext = textBuilder.getExtendedCodetext();

        String secondHalf = text.substring(text.length() / 2);
        String secondHalfDecoded = "";
        textBuilder.clear();
        textBuilder.addECICodetext(ECIEncodings.UTF8, secondHalf);
        String secondHalfCodetext = textBuilder.getExtendedCodetext();

        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.MAXI_CODE, firstHalfCodetext);
        {
            generator.getParameters().getBarcode().getMaxiCode().setMaxiCodeMode(MaxiCodeMode.MODE_4);
            generator.getParameters().getBarcode().getMaxiCode().setMaxiCodeStructuredAppendModeBarcodeId(1);
            generator.getParameters().getBarcode().getMaxiCode().setMaxiCodeStructuredAppendModeBarcodesCount(2);
            generator.getParameters().getBarcode().getMaxiCode().setMaxiCodeEncodeMode(MaxiCodeEncodeMode.EXTENDED_CODETEXT);
            BufferedImage barcode = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(barcode, DecodeType.MAXI_CODE);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(reader.getFoundBarCodes()[0].getExtended().getMaxiCode().getMaxiCodeStructuredAppendModeBarcodeId(), 1);
                Assert.assertEquals(reader.getFoundBarCodes()[0].getExtended().getMaxiCode().getMaxiCodeStructuredAppendModeBarcodesCount(), 2);
                firstHalfDecoded = reader.getFoundBarCodes()[0].getCodeText();
            }
        }

        generator = new BarcodeGenerator(EncodeTypes.MAXI_CODE, secondHalfCodetext);
        {
            generator.getParameters().getBarcode().getMaxiCode().setMaxiCodeMode(MaxiCodeMode.MODE_4);
            generator.getParameters().getBarcode().getMaxiCode().setMaxiCodeStructuredAppendModeBarcodeId(2);
            generator.getParameters().getBarcode().getMaxiCode().setMaxiCodeStructuredAppendModeBarcodesCount(2);
            generator.getParameters().getBarcode().getMaxiCode().setMaxiCodeEncodeMode(MaxiCodeEncodeMode.EXTENDED_CODETEXT);
            BufferedImage barcode = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(barcode, DecodeType.MAXI_CODE);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(reader.getFoundBarCodes()[0].getExtended().getMaxiCode().getMaxiCodeStructuredAppendModeBarcodeId(), 2);
                Assert.assertEquals(reader.getFoundBarCodes()[0].getExtended().getMaxiCode().getMaxiCodeStructuredAppendModeBarcodesCount(), 2);
                Assert.assertEquals(reader.getFoundBarCodes()[0].getCodeText(), secondHalf);
                secondHalfDecoded = reader.getFoundBarCodes()[0].getCodeText();
            }
        }
        String textDecoded = firstHalfDecoded + secondHalfDecoded;
        Assert.assertEquals(text, textDecoded);
    }
}
