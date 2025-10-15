package com.aspose.external.barcode.tester.releases.v21_3;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BARCODEJAVA1095
{
    private String folder;
    @BeforeMethod
    public void setupTestFixture()
    {
        this.folder = Global.getTestDataFolder("Issues/BARCODEJAVA1095/");
        utils.LicenseAssistant.setupLicense();
    }


    @Test
    public void testRecognitionSpeedHighQuality()
    {
        long startTime = System.nanoTime();
        String fileName = this.folder + "sample2.png";
        BarCodeReader reader = new BarCodeReader(fileName);
//        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);

        reader.setQualitySettings(QualitySettings.getHighQuality());
        System.out.println("barcodes number : " + reader.readBarCodes().length);
        System.out.println("barcodes codeText : " + reader.getFoundBarCodes()[0].getCodeText());
        System.out.println("barcodes codeType : " + reader.getFoundBarCodes()[0].getCodeType());
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
//        System.out.println("Execution time in nanoseconds  : " + timeElapsed);
        System.out.println("Execution time in milliseconds : " +   timeElapsed / 1000000);
    }
  @Test
    public void testRecognitionSpeedHighPerformance()
    {
        long startTime = System.nanoTime();
        String fileName = this.folder + "sample2.png";
        BarCodeReader reader = new BarCodeReader(fileName);
//        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);

        reader.setQualitySettings(QualitySettings.getHighPerformance());
        System.out.println("barcodes number : " + reader.readBarCodes().length);
        System.out.println("barcodes codeText : " + reader.getFoundBarCodes()[0].getCodeText());
        System.out.println("barcodes codeType : " + reader.getFoundBarCodes()[0].getCodeType());
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
//        System.out.println("Execution time in nanoseconds  : " + timeElapsed);
        System.out.println("Execution time in milliseconds : " +   timeElapsed / 1000000);
    }
}

