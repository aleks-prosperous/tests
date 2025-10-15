package com.aspose.external.barcode.tester.releases.v20_4;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37391
{
    /// <summary>
    /// Path to folder with files for testing Issue37391.
    /// </summary>
    private String Folder = Global.getIssuesTestImagePath("Issue37391");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_barcode_code32_99700160_Code32()
    {
        String fileName = Global.pathCombine(Folder, "barcode_code32_99700160.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_32);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("997001603", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_barcode_code32_99700160_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(Folder, "barcode_code32_99700160.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("997001603", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
