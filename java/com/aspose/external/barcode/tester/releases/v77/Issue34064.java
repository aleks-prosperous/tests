package com.aspose.external.barcode.tester.releases.v77;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue34064
{
    final String Folder = Global.getTestDataFolder("Issues/Issue34064");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void test_Issue34064_img1_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.Folder, "img1.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("||10|31108977|0100000034017|PALETTI MARCO|PLTMRC71P20C107P|000|A8|V600109|", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Issue34064_img1Cutted_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.Folder, "img1Cutted.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("||10|31108977|0100000034017|PALETTI MARCO|PLTMRC71P20C107P|000|A8|V600109|", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
