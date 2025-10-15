package com.aspose.external.barcode.tester.releases.v18_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Issue37000 {
    String fileName = Global.getTestDataFolder("Issues\\Issue37000\\scan_Cropped_2018_6_26_16_10_30.bmp");

    @BeforeMethod
    public void setUp() {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void Region_Recognition_Test_Data_Test() throws IOException
    {
        BufferedImage image = ImageIO.read(new File(fileName));
        String codeText = "9929900065";

        BarCodeReader reader = new BarCodeReader(image);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(codeText, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void Region_Recognition_Whole_Image_Region_Test() throws IOException
    {
        BufferedImage image = ImageIO.read(new File(fileName));
        String codeText = "9929900065";

        Rectangle area = new Rectangle(0, 0, 1468, 852);
        BarCodeReader reader = new BarCodeReader(image, area);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(codeText, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void Region_Recognition_Region_With_Barcode_Test() throws IOException
    {
        BufferedImage image = ImageIO.read(new File(fileName));
        String codeText = "9929900065";

        Rectangle area = new Rectangle(0, 852 - 253, 1468, 253);
        BarCodeReader reader = new BarCodeReader(image, area);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(codeText, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void Region_Recognition_Region_Without_Barcode_Test() throws IOException
    {
        BufferedImage image = ImageIO.read(new File(fileName));

        Rectangle area = new Rectangle(0, 0, 1468, 253);
        BarCodeReader reader = new BarCodeReader(image, area);
        Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
    }
}
