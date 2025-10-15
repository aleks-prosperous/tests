package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.generation.AutoSizeMode;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;

public class Issue36451
{
        @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void test_GenerationWithRotation()
    {
        float[] anglesToTest = new float[] {90f, 180f, 270f, -90f, -180f, -270f};

        for (int i = 0; i < anglesToTest.length; i++)
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_128, "Aspose123");
            {
                gen.getParameters().setAutoSizeMode(AutoSizeMode.NEAREST);
                gen.getParameters().getImageWidth().setPixels(400);
                gen.getParameters().getImageHeight().setPixels(400);
                gen.getParameters().setRotationAngle(anglesToTest[i]);

                BufferedImage barCodeImage = gen.generateBarCodeImage();

                BarCodeReader reader = new BarCodeReader(barCodeImage, DecodeType.CODE_128);
                reader.setQualitySettings(QualitySettings.getHighPerformance());
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("Aspose123", reader.getFoundBarCodes()[0].getCodeText());
            }

        }
    }
}
