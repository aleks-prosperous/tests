package com.aspose.external.barcode.tester.releases.v82;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Issue36263
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36263");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Issue36263_PB_2016_06_jpg_EAN13_Supplement()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "PB_2016_06.jpg"), DecodeType.scanSets(DecodeType.EAN_13, DecodeType.SUPPLEMENT));
        {
            BaseDecodeType expectedType = DecodeType.scanSets(DecodeType.EAN_13, DecodeType.SUPPLEMENT);
            List<String> actualTexts = new ArrayList<>();
            for(BarCodeResult result : reader.readBarCodes())
            {
                actualTexts.add(result.getCodeText());
                BaseDecodeType actualType = result.getCodeType();
                Assert.assertTrue(expectedType.containsAny(actualType), "Actual and expected type comparison: 'Issue36263\\PB_2016_06.jpg' failed. ");
            }

            String[] expectedTexts = new String[2];
            expectedTexts[0] = "9771562510009";
            expectedTexts[1] = "00616";

            Assert.assertEquals(expectedTexts.length, actualTexts.size());
            for(int i = 0; i < expectedTexts.length; i++)
                Assert.assertEquals(actualTexts.get(i), expectedTexts[i], " File 'Issue36263\\PB_2016_06.jpg': Expected and actual collections of code texts do not meet requirements.");
        }
        System.out.println("Test for \"Issue36263\\PB_2016_06.jpg\" has completed successfully.");
    }

    @Test
    public void test_Issue36263_PB_2016_06_jpg_EAN13_Supplement_CutVersion()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "PB_2016_06_cut.jpg"), DecodeType.scanSets(DecodeType.EAN_13, DecodeType.SUPPLEMENT));
        {
            BaseDecodeType expectedType = DecodeType.scanSets(DecodeType.EAN_13, DecodeType.SUPPLEMENT);
            List<String> actualTexts = new ArrayList<>();
            for(BarCodeResult result : reader.readBarCodes())
            {
                actualTexts.add(result.getCodeText());
                BaseDecodeType actualType = result.getCodeType();
                Assert.assertTrue(expectedType.containsAny(actualType), "Actual and expected type comparison: 'Issue36263\\PB_2016_06.jpg' failed. ");
            }

            String[] expectedTexts = new String[2];
            expectedTexts[0] = "9771562510009";
            expectedTexts[1] = "00616";

            Assert.assertEquals(expectedTexts.length, actualTexts.size());
            for(int i = 0; i < expectedTexts.length; i++)
                Assert.assertEquals(actualTexts.get(i), expectedTexts[i], " File 'Issue36263\\PB_2016_06.jpg': Expected and actual collections of code texts do not meet requirements.");
        }
        System.out.println("Test for \"Issue36263\\PB_2016_06.jpg\" has completed successfully.");
    }
}
