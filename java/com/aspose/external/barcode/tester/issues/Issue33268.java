//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33268.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="03.07.2012 14:20:27">
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


@Test(description = "Tests for Issue-33268.")
public class Issue33268
{
    final String folder = Global.getTestDataFolder("Issues/Issue33268");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String fileName = Global.pathCombine(folder, "barcode.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)24012345678905", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test2()
    {
        String fileName = Global.pathCombine(folder, "barcode2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)47733295678906", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test3()
    {
        String fileName = Global.pathCombine(folder, "barcode3.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)98342309582289", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test4()
    {
        String fileName = Global.pathCombine(folder, "GS1DataBarOmnidirectional.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)00614141999996", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test4_Edited()
    {
        String fileName = Global.pathCombine(folder, "GS1DataBarOmnidirectional_edited.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)00614141999996", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test5()
    {
        String fileName = Global.pathCombine(folder, "72481199.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)20012345678909", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testFail1()
    {
        String fileName = Global.pathCombine(folder, "GS1_DataBar_Omnidirectional.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)76123456789008", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testFail2()
    {
        String fileName = Global.pathCombine(folder, "rss14.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)01234567890128", reader.getFoundBarCodes()[0].getCodeText());

    }

    @Test
    public void test_Fail3()
    {
        String fileName = Global.pathCombine(folder, "2200px.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)00075678164125", reader.getFoundBarCodes()[0].getCodeText());

    }
}

