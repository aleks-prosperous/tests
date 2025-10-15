//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33209.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="08.05.2012 13:27:24">
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

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


@Test(description = "Tests for Issue-33209.")
public class Issue33209
{
    final String folder = Global.getTestDataFolder("Issues/Issue33209");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testImage() throws IOException
    {
        String fileName = Global.pathCombine(folder, "1bc.png");
        BufferedImage bitmap = ImageIO.read(new File(fileName));
        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("E70009450_REIN", reader.getFoundBarCodes()[0].getCodeText());
    }
}

