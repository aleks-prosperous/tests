package com.aspose.external.barcode.tester.releases.v18_10_1;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;

public class Issue37001
{

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Same_BarcodeReader_Instance_Works_For_Multiple_Images()
    {
        String codeText1 = "XFVOM";
        String codeText2 = "FXVEN";

        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_39_FULL_ASCII);
        generator.setCodeText(codeText1);
        BufferedImage bitmap1 = generator.generateBarCodeImage();
        generator.setCodeText(codeText2);
        BufferedImage bitmap2 = generator.generateBarCodeImage();

        BarCodeReader reader = new BarCodeReader();
        String res1 = "";
        reader.setBarCodeImage(bitmap1);
        for(BarCodeResult result : reader.readBarCodes())
        res1 += result.getCodeText();
        Assert.assertEquals(codeText1, res1);

        String res2 = "";
        reader.setBarCodeImage(bitmap2);
        for(BarCodeResult result : reader.readBarCodes())
        res2 += result.getCodeText();
        Assert.assertEquals(codeText2, res2);
    }
}

