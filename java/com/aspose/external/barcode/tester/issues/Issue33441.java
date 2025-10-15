//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33441.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="13.02.2013 11:28:50">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33441.")
public class Issue33441
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33441");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        final String fileName = "170px-HSR_DataMatrix.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("http://www.gis.hsr.ch/wiki/HSR", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void test2()
    {
        final String fileName = "220px-Lorem_Ipsum.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void test3()
    {
        final String fileName = "auspost-24.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1118104220", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.AUSTRALIA_POST, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void test4()
    {
        final String fileName = "aztec2.gif";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("\r\nDatascan Font Service Ltd\r\nFirst Floor, 2 Wren Avenue\r\nLondon NW2 6UH\r\nEngland", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.AZTEC, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void test5()
    {
        final String fileName = "azteccode-14.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("IkvIlnZfMxx9FwXbZ6beDlaQRtbdt4Daf4Wuk8c1HrH1bHT2ONRl6AahJe01L6wRu", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.AZTEC, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void test6()
    {
        final String fileName = "datamatrix-0.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("dMCd S/n4s", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void test7()
    {
        final String fileName = "datamatrix-13.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("$obH-mQDlG. h0sSsb", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void test8()
    {
        final String fileName = "VIN-barcode2.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1M8GDM9AXKP042788", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.VIN, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void test9()
    {
        final String fileName = "16c77326ababf04f8f3598a024bbf742.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        List<String> values = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());
        Assert.assertTrue(values.contains("854332999019"));
    }

    @Test
    public void test10()
    {
        final String fileName = "236350_html_3419e70d.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("46012340", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.EAN_8, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void test11()
    {
        final String fileName = "bookland-bar-code.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        List<String> values = new ArrayList<>();
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());
        Assert.assertTrue(values.contains("9780735200449"));
        Assert.assertTrue(values.contains("51299"));
    }

    @Test
    public void test12()
    {
        final String fileName = "Code128-Barcode-Creator_1.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("http://www.softpedia.com", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void test13()
    {
            final String fileName = "ean_128_symbol.gif";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>01930672802054953103018750", reader.getFoundBarCodes()[0].getCodeText());
                /*Assert.assertTrue(reader.Read());
                Assert.assertEquals(DecodeType.CODE_128, reader.GetReadType());
                Assert.assertEquals("<FNC1>01930672802054953103018750", reader.getCodeText());
                Assert.assertFalse(reader.Read());*/
        }
    }
}

