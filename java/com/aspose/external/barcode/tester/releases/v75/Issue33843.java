package com.aspose.external.barcode.tester.releases.v75;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;

import java.util.ArrayList;
import java.util.List;

public class Issue33843
{
    final String Folder = Global.getTestDataFolder("Issues/Issue33843");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


        @Test
    public void test_Issue33843_DOC00000010_tif_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.Folder, "DOC00000010.tif"), DecodeType.DATA_MATRIX);
        {
            List<String> actualTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[19];
            expectedTexts[0] = "AZ000000014930";
            expectedTexts[1] = "AZ000000014931";
            expectedTexts[2] = "AZ000000014932";
            expectedTexts[3] = "AZ000000014933";
            expectedTexts[4] = "AZ000000014934";
            expectedTexts[5] = "AZ000000014935";
            expectedTexts[6] = "AZ000000014936";
            expectedTexts[7] = "AZ000000014937";
            expectedTexts[8] = "AZ000000014938";
            expectedTexts[9] = "AZ000000014939";
            expectedTexts[10] = "AZ000000014940";
            expectedTexts[11] = "AZ000000014941";
            expectedTexts[12] = "AZ000000014942";
            expectedTexts[13] = "AZ000000014943";
            expectedTexts[14] = "AZ000000014944";
            expectedTexts[15] = "AZ000000014945";
            expectedTexts[16] = "AZ000000014946";
            expectedTexts[17] = "AZ000000014947";
            expectedTexts[18] = "AZ000000014948";

            CollectionAssert.areEquivalent(expectedTexts, actualTexts, " File 'Issue33843/DOC00000010.tif': Expected and actual collections of code texts do not meet requirements.");
        }
    }

        @Test
    public void test_Issue33843_DOC00000010_tif_DataMatrix2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.Folder, "DOC00000010.tif"), DecodeType.DATA_MATRIX);
        {
            List<String> actualTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[19];
            expectedTexts[0] = "AZ000000014930";
            expectedTexts[1] = "AZ000000014931";
            expectedTexts[2] = "AZ000000014932";
            expectedTexts[3] = "AZ000000014933";
            expectedTexts[4] = "AZ000000014934";
            expectedTexts[5] = "AZ000000014935";
            expectedTexts[6] = "AZ000000014936";
            expectedTexts[7] = "AZ000000014937";
            expectedTexts[8] = "AZ000000014938";
            expectedTexts[9] = "AZ000000014939";
            expectedTexts[10] = "AZ000000014940";
            expectedTexts[11] = "AZ000000014941";
            expectedTexts[12] = "AZ000000014942";
            expectedTexts[13] = "AZ000000014943";
            expectedTexts[14] = "AZ000000014944";
            expectedTexts[15] = "AZ000000014945";
            expectedTexts[16] = "AZ000000014946";
            expectedTexts[17] = "AZ000000014947";
            expectedTexts[18] = "AZ000000014948";

            CollectionAssert.areEquivalent(expectedTexts, actualTexts, " File 'Issue33843/DOC00000010.tif': Expected and actual collections of code texts do not meet requirements.");
        }
    }
}
