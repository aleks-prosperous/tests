package com.aspose.external.barcode.tester.releases.v80;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.SingleDecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue36205
{
    final String folder = Global.getTestDataFolder("Issues/Issue36205");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testBarcodeBuilderRecognizer()
    {
        String fileName = "Aztec3d_AaBbCc_3.png";
        String filePath = Global.pathCombine(folder, fileName);
        SingleDecodeType decodeType = DecodeType.AZTEC;
        BarCodeReader reader = new BarCodeReader(filePath, decodeType);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("AaBbCc", reader.getFoundBarCodes()[0].getCodeText());
    }
}
