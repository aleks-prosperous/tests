package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.external.barcode.tester.helpers.RecognitionHelper;
import com.aspose.external.barcode.tester.helpers.data.CodetextWithType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue36719
{
    /// <summary>
    /// Path to folder with files for testing.
    /// </summary>
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue36719");

        @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void testNoBarCode()
    {
        RecognitionHelper.testRecognized(Folder, "problematic_file.tiff", DecodeType.ALL_SUPPORTED_TYPES, new CodetextWithType[] { }, QualitySettings.getNormalQuality(),
            ChecksumValidation.DEFAULT, false, true, false, true);
    }
}
