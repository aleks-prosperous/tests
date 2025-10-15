package com.aspose.external.barcode.tester.releases.v19_05;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue37174
{
    /// <summary>
    /// Path to folder with files for testing Issue37174.
    /// </summary>
    private String folder = Global.getIssuesTestImagePath("Issue37174");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    private void testRecognizedImage(String afolder, String aFilename, BaseDecodeType aDecodeType, String CodeText)
    {
        testRecognizedImage(afolder, aFilename, aDecodeType, CodeText, false);
    }

    private void testRecognizedImage(String afolder, String aFilename, BaseDecodeType aDecodeType, String CodeText, boolean isDeconvolutionModeSlow)
    {
        String fileName = Global.pathCombine(afolder, aFilename);
        BarCodeReader reader = new BarCodeReader(fileName, aDecodeType);
        {
            if (isDeconvolutionModeSlow)
                reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(1, lCodetexts.size(), "Recognition of " + aFilename + " failed");
            Assert.assertTrue(lCodetexts.contains(CodeText));
        }
    }

    private void testFailedImage(String afolder, String aFilename, BaseDecodeType aDecodeType)
    {
        String fileName = Global.pathCombine(afolder, aFilename);
        BarCodeReader reader = new BarCodeReader(fileName, aDecodeType);
        {
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(0, lCodetexts.size(), aFilename + " is ok, need to fix this test");
        }
    }

        @Test
    public void test_003()
    {
        String fileName = Global.pathCombine(folder, "003.tif");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39, DecodeType.DATA_MATRIX));
        {
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertTrue(lCodetexts.size() >= 7, "Recognition of 003.tif failed");
            Assert.assertTrue(lCodetexts.contains("SPACEHOLDER"));
            Assert.assertTrue(lCodetexts.contains("Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Ind"));
            //new codes
            Assert.assertEquals(lCodetexts.size(), 7, "New recognitions, need to fix this test.");
        }
    }

        @Test
    public void test_003_Code39_cut_01()
    {
        testRecognizedImage(folder, "003_Code39_cut_01.png", new MultyDecodeType(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39), "SPACEHOLDER");
    }

        @Test
    public void test_003_datamatrix_cut_06()
    {
        testRecognizedImage(folder, "003_datamatrix_cut_06.png", DecodeType.DATA_MATRIX, "Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Ind");
    }

        @Test
    public void test_003_datamatrix_cut_04()
    {
        testRecognizedImage(folder, "003_datamatrix_cut_04.png", DecodeType.DATA_MATRIX, "Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Ind");
    }

    @Test
    public void test_003_datamatrix_cut_01()
    {
        testRecognizedImage(folder, "003_datamatrix_cut_01.png", DecodeType.DATA_MATRIX, "Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Ind");
    }

    @Test
    public void test_003_datamatrix_cut_02()
    {
        testRecognizedImage(folder, "003_datamatrix_cut_02.png", DecodeType.DATA_MATRIX, "Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Ind", true);
    }


    @Test
    public void test_003_datamatrix_cut_03()
    {
        testRecognizedImage(folder, "003_datamatrix_cut_03.png", DecodeType.DATA_MATRIX, "Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Ind");
    }

    @Test
    public void test_003_datamatrix_cut_05()
    {
        testRecognizedImage(folder, "003_datamatrix_cut_05.png", DecodeType.DATA_MATRIX, "Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Indigo Pacific Pte Ltd | 1234567890 | ^ | Ind");
    }
}
