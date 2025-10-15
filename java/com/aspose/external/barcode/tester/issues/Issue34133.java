package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Issue34133
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34133");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue34133SampleJpgCode128()
    {
        BarCodeReader reader = new BarCodeReader(folder + "sample.jpg", DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        List<String> actualTexts = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
        actualTexts.add(result.getCodeText());

        String[] expectedTexts = new String[4];
        expectedTexts[0] = "C16-4";
        expectedTexts[1] = "B16-4";
        expectedTexts[2] = "A16-4";
        expectedTexts[3] = "D16-4";

        Assert.assertTrue(actualTexts.contains(expectedTexts[0]) && actualTexts.contains(expectedTexts[1]) &&
                actualTexts.contains(expectedTexts[2]) && actualTexts.contains(expectedTexts[3]), " File sample.jpg: Expected and actual collections of code texts do not meet requirements.");
    }
}
