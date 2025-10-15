//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33335.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="23.10.2012 12:38:21">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33335.")
public class Issue33335
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33335");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void code39()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "test3.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
            for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());

            Assert.assertEquals(2, values.size());
            Assert.assertTrue(values.contains("1061532"));
            Assert.assertTrue(values.contains("/3306819"));
    }
}

