package com.aspose.external.barcode.tester.releases.v19_07;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue37223
{
    /// <summary>
    /// Path to folder with files for testing Issue37223.
    /// </summary>
    private String folder = Global.getIssuesTestImagePath("Issue37223");

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

    private void testFailedImage(String aFolder, String aFilename, BaseDecodeType aDecodeType)
    {
        String fileName = Global.pathCombine(aFolder, aFilename);
        BarCodeReader reader = new BarCodeReader(fileName, aDecodeType);
        {
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(0, lCodetexts.size(), aFilename + " is ok, need to fix this test");
        }
    }

        @Test
        ////[Category("Code128")]
    public void test_37223_cut_failed()
    {
        testRecognizedImage(folder, "37223_cut_failed.png", DecodeType.CODE_128, "%116%1930041");
    }

        @Test
        ////[Category("Code128")]
        ////[Category("EAN13")]
    public void test_tverplk21_2019_05_28T154505_0001()
    {
        testRecognizedImage(folder, "tverplk21-2019-05-28T154505 0001.jpg", DecodeType.CODE_128, "%116%1930041");

        String fileName = Global.pathCombine(folder, "tverplk21-2019-05-28T154505 0001.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.TYPES_1D);
        {
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertTrue(lCodetexts.size() >= 2, "Recognition of 003.tif failed");
            Assert.assertTrue(lCodetexts.contains("%116%1930041"));
            Assert.assertTrue(lCodetexts.contains("2000000747767"));
            //new codes
            Assert.assertEquals(lCodetexts.size(), 2, "New recognitions, need to fix this test.");
        }
    }
}
