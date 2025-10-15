package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Issue33938
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33938");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue33938TifCode39StandardQR()
    {
        BarCodeReader reader = new BarCodeReader(folder + "3.tif", DecodeType.scanSets(DecodeType.CODE_39, DecodeType.QR));
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        List<String> actualTexts = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

        String[] expectedTexts = new String[2];
        expectedTexts[0] = "SEPARATOR";
        expectedTexts[1] = "CapitalStream Document ID: 3372291970265819248, Coversheet Indicator: Y, Document Source System: CS";

        CollectionAssert.isSubsetOf(actualTexts, expectedTexts, " File 'Issue33938\3.tif': Expected and actual collections of code texts do not meet requirements.");
    }
}
