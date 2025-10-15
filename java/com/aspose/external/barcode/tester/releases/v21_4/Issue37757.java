package com.aspose.external.barcode.tester.releases.v21_4;

import com.aspose.barcode.generation.AutoSizeMode;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;

public class Issue37757
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

  @Test
    public void test_FilledBars_With_AutoSize_Mode()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_128, "EXPRESSION");
        generator.getParameters().setAutoSizeMode(AutoSizeMode.NEAREST);
        generator.getParameters().getImageWidth().setPixels(600);
        generator.getParameters().getImageHeight().setPixels(600);
        generator.getParameters().getBarcode().setFilledBars(false);
        BufferedImage img = generator.generateBarCodeImage();
        Assert.assertEquals(600, img.getWidth());
        Assert.assertEquals(600, img.getHeight());
    }
}
