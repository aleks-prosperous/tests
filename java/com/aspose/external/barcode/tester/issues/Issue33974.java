package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.InverseImageMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue33974
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33974");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue33974DataMatrix1JpgDataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(folder + "DataMatrix_1.jpg", DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("UMT471120001047", reader.getFoundBarCodes()[0].getCodeText());
    }
}
