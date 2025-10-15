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
 * Tests Issue34072 tests. Incorrect recognition of Pharmacode from the JPG image
 * </p>
 */
@Test(description = "Tests for Issue34072.")
public class Issue34072
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34072");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Test recognition of the "good" image
     * </p>
     */
    @Test
    public void test1()
    {
        final String fileName = "test1.jpg";
        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.PHARMACODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("4506", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Test recgnition of big barcode picture
     * </p>
     */
    @Test
    public void test2()
    {
        final String fileName = "test4.jpg";
        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.PHARMACODE);
        reader.setQualitySettings(QualitySettings.getHighQuality());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("4506", reader.getFoundBarCodes()[0].getCodeText());
    }
}

