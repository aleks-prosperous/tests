//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue13470.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="17.10.2013 18:26:38">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.SingleDecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue13470.")
public class Issue13470
{
    final String Folder = Global.getTestDataFolder("Issues/Issue13470");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testMacroPDF417()
    {
        List<String> values = new ArrayList<String>();
        List<SingleDecodeType> readTypes = new ArrayList<SingleDecodeType>();

        String fileName = Global.pathCombine(Folder, "encode.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.MACRO_PDF_417);
        for(BarCodeResult result : reader.readBarCodes())
        {
            values.add(result.getCodeText());
            readTypes.add(result.getCodeType());
        }

            // 15 must be
            Assert.assertEquals(15, values.size(), "Must be 15");
            Assert.assertEquals(15, readTypes.size(), "Must be 15");
    }
}

