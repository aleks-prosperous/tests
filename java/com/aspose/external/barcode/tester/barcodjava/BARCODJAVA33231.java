package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.LicenseAssistant;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BARCODJAVA33231
{
    @BeforeMethod
    public void setLicense() throws Exception
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testOne() throws IOException
    {
        BufferedImage img = ImageIO.read(new File(Global.getBarcodeJavaIssuesTestImagePath(Global.pathCombine(this.getClass().getSimpleName(), "barcode2.png"))));
        BarCodeReader reader = new BarCodeReader(img, DecodeType.ALL_SUPPORTED_TYPES);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(reader.readBarCodes()[0].getCodeText(), "(01)15012345678907");

    }
}
