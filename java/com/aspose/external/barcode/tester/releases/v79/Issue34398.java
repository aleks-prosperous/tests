package com.aspose.external.barcode.tester.releases.v79;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue34398
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("QR")]
    public void test_Issue34398_QRCODEE011_tiff_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34398\\QRCODEE011.tiff"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ELBR17~Male~01-Jan-1971~45~No~20~12~Half-yearly~6656000~272235~False~Male~01-Jan-" +
                    "1977~39~R1~20~12~500,000~212~R2~20~12~500,000~170~R3~20~12~500,000~6573~R4~0~0~0" +
                    "~0~R5~0~0~0~0~R6~0~0~0~0~R7~0~0~0~0~R8~0~0~0~0", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Issue34398_QRCODEE011___tiff_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34398\\QRCODEE011__.tiff"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ELBR17~Male~01-Jan-1971~45~No~20~12~Half-yearly~6656000~272235~False~Male~01-Jan-" +
                    "1977~39~R1~20~12~500,000~212~R2~20~12~500,000~170~R3~20~12~500,000~6573~R4~0~0~0" +
                    "~0~R5~0~0~0~0~R6~0~0~0~0~R7~0~0~0~0~R8~0~0~0~0", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
