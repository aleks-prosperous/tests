package com.aspose.external.barcode.tester.releases.v21_4;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;

public class BARCODEJAVA1111
{
    private String folder;

    @BeforeMethod
    public void setup()
    {
        this.folder = Global.getTestDataFolder("Issues/BARCODEJAVA1111");
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        for(int i=0; i<2; i++)
        {
            testRecognition();
        }
    }

    public void testRecognition()
    {
        String fileName = this.folder + "1617938768.jpg";
        Instant startTime = Instant.now();
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        BarCodeResult[] barCodeResults = reader.readBarCodes();
        if(barCodeResults != null && barCodeResults.length > 0)
        {
            System.out.println("barCodeResults != null && barCodeResults.length > 0");
            BarCodeResult result = barCodeResults[0];
            System.out.println("CodeText : " + result.getCodeText());
            System.out.println("CodeType: " + result.getCodeTypeName());
        }
        Instant endTime = Instant.now();
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Execution time in milliseconds : " +   duration.toMillis());
    }

    @Test
    public void test2()
    {
        String fileName = this.folder + "1617938768.jpg";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        BarCodeResult[] barCodeResults = reader.readBarCodes();
        if(barCodeResults != null && barCodeResults.length > 0)
        {
            System.out.println("barCodeResults != null && barCodeResults.length > 0");
            BarCodeResult result = barCodeResults[0];
            System.out.println("CodeText : " + result.getCodeText());
            System.out.println("CodeType: " + result.getCodeTypeName());
        }
    }

}
