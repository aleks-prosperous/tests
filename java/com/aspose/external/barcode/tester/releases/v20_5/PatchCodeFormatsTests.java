package com.aspose.external.barcode.tester.releases.v20_5;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.PatchFormat;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;

public class PatchCodeFormatsTests
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void PatchCode_A4Page_With_QR_Test()
    {
        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.PATCH_CODE, "Patch I");
        {
            bg.getParameters().getBarcode().getPatchCode().setPatchFormat(PatchFormat.A4);
            bg.getParameters().getBarcode().getPatchCode().setExtraBarcodeText("ExtraBarcodeText");
            BufferedImage img = bg.generateBarCodeImage();
            BarCodeReader r = new BarCodeReader(img);
            {
                BarCodeResult[] found = r.readBarCodes();
                Assert.assertEquals(5, found.length);
                Assert.assertEquals("Patch I", found[0].getCodeText());
                Assert.assertEquals("ExtraBarcodeText", found[2].getCodeText());
            }
        }
    }

    @Test
    public void PatchCode_A4LandscapePage_With_QR_Test()
    {
        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.PATCH_CODE, "Patch I");
        {
            bg.getParameters().getBarcode().getPatchCode().setPatchFormat(PatchFormat.A4_LANDSCAPE);
            bg.getParameters().getBarcode().getPatchCode().setExtraBarcodeText("ExtraBarcodeText");
            BufferedImage img = bg.generateBarCodeImage();
            BarCodeReader r = new BarCodeReader(img);
            {
                BarCodeResult[] found = r.readBarCodes();
                Assert.assertEquals(5, found.length);
                Assert.assertEquals("Patch I", found[0].getCodeText());
                Assert.assertEquals("ExtraBarcodeText", found[2].getCodeText());
            }
        }
    }

    @Test
    public void PatchCode_USLetterPage_With_QR_Test()
    {
        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.PATCH_CODE, "Patch I");
        {
            bg.getParameters().getBarcode().getPatchCode().setPatchFormat(PatchFormat.US_LETTER);
            bg.getParameters().getBarcode().getPatchCode().setExtraBarcodeText("ExtraBarcodeText");
            BufferedImage img = bg.generateBarCodeImage();
            BarCodeReader r = new BarCodeReader(img);
            {
                BarCodeResult[] found = r.readBarCodes();
                Assert.assertEquals(5, found.length);
                Assert.assertEquals("Patch I", found[0].getCodeText());
                Assert.assertEquals("ExtraBarcodeText", found[2].getCodeText());
            }
        }
    }
    
    @Test
    public void PatchCode_A4Page_With_NoQR_Test()
    {
        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.PATCH_CODE, "Patch I");
        {
            bg.getParameters().getBarcode().getPatchCode().setPatchFormat(PatchFormat.A4);
            bg.getParameters().getBarcode().getPatchCode().setExtraBarcodeText("");
            BufferedImage img = bg.generateBarCodeImage();
            BarCodeReader r = new BarCodeReader(img);
            {
                BarCodeResult[] found = r.readBarCodes();
                Assert.assertEquals(4, found.length);
                Assert.assertEquals("Patch I", found[0].getCodeText());
            }
        }
    }
}
