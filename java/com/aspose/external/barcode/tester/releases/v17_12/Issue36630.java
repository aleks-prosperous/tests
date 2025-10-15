package com.aspose.external.barcode.tester.releases.v17_12;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36630
{
    /**
     * Path to folder with files for testing Issue36630.
     */
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36630");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Code39Standard")]
    public void test_Code39Standard()
    {
        String file = Global.pathCombine(folder, "2017071100010.tif");
        BarCodeReader reader = new BarCodeReader(file, DecodeType.CODE_39);
        reader.setQualitySettings(QualitySettings.getNormalQuality());
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("201707110007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_AllSupportedTypes()
    {
        String file = Global.pathCombine(folder, "2017071100010.tif");
        BarCodeReader reader = new BarCodeReader(file);
        reader.setQualitySettings(QualitySettings.getNormalQuality());
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("201707110007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
