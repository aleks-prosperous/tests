package com.aspose.barcode.generation;

import com.aspose.barcode.LicenseAssistant;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class CodetextParametersTests
{
    CodetextParameters codetextParameters;
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
        BarcodeGenerator barcodeGenerator = new BarcodeGenerator(EncodeTypes.CODE_39);
        BaseGenerationParameters baseGenerationParameters = barcodeGenerator.getParameters();
        BarcodeParameters barcodeParameters = baseGenerationParameters.getBarcode();
        codetextParameters = barcodeParameters.getCodeTextParameters();
    }

    @Test
    public void testSetFont()
    {
        FontUnit fontUnit = codetextParameters.getFont();
        fontUnit.setFamilyName("Arial");
        fontUnit.setStyle(FontStyle.ITALIC);
        codetextParameters.setFont(fontUnit);
        Assert.assertEquals(codetextParameters.getFont().getStyle(), FontStyle.ITALIC);
        Assert.assertEquals(codetextParameters.getFont().getFamilyName(),"Arial");

    }
    @Test
    public void testSetSpace()
    {
        Unit space = codetextParameters.getSpace();
        Assert.assertEquals(space.getPoint(), 2.0f);
        space.setMillimeters(250);
        Assert.assertEquals(codetextParameters.getSpace().getMillimeters(), 250f);

    }
}
