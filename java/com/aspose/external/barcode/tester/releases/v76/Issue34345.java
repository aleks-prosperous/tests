package com.aspose.external.barcode.tester.releases.v76;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Issue34345
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue34345_12938_06_gif_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34345\\12938_06.gif"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Intermec STC", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue34345_datamatrixstars_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34345\\datamatrix-stars.png"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("StarDatamatrix", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
