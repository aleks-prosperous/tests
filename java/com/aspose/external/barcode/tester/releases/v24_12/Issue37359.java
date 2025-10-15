package com.aspose.external.barcode.tester.releases.v24_12;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue37359
{
    /// <summary>
    /// Path to folder with files for testing Issue37359.
    /// </summary>
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue37359");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_1_Deconv_Slow()
    {
        recognizeCode128DeconvSlow("3.jpg", "HHS000171368");
    }

    @Test
    public void test_2_Deconv_Slow()
    {
        recognizeCode128DeconvSlow("11.jpg", "HHS000171590");
    }

    @Test
    public void test_3_Fast()
    {
        recognizeCode128Fast("1-False-0C42608B781F792DA7CA67F5B2799804.png", "CharCount");
    }

    @Test
    public void test_4_Fast()
    {
        recognizeCode128Fast("1-False-1C6DBF32404E3ABD305D314ACF9D0118.png", "0162210246300082");
    }

    @Test
    public void test_5_Normal()
    {
        RecognizeCode128Normal("1-False-2BDFEE3D690A7ACF25565C23AE258378.png", "HSB HISAR");
    }

    @Test
    public void test_6_Normal()
    {
        RecognizeCode128Normal("0-False-4AAFA4CDE1B589941BB801020CE5BDFB.png", "JAEMIN");
    }

    @Test
    public void test_7_High()
    {
        recognizeCode128Fast("0-False-1039D03BB8AFE15492A4A1451A2D3945.png", "0001171436000000");
    }

    @Test
    public void Test_8_High()
    {
        RecognizeCode128Wrong("0-False-4280033BCD1ECC08C4254FE912C49884.png", "VC704-WN3RT-K8P7B-CHC43-C3722");
    }

    @Test
    public void test_9_High_or_Deconv_Slow_Otherwise_Wrong_Codetext()
    {
        RecognizeCode128High("33453_Image+1.TIF", "H00123192899A");
    }

    @Test
    public void test_ABB_Normal()
    {
        RecognizeCode128Normal("ABB.jpeg", "AUS000957724");
    }

    @Test
    public void test_Simple_1_Fast()
    {
        recognizeCode128Fast("serial_barcode_normal.png", "PGD5WK");
    }

    @Test
    public void test_Simple_2_Fast()
    {
        recognizeCode128Fast("what-is-code-128-barcode.jpg", "AMLABELS12345");
    }

    private void recognizeCode128DeconvSlow(String fileName, String codeText)
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, fileName), DecodeType.CODE_128);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.HIGH);
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);

            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals(codeText, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    private void RecognizeCode128High(String fileName, String codeText)
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

    private void RecognizeCode128Normal(String fileName, String codeText)
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, fileName), DecodeType.CODE_128);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.NORMAL);
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.NORMAL);

            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals(codeText, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    private void recognizeCode128Fast(String fileName, String codeText)
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, fileName), DecodeType.CODE_128);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.HIGH);
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.FAST);

            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals(codeText, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    private void NotRecognizeCode128(String fileName, String codeText)
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, fileName), DecodeType.CODE_128);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            BarCodeResult[] res = reader.readBarCodes();

            Assert.assertEquals(0, res.length);
        }
    }

    private void RecognizeCode128Wrong(String fileName, String codeText)
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, fileName), DecodeType.CODE_128);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            BarCodeResult[] res = reader.readBarCodes();
            Assert.assertEquals(1, res.length);
            Assert.assertNotEquals(codeText, reader.getFoundBarCodes()[0].getCodeText(), "Passed, need to fix this test");
        }
    }
}
