package com.aspose.external.barcode.tester.releases.v24_5;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Issue38962
{
    private final String Folder = Global.getTestDataFolder("Issues/Issue38962");

    @BeforeMethod
    public void setUp(Method testMethod)
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_OriginalLongCodetext()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "original_dotcode_long_codetext.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("Aspose.BarCode for .NET is a powerful development library to generate & recognize 1D & 2D barcodes", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_CorruptedLongCodetext()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "corrupted_dotcode_long_codetext.png"), DecodeType.DOT_CODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("Aspose.BarCode for .NET is a powerful development library to generate & recognize 1D & 2D barcodes", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
