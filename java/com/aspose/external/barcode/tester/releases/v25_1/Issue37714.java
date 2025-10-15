package com.aspose.external.barcode.tester.releases.v25_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue37714
{
    /// <summary>
    /// Path to folder with files for testing Issue37714.
    /// </summary>
    private String Folder = Global.getTestDataFolder("Issues/Issue37714");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
        // [Category("Code128")]
    public void test_Code128_FromCustomer()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "KSS-730EX-BH_NAVBelege_20201104_15523774.tif"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("UERG010154276", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        // [Category("Code128")]
    public void test_Code128_FromCustomer_Cut()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "strange_cut.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("UERG010154276", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
