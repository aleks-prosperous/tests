package com.aspose.external.barcode.tester.releases.v18_3;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36814
{
    /**
     * <p>
     * Path to folder with files for testing Issue36748.
     * </p>
     */
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36814");

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test17209657638pdfCut()
    {
        String fileName = folder + "17209657638_page1_cut.png";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
    }

    @Test
    public void test17230578692pdfCut()
    {
        String fileName = folder + "17230578692_page1_cut.png";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
    }

    @Test
    public void test17234582779pdfCut()
    {
        String fileName = folder + "17234582779_page1_cut.png";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
    }

    @Test
    public void test17234582779pdfCutEdited()
    {
        String expectedMessage = "WellcarePROD0000079861TPC3";
        String fileName = folder + "17234582779_page1_cut_edited.png";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(expectedMessage, reader.getFoundBarCodes()[0].getCodeText());
    }
}
