package com.aspose.external.barcode.tester.releases.v23_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue38457
{
    /// <summary>
    /// Path to folder with files for testing Issue38457.
    /// </summary>
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue38457");
    private static final String expected = "394";

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_394_not_rotated_ok()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "394_not_rotated_ok.gif"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(expected, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_394_rotated_increased_margin_ok()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "394_rotated_increased_margin_ok.gif"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(expected, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_394_rotated_not_recognized()
    {
         BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "394_rotated_not_recognized.gif"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(expected, reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
