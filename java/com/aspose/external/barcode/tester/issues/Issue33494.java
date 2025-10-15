//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33494.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="04.04.2013 17:57:12">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33494.")
public class Issue33494
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33494");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void testQRMain()
    {
        String fileName = Global.pathCombine(folder, "1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("||15|317535612||BOLOGNESI MARCO|BLGMRC72M30A393I|81|A8|A800543|", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testQRRotated()
    {
        String fileName = Global.pathCombine(folder, "qrrot.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("||15|317535612||BOLOGNESI MARCO|BLGMRC72M30A393I|81|A8|A800543|", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

