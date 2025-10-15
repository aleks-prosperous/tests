//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33633.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="12.08.2013 10:21:41">
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


@Test(description = "Tests for Issue33633.")
public class Issue33633
{
    final String folder = Global.getTestDataFolder("Issues/Issue33633");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void EAN13Usual()
    {
        String filename = Global.pathCombine(folder, "ean13.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0360002914508", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void EAN13Above()
    {
        String filename = Global.pathCombine(folder, "EAN13Above.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234700000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void EAN13None()
    {
        String filename = Global.pathCombine(folder, "EAN13None.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234700000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void EAN8Usual()
    {
        String filename = Global.pathCombine(folder, "ean8.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("03600023", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void EAN8Above()
    {
        String filename = Global.pathCombine(folder, "EAN8Above.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12347001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void EAN8None()
    {
        String filename = Global.pathCombine(folder, "EAN8None.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12347001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void UPCAUsual()
    {
        String filename = Global.pathCombine(folder, "upca.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("036000291452", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void UPCAAbove()
    {
        String filename = Global.pathCombine(folder, "UPCAAbove.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123470000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void UPCANone()
    {
        String filename = Global.pathCombine(folder, "UPCANone.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123470000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void UPCEUsual()
    {
        String filename = Global.pathCombine(folder, "upce.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("06543217", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void UPCEAbove()
    {
        String filename = Global.pathCombine(folder, "UPCEAbove.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234709", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void UPCENone()
    {
        String filename = Global.pathCombine(folder, "UPCENone.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234709", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

