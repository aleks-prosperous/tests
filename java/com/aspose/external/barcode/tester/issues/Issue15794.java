package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue15794.")
public class Issue15794
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue15794");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void IMG_0041JPG()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "IMG_0041.JPG"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("8005415040124", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void IMG_0041JPG_Cutted_Rotated()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "IMG_0041_cutted_rotated.png"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("8005415040124", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void IMG_0041JPG_Cutted_Rotated2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "IMG_0041_cutted_rotated2.png"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("8005415040124", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void IMG_0045JPG()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "IMG_0045.JPG"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0087752011362", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void IMG_0045JPG_Cutted_Rotated()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "IMG_0045_cutted_rotated.png"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0087752011362", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

