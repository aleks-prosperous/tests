package com.aspose.external.barcode.tester.releases.v23_3;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class BARCODEJAVA1539
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        byte[] data = new byte[]{-36, -35, -34, -33, -32, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22, -21, -20, -19, -18, -17};
        char[] charArr = new char[data.length];
        for (int i = 0; i < data.length; ++i)
            charArr[i] = (char)(data[i] & 0xff);

        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DOT_CODE, new String(charArr));
        BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), DecodeType.DOT_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
    }
}
