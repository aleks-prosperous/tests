//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33438.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="13.02.2013 11:28:50">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import com.aspose.barcode.logger.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33438.")
public class Issue33438
{
    final String folder = Global.
            getTestDataFolder("Issues" + File.separator + "Issue33438");

    @AfterMethod
    public void afterFinish(Method testMethod)
    {
        Logger.methodFinished(getClass().getName() + "." + testMethod.getName());
    }

    @BeforeMethod
    public void setUp(Method testMethod)
    {
        utils.LicenseAssistant.setupLicense();
        Logger.methodStarted(getClass().getName() + "." + testMethod.getName());
    }

    @Test
    public void testNoHang_java_adpated()
    {
        final String fileName = "378abb43520d76c1a8fbaeb16de3765d_AllSupported.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        List<Integer> list = new ArrayList<Integer>();
        list.add(20);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(10)7700096376", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
    public void testNoHangWithGS1Code128Type()
    {
        final String fileName = "378abb43520d76c1a8fbaeb16de3765d_AllSupported.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.GS_1_CODE_128);
        {
            List<Integer> list = new ArrayList<Integer>();
            list.add(20);
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(10)7700096376", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

