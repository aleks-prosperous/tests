package com.aspose.external.barcode.tester.releases.v23_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue37518
{
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue37518");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_2d_databar_mcropdf_417_1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "2d-databar-mcropdf-417-1.jpg"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("DGFGG453345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }


    @Test
    public void test_2d_databar_mcropdf_417_2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "2d-databar-mcropdf-417-2.jpg"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("DGFGG453345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }


    @Test
    public void test_Micro_PDF417_Version()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Micro PDF417 Version.gif"), DecodeType.MICRO_PDF_417);
        {
            List<String> codetexts = new ArrayList<>();
            Assert.assertEquals(4, reader.readBarCodes().length);
            for(BarCodeResult result : reader.getFoundBarCodes())
                codetexts.add(result.getCodeText());

            Assert.assertTrue(codetexts.contains("ABCDEFGHIJKLMNOPQRSTUV"));
            Assert.assertTrue(codetexts.contains("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCD"));
            Assert.assertTrue(codetexts.contains("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMN"));
            Assert.assertTrue(codetexts.contains("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZAB"));
        }
    }

    @Test
    public void test_Columns_1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Columns_1.png"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUV", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Columns_2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Columns_2.png"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCD", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Columns_3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Columns_3.png"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMN", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Columns_4()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Columns_4.png"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZAB", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_micro_pdf417_o()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "micro-pdf417-o.jpg"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("This is a MicroPDF417 by TEC-IT", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
