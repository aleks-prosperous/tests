//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33406.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.01.2013 15:09:12">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33406.")
public class Issue33406
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33406");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test(description = "See the BARCODENET-36511 issue")
    public void testEAN13()
    {
        List<String> values = new ArrayList<String>();
        String fileName = Global.pathCombine(folder, "0.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());
        Assert.assertEquals(2, values.size(), "Must be two.");
        Assert.assertEquals("4902580315467", values.get(0));
        if (values.size() >= 2)
        {
            Assert.assertEquals("4902580315467", values.get(1));
        }
    }
}

