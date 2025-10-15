package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>
 * Tests Issue 33893 tests.
 * </p>
 */
@Test(description = "Tests for Issue33893.")
public class Issue33893
{
    /**
     * <p>
     * Path to generatedFolder with files for testing issue 33893.
     * </p>
     */
    private final String folder = Global.getTestDataFolder("Issues/Issue33893/");
//    private final String folder = "src/test/resources/testdata/Issues/Issue33893";

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void test150dpi()
    {
        String fileName = Global.pathCombine(folder, "page1_150dpi.png");
        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        List<String> codetexts = new ArrayList<String>();

       BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
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

        @Test
    public void test200dpi()
    {
        String fileName = Global.pathCombine(folder, "page1_200dpi.png");

        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        List<String> codetexts = new ArrayList<String>();

       BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
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

        @Test
    public void test250dpi()
    {
        String fileName = Global.pathCombine(folder, "page1_250dpi.png");

        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        List<String> codetexts = new ArrayList<String>();

       BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
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

        @Test
    public void test300dpi()
    {
        String fileName = Global.pathCombine(folder, "page1_300dpi.png");

        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        List<String> codetexts = new ArrayList<String>();

       BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
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

