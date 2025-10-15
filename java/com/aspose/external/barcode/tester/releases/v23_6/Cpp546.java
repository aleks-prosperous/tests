package com.aspose.external.barcode.tester.releases.v23_6;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Cpp546
{
    /// <summary>
    /// Path to folder with files for testing Cpp451.
    /// </summary>
    private static final String Folder = Global.getTestDataFolder("Issues\\Cpp546");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException {

        String fileName = Global.pathCombine(Folder, "00000001.TIF");
        Rectangle region = new Rectangle(0, 0, 2463, 3465);
        BaseDecodeType[] types = new BaseDecodeType[] { DecodeType.CODE_39, DecodeType.INTERLEAVED_2_OF_5 };

        BarCodeReader reader = new BarCodeReader(ImageIO.read(new File(fileName)), region, types);

        reader.setQualitySettings(QualitySettings.getHighPerformance());
        BarCodeResult[] res = reader.readBarCodes();

        Assert.assertEquals(1, res.length);
        Assert.assertEquals("3110641117003S", res[0].getCodeText());
    }
}
