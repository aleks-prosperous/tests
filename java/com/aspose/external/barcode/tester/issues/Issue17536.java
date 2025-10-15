// Copyright (c) 2001-2011 Aspose Pty Ltd. All Rights Reserved.
package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;


@Test(description = "Tests for Issue-17536.")
public class Issue17536
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue17536");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void MainTest()
    {
        String fileName = Global.pathCombine(folder, "doublebarcode.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10000862", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.CODE_39, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void RecognizeWithoutSetSymbology()
    {
        String fileName = Global.pathCombine(folder, "doublebarcode.tif");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10000862", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.CODE_39, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void CountRecognizedBarCodes()
    {
        String fileName = Global.pathCombine(folder, "doublebarcode.tif");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
        }
    }
}

