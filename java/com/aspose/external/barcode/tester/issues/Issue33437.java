//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33437.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="13.02.2013 11:28:50">
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


@Test(description = "Tests for Issue33437.")
public class Issue33437
{
    final String folder = Global.getTestDataFolder("Issues/Issue33437");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testPDF417_Double()
    {
        final String fileName = "how-to-change-pdf417-error-correction-level.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("1234", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("1234", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void testAuspost_0()
    {
        final String fileName = "auspost-0.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.AUSTRALIA_POST);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1187665441", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testAuspost_4()
    {
        final String fileName = "auspost-4.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.AUSTRALIA_POST);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("4504331357", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testAuspost_17()
    {
        final String fileName = "auspost-17.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.AUSTRALIA_POST);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1142746155", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testAuspost_18()
    {
        final String fileName = "auspost-18.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.AUSTRALIA_POST);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1112017161", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testAuspost_26()
    {
        final String fileName = "auspost-26.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.AUSTRALIA_POST);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1113585171", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testAuspost_png()
    {
        String fileName = "australia_post.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.AUSTRALIA_POST);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testOneCode_1()
    {
        final String fileName = "onecode-1.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ONE_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("3157730612439682811668782300800", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testOneCode_2()
    {
        final String fileName = "onecode-2.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ONE_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0206065272835991224200893964420", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testOneCode_5()
    {
        final String fileName = "onecode-5.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ONE_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("8111817383495447920952295106822", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testOneCode_6()
    {
        final String fileName = "onecode-6.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ONE_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("2455289824493637795105814325610", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testOneCode_7()
    {
        final String fileName = "onecode-7.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ONE_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("6012408190474038224262026630953", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testOneCode_8()
    {
        final String fileName = "onecode-8.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ONE_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("2139324879761683115032932485867", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testOneCode_10()
    {
        final String fileName = "onecode-10.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ONE_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0114254229202055575275389851315", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testOneCode_15()
    {
        final String fileName = "onecode-15.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ONE_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("7359708684353931280726874548570", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testOneCode_16()
    {
        final String fileName = "onecode-16.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ONE_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0283273622623635948164150475260", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testOneCode_18()
    {
        final String fileName = "onecode-18.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ONE_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("5116293002242466960642063497324", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testOneCode_20()
    {
        final String fileName = "onecode-20.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ONE_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("7289916429448327511879985175587", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testOneCode_28()
    {
        final String fileName = "onecode-28.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ONE_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("7078690600433486858222673950773", reader.getFoundBarCodes()[0].getCodeText());
    }
}

