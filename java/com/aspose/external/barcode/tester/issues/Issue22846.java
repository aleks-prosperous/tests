package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue22846.")
public class Issue22846
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue22846");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String fileName = Global.pathCombine(folder, "img008.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("OLS-106", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test(enabled = false)
    public void test2()
    {
        String fileName = Global.pathCombine(folder, "img010.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.setQualitySettings(QualitySettings.getHighQuality());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        //Assert.assertEquals("OLS-1.U", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("OLS-107", reader.getFoundBarCodes()[0].getCodeText());
    }
}

