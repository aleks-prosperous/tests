package com.aspose.external.barcode.tester.releases.v75;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class Issue34309
{
    final String folder = Global.getTestDataFolder("Issues/Issue34309");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        String filename = Global.pathCombine(folder, "Untitled22.jpg");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(":AAAAvGg0ByEJ9w|ac", reader.getFoundBarCodes()[0].getCodeText());
    }
}
