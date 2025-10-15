//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33600.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="17.10.2013 18:26:38">
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


@Test(description = "Tests for Issue33600.")
public class Issue33600
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33600");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testPatch()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "2013071517052124526.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PATCH_CODE);
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());

        Assert.assertEquals(2, values.size());
        Assert.assertEquals("Patch T", values.get(0));
        Assert.assertEquals("Patch T", values.get(1));
    }
}

