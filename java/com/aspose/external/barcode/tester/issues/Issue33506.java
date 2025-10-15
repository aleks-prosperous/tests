//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33506.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="17.10.2013 18:44:10">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33506.")
public class Issue33506
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33506");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }


    @Test
    public void testTIF1()
    {
        List<String> values = new ArrayList<String>()
        {{
            add("3111220335");
            add("0316757107");
        }};
        BarCodeReader reader = new BarCodeReader(folder + "20130418093004988.tif", DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertTrue(values.contains(reader.getFoundBarCodes()[0].getCodeText()), "Error: " + reader.getFoundBarCodes()[0].getCodeText());

    }

    @Test
    public void testTIF2()
    {
        List<String> values = new ArrayList<String>()
        {{
            add("0317666597");
            add("0316217409");
            add("3111199606");
            add("3111199341");
        }};

        BarCodeReader reader = new BarCodeReader(folder + "20130418093034445.tif", DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertTrue(values.contains(reader.getFoundBarCodes()[0].getCodeText()), "Error: " + reader.getFoundBarCodes()[0].getCodeText());

    }
}

