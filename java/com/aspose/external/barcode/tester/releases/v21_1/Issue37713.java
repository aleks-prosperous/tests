package com.aspose.external.barcode.tester.releases.v21_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

public class Issue37713
{
    /// <summary>
    /// Path to folder with files for testing Issue37713.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues\\Issue37713");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }


    @Test
    public void test_Angle()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "test_cut.png"), DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            reader.readBarCodes();
            Assert.assertEquals(reader.getFoundBarCodes().length, 1);
            Assert.assertEquals("9324189956", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertNotEquals(reader.getFoundBarCodes()[0].getRegion().getAngle(), 0);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 357, 3);
        }

    }
}
