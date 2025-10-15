package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33857.")
public class Issue33857
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33857");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testMainImage()
    {
        String fileName = Global.pathCombine(folder, "saved109.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("McCode={MATR=290964\nUNIDADE=20\nNOME=ALEXANDRE FERREIRA SENNA}", reader.getFoundBarCodes()[0].getCodeText());
    }
}

