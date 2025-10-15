package com.aspose.external.barcode.tester.releases.v17_9;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36666
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separatorChar + "Issue36666");

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
        //[Category("Pharmacode")]
        //[Category("AllSupportedTypes")]
    public void testRecognitionPharmacodeWithAllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "Pharmacode_123789.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123789", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.PHARMACODE, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("Pharmacode")]
    public void testRecognitionPharmacode()
    {
        String fileName = Global.pathCombine(folder, "Pharmacode_123789.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PHARMACODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123789", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.PHARMACODE, reader.getFoundBarCodes()[0].getCodeType());
        }
    }
}
