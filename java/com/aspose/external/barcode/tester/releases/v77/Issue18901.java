package com.aspose.external.barcode.tester.releases.v77;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

//import com.aspose.barcode.barcoderecognition.RecognitionHints;

public class Issue18901
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue18901");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void PZN_306417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "306417_Barcode06.bmp"), DecodeType.PZN);
        {
            reader.setQualitySettings(QualitySettings.getHighQuality());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("-4410551", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void EAN8_306419()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "306419_Barcode06.bmp"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("42107071", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void EAN13_306420()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "306420_Barcode06.bmp"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("4028615070009", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void EAN13_306425()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "306425_Barcode05.bmp"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("4048882194550", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void EAN13_306428()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "306428_Barcode05.bmp"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5021791704484", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
