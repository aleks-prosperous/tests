//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33269.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="03.07.2012 14:20:27">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;


@Test(description = "Tests for Issue-33269.")
public class Issue33269
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33269");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String fileName = Global.pathCombine(folder, "barcode.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_LIMITED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)18369043319951", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test2()
    {
        String fileName = Global.pathCombine(folder, "barcode2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_LIMITED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)15015854044898", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test3()
    {
        String fileName = Global.pathCombine(folder, "barcode3.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_LIMITED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)15012345678907", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test4()
    {
        String fileName = Global.pathCombine(folder, "GS1DataBarLimited.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_LIMITED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)00614141999996", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test4Edited()
    {
        String fileName = Global.pathCombine(folder, "GS1DataBarLimited_Edited.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_LIMITED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)00614141999996", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testFail1()
    {
        String fileName = Global.pathCombine(folder, "xam2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_LIMITED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)00123456789012", reader.getFoundBarCodes()[0].getCodeText());

    }
}

