//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33498.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="04.04.2013 17:57:12">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33498.")
public class Issue33498
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33498");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void IMG0()
    {
        String fileName = Global.pathCombine(folder, "IMG0.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setStripFNC(true);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9612869289035362657581", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void IMG1()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "IMG1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());
        }

        Assert.assertEquals(3, values.size());
        Assert.assertTrue(values.contains("1Z65A54Y0196033513")); // 2 times
        Assert.assertTrue(values.contains("420331221815"));
    }

        @Test
    public void IMG2()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "IMG2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        reader.getBarcodeSettings().setStripFNC(true);
        {
            for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());
            Assert.assertEquals(2, values.size());
            Assert.assertTrue(values.contains("42033122"));
            Assert.assertTrue(values.contains("1Z5812340301932259"));
        }
    }

        @Test
    public void IMG3()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "IMG3.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128, DecodeType.GS_1_CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setStripFNC(true);
        {
            for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());
            Assert.assertEquals(2, values.size());
            Assert.assertTrue(values.contains("(420)33122(92)74899999145103494613"));
            Assert.assertTrue(values.contains("SDQ2hwlvYR_001_v"));
        }
    }

        @Test
    public void IMG4()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "IMG4.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setStripFNC(true);
            for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());
            Assert.assertEquals(2, values.size());
            Assert.assertTrue(values.contains("42033122"));
            Assert.assertTrue(values.contains("9612019361026370408718"));
    }

        @Test
    public void IMG5()
    {
        String fileName = Global.pathCombine(folder, "IMG5.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        //reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setStripFNC(true);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1ZW795070300319938", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void IMG6()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "IMG6.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setStripFNC(true);
        {
            for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());
            Assert.assertEquals(2, values.size());
            Assert.assertTrue(values.contains("420331221815"));
            Assert.assertTrue(values.contains("1Z65A54Y0196033513"));
        }
    }

        @Test
    public void IMG7()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "IMG7.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setStripFNC(true);
        {
            for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());
            Assert.assertEquals(2, values.size());
            Assert.assertTrue(values.contains("420331221815"));
            Assert.assertTrue(values.contains("1Z65A54Y0196033513"));
        }
    }

        @Test
    public void IMG8()
    {
        String fileName = Global.pathCombine(folder, "IMG8.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setStripFNC(true);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1Z65A54Y0196033513", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void IMG9()
    {
        String fileName = Global.pathCombine(folder, "IMG9.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setStripFNC(true);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("420331229406203699300020456914", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void IMG10()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "IMG10.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128, DecodeType.GS_1_CODE_128);
        reader.getBarcodeSettings().setStripFNC(true);
        {
            for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());
            Assert.assertEquals(2, values.size());
            Assert.assertTrue(values.contains("(420)33122(92)74899999145103494613"));
            Assert.assertTrue(values.contains("SDQ2hwlvYR_001_v"));
        }
    }
}

