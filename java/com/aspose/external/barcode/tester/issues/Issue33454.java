//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33454.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="13.02.2013 11:28:50">
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


@Test(description = "Tests for Issue33454.")
public class Issue33454
{
    final String folder = Global.getTestDataFolder("Issues/Issue33454");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testPage3()
    {
        String path = Global.pathCombine(folder, "Page3.jpg");
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("d7e13e5a-1411-4736-b6e6-97821fe23344", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage4()
    {
        String path = Global.pathCombine(folder, "Page4.jpg");
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("5b17102a-60a8-4770-b94a-c74d248496d0", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage5()
    {
        String path = Global.pathCombine(folder, "Page5.jpg");
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("f2738ed0-43a6-4bc9-a094-38c501f6ec93", reader.getFoundBarCodes()[0].getCodeText());
    }
}

