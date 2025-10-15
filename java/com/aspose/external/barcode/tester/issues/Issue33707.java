//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33707.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
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


@Test(description = "Tests for Issue33707.")
public class Issue33707
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33707");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void fixedOKCount()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "notrecognized7.jpg"), DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("2013/802396", reader.getFoundBarCodes()[0].getCodeText());
    }
}

