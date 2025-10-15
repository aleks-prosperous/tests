package com.aspose.external.barcode.tester.releases.v21_6;


import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class BARCODEJAVA851
{
    final String fullPath = Global.getTestDataFolder("Issues/BARCODEJAVA552");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Acct_and_Doc_NotWorking_page3()
    {
        String fileName = Global.pathCombine(fullPath, "Acct_and_Doc_NotWorking_page3.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.INTERLEAVED_2_OF_5));
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(2, lCodetexts.size());
            Assert.assertTrue(lCodetexts.contains("96551232"));
            Assert.assertTrue(lCodetexts.contains("0626"));
        }
    }

    @Test
    public void test_Acct_and_Doc_NotWorking_page3_AllSupported()
    {
        String fileName = Global.pathCombine(fullPath, "Acct_and_Doc_NotWorking_page3.tiff");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
                        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(2, lCodetexts.size());
            Assert.assertTrue(lCodetexts.contains("96551232"));
            Assert.assertTrue(lCodetexts.contains("0626"));
        }
    }

    @Test
    public void test_Acct_and_Doc_Working_page3()
    {
        String fileName = Global.pathCombine(fullPath, "Acct_and_Doc_Working_page3.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.INTERLEAVED_2_OF_5));
        {
                        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(2, lCodetexts.size());
            Assert.assertTrue(lCodetexts.contains("96551232"));
            Assert.assertTrue(lCodetexts.contains("0626"));
        }
    }

    @Test
    public void test_MoneyMovement_NotWorking_page2()
    {
        String fileName = Global.pathCombine(fullPath, "MoneyMovement_NotWorking_page2.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.INTERLEAVED_2_OF_5));
        {
                        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(2, lCodetexts.size());
            Assert.assertTrue(lCodetexts.contains("96100050"));
            Assert.assertTrue(lCodetexts.contains("0201"));
        }
    }

    @Test
    public void test_MoneyMovement_NotWorking_page2_AllSupported()
    {
        String fileName = Global.pathCombine(fullPath, "MoneyMovement_NotWorking_page2.tiff");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
                        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(2, lCodetexts.size());
            Assert.assertTrue(lCodetexts.contains("96100050"));
            Assert.assertTrue(lCodetexts.contains("0201"));
        }
    }

    @Test
    public void test_MoneyMovement_Working_page2()
    {
        String fileName = Global.pathCombine(fullPath, "MoneyMovement_Working_page2.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.INTERLEAVED_2_OF_5));
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(2, lCodetexts.size());
            Assert.assertTrue(lCodetexts.contains("96100050"));
            Assert.assertTrue(lCodetexts.contains("0201"));
        }
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
    @Test
    public void test_DOC_TYPE_ESTATE_PAPERS_ACCT_74206889_DOCID_718()
    {
        String fileName = Global.pathCombine(fullPath, "DOC TYPE - ESTATE PAPERS, ACCT - 74206889, DOCID - 718.pdf.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.INTERLEAVED_2_OF_5));
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            List<String> lCodetexts = new ArrayList<>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(2, lCodetexts.size());
            Assert.assertTrue(lCodetexts.contains("74206889"));
            Assert.assertTrue(lCodetexts.contains("0718"));
        }
    }

    /// <summary>
    /// Tests recogntion with All Supported symbologies.
    /// </summary>
    @Test
    public void test_DOC_TYPE_ESTATE_PAPERS_ACCT_74206889_DOCID_718_AllSupported()
    {
        String fileName = Global.pathCombine(fullPath, "DOC TYPE - ESTATE PAPERS, ACCT - 74206889, DOCID - 718.pdf.tiff");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            List<String> lCodetexts = new ArrayList<>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(2, lCodetexts.size());
            Assert.assertTrue(lCodetexts.contains("74206889"));
            Assert.assertTrue(lCodetexts.contains("0718"));
        }
    }
}
