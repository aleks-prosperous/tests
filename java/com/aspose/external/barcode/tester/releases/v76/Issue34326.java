package com.aspose.external.barcode.tester.releases.v76;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Issue34326
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue34326_DotPeenDashed1_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34326\\DotPeenDashed1.png"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("250623022021032007010300", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue34326_DotPeenDashed2_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34326\\DotPeenDashed2.png"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("250623022021032007010300", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
