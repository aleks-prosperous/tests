package com.aspose.external.barcode.tester.releases.v80;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue36210
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("QR")]
    public void test_Issue36210_20160407NW181_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36210\\20160407-NW-18-1.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("20160407-NW-18-1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Issue36210_20160407NW211_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36210\\20160407-NW-21-1.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("20160407-NW-21-1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Issue36210_20160407NW671_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36210\\20160407-NW-67-1.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("20160407-NW-67-1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
