package com.aspose.external.barcode.tester.releases.v19_05;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue36847
{
    /// <summary>
    /// Path to folder with files for testing Issue36847.
    /// </summary>
    private static final String Folder = Global.getIssuesTestImagePath("Issue36847");

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
            List<String> lCodetexts = new ArrayList<>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(1, lCodetexts.size(), "Recognition of " + aFilename + " failed");
            Assert.assertTrue(lCodetexts.contains(CodeText));
        }
    }

    private void testFailedImage(String aFolder, String aFilename, BaseDecodeType aDecodeType)
    {
        String fileName = Global.pathCombine(aFolder, aFilename);
        BarCodeReader reader = new BarCodeReader(fileName, aDecodeType);
        {
            List<String> lCodetexts = new ArrayList<>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(0, lCodetexts.size(), aFilename + " is ok, need to fix this test");
        }
    }

        @Test
    public void test_83249_PDF_page_fine()
    {
        testRecognizedImage(Folder, "83249_PDF_page_fine.png", DecodeType.QR, "aetna_uat0000259961TPC3");

    }

        @Test
    public void test_83248_PDF_page_01_cut_rot()
    {
        testFailedImage(Folder, "83248_PDF_page_01_cut_rot.png", DecodeType.QR);
    }

        @Test
    public void test_83249_PDF_page_01_cut_rot()
    {
        testFailedImage(Folder, "83249_PDF_page_01_cut_rot.png", DecodeType.QR);
    }

        @Test(enabled = false)
    public void test_83251_PDF_page_05_cut_rot()
    {
        String fileName = Global.pathCombine(Folder, "83251_PDF_page_05_cut_rot.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            reader.setQualitySettings(QualitySettings.getHighQuality());
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("aetna_uat0000260218TPC6", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
