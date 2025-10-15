package com.aspose.external.barcode.tester.releases.v25_9;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class ReleaseNotes
{
    private String folderPath = Global.getTestDataFolder("ReleaseNotes/V25_9");
    @BeforeClass
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * [Pdf417](https://en.wikipedia.org/wiki/PDF417) barcode recognition performance has been enhanced,
     * with better results on mobile devices and in document processing scenarios.
     */
    @Test
    public void test1() {
        BarCodeReader reader = new BarCodeReader(folderPath + "Pdf417.png", DecodeType.PDF_417, DecodeType.COMPACT_PDF_417);
        BarCodeResult[] results = reader.readBarCodes();
        for(BarCodeResult result:results){
            System.out.println(result.getCodeTypeName());
            System.out.println(result.getCodeText());
        }
    }
  /**
     * [Han Xin code](https://en.wikipedia.org/wiki/Han_Xin_code) ecognition performance has been refined,
     * leading to more consistent decoding.
     */
    @Test
    public void test2() {
        BarCodeReader reader = new BarCodeReader(folderPath + "HanXinCode.png", DecodeType.HAN_XIN);
        BarCodeResult[] results = reader.readBarCodes();
        for(BarCodeResult result:results){
            System.out.println(result.getCodeTypeName());
            System.out.println(result.getCodeText());
        }
    }
}
