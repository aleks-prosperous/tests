package com.aspose.external.barcode.tester.releases.v75;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue34162
{
    final String Folder = Global.getTestDataFolder("Issues/Issue34162");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Issue34162_test_photo_jpg_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.Folder, "test_photo.jpg"), DecodeType.AZTEC);
            String lMatchedText = "abcdefghijklmnopqrstuvwxyz\r\nabcdefghijklmnopqrstuvwxyz\r\nabcdefghijklmnopqrstuvwxyz\r\nabcdefghijklmnopqrstuvwxyz\r\nabcdefghijklmnopqrstuvwxyz\r\nabcdefghijklmnopqrstuvwxyz\r\nabcdefghijklmnopqrstuvwxyz\r\nabcdefghijklmnopqrstuvwxyz\r\nabcdefghijklmnopqrstuvwxyz\r\nabcdefghijklmnopqrstuvwxyz\r\nabcdefghijklmnopqrstuvwxyz\r\nabcdefghijklmnopqrstuvwxyz\r\nabcdefghijklmnopqrstuvwxyz\r\nabcdefghijklmnopqrstuvwxyz\r\nabcdefghijklmnopqrstuvwxyz\r\nabcdefghijklmnopqrstuvwxyz\r\nabcdefghijklmnopqrstuvwxyz\r\nabcdefghijklmnopqrstuvwxyz\r\nabcdefghijklmnopqrstuvwxyz\r\n";
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(lMatchedText, reader.getFoundBarCodes()[0].getCodeText());
    }
}
