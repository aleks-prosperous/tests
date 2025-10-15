//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33586.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="03.07.2013 12:05:15">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.lang.reflect.Method;


@Test(description = "Tests for Issue-33586.")
public class Issue33586
{
    private final String folder = Global.
            getTestDataFolder("Issues" + File.separator + "Issue33586");

    @BeforeMethod
    public void setUp(Method testMethod)
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        
        
    public void IMG1_1()
    {
        String fileName = Global.pathCombine(folder, "100748+Pg1+Img1.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(":AAAAvGg0ByEJ9w|ac", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
        
        
    public void IMG1_2()
    {
        String fileName = Global.pathCombine(folder, "100748+Pg1+Img1.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(":AAAAvGg0ByEJ9w|ac", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void IMG2_1()
    {
        String fileName = Global.pathCombine(folder, "Untitled.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(":AAAAvGg0ByEJ9w|ac", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void IMG2_2()
    {
        String fileName = Global.pathCombine(folder, "Untitled.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(":AAAAvGg0ByEJ9w|ac", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void IMG3_1()
    {
        String fileName = Global.pathCombine(folder, "Untitled2.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            //hotfix for Jenkins
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(":AAAAvGg0ByEJ9w|ac", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void IMG3_2()
    {
        String fileName = Global.pathCombine(folder, "Untitled2.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(":AAAAvGg0ByEJ9w|ac", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

