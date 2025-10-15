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
 * Tests Issue 33895 tests.
 * </p>
 */
@Test(description = "Tests for Issue33895.")
public class Issue33895
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33895");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Tests cutted image from page1.
     * </p>
     */
    @Test
    public void testPage1Cutted()
    {
        String fileName = Global.pathCombine(folder, "page1_300dpi_cutted.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("BA2479046+AR0002      +04202013+03202013", reader.getFoundBarCodes()[0].getCodeText());
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
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                readTypes.add(result.getCodeType());
                codetexts.add(result.getCodeText());
            }
            Assert.assertTrue(codetexts.contains("BA2479046"));
            Assert.assertTrue(codetexts.contains("BA2479046+AR0002      +04202013+03202013"));
            Assert.assertEquals(2, codetexts.size());
        }
    }


    /**
     * <p>
     * Tests recognition of page2.
     * </p>
     */
    @Test
    public void testPage2()
    {
        String fileName = Global.pathCombine(folder, "page2_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("BA2479046+WI0050      +03202013+03202013", reader.getFoundBarCodes()[0].getCodeText());
    }


    /**
     * <p>
     * Tests recognition of page3.
     * </p>
     */
    @Test
    public void testPage3()
    {
        String fileName = Global.pathCombine(folder, "page3_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("BA2479046+WA0007CA    +03202013+03202013", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Tests recognition of page1 with Standard and Extended symbologies.
     * </p>
     */
    @Test
    public void testPage1StandardAndExtended()
    {
        String fileName = Global.pathCombine(folder, "page1_300dpi.png");
        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        List<String> codetexts = new ArrayList<String>();

        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            for(BarCodeResult result : reader.readBarCodes())
            {
                readTypes.add(result.getCodeType());
                codetexts.add(result.getCodeText());
            }
            Assert.assertTrue(codetexts.contains("BA2479046"));
            Assert.assertTrue(codetexts.contains("BA2479046aR0002      +04202013+03202013"));
            Assert.assertEquals(2, codetexts.size());
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_39));
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_39_FULL_ASCII));
        }
    }
}

