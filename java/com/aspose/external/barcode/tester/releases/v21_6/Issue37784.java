package com.aspose.external.barcode.tester.releases.v21_6;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37784
{
    /// <summary>
    /// Path to folder with files for testing Issue37784.
    /// </summary>
    private final String Folder = Global.getTestDataFolder("Issues\\Issue37784");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_1()
    {
        RecognizeCode128("1.jpg", "HHS000171320");
    }

    @Test
    public void test_2()
    {
        RecognizeCode128("2.jpg", "HHS000171349");
    }

    @Test
    public void test_3()
    {
        RecognizeCode128("3.jpg", "HHS000171368");
    }

    @Test
    public void test_4()
    {
        RecognizeCode128("4.jpg", "HHS000171430");
    }

    @Test
    public void test_5()
    {
        RecognizeCode128("5.jpg", "HHS000171486");
    }

    @Test
    public void test_6()
    {
        RecognizeCode128("6.jpg", "HHS000171506");
    }

    @Test
    public void test_7()
    {
        RecognizeCode128("7.jpg", "HHS000171512");
    }

    @Test
    public void test_8()
    {
        RecognizeCode128("8.jpg", "HHS000171517");
    }

    @Test
    public void test_9()
    {
        RecognizeCode128("9.jpg", "HHS000171521");
    }

    @Test
    public void test_10()
    {
        RecognizeCode128("10.jpg", "HHS000171523");
    }

    @Test
    public void test_11()
    {
        RecognizeCode128("11.jpg", "HHS000171590");
    }

    @Test
    public void test_12()
    {
        RecognizeCode128("12.jpg", "HHS000171628");
    }

    @Test
    public void test_13()
    {
        RecognizeCode128("13.jpg", "HHS000171634");
    }

    @Test
    public void test_14()
    {
        RecognizeCode128("14.jpg", "HHS000171645");
    }

    @Test
    public void test_15()
    {
        RecognizeCode128("15.jpg", "HHS000171932");
    }

    @Test
    public void test_16()
    {
        RecognizeCode128("16.jpg", "HHS000172187");
    }

    @Test
    public void test_193_20210317105958193()
    {
        RecognizeCode128("193_20210317105958193.jpeg", "HHS000171527");
    }

    @Test
    public void test_866_20210310105414866()
    {
        RecognizeCode128("866_20210310105414866.jpeg", "HHS000171312");
    }

    @Test
    public void test_ABB()
    {
        RecognizeCode128("ABB.jpeg", "AUS000957724");
    }


    private void RecognizeCode128(String fileName, String codeText)
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, fileName), DecodeType.CODE_128);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);

            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals(codeText, reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
