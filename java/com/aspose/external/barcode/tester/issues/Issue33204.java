// Copyright (c) 2001-2011 Aspose Pty Ltd. All Rights Reserved.

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.auxiliary.StringExtensions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue-33204.")
public class Issue33204
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33204");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    private void innerTestLogic(String text)
    {
        String fileName = Global.pathCombine(folder, StringExtensions.concat(text, ".jpg"));
        BufferedImage bitmap = Global.getBufferedImageFromFile(fileName);
        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        boolean founded = false;
        for(BarCodeResult result : reader.readBarCodes())
        {
//            stopwatch.Stop();
//            System.out.println("Elapsed :" + stopwatch.Elapsed + " Symbol:" + result.getCodeTypeName() + " Code :" + result.getCodeText());
            Assert.assertEquals(text, result.getCodeText());
            Assert.assertEquals(DecodeType.CODE_128, result.getCodeType());
            founded = true;
        }
        Assert.assertTrue(founded, "Not founded barcode.");
    }

    @Test
    public void testSamuel()
    {
        innerTestLogic("Samuel");
    }

    @Test
    public void test12345()
    {
        innerTestLogic("12345");
    }

    @Test
    public void testTest1()
    {
        innerTestLogic("Test1");
    }

    @Test
    public void testTest2()
    {
        innerTestLogic("Test2");
    }

    @Test
    public void testWws_super()
    {
        innerTestLogic("wws super");
    }

    @Test
    public void testWww_si_wws_de()
    {
        innerTestLogic("www.si-wws.de");
    }

    @Test
    public void demoTest()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "Test4.jpg");
        BufferedImage bitmap = Global.getBufferedImageFromFile(fileName);
        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.CODE_128);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);

        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());

        Assert.assertEquals(6, values.size());
        Assert.assertTrue(values.contains("www.si-wws.de"));
        Assert.assertTrue(values.contains("wws super"));
        Assert.assertTrue(values.contains("Samuel"));
        Assert.assertTrue(values.contains("Test2"));
        Assert.assertTrue(values.contains("Test1"));
        Assert.assertTrue(values.contains("12345"));
    }
}

