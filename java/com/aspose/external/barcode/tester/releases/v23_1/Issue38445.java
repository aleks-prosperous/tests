package com.aspose.external.barcode.tester.releases.v23_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue38445
{
    private String _numericStr = "０１２３４５６７８９";
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue38445");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }


    @Test
    public void test_QRCodeWithSpecialNumeric_GenerateRecognize()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR, _numericStr);
        BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(_numericStr, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_QRCodeWithSpecialNumeric_Recognize()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "qrnumeric.png"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(_numericStr, reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
