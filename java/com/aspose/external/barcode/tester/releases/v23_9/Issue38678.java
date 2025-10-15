package com.aspose.external.barcode.tester.releases.v23_9;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue38678
{
    private final static String Folder = Global.getTestDataFolder("Issues\\Issue38678");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test(enabled = false)
    public void test_Customers_Test()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "customers_test.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("(91)10048521001(92)A(93)123456WO(10)123456789TEST(17)2030-12-31", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
