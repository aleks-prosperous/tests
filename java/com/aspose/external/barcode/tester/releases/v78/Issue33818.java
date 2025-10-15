package com.aspose.external.barcode.tester.releases.v78;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue33818
{
    final String folder = com.aspose.barcode.auxiliary.Global.getTestDataFolder("Issues/Issue33818");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        BarCodeReader reader = new BarCodeReader(folder + "/DataMatrix.PNG", DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("K1402120012", reader.getFoundBarCodes()[0].getCodeText());
    }
}
