package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue28448.")
public class Issue28448
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue28448");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void test300dpi()
    {
        String fileName = Global.pathCombine(folder, "ga_edit_300dbi.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            reader.getQualitySettings().setXDimension( XDimensionMode.SMALL);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2-CERTIFICATIONS", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test600dpi()
    {
        String fileName = Global.pathCombine(folder, "ga_edit_600dpi.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2-CERTIFICATIONS", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test300dpiNoEdit()
    {
        String fileName = Global.pathCombine(folder, "ga_noedit_300dpi.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            reader.getQualitySettings().setXDimension( XDimensionMode.SMALL);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2-CERTIFICATIONS", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

