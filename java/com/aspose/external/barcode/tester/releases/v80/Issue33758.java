//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33725.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.releases.v80;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(description = "Tests for Issue33758.")
public class Issue33758
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33758");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void Ideal1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "AustraliaPost_Ideal.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Ideal2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "AustraliaPost_Rotated90.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Ideal3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "OneCode_Ideal.png"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567094987654321", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Ideal4()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "Planet_Ideal.png"), DecodeType.PLANET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("07336", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Ideal5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "PostNet_Ideal.png"), DecodeType.POSTNET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Ideal6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "RM4SCC_Ideal.png"), DecodeType.RM_4_SCC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("258369AA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Percent1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "AustraliaPost_1.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Percent2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "OneCode_1.bmp"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("24000555555000000001990105432", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Percent3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "Planet_1.png"), DecodeType.PLANET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678901", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Percent4()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "RM4SCC_1.jpg"), DecodeType.RM_4_SCC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("NN136EH3A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Percent5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "RM4SCC_2.jpg"), DecodeType.RM_4_SCC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("N101HU9Z", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}



