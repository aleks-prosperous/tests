//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33410.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.01.2013 12:53:02">
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


@Test(description = "Tests for Issue33410.")
public class Issue33410
{
    final String folder = Global.getTestDataFolder("Issues/Issue33410");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void testCase()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "testcase.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());

            Assert.assertEquals(3, values.size());
            Assert.assertTrue(values.contains("aaaaaaaaaaaaaa123456789012345678901234567890123456789012345678901234567"));
            Assert.assertTrue(values.contains("bbbbbbbbbbbb123456789012345678901234567890123456789012345678901234567"));
            Assert.assertTrue(values.contains("ccccccccccccc123456789012345678901234567890123456789012345678901234567"));
        }
    }

        @Test
    public void testCaseC()
    {
        String fileName = Global.pathCombine(folder, "testcaseCcccc.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ccccccccccccc123456789012345678901234567890123456789012345678901234567", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

