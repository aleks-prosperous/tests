//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33683.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.10.2013 16:51:28">
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


@Test(description = "Tests for Issue33683.")
public class Issue33683
{
    final String folder = Global.getTestDataFolder("Issues/Issue33683");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testRM4SCC()
    {
        String filename = Global.pathCombine(folder, "photo_clean.jpg");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.RM_4_SCC);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("NN136EH3A", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("C", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
    }
}

