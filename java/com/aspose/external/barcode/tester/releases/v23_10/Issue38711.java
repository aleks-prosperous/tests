package com.aspose.external.barcode.tester.releases.v23_10;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.AztecSymbolMode;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue38711
{
    private final static String _folder = Global.getTestDataFolder("Issues/Issue38711");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Rune()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AZTEC, "123");
        {
            gen.getParameters().getBarcode().getXDimension().setPixels(4);
            gen.getParameters().getBarcode().getAztec().setAztecSymbolMode(AztecSymbolMode.RUNE);

            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.AZTEC);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals("123", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void test_LowQuality()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(_folder, "low_quality.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("http://www.ntu.edu.sg/eee/people", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
