package com.aspose.barcode.generation;

import com.aspose.barcode.LicenseAssistant;
import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BarcodeParametersTests
{
    String folder = Global.getGeneratedImagesFolder("BarcodeParametersTests");
    BarcodeParameters barcodeParameters;
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();

        BarcodeGenerator barcodeGenerator = new BarcodeGenerator(EncodeTypes.EAN_14, "332211");
        BaseGenerationParameters baseGenerationParameters = barcodeGenerator.getParameters();
        barcodeParameters = baseGenerationParameters.getBarcode();
    }

    @Test(enabled = true)
    public void testBarcodeParametersTests1() throws Exception
    {
        BarcodeGenerator barcodeGenerator = new BarcodeGenerator(EncodeTypes.EAN_14, "332211");
        BaseGenerationParameters baseGenerationParameters = barcodeGenerator.getParameters();
        BarcodeParameters barcodeParameters = baseGenerationParameters.getBarcode();
        Unit unitXDimension = barcodeParameters.getXDimension();
        unitXDimension.setMillimeters(100);
        barcodeParameters.setXDimension(unitXDimension);
        Assert.assertEquals(barcodeParameters.getXDimension().getMillimeters(),100.0f);
    }
@Test(enabled = true)
    public void test_setPadding() throws Exception
    {
        BarcodeGenerator barcodeGenerator = new BarcodeGenerator(EncodeTypes.EAN_14, "332211");
        BaseGenerationParameters baseGenerationParameters = barcodeGenerator.getParameters();
        BarcodeParameters barcodeParameters = baseGenerationParameters.getBarcode();
        Padding padding = barcodeParameters.getPadding();
        Unit paddingLeft = padding.getLeft();
        paddingLeft.setMillimeters(1000);
        Unit paddingRight = padding.getRight();
        paddingRight.setMillimeters(10);
        Unit paddingTop = padding.getTop();
        paddingTop.setPixels(50);
        Unit paddingBottom = padding.getBottom();
        paddingBottom.setInches(30);
        barcodeParameters.setPadding(padding);
        Assert.assertEquals(barcodeParameters.getPadding().getLeft().getMillimeters(),1000f);
        Assert.assertEquals(barcodeParameters.getPadding().getRight().getMillimeters(),10f);
        Assert.assertEquals(barcodeParameters.getPadding().getTop().getPixels(),50f);
        Assert.assertEquals(barcodeParameters.getPadding().getBottom().getInches(),30f);

    }

    @Test
    public void testPostal()
    {
        PostalParameters postalParameters = barcodeParameters.getPostal();
        Unit unit = postalParameters.getPostalShortBarHeight();
        unit.setMillimeters(100);
        postalParameters.setPostalShortBarHeight(unit);
        Assert.assertEquals(postalParameters.getPostalShortBarHeight().getMillimeters(),100.0f);
    }
   @Test
    public void testAustralianPost()
    {
        AustralianPostParameters australianPostParameters = barcodeParameters.getAustralianPost();
        Unit unit = australianPostParameters.getAustralianPostShortBarHeight();
        unit.setMillimeters(100);
        australianPostParameters.setAustralianPostShortBarHeight(unit);
        Assert.assertEquals(australianPostParameters.getAustralianPostShortBarHeight().getMillimeters(),100.0f);
    }

    @Test
    public void testSetGS1CompositeBa()
    {
        GS1CompositeBarParameters gs1CompositeBarParameters = barcodeParameters.getGS1CompositeBar();
        gs1CompositeBarParameters.setLinearComponentType(EncodeTypes.GS_1_CODE_128);
        gs1CompositeBarParameters.setTwoDComponentType(TwoDComponentType.CC_A);
        barcodeParameters.setGS1CompositeBar(gs1CompositeBarParameters);
        Assert.assertEquals(barcodeParameters.getGS1CompositeBar().getLinearComponentType(), EncodeTypes.GS_1_CODE_128);
        Assert.assertEquals(barcodeParameters.getGS1CompositeBar().getTwoDComponentType(), TwoDComponentType.CC_A);
    }

}
