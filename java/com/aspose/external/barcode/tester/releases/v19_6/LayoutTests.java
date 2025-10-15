package com.aspose.external.barcode.tester.releases.v19_6;

import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.*;
import java.awt.image.BufferedImage;

public class LayoutTests
{
    @BeforeMethod
    public void setUp() throws Exception
    {
        LicenseAssistant.setupLicense(com.aspose.barcode.licensing.LicenseType.Barcode);
    }

    @Test
    public void Rotation_Test()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.STANDARD_2_OF_5);
        {
            generator.getParameters().setRotationAngle(0);
            BufferedImage normalImage = generator.generateBarCodeImage();

            generator.getParameters().setRotationAngle(90);
            BufferedImage rotatedImage = generator.generateBarCodeImage();

            Assert.assertEquals(normalImage.getWidth(), rotatedImage.getHeight());
            Assert.assertEquals(normalImage.getHeight(), rotatedImage.getWidth());
        }
    }

    @Test
    public void BackgroundColor_Test()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.STANDARD_2_OF_5);
        {
            generator.getParameters().setBackColor(Color.RED);
            BufferedImage img = generator.generateBarCodeImage();
            Color testPixel = new Color(img.getRGB(1, 1));

            Assert.assertEquals(Color.RED.getRed(), testPixel.getRed());
            Assert.assertEquals(Color.RED.getGreen(), testPixel.getGreen());
            Assert.assertEquals(Color.RED.getBlue(), testPixel.getBlue());
        }
    }

    @Test
    public void ForegroundColor_Test()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.STANDARD_2_OF_5);
        {
            generator.getParameters().getBarcode().getPadding().getLeft().setPixels(0);
            generator.getParameters().getBarcode().getPadding().getTop().setPixels(0);
            generator.getParameters().getBarcode().setBarColor(Color.RED);
            BufferedImage img = generator.generateBarCodeImage();
            Color testPixel = new Color(img.getRGB(1, 1));

            Assert.assertEquals(Color.RED.getRed(), testPixel.getRed());
            Assert.assertEquals(Color.RED.getGreen(), testPixel.getGreen());
            Assert.assertEquals(Color.RED.getBlue(), testPixel.getBlue());
        }
    }

    @Test
    public void BorderColor_Test()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.STANDARD_2_OF_5);
        {
            generator.getParameters().getBorder().getWidth().setPixels(2);
            generator.getParameters().getBorder().setColor(Color.RED);
            generator.getParameters().getBorder().setVisible(true);
            generator.getParameters().setBackColor(Color.BLUE);
            BufferedImage img = generator.generateBarCodeImage();

            Color testPixel1 = new Color(img.getRGB(0, 0));
            Assert.assertEquals(Color.RED.getRed(), testPixel1.getRed());
            Assert.assertEquals(Color.RED.getGreen(), testPixel1.getGreen());
            Assert.assertEquals(Color.RED.getBlue(), testPixel1.getBlue());

            Color testPixel2 = new Color(img.getRGB(1, 1));
            Assert.assertEquals(Color.RED.getRed(), testPixel2.getRed());
            Assert.assertEquals(Color.RED.getGreen(), testPixel2.getGreen());
            Assert.assertEquals(Color.RED.getBlue(), testPixel2.getBlue());

            Color testPixel3 = new Color(img.getRGB(2, 2));
            Assert.assertEquals(Color.BLUE.getRed(), testPixel3.getRed());
            Assert.assertEquals(Color.BLUE.getGreen(), testPixel3.getGreen());
            Assert.assertEquals(Color.BLUE.getBlue(), testPixel3.getBlue());

            Color testPixel4 = new Color(img.getRGB(img.getWidth() - 1, img.getHeight() - 1));
            Assert.assertEquals(Color.RED.getRed(), testPixel4.getRed());
            Assert.assertEquals(Color.RED.getGreen(), testPixel4.getGreen());
            Assert.assertEquals(Color.RED.getBlue(), testPixel4.getBlue());

            Color testPixel5 = new Color(img.getRGB(img.getWidth() - 2, img.getHeight() - 2));
            Assert.assertEquals(Color.RED.getRed(), testPixel5.getRed());
            Assert.assertEquals(Color.RED.getGreen(), testPixel5.getGreen());
            Assert.assertEquals(Color.RED.getBlue(), testPixel5.getBlue());

            Color testPixel6 = new Color(img.getRGB(img.getWidth() - 3, img.getHeight() - 3));
            Assert.assertEquals(Color.BLUE.getRed(), testPixel6.getRed());
            Assert.assertEquals(Color.BLUE.getGreen(), testPixel6.getGreen());
            Assert.assertEquals(Color.BLUE.getBlue(), testPixel6.getBlue());
        }
    }


    @Test
    public void Resolution_Test()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.PATCH_CODE);
        {
            generator.getParameters().getBarcode().getPadding().getLeft().setPixels(0);
            generator.getParameters().getBarcode().getPadding().getTop().setPixels(0);
            generator.getParameters().getBarcode().getPadding().getRight().setPixels(0);
            generator.getParameters().getBarcode().getPadding().getBottom().setPixels(0);
            generator.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);

            BufferedImage normalImage = generator.generateBarCodeImage();

            generator.getParameters().setResolution(generator.getParameters().getResolution() * 2);
            BufferedImage testImage = generator.generateBarCodeImage();

            Assert.assertEquals(normalImage.getHeight() * 2, testImage.getHeight(), 1);
        }
    }
}

