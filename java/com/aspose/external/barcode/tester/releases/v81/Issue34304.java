package com.aspose.external.barcode.tester.releases.v81;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

@Test
public class Issue34304
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34304");
    final String generatedFolder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue34304");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Issue34304_50bytes_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "50bytes.png"), DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("\0\t\n\r !\"#$%&\'()*+,-./01", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Issue34304_kGlyK_gif_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "kGlyK.gif"), DecodeType.QR);
        String expectedText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ultrices imperdiet nisi sit amet molestie. Sed tincidunt quam nec imperdiet bibendum. Nam condimentum porttitor cursus. Praesent metus erat, viverra et erat dictum, tempus sagittis justo. Donec malesuada dui libero, sit amet gravida metus.";

        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(expectedText, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Issue34304_umlautsAndBytes_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "umlautsAndBytes.png"), DecodeType.QR);
            String expectedText = "ÄÉÖÜßäéöü\0\t\n\r !\"#$%&\'()*+,-./01";
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(expectedText, reader.getFoundBarCodes()[0].getCodeText());
    }
}
