package com.aspose.external.barcode.tester.releases.v20_5;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class BARCODEJAVA928
{
    /// <summary>
    /// Path to folder with files for testing Issue37413.
    /// </summary>
    private String Folder = Global.getBarcodeJavaIssuesTestImagePath("BARCODEJAVA928");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String documentPath = Folder + File.separator + "test_image.jpg";
        final BarCodeReader reader = new BarCodeReader(documentPath, DecodeType.getAllSupportedTypesArray());
        BarCodeResult[] barcodes = reader.readBarCodes();
        Assert.assertEquals(barcodes.length, 1);
        Assert.assertEquals(barcodes[0].getCodeText(), "John Smith");
    }
}
