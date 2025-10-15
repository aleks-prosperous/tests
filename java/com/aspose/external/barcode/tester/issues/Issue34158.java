package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Issue34158
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34158");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Issue34158_sample_new_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "sample_new.jpg"), DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            List<String> actualTexts = new ArrayList<String>();
            List<BarCodeRegionParameters> actualRegions = new ArrayList<BarCodeRegionParameters>();
            for(BarCodeResult result : reader.readBarCodes())
            {
                actualTexts.add(result.getCodeText());
                actualRegions.add(result.getRegion());
            }

            String[] expectedTexts = new String[4];
            expectedTexts[0] = "B16-4";
            expectedTexts[1] = "D16-4";
            expectedTexts[2] = "A16-4";
            expectedTexts[3] = "C16-4";

            CollectionAssert.areEquivalent(expectedTexts, actualTexts, " File 'Issue34158\\sample_new.jpg': Expected and actual collections of code texts do not meet requirements.");

            List<Point[]> lExpectedRegions = new ArrayList<>(); {
            lExpectedRegions.add(new Point[]{ new Point(677, 1102), new Point(768, 1102), new Point(768, 1116), new Point(677, 1116) });

            lExpectedRegions.add(new Point[]{ new Point(5, 1006), new Point(19, 1006), new Point(19, 1097), new Point(5, 1097)});
                                lExpectedRegions.add(new Point[]{ new Point(24, 5), new Point(115, 5), new Point(115, 19), new Point(24, 19)});
                                lExpectedRegions.add(new Point[]{ new Point(773, 24), new Point(787, 24), new Point(787, 115), new Point(773, 115)});
            };

            TestExternalHelper.checkBarcodesRegionMatching(actualRegions.get(actualTexts.indexOf("C16-4")), lExpectedRegions.get(0), 0.8);
            TestExternalHelper.checkBarcodesRegionMatching(actualRegions.get(actualTexts.indexOf("B16-4")), lExpectedRegions.get(1), 0.8);
            TestExternalHelper.checkBarcodesRegionMatching(actualRegions.get(actualTexts.indexOf("A16-4")), lExpectedRegions.get(2), 0.8);
            TestExternalHelper.checkBarcodesRegionMatching(actualRegions.get(actualTexts.indexOf("D16-4")), lExpectedRegions.get(3), 0.8);
        }
        System.out.println("Test for \"Issue34158\\sample_new.jpg\" has completed successfully.");
    }
}