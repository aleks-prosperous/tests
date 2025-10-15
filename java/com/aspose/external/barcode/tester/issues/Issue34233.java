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

public class Issue34233
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34233");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue34233Code16KPngAllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(folder + "Code16K.png", DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("test123", reader.getFoundBarCodes()[0].getCodeText());
    }
}
