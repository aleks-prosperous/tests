package com.aspose.external.barcode.tester.releases.v23_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.ComplexBackgroundMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37840
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Path to folder with files for testing.
    /// </summary>
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue37840");

    @Test
    public void testComplexBackground()
    {
        String filename = "colored_qr.png";
        String path = Global.pathCombine(Folder, filename);

        BarCodeReader reader = new BarCodeReader(path);
        {
            reader.getQualitySettings().setComplexBackground(ComplexBackgroundMode.ENABLED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Aspose", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testGreenOnRed()
    {
        String filename = "green_on_red.png";
        String path = Global.pathCombine(Folder, filename);

        BarCodeReader reader = new BarCodeReader(path);
        {
            reader.getQualitySettings().setComplexBackground(ComplexBackgroundMode.ENABLED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Aspose", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testRedOnGreen()
    {
        String filename = "red_on_green.png";
        String path = Global.pathCombine(Folder, filename);

        BarCodeReader reader = new BarCodeReader(path);
        {
            reader.getQualitySettings().setComplexBackground(ComplexBackgroundMode.ENABLED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Aspose", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
