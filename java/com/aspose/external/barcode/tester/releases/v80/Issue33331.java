//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33331.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="29.08.2012 15:43:46">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.releases.v80;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue-33331.")
public class Issue33331
{
    private final String Folder = Global.getTestDataFolder("Issues/Issue33331");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void recognize128()
    {
        String fileName = Folder + "test.png";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("MAN_161845_ALHMXP_S", reader.getFoundBarCodes()[0].getCodeText());
    }
}

