package com.aspose.external.barcode.tester.releases.v82;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;

import java.util.ArrayList;
import java.util.List;

public class Issue36310
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36310\\00000001F.tif"), DecodeType.DATA_MATRIX);
        {
            List<String> actualTexts = new ArrayList<>();
            for(BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[5];
            expectedTexts[0] = "DMapp1of3";
            expectedTexts[1] = "DI011416000001";
            expectedTexts[2] = "0120000000";
            expectedTexts[3] = "DI011416000001";
            expectedTexts[4] = "DMapp1of3";

            CollectionAssert.isSubsetOf(actualTexts, expectedTexts, " File 'Issue36310\\00000001F.tif': Expected and actual collections of code texts do not meet requirements.");
        }
        System.out.println("Test for \"Issue36310\\00000001F.tif\" has completed successfully.");
    }
}
