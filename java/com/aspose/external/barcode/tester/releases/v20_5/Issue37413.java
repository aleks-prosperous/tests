package com.aspose.external.barcode.tester.releases.v20_5;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.HashMap;
import java.util.Map;

public class Issue37413
{
    /// <summary>
    /// Path to folder with files for testing Issue37413.
    /// </summary>
    private String Folder = Global.getTestDataFolder("Issues\\Issue37413");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }


    @Test(enabled = false)
    public void test_012333016337_1()
    {
        String fileName = Global.pathCombine(Folder, "012333016337_1.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.UPCA, DecodeType.EAN_13);
        {
            reader.setQualitySettings(QualitySettings.getHighQuality());
            Map<String, String> lResDic = new HashMap<>();
            for(BarCodeResult result : reader.readBarCodes())
            {
                if (lResDic.containsKey(result.getCodeText())) continue;
                lResDic.put(result.getCodeText(), result.getCodeText());
            }

            Assert.assertEquals(lResDic.values().size(), 1);
            Assert.assertTrue(lResDic.containsKey("012333016337"));
        }
    }

    @Test
    public void test_barcode_question()
    {
        String fileName = Global.pathCombine(Folder, "barcode-question.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.UPCA, DecodeType.EAN_13, DecodeType.SUPPLEMENT);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("070999006994", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("33546", reader.getFoundBarCodes()[1].getCodeText());
        }
    }
}
