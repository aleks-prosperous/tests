//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue13958.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="20.04.2012 16:10:49">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue-13958.")
public class Issue13958
{
    private final String folder = Global.getTestDataFolder("Issues/Issue13958");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void Recognize1()
    {
        String fileName = Global.pathCombine(folder, "dollar1.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("999$375099$21021$$$", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Recognize2()
    {
        String fileName = Global.pathCombine(folder, "dollar2.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("999$375099$21021$$$", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Recognize3()
    {
        String fileName = Global.pathCombine(folder, "dollar3.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("999$375099$21021$$$", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

