package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33798.")
public class Issue33798
{
    String folder = Global.getIssuesTestImagePath(this.getClass().getSimpleName());

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test201401239002057()
    {
        List<String> values = new ArrayList<String>();
        List<BaseDecodeType> types = new ArrayList<BaseDecodeType>();

        String fileName = Global.pathCombine(folder, "201401239002057.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        try
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                types.add(result.getCodeType());
                values.add(result.getCodeText());
            }

            Assert.assertEquals(8, types.size());
            for (BaseDecodeType type : (Iterable<BaseDecodeType>) types)
            {
                Assert.assertEquals(DecodeType.CODE_39, type);
            }

            Assert.assertTrue(values.contains("NEW INDEX"));
            Assert.assertTrue(values.contains("294928"));
            Assert.assertTrue(values.contains("OZIMTRACYR"));
            Assert.assertTrue(values.contains("LPM2022070112"));
            Assert.assertTrue(values.contains("FLBAR"));
            Assert.assertTrue(values.contains("LIBERTY"));

            int count = 0;
            for (String s : (Iterable<String>) values)
            {
                if ("12POLICY".equals(s))
                {
                    count++;
                }
            }

            Assert.assertEquals(2, count);
        } finally
        {
        }
    }

    @Test
    public void test201401239002185()
    {
        List<String> values = new ArrayList<String>();
        List<BaseDecodeType> types = new ArrayList<BaseDecodeType>();

        String fileName = Global.pathCombine(folder, "201401239002185.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        try
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                types.add(result.getCodeType());
                values.add(result.getCodeText());
            }

            Assert.assertEquals(8, types.size());
            for (BaseDecodeType type : (Iterable<BaseDecodeType>) types)
            {
                Assert.assertEquals(DecodeType.CODE_39, type);
            }

            Assert.assertTrue(values.contains("NEW INDEX"));
            Assert.assertTrue(values.contains("803721"));
            Assert.assertTrue(values.contains("LEHNLAW"));
            Assert.assertTrue(values.contains("LPM2020500111"));
            Assert.assertTrue(values.contains("FLBAR"));
            Assert.assertTrue(values.contains("LIBERTY"));

            int count = 0;
            for (String s : (Iterable<String>) values)
            {
                if ("11POLICY".equals(s))
                {
                    count++;
                }
            }

            Assert.assertEquals(2, count);
        } finally
        {
        }
    }

    @Test
    public void test201401239002359()
    {
        List<String> values = new ArrayList<String>();
        List<BaseDecodeType> types = new ArrayList<BaseDecodeType>();

        String fileName = Global.pathCombine(folder, "201401239002359.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        try
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                types.add(result.getCodeType());
                values.add(result.getCodeText());
            }

            Assert.assertEquals(8, types.size());
            for (BaseDecodeType type : (Iterable<BaseDecodeType>) types)
            {
                Assert.assertEquals(DecodeType.CODE_39, type);
            }

            Assert.assertTrue(values.contains("NEW INDEX"));
            Assert.assertTrue(values.contains("803721"));
            Assert.assertTrue(values.contains("LEHNLAW"));
            Assert.assertTrue(values.contains("LPM2020500112"));
            Assert.assertTrue(values.contains("FLBAR"));
            Assert.assertTrue(values.contains("LIBERTY"));

            int count = 0;
            for (String s : (Iterable<String>) values)
            {
                if ("12POLICY".equals(s))
                {
                    count++;
                }
            }

            Assert.assertEquals(2, count);
        } finally
        {
        }
    }

    @Test
    public void test201401239002476()
    {
        List<String> values = new ArrayList<String>();
        List<BaseDecodeType> types = new ArrayList<BaseDecodeType>();

        String fileName = Global.pathCombine(folder, "201401239002476.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        try
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                types.add(result.getCodeType());
                values.add(result.getCodeText());
            }

            Assert.assertEquals(8, types.size());
            for (BaseDecodeType type : (Iterable<BaseDecodeType>) types)
            {
                Assert.assertEquals(DecodeType.CODE_39, type);
            }

            Assert.assertTrue(values.contains("NEW INDEX"));
            Assert.assertTrue(values.contains("GRE41112"));
            Assert.assertTrue(values.contains("GREENOBRENT"));
            Assert.assertTrue(values.contains("LPM2002610110"));
            Assert.assertTrue(values.contains("GABAR"));
            Assert.assertTrue(values.contains("LIBERTY"));

            int count = 0;
            for (String s : (Iterable<String>) values)
            {
                if ("10POLICY".equals(s))
                {
                    count++;
                }
            }

            Assert.assertEquals(2, count);
        } finally
        {
        }
    }
}

