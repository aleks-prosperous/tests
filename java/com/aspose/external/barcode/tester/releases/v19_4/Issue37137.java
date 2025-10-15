package com.aspose.external.barcode.tester.releases.v19_4;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37137
{
    /// <summary>
    /// Path to folder with files for testing Issue37053.
    /// </summary>
    private static final String folder = Global.getTestDataFolder("Issues\\Issue37137");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Tests recognition AllSupportedTypes.a
    /// </summary>
        @Test
    public void test_QrCode_20mm()
    {
        String fileName = Global.pathCombine(folder, "QrCode_20mm.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SAMDMS:MANDANT=Mandant 196;NUMSEITE=2;ANZSEITEN=18;ABLAGE=(COD_GO_TYP=KU;COD_GO_NR=ABC87654321;COD_HUELLE=1129;NAM_DOKUMENT=ERHEBUNGSBOGEN)", reader.getFoundBarCodes()[0].getCodeText());
    }
}
