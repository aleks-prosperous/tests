package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BARCODJAVA33535
{
    /**
     * <p>
     * Path to folder with files for testing.
     * </p>
     */
    private final String Folder = Global.getBarcodeJavaIssuesTestImagePath(this.getClass().getSimpleName());

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Tests recognition of pharmacode picture
     * </p>
     */
    @Test
    public void testPharmacode()
    {
        final String fileName = "test5.png";
        String path = Folder + "/" + fileName;
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.PHARMACODE);
        BarCodeResult[] results = reader.readBarCodes();
        Assert.assertEquals("4506", results[0].getCodeText());
        Assert.assertEquals(results.length, 1);
    }
}
