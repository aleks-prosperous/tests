// Copyright (c) 2001-2011 Aspose Pty Ltd. All Rights Reserved.
package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.lang.reflect.Method;


@Test(description = "Tests for Issue-33177.")
public class Issue33177
{
    final String folder = Global.
            getTestDataFolder("Issues" + File.separator + "Issue33177");

    @BeforeMethod
    public void setUp(Method testMethod)
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void test2DBI1_1()
    {
        String fileName = Global.pathCombine(folder, "2DBI1_1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1812615-1245", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test2DBI1_2()
    {
        String fileName = Global.pathCombine(folder, "2DBI1_2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1812615-1255", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test(enabled = false) // TODO NOT Test
    public void test2DBI2_1()
    {
        String fileName = Global.pathCombine(folder, "2DBI2_1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1812615-1245", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test1PDF()
    {
        String fileName = Global.pathCombine(folder, "1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("87671-1023", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test2PDF()
    {
        String fileName = Global.pathCombine(folder, "2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("86496-1105", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test3PDF()
    {
        String fileName = Global.pathCombine(folder, "3.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("86840-1105", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test4PDF()
    {
        String fileName = Global.pathCombine(folder, "4.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            reader.getQualitySettings().setXDimension(XDimensionMode.USE_MINIMAL_X_DIMENSION);
            reader.getQualitySettings().setMinimalXDimension(5);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("87918-1023", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

