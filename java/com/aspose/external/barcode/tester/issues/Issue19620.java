package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue-19620.")
public class Issue19620
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue19620");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void recognize_1()
    {
        String fileName = Global.pathCombine(folder, "1.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("08279290001001gaba_qc_therwil@gaba.com", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize_2()
    {
        String fileName = Global.pathCombine(folder, "2.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0715999000100102216472438", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize_3()
    {
        String fileName = Global.pathCombine(folder, "3.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("07163500001001info@hevert.de", reader.getFoundBarCodes()[0].getCodeText());
    }
}

