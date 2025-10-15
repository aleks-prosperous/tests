package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import com.aspose.barcode.logger.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.lang.reflect.Method;


/**
 * <p>
 * Tests Issue34073 tests. Multiple incorrect recognitions of a single Pharmacode
 * </p>
 */
@Test(description = "Tests for Issue34073.")
public class Issue34073
{
    /**
     * <p>
     * Path to generatedFolder with files for testing.
     * </p>
     */
    private static final String folder = Global.
            getTestDataFolder("Issues" + File.separator + "Issue34073");

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @AfterMethod
    public void afterFinish(Method testMethod)
    {
        Logger.methodFinished(getClass().getName() + "." + testMethod.getName());
    }

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Tests recognition of pharmacode picture
     * </p>
     */
    @Test
    public void testPharmacode()
    {
        final String fileName = "test5.jpg";
        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.PHARMACODE);
        reader.setQualitySettings(QualitySettings.getHighQuality());
        reader.getQualitySettings().setXDimension(XDimensionMode.LARGE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("4506", reader.getFoundBarCodes()[0].getCodeText());
    }
}

