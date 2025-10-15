package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue34388_CompoundImage
{

    private String _folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void test_Issue34388_manyRotatedAztecs_2_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue34388\\manyRotatedAztecs_2.png"), DecodeType.AZTEC);
        {
            List<String> actualTexts = new ArrayList<>();
            for(BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[10];
            expectedTexts[0] = "ABCDEF";
            expectedTexts[1] = "ABCDEF";
            expectedTexts[2] = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
            expectedTexts[3] = "4565345456545456";
            expectedTexts[4] = "012345678901234567890123456789";
            expectedTexts[5] = "AaBbCc";
            expectedTexts[6] = "AaBbCc";
            expectedTexts[7] = "AaBbCc";
            expectedTexts[8] = "www.8qr.de/123aq";
            expectedTexts[9] = "AaBbCc";

            CollectionAssert.areEquivalent(expectedTexts, actualTexts, " File 'Issue34388\\manyRotatedAztecs_2.png': Expected and actual collections of code texts do not meet requirements.");
        }
        System.out.println("Test for \"Issue34388\\manyRotatedAztecs_2.png\" has completed successfully.");
    }

        @Test
    public void test_Issue34388_manyRotatedAztecs_3_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue34388\\manyRotatedAztecs_3.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            List<String> actualTexts = new ArrayList<String>();
            for (BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[7];
            expectedTexts[0] = "ABCDEF";
            expectedTexts[1] = "AaBbCc";
            expectedTexts[2] = "ABCDEF";
            expectedTexts[3] = "4565345456545456";
            expectedTexts[4] = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
            expectedTexts[5] = "012345678901234567890123456789";
            expectedTexts[6] = "AaBbCc";

            CollectionAssert.areEquivalent(expectedTexts, actualTexts, " File 'Issue34388\\manyRotatedAztecs_3.png': Expected and actual collections of code texts do not meet requirements.");
        }
        System.out.println("Test for \"Issue34388\\manyRotatedAztecs_3.png\" has completed successfully.");
    }

        @Test
    public void test_Issue34388_manyRotatedAztecs_3_png_AllSupportedTypes2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue34388\\manyRotatedAztecs_3.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            List<String> actualTexts = new ArrayList<String>();
            for (BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[7];
            expectedTexts[0] = "ABCDEF";
            expectedTexts[1] = "ABCDEF";
            expectedTexts[2] = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
            expectedTexts[3] = "4565345456545456";
            expectedTexts[4] = "012345678901234567890123456789";
            expectedTexts[5] = "AaBbCc";
            expectedTexts[6] = "AaBbCc";

            CollectionAssert.areEquivalent(expectedTexts, actualTexts, " File 'Issue34388\\manyRotatedAztecs_3.png': Expected and actual collections of code texts do not meet requirements.");
        }
        System.out.println("Test for \"Issue34388\\manyRotatedAztecs_3.png\" has completed successfully.");
    }
}
