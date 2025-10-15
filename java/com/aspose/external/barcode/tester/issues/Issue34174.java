package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue34174
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34174");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void test_Issue34174_compact01_png_CompactPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "compact01.png"), DecodeType.COMPACT_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Issue34174_compactRotated_01_png_CompactPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "compactRotated_01.png"), DecodeType.COMPACT_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Issue34174_compactRotated_02_png_CompactPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "compactRotated_02.png"), DecodeType.COMPACT_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Issue34174_compactRotated_03_png_CompactPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "compactRotated_03.png"), DecodeType.COMPACT_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Issue34174_PDF417Trunc_jpg_CompactPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "PDF417-Trunc.jpg"), DecodeType.COMPACT_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789012345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
