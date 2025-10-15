//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33731.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33731.")
public class Issue33731
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33731");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void CiscoAll()
    {
        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        List<String> codetexts = new ArrayList<String>();
        // Note: Code39 with checksum recognized
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "cisco_image3.png"), DecodeType.CODE_39);
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("046379", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void CiscoRM4SCC()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "cisco_image3.png"), DecodeType.RM_4_SCC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }
}

