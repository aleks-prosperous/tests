//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33675.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="30.09.2013 13:07:00">
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


@Test(description = "Tests for Issue33675.")
public class Issue33675
{
    final String folder = Global.getTestDataFolder("Issues/Issue33675");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void QR1()
    {
        String filename = Global.pathCombine(folder, "DOC+10-172.124.jpg");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("McCode={LTE=109\r\nCLI=07571315735,04292188777\r\nSPE=20307691\r\nEMP=20307676\r\nBLC=BLOCO 05\r\nUNI=209\r\nTPO=172.124}", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void QR2()
    {
        String filename = Global.pathCombine(folder, "DOC+10-172.124 - AnotherSize.jpg");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("McCode={LTE=109\r\nCLI=07571315735,04292188777\r\nSPE=20307691\r\nEMP=20307676\r\nBLC=BLOCO 05\r\nUNI=209\r\nTPO=172.124}", reader.getFoundBarCodes()[0].getCodeText());
    }
}

