package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BARCODJAVA33490
{
    @BeforeClass
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test(enabled = false, description = "This image format is not supported by ms 22.12")
    public void reproduceTest()
    {
        String folder = Global.getTestDataFolder("Issues/Issue33125");
        String file = Global.pathCombine(folder, "48bppRGB rotated0.tif");
        try
        {
            BarCodeReader reader = new BarCodeReader(file, DecodeType.GS_1_CODE_128);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(reader.readBarCodes()[0].getCodeText(), "(01)12345600000001");
        } catch (Exception e)
        {
            Assert.fail();
        }
    }
}
