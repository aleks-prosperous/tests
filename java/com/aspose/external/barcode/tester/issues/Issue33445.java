//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33445.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="28.03.2013 17:20:32">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue-33445.")
public class Issue33445
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33445");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testTIF()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "00000001.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
            for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());
        Assert.assertEquals(2, values.size(), "must be 2");
        Assert.assertTrue(values.contains("BL4370"));
        Assert.assertTrue(values.contains("7802235"));
    }
}

