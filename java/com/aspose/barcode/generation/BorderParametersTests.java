package com.aspose.barcode.generation;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class BorderParametersTests
{

    String folder = Global.getGeneratedImagesFolder(this.getClass().getSimpleName());

    @Test(enabled = true)
    public void testBorderParameters1() throws Exception
    {
        Color expBorderColor = Color.RED;
        BorderDashStyle expDashStyle = BorderDashStyle.DOT;
        float expectedBorderWidthMm = 10.0f;

        BarcodeGenerator barcodeGenerator = new BarcodeGenerator(EncodeTypes.CODE_128, "1134567891");
        BorderParameters borderParameters = barcodeGenerator.getParameters().getBorder();

        borderParameters.setVisible(true);
        borderParameters.setDashStyle(expDashStyle);
        borderParameters.setColor(expBorderColor);
        Unit unit = borderParameters.getWidth();
        unit.setMillimeters(expectedBorderWidthMm);

        Assert.assertEquals(borderParameters.getDashStyle(), expDashStyle);
        Assert.assertEquals(borderParameters.getColor(), expBorderColor);
        Assert.assertEquals(borderParameters.getWidth().getMillimeters(), expectedBorderWidthMm);
        Assert.assertTrue(borderParameters.getVisible());


        barcodeGenerator.save(this.folder + "BorderParametersTest1.png");
    }

    @Test(enabled = true)
    public void testBorderParameters2() throws Exception
    {
        BorderDashStyle expDashStyle = BorderDashStyle.DOT;
        BarcodeGenerator barcodeGenerator = new BarcodeGenerator(EncodeTypes.CODE_128, "1134567891");
        BorderParameters borderParameters = barcodeGenerator.getParameters().getBorder();
        borderParameters.setDashStyle(expDashStyle);
        Assert.assertEquals(borderParameters.getDashStyle(), expDashStyle);
    }
    @Test(enabled = true)
    public void testBorderParameters3() throws Exception
    {
        BarcodeGenerator barcodeGenerator = new BarcodeGenerator(EncodeTypes.CODE_128, "1134567891");
        BorderParameters borderParameters = barcodeGenerator.getParameters().getBorder();
        Unit unit = borderParameters.getWidth();
        borderParameters.getWidth().setMillimeters(10.0f);
        System.out.println(unit.getMillimeters());
//        Assert.assertEquals(borderParameters.getDashStyle(), expDashStyle);
    }
}
