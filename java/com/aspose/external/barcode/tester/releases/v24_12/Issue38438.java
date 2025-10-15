package com.aspose.external.barcode.tester.releases.v24_12;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue38438
{
    static final String Folder = Global.getTestDataFolder("Issues\\Issue38438");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_MultipleLowQualityCode39()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "2894_001_L1_2021-09-22_15-30-16-8230_0.jpeg"), DecodeType.CODE_39_FULL_ASCII);
        {
            reader.setQualitySettings(QualitySettings.getHighQuality());

            Assert.assertEquals(7, reader.readBarCodes().length);
            Assert.assertEquals("N80126667", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("P1460C97005", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("Q2880", reader.getFoundBarCodes()[2].getCodeText());
            Assert.assertEquals("B6000101207", reader.getFoundBarCodes()[3].getCodeText());
            Assert.assertEquals("V000126226", reader.getFoundBarCodes()[4].getCodeText());
            Assert.assertEquals("M403267418", reader.getFoundBarCodes()[5].getCodeText());
            Assert.assertEquals("H1000017544", reader.getFoundBarCodes()[6].getCodeText());
        }
    }
}
