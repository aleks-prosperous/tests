package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33359.")
public class Issue33359
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33359");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void attempt1()
    {
        String fileName = Global.pathCombine(folder, "IMG2.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("MZ2163428", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void attempt2()
    {
        String fileName = Global.pathCombine(folder, "3.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("ABCDEF", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void attempt3()
    {
        String fileName = Global.pathCombine(folder, "tmp.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("ABCDEF", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void attempt4()
    {
        String fileName = Global.pathCombine(folder, "tmp.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("ABCDEF", reader.getFoundBarCodes()[0].getCodeText());
    }
}

