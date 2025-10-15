package com.aspose.external.barcode.tester.releases.v24_12;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Issue39109
{
    static final String Folder = Global.getTestDataFolder("Issues\\Issue39109");

    @Test
    public void test_matrix2of5_fake_recognition()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "page_2.jpg"), DecodeType.MATRIX_2_OF_5);
        {
            reader.setQualitySettings(QualitySettings.getHighQuality());
            BarCodeResult[] res = reader.readBarCodes();
            Assert.assertEquals(0, res.length, "No barcodes on image");
        }
    }
}
