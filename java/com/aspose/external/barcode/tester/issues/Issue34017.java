package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


/**
 * <p>
 * Tests Issue34017 tests.
 * </p>
 */
@Test(description = "Tests for Issue34017.")
public class Issue34017
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34017");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testRecognition_imgTest_jpg()
    {
        String fileName = Global.pathCombine(folder, "imgTest.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("02000003877599", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testRecognitionCutted()
    {
        String fileName = Global.pathCombine(folder, "imgTest_cuttted.png");

        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("02000003877599", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testRecognitionCuttedBig()
    {
        String fileName = Global.pathCombine(folder, "imgTest_cuttedBid.jpg");

        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("02000003877599", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testRecognitionWithMedianSmoothing()
    {
        String fileName = Global.pathCombine(folder, "imgTest.jpg");

        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("02000003877599", reader.getFoundBarCodes()[0].getCodeText());
    }
}

