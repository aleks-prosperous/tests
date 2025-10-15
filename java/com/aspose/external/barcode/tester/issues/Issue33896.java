package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>
 * Tests Issue 33896 tests.
 * </p>
 */
@Test(description = "Tests for Issue33896.")
public class Issue33896
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33896");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }


    /// <summary>
    /// Tests recognition of page1.
    /// </summary>
        @Test
    public void testPage1()
    {
        String fileName = Global.pathCombine(folder, "page1_300dpi.png");
        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        List<String> codetexts = new ArrayList<String>();
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            for(BarCodeResult result : reader.readBarCodes())
            {
                readTypes.add(result.getCodeType());
                codetexts.add(result.getCodeText());
            }
            Assert.assertTrue(codetexts.contains("BA2479354"));
            Assert.assertTrue(codetexts.contains("BA2479354+AR0005C     +08082012+03202013"));
            Assert.assertEquals(2, codetexts.size());
        }
    }
}

