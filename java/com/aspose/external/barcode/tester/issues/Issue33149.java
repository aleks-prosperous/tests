package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33149.")
public class Issue33149
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33149");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testFile1()
    {
        String fileName = Global.pathCombine(folder, "bmp.bmp");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SFM_007_P_P_00050395", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testFile2()
    {
        String fileName = Global.pathCombine(folder, "pdf.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SFM_007_P_P_00050395", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testFile3()
    {
        String fileName = Global.pathCombine(folder, "pdf90.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SFM_007_P_P_00050395", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testFile4()
    {
        String fileName = Global.pathCombine(folder, "1_1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SFM_007_P_P_00050395", reader.getFoundBarCodes()[0].getCodeText());
    }
}

