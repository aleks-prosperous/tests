package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33511.")
public class Issue33511
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33511");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test1AllTypes()
    {
        String fileName = Global.pathCombine(folder, "tmpbarcode1.png");
        final BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("MS9XU0QvMDMoRSk7OztBQTBQOTlYMDE4OTs7O0ZTOzs7MS9XU0QvMDMoRSk7OztOOzs7Mzs7O2FiYzs7Ow==", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test1()
    {
        String fileName = Global.pathCombine(folder, "tmpbarcode1.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("MS9XU0QvMDMoRSk7OztBQTBQOTlYMDE4OTs7O0ZTOzs7MS9XU0QvMDMoRSk7OztOOzs7Mzs7O2FiYzs7Ow==", reader.getFoundBarCodes()[0].getCodeText());
    }
}

