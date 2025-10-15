package com.aspose.external.barcode.tester.releases.v81;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Issue34430
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue34430_AaBbCc_3D_2_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34430\\AaBbCc_3D_2.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AaBbCc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue34430_azteccodeinstein_cut_jpg_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34430\\aztec-code-in-stein_cut.jpg"), DecodeType.AZTEC);
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("www.8qr.de/123aq", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue34430_azteccodeinstein_cut_jpg_Aztec2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34430\\aztec-code-in-stein_cut.jpg"), DecodeType.AZTEC);
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("www.8qr.de/123aq", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
