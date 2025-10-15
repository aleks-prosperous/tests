//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33443.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="07.06.2012 16:36:47">
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


@Test(description = "Tests for Issue-33443.")
public class Issue33443
{
    final String folder = Global.getTestDataFolder("Issues/Issue33443");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


        @Test
    public void test1()
    {
        String fileName = Global.pathCombine(folder, "Capture1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("https://smart.amaris.com/candidate.aspx?ID=161660", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test2()
    {
        String fileName = Global.pathCombine(folder, "Capture2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("https://smart.amaris.com/candidate.aspx?ID=161660", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test3()
    {
        String fileName = Global.pathCombine(folder, "Capture3.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("https://smart.amaris.com/candidate.aspx?ID=161660", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

