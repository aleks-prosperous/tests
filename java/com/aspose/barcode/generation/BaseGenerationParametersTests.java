package com.aspose.barcode.generation;

import com.aspose.barcode.LicenseAssistant;
import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class BaseGenerationParametersTests
{
    String folder = Global.getGeneratedImagesFolder("BaseGenerationParametersTests");
    BarcodeGenerator barcodeGenerator = new BarcodeGenerator(EncodeTypes.EAN_14, "332211");
    BaseGenerationParameters baseGenerationParameters = barcodeGenerator.getParameters();

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test(enabled = true)
    public void testBaseGenerationParameters1() throws Exception
    {
        Color expectedBackColor = Color.RED;
        float expectedResolution = 120f;
        float expectedRotationAngle = 30f;

        BarcodeGenerator barcodeGenerator = new BarcodeGenerator(EncodeTypes.EAN_14, "332211");
        BaseGenerationParameters baseGenerationParameters = barcodeGenerator.getParameters();
        baseGenerationParameters.setBackColor(expectedBackColor);
        baseGenerationParameters.setResolution(expectedResolution);
        baseGenerationParameters.setRotationAngle(expectedRotationAngle);
        Assert.assertTrue(baseGenerationParameters.getUseAntiAlias());
        baseGenerationParameters.setUseAntiAlias(false);

        Assert.assertEquals(baseGenerationParameters.getBackColor(), expectedBackColor);
        Assert.assertEquals(baseGenerationParameters.getResolution(),expectedResolution);
        Assert.assertFalse(baseGenerationParameters.getUseAntiAlias());
        Assert.assertEquals(baseGenerationParameters.getRotationAngle(),expectedRotationAngle);

        barcodeGenerator.save(this.folder + "BaseGenerationParametersTest1.png");
    }
 @Test(enabled = true)
    public void testImageWidthHeight() throws Exception
    {
        Unit imageWidth = baseGenerationParameters.getImageWidth();
        imageWidth.setMillimeters(125);
        baseGenerationParameters.setImageWidth(imageWidth);
        Unit imageHeight = baseGenerationParameters.getImageHeight();
        imageHeight.setMillimeters(145);
        baseGenerationParameters.setImageHeight(imageHeight);
        Assert.assertEquals(baseGenerationParameters.getImageWidth().getMillimeters(),125f);
        Assert.assertEquals(baseGenerationParameters.getImageHeight().getMillimeters(),145f);
    }
}


