package com.aspose.external.barcode.tester.releases.v22_3;

import com.aspose.barcode.auxiliary.Global;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue38088
{
    private final static String Folder = Global.getTestDataFolder("Issues/Issue38088");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Normal_Setting()
    {
        //recognize image with UseOldBarcodeDetector true
        BarCodeReader read = new BarCodeReader(Global.pathCombine(Folder, "many_code128.png"), DecodeType.CODE_128);
        {
            List<String> results = new ArrayList<String>();

            for(BarCodeResult result : read.readBarCodes())
            results.add(result.getCodeText());

            CollectionAssert.contains("Aspose Code 03", results);
            CollectionAssert.contains("Aspose Code 04", results);
        }
    }

    @Test
    public void test_Low_Setting()
    {
        //recognize image with UseOldBarcodeDetector true
        BarCodeReader read = new BarCodeReader(Global.pathCombine(Folder, "many_code128.png"), DecodeType.CODE_128);
        {
            List<String> results = new ArrayList<String>();
            read.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);

            for(BarCodeResult result : read.readBarCodes())
            results.add(result.getCodeText());

            CollectionAssert.contains("Aspose Diag 01", results);
            CollectionAssert.contains("Aspose Code 02", results);
            CollectionAssert.contains("Aspose Code 03", results);
            CollectionAssert.contains("Aspose Code 04", results);
        }
    }

    @Test
    public void test_Small_Low_Setting()
    {
        //recognize image with UseOldBarcodeDetector true
        BarCodeReader read = new BarCodeReader(Global.pathCombine(Folder, "many_code128.png"), DecodeType.CODE_128);
        {
            List<String> results = new ArrayList<String>();
            read.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            read.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);

            for(BarCodeResult result : read.readBarCodes())
                results.add(result.getCodeText());

            CollectionAssert.contains("Aspose Diag 01", results);
            CollectionAssert.contains("Aspose Code 02", results);
            CollectionAssert.contains("Aspose Code 03", results);
            CollectionAssert.contains("Aspose Code 01", results);
            CollectionAssert.contains("Aspose Code 04", results);
        }
    }
}
