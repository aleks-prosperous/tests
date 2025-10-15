package com.aspose.external.barcode.tester.releases.v23_4;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.MultyDecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;

public class BARCODEJAVA1497
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        String expectedText = "(01)01082503101704(10)1234567890123";

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_DOT_CODE, expectedText);
        BufferedImage bmp = gen.generateBarCodeImage();
        BarCodeReader reader = new BarCodeReader(bmp, new MultyDecodeType(DecodeType.GS_1_DOT_CODE));
        Assert.assertTrue(reader.readBarCodes().length > 0);
        Assert.assertEquals(reader.getFoundBarCodes()[0].getCodeText(), expectedText);
    }
}