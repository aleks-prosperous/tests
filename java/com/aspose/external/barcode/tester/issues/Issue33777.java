package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33777.")
public class Issue33777
{
    String folder = Global.getIssuesTestImagePath(this.getClass().getSimpleName());

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    //>>>>>>>> #region  Page04

    @Test
    public void testPage04()
    {
        String fileName = Global.pathCombine(folder, "page04_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128, DecodeType.PDF_417);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.NORMAL);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("458836", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("458836", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void testPage04Code128()
    {
        String fileName = Global.pathCombine(folder, "page04_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.NORMAL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("458836", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage04Pdf417()
    {
        String fileName = Global.pathCombine(folder, "page04_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("458836", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage04Pdf417Cutted()
    {
        String fileName = Global.pathCombine(folder, "page04_300dpi_cuttedPdf417.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("458836", reader.getFoundBarCodes()[0].getCodeText());
    }

    //<<<<<<<< #endregion 

    //>>>>>>>> #region  Page56

    @Test
    public void testPage56()
    {
        String fileName = Global.pathCombine(folder, "page56_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128, DecodeType.PDF_417);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.NORMAL);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("458543", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("458543", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void testPage56Code128()
    {
        String fileName = Global.pathCombine(folder, "page56_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.NORMAL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("458543", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage56Pdf417()
    {
        String fileName = Global.pathCombine(folder, "page56_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("458543", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage56Pdf417Cutted()
    {
        String fileName = Global.pathCombine(folder, "page56_300dpi_cuttedPdf417.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("458543", reader.getFoundBarCodes()[0].getCodeText());
    }
    //<<<<<<<< #endregion 

    //>>>>>>>> #region  Page13

    @Test
    public void testPage13()
    {
        String fileName = Global.pathCombine(folder, "page13_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128, DecodeType.PDF_417);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.NORMAL);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("458702", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("458702", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void testPage13Code128()
    {
        String fileName = Global.pathCombine(folder, "page13_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.NORMAL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("458702", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage13Pdf417()
    {
        String fileName = Global.pathCombine(folder, "page13_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("458702", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage13Pdf417Cutted()
    {
        String fileName = Global.pathCombine(folder, "page13_300dpi_cuttedPdf417.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("458702", reader.getFoundBarCodes()[0].getCodeText());
    }
    //<<<<<<<< #endregion 

    //>>>>>>>> #region  Page72

    @Test
    public void testPage72()
    {
        String fileName = Global.pathCombine(folder, "page72_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128, DecodeType.PDF_417);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.NORMAL);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("458317", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("458317", reader.getFoundBarCodes()[1].getCodeText());
    }
    //<<<<<<<< #endregion 

    //>>>>>>>> #region  Page75

    @Test
    public void testPage75()
    {
        String fileName = Global.pathCombine(folder, "page75_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("458377", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("458377", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void testPage75Code128()
    {
        String fileName = Global.pathCombine(folder, "page75_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.NORMAL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("458377", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage75Pdf417()
    {
        String fileName = Global.pathCombine(folder, "page75_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("458377", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage75Pdf417Cutted()
    {
        String fileName = Global.pathCombine(folder, "page75_300dpi_cuttedPdf417.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("458377", reader.getFoundBarCodes()[0].getCodeText());
    }
    //<<<<<<<< #endregion 

    //>>>>>>>> #region  Page88

    @Test
    public void testPage88()
    {
        String fileName = Global.pathCombine(folder, "page88_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128, DecodeType.PDF_417);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.NORMAL);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("458306", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("458306", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void testPage88Code128()
    {
        String fileName = Global.pathCombine(folder, "page88_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.NORMAL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("458306", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage88Pdf417()
    {
        String fileName = Global.pathCombine(folder, "page88_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("458306", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage88Pdf417Cutted()
    {
        String fileName = Global.pathCombine(folder, "page88_300dpi_cuttedPdf417.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("458306", reader.getFoundBarCodes()[0].getCodeText());
    }
    //<<<<<<<< #endregion 

}

