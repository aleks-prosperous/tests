package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class BARCODJAVA33491
{
    @BeforeClass
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test(description = "Java specific issue that found in Issue33569.converterFullBug()")
    public void reproduceTest() throws IOException
    {
        String folder = Global.getTestDataFolder("Issues/Issue33569");
        String fileName = Global.pathCombine(folder, "IMG0convFull.png");
//        BarCodeReader reader = new BarCodeReader((Bitmap) Image.fromFile(fileName), new Rectangle(93, 2245, 40, 950), DecodeType.CODE_128);
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertTrue(reader.readBarCodes().length > 0);
        String actual = reader.readBarCodes()[0].getCodeText();
        String expected = "TMG1000000000090000000800000001";
        Assert.assertEquals(expected, actual);
    }
}
