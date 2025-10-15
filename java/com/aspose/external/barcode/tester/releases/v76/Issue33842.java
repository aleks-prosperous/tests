package com.aspose.external.barcode.tester.releases.v76;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;

import java.util.ArrayList;
import java.util.List;

public class Issue33842
{
    final String folder = Global.getTestDataFolder("Issues/Issue33842");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


        @Test
    public void test_Issue33842_DOC00000009_tif_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "DOC00000009.tif"), DecodeType.DATA_MATRIX);
        {
            List<String> actualTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[15];
            expectedTexts[0] = "AZ000000014949";
            expectedTexts[1] = "AZ000000014950";
            expectedTexts[2] = "AZ000000014951";
            expectedTexts[3] = "AZ000000014952";
            expectedTexts[4] = "AZ000000014953";
            expectedTexts[5] = "AZ000000014954";
            expectedTexts[6] = "AZ000000014955";
            expectedTexts[7] = "AZ000000014956";
            expectedTexts[8] = "AZ000000014957";
            expectedTexts[9] = "AZ000000014958";
            expectedTexts[10] = "AZ000000014959";
            expectedTexts[11] = "AZ000000014960";
            expectedTexts[12] = "AZ000000014961";
            expectedTexts[13] = "AZ000000014962";
            expectedTexts[14] = "AZ000000014963";

            CollectionAssert.areEquivalent(expectedTexts, actualTexts, " File 'Issue33842/DOC00000009.tif': Expected and actual collections of code texts do not meet requirements.");
        }
        System.out.println("Test for \"Issue33842\\DOC00000009.tif\" has completed successfully.");
    }
}
