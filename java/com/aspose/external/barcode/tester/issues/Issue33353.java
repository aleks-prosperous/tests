//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33353.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="23.10.2012 12:38:21">
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


@Test(description = "Tests for Issue33353.")
public class Issue33353
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33353");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void try_()
    {
        String fileName = Global.pathCombine(folder, "isbn-8.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        List<String> values = new ArrayList<>();
        for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());
        Assert.assertEquals(2, values.size());
        Assert.assertTrue(values.contains("46683"));
        Assert.assertTrue(values.contains("6917344063704"));
    }

    @Test
    public void tryTry()
    {
        String fileName = Global.pathCombine(folder, "isbn-8.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("6917344063704", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void tryTryTry()
    {
        String fileName = Global.pathCombine(folder, "isbn-8.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SUPPLEMENT);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("46683", reader.getFoundBarCodes()[0].getCodeText());
    }
}

