//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33672.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="30.09.2013 13:07:00">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33785.")
public class Issue33785
{
    String folder = Global.getIssuesTestImagePath(this.getClass().getSimpleName());

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void code128()
    {
        List<String> values = new ArrayList<String>();

        String filename = Global.pathCombine(folder, "01.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.CODE_128);
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());

            Assert.assertEquals(3, values.size());
            Assert.assertTrue(values.contains("7530009720911"));
            Assert.assertTrue(values.contains("WAW"));
            Assert.assertTrue(values.contains("KAZ00000155654"));
    }

    @Test
    public void datamatrix()
    {
        String filename = Global.pathCombine(folder, "01.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("KAZ00000155654", reader.getFoundBarCodes()[0].getCodeText());
    }
}

