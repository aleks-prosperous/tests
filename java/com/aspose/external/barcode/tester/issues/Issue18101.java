//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue18101.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="12.08.2013 10:21:41">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue18101.")
public class Issue18101
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue18101");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void Bad1()
    {
        String filename = Global.pathCombine(folder, "sample1.tif");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\"BT_SO\"|\"12666\"|\"KOFMAN\"|\"YAKOV\"|\"33325\"|\"06/07/2010\"", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Bad2()
    {
        String filename = Global.pathCombine(folder, "sample2.tif");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\"BT_SO\"|\"12974\"|\"SHTEYNBERG\"|\"IZRAIL\"|\"40856\"|\"04/16/2010\"", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Bad3()
    {
        String filename = Global.pathCombine(folder, "sample3.tif");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
    public void Bad4()
    {
        String filename = Global.pathCombine(folder, "sample4.tif");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\"BT_SO\"|\"13241\"|\"SEGAL\"|\"RITA\"|\"46336\"|\"10/30/2010\"", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Bad5()
    {
        String filename = Global.pathCombine(folder, "sample5.tif");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\"BT_SO\"|\"10504\"|\"Boyarskaya\"|\"Larisa\"|\"42718\"|\"10/30/2010\"", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

