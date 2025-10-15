//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33725.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
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


@Test(description = "Tests for Issue33725.")
public class Issue33725
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33725");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void Inter25Bad()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "AMA_testBarcodeForAspose.tif"), DecodeType.INTERLEAVED_2_OF_5);
        {
            // Incorrect picture, false is ok
            Assert.assertEquals(reader.readBarCodes().length, 0, "Incorrect picture, false is ok");
        }
    }

        @Test
    public void Code39Good()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "AMA2.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IGSEPPAGE", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}