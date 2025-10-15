package com.aspose.external.barcode.tester.releases.v18_12;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue37024
{
    /// <summary>
    /// Path to folder with files for testing Issue37024.
    /// </summary>
    private static final String folder = Global.getTestDataFolder("Issues\\Issue37024");


    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Tests recogntion with AllSupportedTypes.
    /// </summary>
        @Test
    public void test_Scenario_1_page2()
    {
        String fileName = Global.pathCombine(folder, "Scenario-1_page2.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.ALL_SUPPORTED_TYPES));
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);

            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(2, lCodetexts.size());
            Assert.assertTrue(lCodetexts.contains("96100050"));
            Assert.assertTrue(lCodetexts.contains("0717"));
        }
    }

    /// <summary>
    /// Tests recogntion with AllSupportedTypes.
    /// </summary>
        @Test
    public void test_Scenario_2_page2()
    {
        String fileName = Global.pathCombine(folder, "Scenario-2_page2.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.ALL_SUPPORTED_TYPES));
        {
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(2, lCodetexts.size());
            Assert.assertTrue(lCodetexts.contains("96100050"));
            Assert.assertTrue(lCodetexts.contains("0437"));
        }
    }

    /// <summary>
    /// Tests recogntion with AllSupportedTypes.
    /// </summary>
        @Test
    public void test_Scenario_3()
    {
        String fileName = Global.pathCombine(folder, "Scenario-3.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.ALL_SUPPORTED_TYPES));
        {
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(2, lCodetexts.size());
            Assert.assertTrue(lCodetexts.contains("96100050"));
            Assert.assertTrue(lCodetexts.contains("0443"));
        }
    }
}
