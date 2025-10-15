//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33456.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="13.02.2013 11:28:50">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;


@Test(description = "Tests for Issue33456.")
public class Issue33456
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33456");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }


    @Test
    public void testSSCC18_Generator_1() throws IOException
    {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.SSCC_18);
        {
            gen.setCodeText("10027815890108488");
            gen.save(ms, BarCodeImageFormat.PNG);
        }

        final BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.SSCC_18);
        reader.getBarcodeSettings().setStripFNC(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(00)" + "10027815890108488" + "2", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testSSCC18_Generator_2() throws IOException
    {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.SSCC_18);
        {
            gen.setCodeText("00017815890108488");
            gen.save(ms, BarCodeImageFormat.PNG);
        }

        final BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.SSCC_18);
        reader.getBarcodeSettings().setStripFNC(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(00)" + "00017815890108488" + "6", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testSSCC18_Image_1()
    {
        String path = Global.pathCombine(folder, "diagram_sscc18.png");
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.SSCC_18);

        reader.getBarcodeSettings().setStripFNC(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(00)" + "001234560000000018", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testSSCC18_Image_2()
    {
        String path = Global.pathCombine(folder, "sscc-barcode.gif");
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.SSCC_18);
        reader.getBarcodeSettings().setStripFNC(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(00)" + "007189085627231896", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testSCC14_Generator_1() throws IOException
    {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.SCC_14);
        {
            gen.setCodeText("1061414100041");
            gen.save(ms, BarCodeImageFormat.PNG);
        }

        final BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.SSCC_18);
        reader.getBarcodeSettings().setStripFNC(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)" + "1061414100041" + "5", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testSCC14_Generator_2() throws IOException
    {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.SCC_14);
        {
            gen.setCodeText("1234567890123");
            gen.save(ms, BarCodeImageFormat.PNG);
        }

        final BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.SCC_14);
        reader.getBarcodeSettings().setStripFNC(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)" + "1234567890123" + "1", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testSCC14_Image_1()
    {
        String path = Global.pathCombine(folder, "scc14.gif");
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.SCC_14);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        reader.getBarcodeSettings().setStripFNC(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)" + "10614141000415", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testSCC14_Image_2()
    {
        String path = Global.pathCombine(folder, "page25_1.gif");
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.SCC_14);
        reader.getBarcodeSettings().setStripFNC(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)" + "12345678901231", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testEAN14_Generator_1() throws IOException
    {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.EAN_14);
        {
            gen.setCodeText("0500123456754");
            gen.save(ms, BarCodeImageFormat.PNG);
        }

        final BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.EAN_14);
        reader.getBarcodeSettings().setStripFNC(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)" + "0500123456754" + "8", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testEAN14_Generator_2() throws IOException
    {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.EAN_14);
        {
            gen.setCodeText("3001234567890");
            gen.save(ms, BarCodeImageFormat.PNG);
        }

        final BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.EAN_14);
        reader.getBarcodeSettings().setStripFNC(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)" + "3001234567890" + "6", reader.getFoundBarCodes()[0].getCodeText());

    }

    @Test
    public void testEAN14_Image_1()
    {
        String path = Global.pathCombine(folder, "ean14.png");
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.EAN_14);
        reader.getBarcodeSettings().setStripFNC(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)" + "05001234567890", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testEAN14_Image_2()
    {
        String path = Global.pathCombine(folder, "ean14.gif");
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.EAN_14);
        reader.getBarcodeSettings().setStripFNC(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)" + "12345678901231", reader.getFoundBarCodes()[0].getCodeText());
    }
}

