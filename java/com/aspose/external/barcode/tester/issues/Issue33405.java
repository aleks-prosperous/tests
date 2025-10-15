//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33405.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="17.01.2013 13:33:23">
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


@Test(description = "Tests for Issue33405.")
public class Issue33405
{
    final String folder = Global.getTestDataFolder("Issues/Issue33405");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testGif()
    {
        String fileName = Global.pathCombine(folder, "UPC_A_Non_Digit_Sections.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.UPCA);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("012345678905", reader.getFoundBarCodes()[0].getCodeText());
    }
}

