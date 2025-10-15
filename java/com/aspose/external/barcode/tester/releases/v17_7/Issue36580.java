package com.aspose.external.barcode.tester.releases.v17_7;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36580
{
    /**
     * Path to folder with files for testing Issue36580.
     */
    private String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36580");

    /**
     * Prepares to run these tests
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testReadDataMatrix1()
    {
        String fileName = Global.pathCombine(folder, "1_lzw.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0278070100002370144", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testReadDataMatrix1_WithAllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "1_lzw.tif");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0278070100002370144", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testReadDataMatrix2()
    {
        String fileName = Global.pathCombine(folder, "2_lzw.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0278070100002371144", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testReadDataMatrix4()
    {
        String fileName = Global.pathCombine(folder, "4_lzw.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0278070100002372144", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testReadDataMatrix5()
    {
        String fileName = Global.pathCombine(folder, "5_lzw.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0278070100002373144", reader.getFoundBarCodes()[0].getCodeText());
    }
}
