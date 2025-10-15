//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33557.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="07.06.2012 16:36:47">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue-33557.")
public class Issue33557
{
    @BeforeMethod
    public void setUp(Method testMethod)
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test1() throws IOException
    {
        List<ByteArrayOutputStream> msList = new ArrayList<ByteArrayOutputStream>();

        final int nSize = 4;
        String[] lstCodeText = new String[]{"code-1", "code-2", "code-3", "code-4"};
        final String strFileID = "1";

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417);
        for (int nCount = 1; nCount <= nSize; nCount++)
        {
            gen.setCodeText(lstCodeText[nCount - 1]);
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(Integer.parseInt(strFileID));
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentID(nCount);
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentsCount(nSize);

            msList.add(new ByteArrayOutputStream());
            gen.save(msList.get(msList.size() - 1), BarCodeImageFormat.PNG);
        }

        for (int i = 0; i < msList.size(); ++i)
        {
            final BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(msList.get(i).toByteArray()), DecodeType.MACRO_PDF_417);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(("code-" +( i + 1)), reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("1", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
            Assert.assertEquals(i + 1, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
            Assert.assertEquals(msList.size(), reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
        }
    }

    @Test
    public void test2() throws IOException
    {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417);
        {
            gen.setCodeText("codeSomecode");
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(15900);
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentID(2);
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentsCount(3);
            gen.save(ms, BarCodeImageFormat.PNG);
        }
        final BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.MACRO_PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("codeSomecode", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("15900", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
        Assert.assertEquals(2, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
        Assert.assertEquals(3, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
    }

    @Test
    public void test3() throws IOException
    {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417);
        {
            gen.setCodeText("codeSomecode");
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(899);
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentID(2);
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentsCount(3);
            gen.save(ms, BarCodeImageFormat.PNG);
        }
        final BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.MACRO_PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("codeSomecode", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("899", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
        Assert.assertEquals(2, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
        Assert.assertEquals(3, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
    }

    @Test
    public void test4() throws IOException
    {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417);
        {
            gen.setCodeText("codeSomecode");
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(8990);
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentID(2);
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentsCount(3);
            gen.save(ms, BarCodeImageFormat.PNG);
        }
        final BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.MACRO_PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("codeSomecode", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("8990", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
        Assert.assertEquals(2, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
        Assert.assertEquals(3, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
    }

    @Test
    public void test5() throws IOException
    {
        ByteArrayOutputStream ms = new ByteArrayOutputStream();

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417);
        {
            gen.setCodeText("codeSomecode2");
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(1753);
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentID(12);
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentsCount(55);
            gen.save(ms, BarCodeImageFormat.PNG);
        }
        final BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(ms.toByteArray()), DecodeType.MACRO_PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("codeSomecode2", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("1753", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
        Assert.assertEquals(12, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
        Assert.assertEquals(55, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
    }
}

