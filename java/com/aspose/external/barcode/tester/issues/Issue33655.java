//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33655.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="07.08.2013 16:15:10">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue-33655.")
public class Issue33655
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33655");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void FineSmall()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "dmrect.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("RR30125229    231044    TNTR611663185034 CC0025CRC1XXXXXXXXXXXXXXXXXXXXX", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void FineBig()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "31072013143533.tif"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("RR30125229    231044    TNTR611663185034 CC0025CRC1XXXXXXXXXXXXXXXXXXXXX", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void FindCode39()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "31072013143533.tif"), DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("611663185034", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

