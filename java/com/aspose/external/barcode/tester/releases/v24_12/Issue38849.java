package com.aspose.external.barcode.tester.releases.v24_12;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Issue38849
{
    static final String Folder = Global.getTestDataFolder("Issues\\Issue38849");

    @Test
    public void test_multi_barcodes_code39_fake_recognition()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "multi_barcodes.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            reader.setQualitySettings(QualitySettings.getNormalQuality());
            BarCodeResult[] res = reader.readBarCodes();
            Assert.assertEquals(1, res.length);
            Assert.assertEquals("1234567890125", res[0].getCodeText());
        }
    }
}
