package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Issue33696
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33696");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue33696Images6JpgEAN13()
    {
        BufferedImage img = null;
        try
        {
            img = ImageIO.read(new File(folder + "images6.jpg"));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        BarCodeReader reader = new BarCodeReader(img, DecodeType.EAN_13);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("4902580315467", reader.getFoundBarCodes()[0].getCodeText());
    }
}
