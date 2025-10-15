package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue33804
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33804");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue33804FalsePositivePngDataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(folder + "false_positive.png", DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("E200A05B520086C93E11BCA863028B412", reader.getFoundBarCodes()[0].getCodeText());
    }
}
