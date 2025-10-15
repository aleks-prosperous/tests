//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33425.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="23.08.2013 16:52:54">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33425.")
public class Issue33425
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33425");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testBrokenImage()
    {
        final String text =
                "ANSI 6360100102DL00390188ZF02270077DLDAABURGOS,CINDY,A\r\nDAG123 ANY ST\r\nDAIORLANDO\r\nDAJFL\r\nDAK32826-5965 \r\nDAQS321008233420\r\nDARE   \r\nDAS          \r\nDAT     \r\nDBA20190829\r\nDBB19810115\r\nDBC1\r\nDBD20110710\r\nDBHY         \r\nDAU601\r\nZFZFAREPLACED: 00000000\r\nZFB \r\nZFCX631107115393\r\nZFDMOTORCYCLE ALSO\r\nZFE07-01-11";
        String fileName = Global.pathCombine(folder, "attachment.jpg");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("110700", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
        Assert.assertEquals(0, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
        Assert.assertEquals(-1, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
    }
}

