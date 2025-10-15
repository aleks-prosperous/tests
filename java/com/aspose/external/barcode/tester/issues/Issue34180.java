package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Issue34180
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34180");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue34180201505211256000160001tifPlanet()
    {
        BarCodeReader reader = new BarCodeReader(folder + "20150521125600016_0001.tif", DecodeType.PLANET);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        List<String> actualTexts = new ArrayList<>();
        for(BarCodeResult result : reader.readBarCodes())
        actualTexts.add(result.getCodeText());

        String[] expectedTexts = new String[2];
        expectedTexts[0] = "990000837284";
        expectedTexts[1] = "990000837284";

        Assert.assertTrue(actualTexts.contains(expectedTexts[0]) && actualTexts.contains(expectedTexts[1]));
    }
}
