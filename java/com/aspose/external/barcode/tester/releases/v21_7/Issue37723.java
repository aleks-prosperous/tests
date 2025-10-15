package com.aspose.external.barcode.tester.releases.v21_7;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.AztecSymbolMode;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;

public class Issue37723
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
    public void test_Aztec_Multiple_Zero()
    {
        String lorig = "\0\0\0\0\0\0\0\0\0\0";

        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.AZTEC, lorig);
        generator.getParameters().getBarcode().getAztec().setAztecSymbolMode(AztecSymbolMode.AUTO);
        generator.getParameters().getBarcode().getXDimension().setPixels(5);
        BufferedImage img = generator.generateBarCodeImage();
        BarCodeReader reader = new BarCodeReader(img, DecodeType.AZTEC);
        BarCodeResult[] res = reader.readBarCodes();

        Assert.assertEquals(1, res.length);
        Assert.assertEquals(lorig, res[0].getCodeText());
    }
}
