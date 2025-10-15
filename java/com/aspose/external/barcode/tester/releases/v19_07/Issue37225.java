package com.aspose.external.barcode.tester.releases.v19_07;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue37225
{
    /// <summary>
    /// Path to folder with files for testing Issue37225.
    /// </summary>
    private String Folder = Global.getIssuesTestImagePath("Issue37225");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    private void testNotHungImage(String aFolder, String aFilename, BaseDecodeType aDecodeType, QualitySettings aQuality,
                                  int aTimeout, int RequiredCompletionTime)
    {
        String fileName = Global.pathCombine(aFolder, aFilename);
        BarCodeReader reader = new BarCodeReader(fileName, aDecodeType);
        {
            reader.setQualitySettings(aQuality);
            reader.setTimeout(aTimeout);

            List<String> lCodetexts = new ArrayList<String>();

            long watch = System.currentTimeMillis();

            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            int lScanDuration = (int) (System.currentTimeMillis() - watch);

            Assert.assertEquals(0, lCodetexts.size(), "found fake");
            if (RequiredCompletionTime < lScanDuration)
                Assert.fail(aFilename + " hungs.");
        }
    }

        @Test
        ////[Category("Code128")]
    public void test_seal()
    {
        testNotHungImage(Folder, "seal.png", DecodeType.CODE_128, QualitySettings.getNormalQuality(), 20000, 5000);
    }

        @Test
        ////[Category("Code128")]
    public void test_seal_HighQuality()
    {
        testNotHungImage(Folder, "seal.png", DecodeType.CODE_128, QualitySettings.getHighQuality(), 20000, 10000);
    }

        @Test
        ////[Category("Code128")]
    public void test_TestPDF_image_1()
    {
        testNotHungImage(Folder, "TestPDF_image_1.png", DecodeType.CODE_128, QualitySettings.getNormalQuality(), 20000, 10000);
    }
}
