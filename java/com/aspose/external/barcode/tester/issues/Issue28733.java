//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue28733.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
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


@Test(description = "Tests for Issue28733.")
public class Issue28733
{
    private final String folder = Global.getTestDataFolder("Issues/Issue28733");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void Bad1()
    {
        String filename = Global.pathCombine(folder, "test2.jpg");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("UIT029306DAIWLEED  106718                                                   KLAARSTAAN WO.08-JUN-11 !!!", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Bad2()
    {
        String filename = Global.pathCombine(folder, "test2.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("CMR    UIT029376", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

