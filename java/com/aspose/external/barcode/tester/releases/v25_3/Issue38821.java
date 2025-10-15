package com.aspose.external.barcode.tester.releases.v25_3;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.licensing.LicenseType;
import com.aspose.external.barcode.tester.helpers.data.CodetextWithType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

public class Issue38821
{
    static final String Folder = Global.getTestDataFolder("Issues/Issue38821");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_FakeEan8Recognition()
    {
        String fileName = Global.pathCombine(Folder, "barcode_rasterized_alt.png.trimmed.png");
        CodetextWithType[] expectedResults = new CodetextWithType[] {
                new CodetextWithType(DecodeType.DATA_MATRIX, "21061374"),
                new CodetextWithType(DecodeType.EAN_13, "8700216004718")
        };
        TestExternalHelper.checkForFakeBarcodes(fileName, expectedResults);
    }
}
