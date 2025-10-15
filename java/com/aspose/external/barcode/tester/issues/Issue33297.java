package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33297.")
public class Issue33297
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33297");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void demoQR()
    {
        String fileName = Global.pathCombine(folder, "test.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        List<String> lResults = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
            lResults.add(result.getCodeText());

        Assert.assertEquals(lResults.size(), 2, "recognized " + lResults.size() + " must be 2");
        Assert.assertTrue(lResults.contains("120120100000101"));
        Assert.assertTrue(lResults.contains("120120101000001120120101000002120120101000003120120101000004120120101000005120120101000006120120101000007120120101000008120120101000009120120101000010120120101000011120120101000012120120101000013120120101000014120120101000015120120101000016120120101000017120120101000018120120101000019120120101000020120120101000021120120101000022120120101000023120120101000024120120101000025"));

    }

    @Test
    public void demoQRtest_blured()
    {
        String fileName = Global.pathCombine(folder, "test_blured2.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        List<String> lResults = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
            lResults.add(result.getCodeText());

        Assert.assertEquals(lResults.size(), 2, "recognized " + lResults.size() + " must be 2");
        Assert.assertTrue(lResults.contains("120120100000101"));
        Assert.assertTrue(lResults.contains("120120101000001120120101000002120120101000003120120101000004120120101000005120120101000006120120101000007120120101000008120120101000009120120101000010120120101000011120120101000012120120101000013120120101000014120120101000015120120101000016120120101000017120120101000018120120101000019120120101000020120120101000021120120101000022120120101000023120120101000024120120101000025"));
    }

    @Test
    public void demoQRtest_CutBigBarCode()
    {
        String fileName = Global.pathCombine(folder, "test_blured2_cutBigBarCode.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("120120101000001120120101000002120120101000003120120101000004120120101000005120120101000006120120101000007120120101000008120120101000009120120101000010120120101000011120120101000012120120101000013120120101000014120120101000015120120101000016120120101000017120120101000018120120101000019120120101000020120120101000021120120101000022120120101000023120120101000024120120101000025", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void demo_test_blured_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "test.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        List<String> lResults = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
            lResults.add(result.getCodeText());

        Assert.assertEquals(lResults.size(), 2, "recognized " + lResults.size() + " must be 2");
        Assert.assertTrue(lResults.contains("120120100000101"));
        Assert.assertTrue(lResults.contains("120120101000001120120101000002120120101000003120120101000004120120101000005120120101000006120120101000007120120101000008120120101000009120120101000010120120101000011120120101000012120120101000013120120101000014120120101000015120120101000016120120101000017120120101000018120120101000019120120101000020120120101000021120120101000022120120101000023120120101000024120120101000025"));
    }

        @Test
    public void test_Matrix2of5_FalseDetect()
    {
        String fileName = Global.pathCombine(folder, "test.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.MATRIX_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }
}

