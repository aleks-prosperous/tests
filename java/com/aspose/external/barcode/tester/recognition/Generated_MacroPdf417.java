package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Generated_MacroPdf417
{

    private String _folder;

        @BeforeMethod
    public void SetupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Issues");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("MacroPdf417")]
    public void test_Generated_Issue33552_Test1_0_png_MacroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated\\Issue33552_Test1_0.png"), DecodeType.MACRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("code-1", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("1", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
            Assert.assertEquals(1, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
            Assert.assertEquals(4, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
        }
    }

        @Test
        //[Category("MacroPdf417")]
    public void test_Generated_Issue33552_Test1_1_png_MacroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated\\Issue33552_Test1_1.png"), DecodeType.MACRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("code-2", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("1", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
            Assert.assertEquals(2, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
            Assert.assertEquals(4, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
        }
    }

        @Test
        //[Category("MacroPdf417")]
    public void test_Generated_Issue33552_Test1_2_png_MacroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated\\Issue33552_Test1_2.png"), DecodeType.MACRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("code-3", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("1", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
            Assert.assertEquals(3, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
            Assert.assertEquals(4, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
        }
    }

        @Test
        //[Category("MacroPdf417")]
    public void test_Generated_Issue33552_Test1_3_png_MacroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated\\Issue33552_Test1_3.png"), DecodeType.MACRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("code-4", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("1", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
            Assert.assertEquals(4, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
            Assert.assertEquals(4, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
        }
    }

        @Test
        //[Category("MacroPdf417")]
    public void test_Generated_Issue33557_Test1_0_png_MacroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated\\Issue33557_Test1_0.png"), DecodeType.MACRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("code-1", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("1", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
            Assert.assertEquals(1, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
            Assert.assertEquals(4, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
        }
    }

        @Test
        //[Category("MacroPdf417")]
    public void test_Generated_Issue33557_Test1_1_png_MacroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated\\Issue33557_Test1_1.png"), DecodeType.MACRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("code-2", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("1", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
            Assert.assertEquals(2, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
            Assert.assertEquals(4, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
        }
    }

        @Test
        //[Category("MacroPdf417")]
    public void test_Generated_Issue33557_Test1_2_png_MacroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated\\Issue33557_Test1_2.png"), DecodeType.MACRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("code-3", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("1", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
            Assert.assertEquals(3, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
            Assert.assertEquals(4, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
        }
    }

        @Test
        //[Category("MacroPdf417")]
    public void test_Generated_Issue33557_Test1_3_png_MacroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated\\Issue33557_Test1_3.png"), DecodeType.MACRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("code-4", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("1", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
            Assert.assertEquals(4, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
            Assert.assertEquals(4, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
        }
    }

        @Test
        //[Category("MacroPdf417")]
    public void test_Generated_Issue33557_Test2_1_png_MacroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated\\Issue33557_Test2_1.png"), DecodeType.MACRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("codeSomecode", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("12959101", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
            Assert.assertEquals(2, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
            Assert.assertEquals(3, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
        }
    }

        @Test
        //[Category("MacroPdf417")]
    public void test_Generated_Issue33557_Test3_1_png_MacroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated\\Issue33557_Test3_1.png"), DecodeType.MACRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("codeSomecode", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("809100", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
            Assert.assertEquals(2, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
            Assert.assertEquals(3, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
        }
    }

        @Test
        //[Category("MacroPdf417")]
    public void test_Generated_Issue33557_Test4_1_png_MacroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated\\Issue33557_Test4_1.png"), DecodeType.MACRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("codeSomecode", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("7289191", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
            Assert.assertEquals(2, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
            Assert.assertEquals(3, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
        }
    }

        @Test
        //[Category("MacroPdf417")]
    public void test_Generated_Issue33557_Test5_1_png_MacroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated\\Issue33557_Test5_1.png"), DecodeType.MACRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("codeSomecode2", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("1653", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
            Assert.assertEquals(12, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
            Assert.assertEquals(55, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
        }
    }
}
