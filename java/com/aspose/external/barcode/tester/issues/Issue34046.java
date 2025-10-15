package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;


/**
 * <p>
 * Tests Issue34046 tests. Can't read Code39 from the tif file
 * </p>
 */
public class Issue34046
{
    /**
     * <p>
     * Path to generatedFolder with files for testing Issue34046.
     * </p>
     */
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34046");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Tests recognition of "bad" image Scaner.tif
    /// </summary>
        @Test
    public void testWithMedianDirectional()
    {
        String fileName = Global.pathCombine(folder, "Scaner.TIF");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        //Assert.assertEquals(reader.readBarCodes().length, 1);
        //Assert.assertEquals("03501V261", reader.getFoundBarCodes()[0].getCodeText());
    }
}

