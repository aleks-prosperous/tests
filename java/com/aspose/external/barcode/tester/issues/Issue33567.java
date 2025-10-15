//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33567.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="17.10.2013 18:26:38">
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


@Test(description = "Tests for Issue33567.")
public class Issue33567
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33567");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String fileName = Global.pathCombine(folder, "tmpbarcode1.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("AD194387-2364-4A3B-8253-29F01162023E", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test2()
    {
        String fileName = Global.pathCombine(folder, "tmpbarcode2.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("5EFEE2EE-71E3-4F0A-9B9E-067AC8C28971", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test3()
    {
        String fileName = Global.pathCombine(folder, "tmpbarcode3.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1C734F8E-528A-44CB-A600-DFFC03348F53", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test4()
    {
        String fileName = Global.pathCombine(folder, "tmpbarcode4.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("468209EE-E041-4C22-8DE4-3F38B487FA65", reader.getFoundBarCodes()[0].getCodeText());
    }
}

