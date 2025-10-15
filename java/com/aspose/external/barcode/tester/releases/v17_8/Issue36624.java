package com.aspose.external.barcode.tester.releases.v17_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Issue36624
{
    /**
     * <p>
     * Path to folder with files for testing Issue36624.
     * </p>
     */
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36624");

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Code39Standard")]
    public void test_Read_3_Barcodes()
    {
        String fileName = Global.pathCombine(folder, "3_Barcodes.tif");
        List<String> results = new ArrayList<String>();
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        {
            for(BarCodeResult result : reader.readBarCodes())
            results.add(result.getCodeText());
        }
        TestExternalHelper.contains("*DOCUMENT*", results);
        TestExternalHelper.contains("*DTP20*", results);
        TestExternalHelper.contains("CCR-44722-01", results);
        Assert.assertEquals(3, results.size());
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Read_3_Barcodes_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "3_Barcodes.tif");
        List<String> results = new ArrayList<String>();
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            for(BarCodeResult result : reader.readBarCodes())
            results.add(result.getCodeText());
        }
        TestExternalHelper.contains("*DOCUMENT*", results);
        TestExternalHelper.contains("*DTP20*", results);
        TestExternalHelper.contains("CCR-44722-01", results);
        Assert.assertEquals(3, results.size());
    }

        @Test
        //[Category("Code39Standard")]
    public void test_Read_3_Barcodes_First()
    {
        String fileName = Global.pathCombine(folder, "3_Barcodes_First.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("*DOCUMENT*", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_Read_3_Barcodes_Second()
    {
        String fileName = Global.pathCombine(folder, "3_Barcodes_Second.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("*DTP20*", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_Read_3_Barcodes_Third()
    {
        String fileName = Global.pathCombine(folder, "3_Barcodes_Third.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("CCR-44722-01", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void testGenerateAndRecognizeWithAstrics()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_39, "**DTP20**");
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.CODE_39);
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("DTP20", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }
}
