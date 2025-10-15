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

public class Issue34206
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34206");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue3420633453Image1TIFCode128()
    {
        BarCodeReader reader = new BarCodeReader(folder + "33453_Image+1.TIF", DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighQuality());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        String actualText = reader.getFoundBarCodes()[0].getCodeText();
        Assert.assertEquals("H00123192899A", actualText, "Expected and Actual text comparison: @\'Issue34206\\33453_Image+1.TIF\' failed. ");
        System.out.println("Test for \"Issue34206\\33453_Image+1.TIF\" has completed successfully.");
    }
}
