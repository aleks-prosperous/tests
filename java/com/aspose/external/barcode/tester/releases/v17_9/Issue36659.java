package com.aspose.external.barcode.tester.releases.v17_9;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36659
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separatorChar + "Issue36659");

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Interleaved2of5")]
        //[Category("AllSupportedTypes")]
    public void test_JpgPicture()
    {
        String fileName = Global.pathCombine(folder, "Detection_ok.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("020303000000", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.INTERLEAVED_2_OF_5, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_JpgPicture_Interleaved2of5()
    {
        String fileName = Global.pathCombine(folder, "Detection_ok.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.INTERLEAVED_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("020303000000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
        //[Category("AllSupportedTypes")]
    public void test_BmpPicture()
    {
        String fileName = Global.pathCombine(folder, "No_Detection.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("020303000000", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.INTERLEAVED_2_OF_5, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_BmpPicture_Interleaved2of5()
    {
        String fileName = Global.pathCombine(folder, "No_Detection.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.INTERLEAVED_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("020303000000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
