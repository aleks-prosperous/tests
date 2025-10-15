package com.aspose.external.barcode.tester.releases.v20_2;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import java.util.ArrayList;
import java.util.List;

public class Issue37324
{
    /// <summary>
    /// Path to folder with files for testing Issue37324.
    /// </summary>
    private String folder = Global.getIssuesTestImagePath("Issue37324");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void testRecognizedImage_AllTypes()
    {
        String fileName = "2019110802002835_df4b.jpg";
        String expectedCodeText = "RM2019110800778";
        String fileFullName = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(fileFullName);
        {
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(5, lCodetexts.size(), "Recognition of " + fileName + " failed");
            TestExternalHelper.contains(expectedCodeText, lCodetexts);
            TestExternalHelper.contains("Patch IV", lCodetexts);
        }
    }

        @Test
    public void testRecognizedImage_Code39()
    {
        String fileName = "2019110802002835_df4b.jpg";
        String expectedCodeText = "RM2019110800778";
        String fileFullName = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(fileFullName, DecodeType.CODE_39);
        {
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(1, lCodetexts.size(), "Recognition of " + fileName + " failed");
            TestExternalHelper.contains(expectedCodeText, lCodetexts);
        }
    }
}
