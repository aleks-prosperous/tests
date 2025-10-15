package com.aspose.external.barcode.tester.releases.v20_3;

import com.aspose.barcode.generation.AutoSizeMode;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

public class ApiUpdatesTests
{
    private BarcodeGenerator generator;

    @BeforeClass
    public void setUp()
    {
        String codeText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        generator = new BarcodeGenerator(EncodeTypes.CODE_128, codeText);
    }

    /**
     * added method com.aspose.barcode.generation.BarcodeParameters.setBarColor(Color)
     * added method com.aspose.barcode.generation.BarcodeParameters.getBarColor():Color
     **/
    @Test
    public void testSetBarColor()
    {
        generator.getParameters().getBarcode().setBarColor(Color.RED);
        Color actBarColor = generator.getParameters().getBarcode().getBarColor();
        Assert.assertEquals(actBarColor, Color.RED);
    }

    /**
     * added method com.aspose.barcode.generation.BaseGenerationParameters.getAutoSizeMode(AutoSizeMode)
     * added method com.aspose.barcode.generation.BaseGenerationParameters.setAutoSizeMode():AutoSizeMode
     **/
    @Test
    public void testSetAutoSizeMode()
    {

        generator.getParameters().setAutoSizeMode(AutoSizeMode.NEAREST);
        AutoSizeMode actAutoSizeMode = generator.getParameters().getAutoSizeMode();
        Assert.assertEquals(actAutoSizeMode, AutoSizeMode.NEAREST);
    }

    /**
     * added method com.aspose.barcode.generation.BaseGenerationParameters.getImageHeight(Unit)
     * added method  com.aspose.barcode.generation.BaseGenerationParameters.setImageHeight():Unit
     **/
    @Test
    public void testSetImageHeight()
    {
        float expImageHeight = 144;
        generator.getParameters().getImageHeight().setPixels(144);
        float actImageHeight = generator.getParameters().getImageHeight().getPixels();
        Assert.assertEquals(actImageHeight, expImageHeight);
    }

    /**
     * added method  com.aspose.barcode.generation.BaseGenerationParameters.getImageWidth(Unit)
     * added method  com.aspose.barcode.generation.BaseGenerationParameters.setImageWidth():Unit
     **/
    @Test
    public void testBarColor()
    {
        float expImageWidth = 133;
        generator.getParameters().getImageWidth().setPixels(expImageWidth);
        float actImageWidth = generator.getParameters().getImageWidth().getPixels();
        Assert.assertEquals(actImageWidth, expImageWidth);
    }
}
