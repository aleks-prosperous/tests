package com.aspose.external.barcode.tester.releases.v80;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue36196
{

    private String _folder;

        @BeforeMethod
    public void setupTestFixture()
    {
        this._folder = Global.getIssuesTestImagePath("Issue36196");
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Issue36196_DOC00000010_tif_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DOC00000010.tif"), DecodeType.CODE_128);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            List<String> actualTexts = new ArrayList<>();
            for(BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[] { "AZ000000014946" , "AZ000000014942", "AZ000000014933" };
            //expectedTexts[3] = "AZ000000014942";

            for(String expectedText : expectedTexts)
            {
                Assert.assertTrue(actualTexts.contains(expectedText));
            }
        }
        System.out.println("Test for \"Issue36196\\DOC00000010.tif\" has completed successfully.");
    }
}
