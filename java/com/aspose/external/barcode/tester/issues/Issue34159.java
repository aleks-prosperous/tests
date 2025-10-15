package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Issue34159
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34159");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue34159SampleNewJpgCode128()
    {
        BarCodeReader reader = new BarCodeReader(folder + "sample_new.jpg", DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        List<String> actualTexts = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
        actualTexts.add(result.getCodeText());

        String[] expectedTexts = new String[4];
        expectedTexts[0] = "B16-4";
        expectedTexts[1] = "D16-4";
        expectedTexts[2] = "A16-4";
        expectedTexts[3] = "C16-4";

        for (String text : expectedTexts)
        {
            Assert.assertTrue(actualTexts.contains(text));
        }
    }
}
