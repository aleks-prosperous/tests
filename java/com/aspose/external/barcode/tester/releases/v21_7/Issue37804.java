package com.aspose.external.barcode.tester.releases.v21_7;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37804
{
    /// <summary>
    /// Path to folder with files for testing Issue37804.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues/Issue37804");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_RecognizeMotorviaQR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Motorvia_second.png"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length, "QR was not recognized");
            Assert.assertEquals(DecodeType.QR, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals("0d2dc3f2-f5a8-4cae-9ca3-cd2e11b7e27b_6a0ce2fb-046c-46a5-8344-e23e2ace71c0_                              _LP Consulting Engineers Inc.            _9911323             ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_GenerateAndRecognizeFromClient()
    {
        GenerateAndRecognizeQR("0d2dc3f2-f5a8-4cae-9ca3-cd2e11b7e27b_56ba6a61-926b-4810-ac4d-a1cd57a9469a_                              _LOYOLA MARYMOUNT UNIVERSITY             _9926349             ", QRVersion.VERSION_07);
        GenerateAndRecognizeQR("0d2dc3f2-f5a8-4cae-9ca3-cd2e11b7e27b_6a0ce2fb-046c-46a5-8344-e23e2ace71c0_                              _LP Consulting Engineers Inc.            _9911323             ", QRVersion.VERSION_07);
    }

    @Test
    public void test_GenerateAndRecognizeOwn()
    {
        GenerateAndRecognizeQR("aaaaaaaaaaaa1234aaaaaaaaaaaaaaaa", QRVersion.VERSION_02);
        GenerateAndRecognizeQR("aaaaaaaaaaaaABCDEFaaaaaaaaaaaaaa", QRVersion.VERSION_02);
        GenerateAndRecognizeQR("aaaaaaABCDEFaaaa1234aaaa1234aaaa", QRVersion.VERSION_02);
        GenerateAndRecognizeQR("AAAAAAAAAAA123456789AAAAAAAA123456789AAAAAAAAAA", QRVersion.VERSION_02);
    }

    private void GenerateAndRecognizeQR(String codeText, QRVersion version)
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.QR, codeText);
        {
            generator.getParameters().getBarcode().getQR().setQrVersion(version);
            generator.getParameters().getBarcode().getQR().setQrErrorLevel(QRErrorLevel.LEVEL_L);
            generator.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);

            BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), DecodeType.QR);
            {
                Assert.assertEquals(1, reader.readBarCodes().length, "QR was not recognized");
                Assert.assertEquals(DecodeType.QR, reader.getFoundBarCodes()[0].getCodeType());
                Assert.assertEquals(codeText, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }
}
