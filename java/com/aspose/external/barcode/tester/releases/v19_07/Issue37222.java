package com.aspose.external.barcode.tester.releases.v19_07;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue37222
{
    /// <summary>
    /// Path to folder with files for testing Issue37222.
    /// </summary>
    private String Folder = Global.getIssuesTestImagePath("Issue36457");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    private void testRecognizedImage(String aFolder, String aFilename, BaseDecodeType aDecodeType, String CodeText)
    {
        String fileName = Global.pathCombine(aFolder, aFilename);
        BarCodeReader reader = new BarCodeReader(fileName, aDecodeType);
        {
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(1, lCodetexts.size(), "Recognition of " + aFilename + " failed");
            Assert.assertTrue(lCodetexts.contains(CodeText));
        }
    }

        @Test
        ////[Category("Code39")]
    public void test_bar()
    {
        String fileName = Global.pathCombine(Folder, "bar.png");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII));
        {
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(1, lCodetexts.size(), "Recognition of bar.png failed");
            CollectionAssert.contains("16-23285", lCodetexts);
        }
    }

        @Test
        ////[Category("Code39")]
    public void test_bar_fixed()
    {
        testRecognizedImage(Folder, "bar_fixed.png", new MultyDecodeType(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39), "16-23285");
    }
}
