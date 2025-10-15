//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33444.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="26.03.2013 12:20:18">
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


@Test(description = "Tests for Issue-33444.")
public class Issue33444
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33444");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


        @Test
    public void testSmall()
    {
        String fileName = Global.pathCombine(folder, "data.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("_1,_2,_3,_4,_5,_6,_7,_8,_9,_10,_11,_12,\rDevon,DN123456,Blah blah ,Off,Off,,Yes,,,100.00,Off,Yes,", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBig()
    {
        String fileName = Global.pathCombine(folder, "002.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("_1,_2,_3,_4,_5,_6,_7,_8,_9,_10,_11,_12,\rDevon,DN123456,Blah blah ,Off,Off,,Yes,,,100.00,Off,Yes,", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

