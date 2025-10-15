package com.aspose.external.barcode.tester.releases.v17_12;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.external.barcode.tester.helpers.RecognitionHelper;
import com.aspose.external.barcode.tester.helpers.data.CodetextWithType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import java.io.File;

public class Issue36740
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36740");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testFakesFound1D()
    {
        RecognitionHelper.testRecognized(folder, "problematic_file.tiff", TestExternalHelper.Types1D, new CodetextWithType[] { }, QualitySettings.getNormalQuality(),
            ChecksumValidation.DEFAULT, false, true, false, true);
    }
}
