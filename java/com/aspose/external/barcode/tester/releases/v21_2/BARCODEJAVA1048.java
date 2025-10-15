package com.aspose.external.barcode.tester.releases.v21_2;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.time.Duration;
import java.time.Instant;

public class BARCODEJAVA1048
{
    private static final String imagePath = Global.getTestDataFolder("barcodjava_issues/BARCODEJAVA1048");
//    private static final String[] imageNames = {"image001.png", "barcode_2.jpg"};
    private static final String[] imageNames = {"barcode_2.jpg"};
    private static final int[] timeouts = {20, 60, 100, 120, 130, 150, 210};

    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test1() throws Exception
    {
        for (String imageName: imageNames)
        {
            System.out.println("______________\nTest image : " + imageName);
            for (int timeout : timeouts)
            {
                testTimeout(timeout, imageName);
            }
        }
    }

    public static void testTimeout(int timeout, String imageName)
    {
        System.out.println("____\nTest timeout : " + timeout + " ms");
        String filePath = imagePath + imageName;
        long elapsedTimeWithTimeout = recognitionWithTimeOut(filePath, timeout);
        long elapsedTimeWithoutTimeout = recognitionWithTimeOut(filePath, 0);
        System.out.println("elapsedTimeWithTimeout: " + elapsedTimeWithTimeout);
        System.out.println("elapsedTimeWithoutTimeout: " + elapsedTimeWithoutTimeout);
        System.out.println("elapsedTimeWithTimeout < elapsedTimeWithoutTimeout: "
                + (elapsedTimeWithTimeout < elapsedTimeWithoutTimeout));
        Assert.assertTrue(elapsedTimeWithTimeout < elapsedTimeWithoutTimeout);
    }

    private static long recognitionWithTimeOut(String fileName, int timeout)
    {
        BarCodeReader reader = new BarCodeReader();
        reader.setBarCodeImage(fileName);
        reader.setQualitySettings(QualitySettings.getNormalQuality());
        reader.setBarCodeReadType(DecodeType.ALL_SUPPORTED_TYPES);
        reader.setTimeout(timeout);
        Instant start = Instant.now();
        try {
            BarCodeResult[] barCodeResult = reader.readBarCodes();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        return duration.toMillis();
    }
}
