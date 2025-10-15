package com.aspose.external.barcode.tester.releases.v78;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.ComplexBackgroundMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Issue34402
{
    final String folder = Global.getTestDataFolder("Issues/Issue34402");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        BarCodeReader reader = new BarCodeReader(folder + "/Barcode200DPIA.png", DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setComplexBackground(ComplexBackgroundMode.ENABLED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("ZZZ#WAS#EF#0203##Unknown#Cost Estimate - Conventional#Cost Estimate Sheet#Test#6/" +
                "19/2012#True#N/A", reader.getFoundBarCodes()[0].getCodeText());
    }
}
