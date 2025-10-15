package com.aspose.external.barcode.tester.releases.v21_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37899
{
    /// <summary>
    /// Path to folder with files for testing Issue37812.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues/Issue37899");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Code39()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Code39.PNG"), DecodeType.CODE_39);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("AM2021091300144", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_2021091301001296_df4b()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "2021091301001296_df4b.jpg"));
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(3, reader.readBarCodes().length);
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("AM2021091300144", reader.getFoundBarCodes()[2].getCodeText());
        }
    }
}
