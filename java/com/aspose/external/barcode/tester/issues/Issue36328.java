package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36328
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36328");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue36328BigDatamatrixTestBlur2PngDataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(folder + "BigDatamatrixTest_blur2.png", DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test big datamatrix test ", reader.getFoundBarCodes()[0].getCodeText());
    }
}
