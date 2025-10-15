package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue34329
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34329");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue34329Barcode2PngCode39Standard()
    {
        BarCodeReader reader = new BarCodeReader(folder + "barcode2.png", DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("CORRESPONDENCE", reader.getFoundBarCodes()[0].getCodeText());
    }
}
