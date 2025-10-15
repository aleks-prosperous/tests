//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue34076.cs" company="Aspose Pty Ltd" author="A. Gavriluk" date="16.01.2015 03:14:00">
//     Copyright (c) 2001-2014 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.lang.reflect.Method;


@Test(description = "Tests for Issue34076.")
public class Issue34076
{
    final String folder = Global.
            getTestDataFolder("Issues" + File.separator + "Issue34076");

    @BeforeMethod
    public void setUp(Method testMethod)
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void BARCODENET33950()
    {
        String filename = Global.pathCombine(folder, "testpage2.tif");
        final BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("A13141225", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void BARCODENET33951()
    {
        String filename = Global.pathCombine(folder, "testpage.tif");
        final BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("A12143880", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void BARCODENET33865()
    {
        String filename = Global.pathCombine(folder, "43303_2.png");
        final BarCodeReader reader = new BarCodeReader(filename, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("458798", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("458798", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void BARCODENET33867()
    {
        String filename = Global.pathCombine(folder, "43303_92.png");
        final BarCodeReader reader = new BarCodeReader(filename, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("458056", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("458056", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void BARCODENET33866()
    {
        String filename = Global.pathCombine(folder, "43303_79.png");
        final BarCodeReader reader = new BarCodeReader(filename, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("458199", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("458199", reader.getFoundBarCodes()[1].getCodeText());
    }
}

