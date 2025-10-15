package com.aspose.external.barcode.tester.releases.v20_5;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37417
{
    /// <summary>
    /// Path to folder with files for testing Issue37391.
    /// </summary>
    private String Folder = Global.getTestDataFolder("Issues\\Issue37417");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_QR_with_no_quite_zone()
    {
        String fileName = Global.pathCombine(Folder, "asposenet_0613_src1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            BarCodeResult[] res = reader.readBarCodes();
            Assert.assertEquals(res.length, 1);
            Assert.assertEquals("MECARD:N:Name1;SOUND:Rad1;TEL:Phone1;EMAIL:email1@example.com;NOTE:Contoso1;BDAY:20200324;ADR:Addres1 line1 lin2 line4;URL:http://www.example.com1;NICKNAME:Nick1;", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
