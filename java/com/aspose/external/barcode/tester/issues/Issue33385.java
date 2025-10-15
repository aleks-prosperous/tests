//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33385.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="23.10.2012 12:38:21">
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


@Test(description = "Tests for Issue33385.")
public class Issue33385
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33385");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testBrokenImage()
    {
        String fileName = Global.pathCombine(folder, "PkDecode.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("I do not know what I may appear to the world, but to myself\r\nI seem to have been only like a boy playing on the sea-shore,\r\nand diverting myself in now and then finding a smoother\r\npebble or a prettier shell than ordinary, whilst the great\r\nocean of truth lay all undiscovered before me.\r\n Sir Isaac Newton 1642-1727\r\n Brewster's Memoirs of Newton, II. Ch. 27", reader.getFoundBarCodes()[0].getCodeText());
    }
}

