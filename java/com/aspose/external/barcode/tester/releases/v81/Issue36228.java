package com.aspose.external.barcode.tester.releases.v81;

import com.aspose.barcode.auxiliary.Global;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;

import java.util.ArrayList;
import java.util.List;

public class Issue36228
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue36228_123456A7_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36228\\123456A7.png"), DecodeType.AZTEC);
        {
            List<String> actualTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[7];
            expectedTexts[0] = "11111";
            expectedTexts[1] = "22222";
            expectedTexts[2] = "33333";
            expectedTexts[3] = "44444";
            expectedTexts[4] = "55555";
            expectedTexts[5] = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
            expectedTexts[6] = "77777";

            CollectionAssert.areEquivalent(expectedTexts, actualTexts, " File 'Issue36228\\123456A7.png': Expected and actual collections of code texts do not meet requirements.");
        }
        System.out.println("Test for \"Issue36228\\123456A7.png\" has completed successfully.");
    }
}
