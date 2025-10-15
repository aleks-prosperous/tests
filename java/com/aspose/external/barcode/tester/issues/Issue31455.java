package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue-31455.")
public class Issue31455
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue31455");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Code39")]
    public void RotatedCropedFirst()
    {
            String file = "test33_rotated_croped_first.tif";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1061532", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void RotatedCropedFirstWithSymbology()
    {
            String file = "test33_rotated_croped_first.tif";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_39);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1061532", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void RotatedCropedSecond()
    {
            String file = "test33_rotated_croped_second.tif";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("/3306819", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void RotatedCropedSecondWithSymbology()
    {
            String file = "test33_rotated_croped_second.tif";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("/3306819", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void RotatedCroped()
    {
        List<String> codetexts = new ArrayList<String>();

            String file = "test33_rotated_croped.tif";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath);
        {
            for(BarCodeResult result : reader.readBarCodes())
            codetexts.add(result.getCodeText());

            TestExternalHelper.contains("/3306819", codetexts);
            TestExternalHelper.contains("1061532", codetexts);
            Assert.assertTrue(codetexts.size() == 2);
        }
    }

        @Test
    public void Rotated()
    {
        List<String> codetexts = new ArrayList<String>();

            String file = "test33_rotated.tif";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath);
        {
            for(BarCodeResult result : reader.readBarCodes())
            codetexts.add(result.getCodeText());

            TestExternalHelper.contains("/3306819", codetexts);
            TestExternalHelper.contains("1061532", codetexts);
            Assert.assertTrue(codetexts.size() == 2);
        }
    }

        @Test
    public void RotatedWithSymbology()
    {
        List<String> codetexts = new ArrayList<String>();

            String file = "test33_rotated.tif";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_39);
        {
            for(BarCodeResult result : reader.readBarCodes())
            codetexts.add(result.getCodeText());

            TestExternalHelper.contains("/3306819", codetexts);
            TestExternalHelper.contains("1061532", codetexts);
            Assert.assertTrue(codetexts.size() == 2);
        }
    }

        @Test
    public void OriginalWithSymbology()
    {
        List<String> codetexts = new ArrayList<String>();

            String file = "test33.tif";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_39);
        {
            for(BarCodeResult result : reader.readBarCodes())
            codetexts.add(result.getCodeText());

            TestExternalHelper.contains("/3306819", codetexts);
            TestExternalHelper.contains("1061532", codetexts);
            Assert.assertTrue(codetexts.size() == 2);
        }
    }

        @Test
        //[Category("Code39")]
    public void Original()
    {
        List<String> codetexts = new ArrayList<String>();

            String file = "test33.tif";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath);
        {
            for(BarCodeResult result : reader.readBarCodes())
            codetexts.add(result.getCodeText());

            TestExternalHelper.contains("/3306819", codetexts);
            TestExternalHelper.contains("1061532", codetexts);
            Assert.assertTrue(codetexts.size() == 2);
        }
    }
}

