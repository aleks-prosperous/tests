package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33786.")
public class Issue33786
{
    String folder = Global.getIssuesTestImagePath(this.getClass().getSimpleName());

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testAus()
    {
        String fileName = Global.pathCombine(folder, "AustraliaPostDomesticEParcel.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.AUSTRALIAN_POSTE_PARCEL);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("99700160DJS123456701021502000", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testAusCode128()
    {
        String fileName = Global.pathCombine(folder, "AustraliaPostDomesticEParcel.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.AUSTRALIAN_POSTE_PARCEL, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("99700160DJS123456701021502000", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testAllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "AustraliaPostDomesticEParcel.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("99700160DJS123456701021502000", reader.getFoundBarCodes()[0].getCodeText());
    }
}

