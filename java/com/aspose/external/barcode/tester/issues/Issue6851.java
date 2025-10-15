//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue6851.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="17.10.2013 10:29:33">
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
import utils.TestExternalHelper;

import java.awt.*;


@Test(description = "Tests for Issue6851.")
public class Issue6851
{
    private final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Postnet")]
    public void test_Issue6851__7evdebarcode_5_jpg_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue6851\\%7evdebarcode_5.jpg"), DecodeType.POSTNET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("06759340153", reader.getFoundBarCodes()[0].getCodeText());
            String actualChkSum = reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum();
            Assert.assertEquals(actualChkSum, "7", "Actual and expected check sum comparison: @\'Issue6851\\%7evdebarcode_5.jpg\' failed" +
                    ". ");
            Point[] expectedPoints = new Point[4];
            expectedPoints[0] = new Point(23, 7);
            expectedPoints[1] = new Point(23, 44);
            expectedPoints[2] = new Point(884, 7);
            expectedPoints[3] = new Point(884, 44);
            TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.95);
        }
    }

        @Test
        //[Category("Postnet")]
    public void test_Issue6851__7evdebarcode_5edited_jpg_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue6851\\%7evdebarcode_5-edited.jpg"), DecodeType.POSTNET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("06759340153", reader.getFoundBarCodes()[0].getCodeText());
            String actualChkSum = reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum();
            Assert.assertEquals(actualChkSum, "7", "Actual and expected check sum comparison: @\'Issue6851\\%7evdebarcode_5-edited.jpg\'" +
                    " failed. ");
            Point[] expectedPoints = new Point[4];
            expectedPoints[0] = new Point(23, 7);
            expectedPoints[1] = new Point(23, 44);
            expectedPoints[2] = new Point(884, 7);
            expectedPoints[3] = new Point(884, 44);
            TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.95);
        }
    }
}

