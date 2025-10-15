//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33617.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="24.07.2013 13:42:52">
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


@Test(description = "Tests for Issue33617.")
public class Issue33617
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33617");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void simpleC40()
    {
        String fileName = Global.pathCombine(folder, "1111.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Wikipedia, the free encyclopedia", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void massiveDataMatrix()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "500px-Datamatrix-encodings.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        try
        {
            for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());

            Assert.assertEquals(4, values.size());
            for (String s : (Iterable<String>) values)
            {
                Assert.assertEquals("Wikipedia, the free encyclopedia", s);
            }
        } finally
        {
        }
    }
}

