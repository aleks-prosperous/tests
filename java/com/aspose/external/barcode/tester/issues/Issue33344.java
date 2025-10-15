package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33344.")
public class Issue33344
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33344");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void SecondPictureTest()
    {
        String fileName = Global.pathCombine(folder, "input_rotated.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        {
                String expected = "REF:|EX:2eb26de3-e4fe-436b-a0b2-e1c08f89882a|[B1]|X:65;Optimisation:OR;U:UK;CST:Reg 28;Regional:RUC;AssetExposures:AEIP;PV:PI;AP:ApAct|CGEM:5.45%;CNTF:11.29%;FEQF:11.29%;INAW:13.18%;RBFB8:17.82%;REB2:13.15%;PDMCD:10.00%;SBFR:17.82%;|1 of 1(100.0000%)|DFV:WEInt_SA_20120623|SW:1.0.0.1869|CS:8460e54e";
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(expected, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_a()
    {
        String fileName = Global.pathCombine(folder, "pdf417_a.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("a", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_a_edited()
    {
        String fileName = Global.pathCombine(folder, "pdf417_a_edited.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("a", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_a_1error()
    {
        String fileName = Global.pathCombine(folder, "pdf417_a_edited_1error.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("a", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_pdf_demo_edited()
    {
        String fileName = Global.pathCombine(folder, "pdf_demo_edited.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_pdf_demo()
    {
        String fileName = Global.pathCombine(folder, "pdf_demo.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testdut0hztd_bd4_rotated_jpg()
    {
        String fileName = Global.pathCombine(folder, "dut0hztd.bd4_rotated.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        {
                String expected = "REF:PP022531726|EX:a1a9a8aa-9444-4a09-86bc-f6d6351a7fc8|[B1]|X:70;Optimisation:OR;U:UK;CST:Reg 28;Regional:RReSA;AssetExposures:AEMP;PV:PM;AP:ApAct|CGEM:2.00%;CTTCB2:14.07%;FEQF:13.53%;INAW:8.00%;RMGF:11.17%;RMEC:15.07%;PDMCD:10.00%;PEPTF:15.00%;SBFR:11.16%;|1 of 1(100.0000%)|DFV:WEInt_SA_20120623|SW:1.0.0.1731|CS:a57a68fb";
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(expected, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testFaxB90_tif()
    {
        String fileName = Global.pathCombine(folder, "FaxB90.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("C1112,345829,9/3/2011", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testReaderPDF417_png()
    {
        String fileName = Global.pathCombine(folder, "ReaderPDF417.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Barcode Software Solutions Team - We will be happy to help you in your project!", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

