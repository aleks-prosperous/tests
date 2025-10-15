package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


@Test(description = "Tests for Issue33801.")
public class Issue33801
{
    private static final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33801");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testBadImage()
    {
        BufferedImage bad = Global.getBufferedImageFromFile(Global.pathCombine(folder, "bad.bmp"));
        analyzeColor(bad, true);
    }

    @Test
    public void testGoodImage()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.INTERLEAVED_2_OF_5, "123456789012345678");
        {
            gen.getParameters().setRotationAngle(270);

            analyzeColor(gen.generateBarCodeImage(), false);
        }
    }

    private void analyzeColor(BufferedImage bmp, boolean bw)
    {
        int i = 0;
        Color matchColor = bw ? new Color(0, 0, 0, 255) : new Color(255, 255, 255, 255);

        int x = bmp.getWidth() - 1;
        for (int y = 1; y < bmp.getHeight() - 1; ++y)
        {
            int rgb = bmp.getRGB(x, y);
            int rgb2 = matchColor.getRGB();

            int r = (rgb >> 16) & 0xFF;
            int g = (rgb >> 8) & 0xFF;
            int b = (rgb & 0xFF);

            int r2 = (rgb2 >> 16) & 0xFF;
            int g2 = (rgb2 >> 8) & 0xFF;
            int b2 = (rgb2 & 0xFF);
            Assert.assertEquals(r, r2);
            Assert.assertEquals(g, g2);
            Assert.assertEquals(b, b2);
        }
        Assert.assertTrue(i < 2);
    }
}

