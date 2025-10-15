package com.aspose.external.barcode.tester.releases.v20_8;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

public class Issue37554
{
    /// <summary>
    /// Path to folder with files for testing Issue37489.
    /// </summary>
    private String Folder = Global.getTestDataFolder("Issues\\Issue37554");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_That_Barcode_Is_Recognized_With_HighQualityDetection() throws IOException
    {
        BufferedImage fileName = ImageIO.read(new FileInputStream(Global.pathCombine(Folder, "000000019b5.tif")));
        BarCodeReader reader = new BarCodeReader(fileName);
        reader.setBarCodeReadType(new MultyDecodeType(DecodeType.MOST_COMMON_TYPES));
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("FS-2068968-1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}