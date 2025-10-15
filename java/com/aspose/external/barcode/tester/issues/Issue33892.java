package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue33892
{

    private String _folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33892");

        @BeforeMethod
    public void SetupTestFixture()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void test_Issue33892_Page2_png_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Page2.png"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            reader.getQualitySettings().setXDimension( XDimensionMode.SMALL);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("BA2479046wI0050      +03202013+03202013", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Issue33892_Page3_png_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Page3.png"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            reader.getQualitySettings().setXDimension( XDimensionMode.SMALL);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("BA2479046wA0007CA    +03202013+03202013", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
