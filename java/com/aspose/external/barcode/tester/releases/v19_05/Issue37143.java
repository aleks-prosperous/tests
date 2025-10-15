package com.aspose.external.barcode.tester.releases.v19_05;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37143
{
    /// <summary>
    /// Path to folder with files for testing Issue37143.
    /// </summary>
    private final  static String folder = Global.getIssuesTestImagePath("Issue37143");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
        @Test
    public void test_1()
        {
        String fileName = Global.pathCombine(folder, "1.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ONE_CODE);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("00040000969189891122", reader.getFoundBarCodes()[0].getCodeText());
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
        @Test
    public void test_2()
    {
        String fileName = Global.pathCombine(folder, "2.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ONE_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("00040000969189891123", reader.getFoundBarCodes()[0].getCodeText());
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
        @Test
    public void test_3()
    {
        String fileName = Global.pathCombine(folder, "3.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ONE_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0031400096918989112481140027474", reader.getFoundBarCodes()[0].getCodeText());
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
        @Test
    public void test_4()
    {
        String fileName = Global.pathCombine(folder, "4.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ONE_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0031400096918989112592058772527", reader.getFoundBarCodes()[0].getCodeText());
    }
}
