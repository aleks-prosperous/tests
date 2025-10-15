package com.aspose.external.barcode.tester.releases.v81;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Issue36230
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("DatabarExpanded")]
    public void test_Issue36230_ClearDatabarExpanded_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36230\\Clear-DatabarExpanded.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(8110)106141411234562891101201212085010048000214025610048000310123191000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpanded")]
    public void test_Issue36230_MootDatabarExpanded_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36230\\Moot-DatabarExpanded.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(8110)106141411234562891101201212085010048000214025610048000310123191000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
