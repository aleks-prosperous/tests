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


@Test(description = "Tests for Issue-33763.")
public class Issue33763
{
    final String folder = Global.getTestDataFolder("Issues/Issue33763");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        String fileName = Global.pathCombine(folder, "IMG0.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("3-20835-AAS-001", reader.getFoundBarCodes()[0].getCodeText());
    }
}

