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


/**
 * <p>
 * Tests Issue34041 tests. Can't read Code128 barcode from JPG image
 * </p>
 */
@Test(description = "Tests for Issue34041.")
public class Issue34041
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34041");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Tests recogntion with symbology Code128 (the main test)
     * </p>
     */
    @Test
    public void testRecognitionOriginal()
    {
        String fileName = Global.pathCombine(folder, "4f529905-c796-4d2d-8631-24383b07c123.jpg");

        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighQuality());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("00100  ROM000077212201114004071441", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Tests recogntion with symbology Code128.
     * </p>
     */
    @Test
    public void testRecognitionCut()
    {
        String fileName = Global.pathCombine(folder, "cut.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighQuality());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("00100  ROM000077212201114004071441", reader.getFoundBarCodes()[0].getCodeText());
    }
}

