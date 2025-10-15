package com.aspose.external.barcode.tester.releases.v19_07;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue37221
{
    /// <summary>
    /// Path to folder with files for testing Issue37221.
    /// </summary>
    private String Folder = Global.getIssuesTestImagePath("Issue37221");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    private void testRecognizedImage(String aFolder, String aFilename, BaseDecodeType aDecodeType, QualitySettings aQuality, int aTimeout, String CodeText)
    {
        String fileName = Global.pathCombine(aFolder, aFilename);
        BarCodeReader reader = new BarCodeReader(fileName, aDecodeType);
        {
            reader.setQualitySettings(aQuality);
            reader.setTimeout(aTimeout);

            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(1, lCodetexts.size(), "Recognition of " + aFilename + " failed");
            Assert.assertTrue(lCodetexts.contains(CodeText));
        }
    }

    @Test
    public void Test_ImageWithError_NormalQuality()
    {
        String fileName = Global.pathCombine(Folder, "ImageWithError.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        {
            reader.setQualitySettings(QualitySettings.getNormalQuality());
            reader.setTimeout(10000);

            List<String> lCodetexts = new ArrayList<String>();
            for (BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(1, lCodetexts.size(), "Recognition of " + fileName + " failed");
            CollectionAssert.contains("JJBEA129955688004535669", lCodetexts);
        }
    }

    @Test
    public void Test_ImageWithError_HighQuality()
    {
        String fileName = Global.pathCombine(Folder, "ImageWithError.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        {
            reader.setTimeout(20000);

            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(1, lCodetexts.size(), "Recognition of " + fileName + " failed");
            CollectionAssert.contains("JJBEA129955688004535669", lCodetexts);
        }
    }
}
