package com.aspose.external.barcode.tester.releases.v19_11;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue37235
{
    /// <summary>
    /// Path to folder with files for testing Issue37235.
    /// </summary>
    private String Folder = Global.getIssuesTestImagePath("Issue37235");

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
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        List<String> lCodetexts = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

        Assert.assertEquals(1, lCodetexts.size(), "Recognition of " + aFilename + " failed");
        Assert.assertTrue(lCodetexts.contains(CodeText));
    }

    private void testFailedImage(String aFolder, String aFilename, BaseDecodeType aDecodeType)
    {
        String fileName = Global.pathCombine(aFolder, aFilename);
        BarCodeReader reader = new BarCodeReader(fileName, aDecodeType);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            List<String> lCodetexts = new ArrayList<>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(0, lCodetexts.size(), aFilename + " is ok, need to fix this test");
        }
    }

    @Test
    public void test_4478_cut()
    {
        testRecognizedImage(Folder, "4478_cut.png", new MultyDecodeType(DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII), "IDBAR010885156");
    }

    @Test
    public void test_4480_cut()
    {
        testRecognizedImage(Folder, "4480_cut.png", new MultyDecodeType(DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII), "IDAHS040059356");
    }

    @Test
    public void test_4482_cut()
    {
        String fileName = Global.pathCombine(Folder, "4482_cut.png");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII));
        {
            reader.setQualitySettings(QualitySettings.getHighQuality());
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(1, lCodetexts.size(), "Recognition of 4482_cut.png failed");
            CollectionAssert.contains("IDBAR012095336", lCodetexts);
        }
    }

    @Test
    public void test_20190614904478()
    {
        testRecognizedImage(Folder, "20190614904478.tif", new MultyDecodeType(DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII), "IDBAR010885156");
    }

    @Test
    public void test_20190614904480()
    {
        testRecognizedImage(Folder, "20190614904480.tif", new MultyDecodeType(DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII), "IDAHS040059356");
    }

    @Test
    public void test_20190614904482()
    {
        String fileName = Global.pathCombine(Folder, "20190614904482.tif");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII));
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(1, lCodetexts.size(), "Recognition of 20190614904482.tif failed");
            CollectionAssert.contains("IDBAR012095336", lCodetexts);
        }
    }
}
