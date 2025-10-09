package com.aspose.barcode.generation;

import com.aspose.barcode.LicenseAssistant;
import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CaptionParametersTests
{
    String folder = Global.getGeneratedImagesFolder("CaptionParametersTests");
    CaptionParameters captionParametersAbove;
    CaptionParameters captionParametersBelow;

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
        BarcodeGenerator barcodeGenerator = new BarcodeGenerator(EncodeTypes.EAN_14, "332211");
        BaseGenerationParameters baseGenerationParameters = barcodeGenerator.getParameters();
        captionParametersAbove = baseGenerationParameters.getCaptionAbove();
        captionParametersBelow = baseGenerationParameters.getCaptionBelow();
        captionParametersAbove.getFont();
        captionParametersAbove.getPadding();
        captionParametersAbove.getAlignment();
        captionParametersAbove.getVisible();
    }


    @Test(enabled = true)
    public void testCaptionParameters1() throws Exception
    {
        Assert.assertEquals(captionParametersAbove.getPadding().getLeft().getPoint(),5.0f);
        Assert.assertEquals(captionParametersAbove.getPadding().getTop().getPoint(),5.0f);
        Assert.assertEquals(captionParametersAbove.getPadding().getRight().getPoint(),5.0f);
        Assert.assertEquals(captionParametersAbove.getPadding().getBottom().getPoint(),0.0f);


        String expectedText = "CaptionAbove";
        captionParametersAbove.setText(expectedText);
        Assert.assertEquals(captionParametersAbove.getText(), expectedText);
    }

    @Test
    public void testCaptionParameters2() throws Exception
    {
        Assert.assertEquals(captionParametersAbove.getFont().getStyle(), FontStyle.REGULAR);
        Assert.assertEquals(captionParametersAbove.getFont().getFamilyName(), "Arial");
        captionParametersAbove.getFont().setStyle(FontStyle.ITALIC);
        captionParametersAbove.getFont().setFamilyName("Verdana");
        Assert.assertEquals(captionParametersAbove.getFont().getStyle(), FontStyle.ITALIC);
        Assert.assertEquals(captionParametersAbove.getFont().getFamilyName(), "Verdana");
    }

    @Test
    public void test_setPadding1() throws Exception
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_39, "12345678");
        generator.getParameters().getCaptionAbove().getPadding().getLeft().setMillimeters(100);
        generator.getParameters().getCaptionAbove().getPadding().getRight().setMillimeters(200);
        generator.getParameters().getCaptionAbove().getPadding().getTop().setMillimeters(300);
        generator.getParameters().getCaptionAbove().getPadding().getBottom().setMillimeters(400);
        Assert.assertEquals(generator.getParameters().getCaptionAbove().getPadding().getLeft().getMillimeters(), 100.0f);
        Assert.assertEquals(generator.getParameters().getCaptionAbove().getPadding().getRight().getMillimeters(), 200f);
        Assert.assertEquals(generator.getParameters().getCaptionAbove().getPadding().getTop().getMillimeters(), 300f);
        Assert.assertEquals(generator.getParameters().getCaptionAbove().getPadding().getBottom().getMillimeters(), 400f);
    }

    @Test
    public void test_setPadding2() throws Exception
    {
        Padding padding = captionParametersAbove.getPadding();
        Unit unitLeft = padding.getLeft();
        Unit unitRight = padding.getRight();
        Unit unitTop = padding.getTop();
        Unit unitBottom = padding.getBottom();
        unitLeft.setMillimeters(100);
        padding.setLeft(unitLeft);
        unitRight.setMillimeters(20);
        padding.setRight(unitRight);
        unitTop.setMillimeters(10);
        padding.setTop(unitTop);
        unitBottom.setMillimeters(50);
        padding.setBottom(unitBottom);
        captionParametersAbove.setPadding(padding);
        Assert.assertEquals(captionParametersAbove.getPadding().getLeft().getMillimeters(), padding.getLeft().getMillimeters());
        Assert.assertEquals(captionParametersAbove.getPadding().getTop().getMillimeters(), padding.getTop().getMillimeters());
        Assert.assertEquals(captionParametersAbove.getPadding().getRight().getMillimeters(), padding.getRight().getMillimeters());
        Assert.assertEquals(captionParametersAbove.getPadding().getBottom().getMillimeters(), padding.getBottom().getMillimeters());
    }
}
