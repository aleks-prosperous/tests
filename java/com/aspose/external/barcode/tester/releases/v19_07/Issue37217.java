package com.aspose.external.barcode.tester.releases.v19_07;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue37217
{
    /// <summary>
    /// Path to folder with files for testing Issue37217.
    /// </summary>
    private String Folder = Global.getIssuesTestImagePath("Issue37217");

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
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
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
    public void test_directum_cut_01()
    {
        testRecognizedImage(Folder, "directum_cut_01.png", DecodeType.CODE_128, "DIRECTUM XXX-0987654321");
    }

        @Test
        ////[Category("Code128")]
    public void test_directum_cut_02()
    {
        testRecognizedImage(Folder, "directum_cut_02.png", DecodeType.CODE_128, "DIRECTUM XXX-0987654321");
    }

        @Test
        ////[Category("Code128")]
    public void test_directum_cut_03()
    {
        testRecognizedImage(Folder, "directum_cut_03.png", DecodeType.CODE_128, "DIRECTUM XXX-0987654321");
    }

        @Test
        ////[Category("Code128")]
    public void test_Barcode_code128_bmp()
    {
        testRecognizedImage(Folder, "Barcode_code128.bmp", DecodeType.CODE_128, "DIRECTUM XXX-0987654321");
    }

                @Test
        ////[Category("Code128")]
    public void test_Barcode_code128_gif()
    {
        testRecognizedImage(Folder, "Barcode_code128.gif", DecodeType.CODE_128, "DIRECTUM XXX-0987654321");
    }

        @Test
        ////[Category("Code128")]
    public void test_Barcode_code128_jpeg()
    {
        testRecognizedImage(Folder, "Barcode_code128.jpeg", DecodeType.CODE_128, "DIRECTUM XXX-0987654321");
    }

        @Test
        ////[Category("Code128")]
    public void test_Barcode_code128_png()
    {
        testRecognizedImage(Folder, "Barcode_code128.png", DecodeType.CODE_128, "DIRECTUM XXX-0987654321");
    }

        @Test
        ////[Category("Code128")]
    public void test_Barcode_code128_tiff()
    {
        testRecognizedImage(Folder, "Barcode_code128.tiff", DecodeType.CODE_128, "DIRECTUM XXX-0987654321");
    }
}
