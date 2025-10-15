package com.aspose.external.barcode.tester.releases.v22_5;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue38152
{
    /// <summary>
    /// Path to folder with files for testing Issue38152.
    /// </summary>
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue38152");
    private static final String expected = "BEGIN:VCARD\r\nVERSION:3.0\r\nREV:2022-03-25T12:27:40.387Z\r\nN;CHARSET=utf-8:\u0010@B5<;\u001f5AB5E0;Vladi;\u001c;\u001c\r\nFN;CHARSET=utf-8:\u001c \u001f5AB5E0 Vladi \u0010@B5< \u001c\r\nORG;CHARSET=utf-8:Siesqo\r\nTITLE;CHARSET=utf-8:Web Developer\r\nROLE;CHARSET=utf-8:Data Protection Officer\r\nEMAIL;INTERNET:info@jeroendesloovere.be\r\nTEL;PREF;WORK:1234121212\r\nTEL;WORK:123456789\r\nADR;WORK;POSTAL;CHARSET=utf-8:null;null;street;worktown;null;workpostcode\r\n ;Belgium\r\nURL:http://www.jeroendesloovere.be\r\nEND:VCARD\r\n";

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Big_QR_From_Screen()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Big QR from screen.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(expected, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Big_QR_Squared()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "squared.png"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(expected, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Big_QR_Transformed_1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "qr_transformed1.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(expected, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Big_QR_Transformed_2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "qr_transformed2.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(expected, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Big_QR_Transformed_3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "qr_transformed3.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(expected, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Big_QR_Transformed_4()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "qr_transformed4.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(expected, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Big_QR_Transformed_5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "qr_transformed5.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(expected, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Big_QR_Transformed_6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "qr_transformed6.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(expected, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Big_QR_Transformed_7()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "qr_transformed7.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(expected, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Big_QR_Transformed_8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "qr_transformed8.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(expected, reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
