//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33732.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
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


@Test(description = "Tests for Issue33732.")
public class Issue33732
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33732");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void CiscoC39()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "cisco_image3.png"), DecodeType.CODE_39);
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("046379", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void IMG5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "IMG5.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1ZW795070300319938", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

