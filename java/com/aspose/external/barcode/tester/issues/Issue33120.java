package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33120.")
public class Issue33120
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33120");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void demo()
    {
        String fileName = Global.pathCombine(folder, "doc20120105155223.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("-A69751", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void cutted()
    {
        String fileName = Global.pathCombine(folder, "doc20120105155223_cutted.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("-A69751", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void cutted_Big()
    {
        String fileName = Global.pathCombine(folder, "doc20120105155223_cutted_big.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("-A69751", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void cutted_Big3()
    {
        String fileName = Global.pathCombine(folder, "doc20120105155223_cutted_verybig.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("-A69751", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void gray()
    {
        String fileName = Global.pathCombine(folder, "doc20120105155223_gray.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("-A69751", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void edited()
    {
        String fileName = Global.pathCombine(folder, "doc20120105155223_edited.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("-A69751", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void converted()
    {
        String fileName = Global.pathCombine(folder, "doc20120105155223.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("-A69751", reader.getFoundBarCodes()[0].getCodeText());
    }
}

