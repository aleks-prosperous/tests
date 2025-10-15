package com.aspose.external.barcode.tester.releases.v76;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue34314
{
    static final String _folder = Global.getTestDataFolder("Issues/Issue34314");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void test_Issue34314_bar_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(_folder, "bar.png"), DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("15-07672", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
    public void test_Issue34314_bar2_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(_folder, "bar2.png"), DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("15-07672", reader.getFoundBarCodes()[0].getCodeText());
    }
}
