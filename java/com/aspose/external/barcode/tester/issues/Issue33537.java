//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33537.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="17.10.2013 18:26:38">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33537.")
public class Issue33537
{
    final String folder = Global.getTestDataFolder("Issues/Issue33537");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void testTif()
    {
        List<String> values = new ArrayList<String>();
        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();

        String fileName = Global.pathCombine(folder, "011312612191.001.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.PATCH_CODE);
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                values.add(result.getCodeText());
                readTypes.add(result.getCodeType());
            }

            Assert.assertEquals(5, values.size(), "Must be 5");
            Assert.assertEquals(5, readTypes.size(), "Must be 5");

            int patchCount = 0;
            for (BaseDecodeType t : readTypes)
            if (t == DecodeType.PATCH_CODE)
                patchCount++;
            Assert.assertEquals(4, patchCount, "Must be 4");

            int patchTextCount = 0;
            for (String t : values)
            if (t.equals("Patch IV"))
                patchTextCount++;
            Assert.assertEquals(4, patchTextCount, "Must be 4");

            Assert.assertTrue(readTypes.contains(DecodeType.CODE_39));
            Assert.assertTrue(values.contains("SO11010724"));
        }
    }

        @Test
    public void testCode39()
    {
        String fileName = Global.pathCombine(folder, "nopatch.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("SO11010724", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

