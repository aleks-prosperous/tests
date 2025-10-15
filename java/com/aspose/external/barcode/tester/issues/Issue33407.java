//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33407.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.01.2013 15:09:12">
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


@Test(description = "Tests for Issue33407.")
public class Issue33407
{
    final String folder = Global.getTestDataFolder("Issues/Issue33407");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


        @Test
    public void testDataMatrix()
    {
        String fileName = Global.pathCombine(folder, "IMG0.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1000934|100093402.006", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testDemo()
    {
        String fileName = Global.pathCombine(folder, "input.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1000934|100093402.006", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testCutted()
    {
        String fileName = Global.pathCombine(folder, "input_cut.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1000934|100093402.006", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testCuttedEdited()
    {
        String fileName = Global.pathCombine(folder, "input_cut_edited.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1000934|100093402.006", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

