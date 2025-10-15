package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

/**
 * <p>
 * Tests Issue33954 tests. Rotation DataMatrix
 * </p>
 */
@Test(description = "Tests for Issue33954.")
public class Issue33954
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33954");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Test rotated DataMatrix (45degrees).
    /// </summary>
        @Test
    public void testRotatedDataMatrix45Degrees()
    {
            String fileName = "00_rotated45.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("00", reader.getFoundBarCodes()[0].getCodeText());

        }
}

