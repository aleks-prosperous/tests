//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33737.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
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


@Test(description = "Tests for Issue33737.")
public class Issue33737
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33737");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void pDFDatamatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "IMG0.png"), DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("3-43867-AAS-001", reader.getFoundBarCodes()[0].getCodeText());
    }
}

