//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33166.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="01.08.2012 18:50:34">
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


@Test(description = "Tests for Issue-33166.")
public class Issue33166
{
    final String folder = Global.getTestDataFolder("Issues/Issue33166");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String fullPath = Global.pathCombine(folder, "output-croped.png");
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("GGKND26rql", reader.getFoundBarCodes()[0].getCodeText());
    }
}

