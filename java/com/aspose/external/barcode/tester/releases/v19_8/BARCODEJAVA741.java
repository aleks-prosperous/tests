package com.aspose.external.barcode.tester.releases.v19_8;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EnableChecksum;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;

public class BARCODEJAVA741
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String expectedText = "44";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.PHARMACODE, expectedText);
        gen.getParameters().getBarcode().setChecksumEnabled(EnableChecksum.DEFAULT);
        BufferedImage bitmap = gen.generateBarCodeImage();
        for(int i = 0; i< 10; i++)
        {
            BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.PHARMACODE);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(reader.readBarCodes()[0].getCodeText(), expectedText);
        }
    }
}
