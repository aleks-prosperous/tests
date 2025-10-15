//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33507.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="12.11.2012 14:45:35">
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
import utils.LicenseAssistant;

import java.io.File;
import java.nio.charset.StandardCharsets;

@Test(description = "Tests for Issue-33507.")
public class Issue33507
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33507");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void recognize1()
    {
        String fileName = Global.pathCombine(folder, "win8-Unicode-Russian.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0123456789 Крупнейший по численности ", reader.getFoundBarCodes()[0].getCodeText(StandardCharsets.UTF_16));

    }

    @Test
    public void recognize2()
    {
        String fileName = Global.pathCombine(folder, "win8-UTF8-Russian.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0123456789 сигналов 38 космических спутников", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize3()
    {
        String fileName = Global.pathCombine(folder, "win8-UTF8-Japan.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0123456789 北朝鮮の国防委員会は１８日、米韓との対", reader.getFoundBarCodes()[0].getCodeText(StandardCharsets.UTF_8));
    }
}

