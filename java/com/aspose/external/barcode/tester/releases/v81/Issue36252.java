package com.aspose.external.barcode.tester.releases.v81;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Issue36252
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue36252_Aztec3d_AaBbCc_3ErrorsBad_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36252\\Aztec3d_AaBbCc_3ErrorsBad.png"), DecodeType.AZTEC);
        {
            reader.setQualitySettings(QualitySettings.getHighQuality());
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue36252_Aztec3d_AaBbCc_3ErrorsBad_png_Aztec2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36252\\Aztec3d_AaBbCc_3ErrorsBad.png"), DecodeType.AZTEC);
        {
            reader.setQualitySettings(QualitySettings.getHighQuality());
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue36252_Aztec3d_AaBbCc_3ErrorsBad_png_Aztec3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36252\\Aztec3d_AaBbCc_3ErrorsBad.png"), DecodeType.AZTEC);
        {
            reader.setQualitySettings(QualitySettings.getHighQuality());
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }
}
