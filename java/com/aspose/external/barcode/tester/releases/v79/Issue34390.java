package com.aspose.external.barcode.tester.releases.v79;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue34390
{
    final String folder = Global.getTestDataFolder("Issues/Issue34390");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testCodeLocationRight1()
    {
        String filename = folder + "/QR_Code_TestImage.bmp";
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.QR);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("47956", reader.getFoundBarCodes()[0].getCodeText());
    }
}
