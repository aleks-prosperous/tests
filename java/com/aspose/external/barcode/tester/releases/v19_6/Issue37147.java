package com.aspose.external.barcode.tester.releases.v19_6;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue37147
{
    private String folder = null;
    private String FolderCorrect = null;
    private String FolderFaulty = null;
    private String FolderFaultyRot = null;

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
        folder = Global.getIssuesTestImagePath("Issue37147");
        FolderCorrect = Global.pathCombine(folder, "Correct");
        FolderFaulty = Global.pathCombine(folder, "Faulty");
        FolderFaultyRot = Global.pathCombine(folder, "FaultyRot");

    }

    private void testRecognizedImage(String aFolder, String aFilename, BaseDecodeType aDecodeType, String CodeText, boolean isWipedPatterns)
    {
        String fileName = Global.pathCombine(aFolder, aFilename);
        BarCodeReader reader = new BarCodeReader(fileName, aDecodeType);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
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
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(0, lCodetexts.size(), aFilename + " is ok, need to fix this test");
        }
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955601023500019_Front()
    {
        testRecognizedImage(FolderCorrect, "JJBEA129955601023500019_Front.tiff", DecodeType.CODE_128, "JJBEA129955601023500019", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955601023500041_Front()
    {
        testRecognizedImage(FolderCorrect, "JJBEA129955601023500041_Front.tiff", DecodeType.CODE_128, "JJBEA129955601023500041", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955601023500055_Front()
    {
        testRecognizedImage(FolderCorrect, "JJBEA129955601023500055_Front.tiff", DecodeType.CODE_128, "JJBEA129955601023500055", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955601023500108_Front()
    {
        testRecognizedImage(FolderCorrect, "JJBEA129955601023500108_Front.tiff", DecodeType.CODE_128, "JJBEA129955601023500108", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955601023500125_Front()
    {
        testRecognizedImage(FolderCorrect, "JJBEA129955601023500125_Front.tiff", DecodeType.CODE_128, "JJBEA129955601023500125", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955601023500137_Front()
    {
        testRecognizedImage(FolderCorrect, "JJBEA129955601023500137_Front.tiff", DecodeType.CODE_128, "JJBEA129955601023500137", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955601023500142_Front()
    {
        testRecognizedImage(FolderCorrect, "JJBEA129955601023500142_Front.tiff", DecodeType.CODE_128, "JJBEA129955601023500142", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955601023500171_Front()
    {
        testRecognizedImage(FolderCorrect, "JJBEA129955601023500171_Front.tiff", DecodeType.CODE_128, "JJBEA129955601023500171", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955601023500262_Front()
    {
        testRecognizedImage(FolderCorrect, "JJBEA129955601023500262_Front.tiff", DecodeType.CODE_128, "JJBEA129955601023500262", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955601023500320_Front()
    {
        testRecognizedImage(FolderCorrect, "JJBEA129955601023500320_Front.tiff", DecodeType.CODE_128, "JJBEA129955601023500320", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955634110501202_Front()
    {
        testRecognizedImage(FolderFaulty, "JJBEA129955634110501202_Front.tiff", DecodeType.CODE_128, "JJBEA129955634110501202", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955634110501214_Front()
    {
        testRecognizedImage(FolderFaulty, "JJBEA129955634110501214_Front.tiff", DecodeType.CODE_128, "JJBEA129955634110501214", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955634110501536_Front()
    {
        testRecognizedImage(FolderFaulty, "JJBEA129955634110501536_Front.tiff", DecodeType.CODE_128, "JJBEA129955634110501536", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955634110600732_Front()
    {
        testRecognizedImage(FolderFaulty, "JJBEA129955634110600732_Front.tiff", DecodeType.CODE_128, "JJBEA129955634110600732", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955634110601829_Front()
    {
        testRecognizedImage(FolderFaulty, "JJBEA129955634110601829_Front.tiff", DecodeType.CODE_128, "JJBEA129955634110601829", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955634110602429_Front()
    {
        testRecognizedImage(FolderFaulty, "JJBEA129955634110602429_Front.tiff", DecodeType.CODE_128, "JJBEA129955634110602429", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955634111200235_Front()
    {
        testRecognizedImage(FolderFaulty, "JJBEA129955634111200235_Front.tiff", DecodeType.CODE_128, "JJBEA129955634111200235", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955634111300192_Front()
    {
        testRecognizedImage(FolderFaulty, "JJBEA129955634111300192_Front.tiff", DecodeType.CODE_128, "JJBEA129955634111300192", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955634111600200_Front()
    {
        testRecognizedImage(FolderFaulty, "JJBEA129955634111600200_Front.tiff", DecodeType.CODE_128, "JJBEA129955634111600200", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_JJBEA129955634111600232_Front()
    {
        testRecognizedImage(FolderFaulty, "JJBEA129955634111600232_Front.tiff", DecodeType.CODE_128, "JJBEA129955634111600232", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_faulty_cut_rot_192()
    {
        testRecognizedImage(FolderFaultyRot, "faulty_cut_rot_192.png", DecodeType.CODE_128, "JJBEA129955634111300192", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_faulty_cut_rot_200()
    {
        testRecognizedImage(FolderFaultyRot, "faulty_cut_rot_200.png", DecodeType.CODE_128, "JJBEA129955634111600200", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_faulty_cut_rot_202()
    {
        testRecognizedImage(FolderFaultyRot, "faulty_cut_rot_202.png", DecodeType.CODE_128, "JJBEA129955634110501202", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_faulty_cut_rot_214()
    {
        testRecognizedImage(FolderFaultyRot, "faulty_cut_rot_214.png", DecodeType.CODE_128, "JJBEA129955634110501214", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_faulty_cut_rot_232()
    {
        testRecognizedImage(FolderFaultyRot, "faulty_cut_rot_232.png", DecodeType.CODE_128, "JJBEA129955634111600232", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_faulty_cut_rot_235()
    {
        testRecognizedImage(FolderFaultyRot, "faulty_cut_rot_235.png", DecodeType.CODE_128, "JJBEA129955634111200235", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_faulty_cut_rot_429()
    {
        testRecognizedImage(FolderFaultyRot, "faulty_cut_rot_429.png", DecodeType.CODE_128, "JJBEA129955634110602429", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_faulty_cut_rot_536()
    {
        testRecognizedImage(FolderFaultyRot, "faulty_cut_rot_536.png", DecodeType.CODE_128, "JJBEA129955634110501536", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_faulty_cut_rot_732()
    {
        testRecognizedImage(FolderFaultyRot, "faulty_cut_rot_732.png", DecodeType.CODE_128, "JJBEA129955634110600732", true);
    }

        @Test
        //////[Category("Code128")]
    public void test_faulty_cut_rot_829()
    {
        testRecognizedImage(FolderFaultyRot, "faulty_cut_rot_829.png", DecodeType.CODE_128, "JJBEA129955634110601829", true);
    }
}
