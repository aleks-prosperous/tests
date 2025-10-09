package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.LicenseAssistant;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BARCODJAVA33145
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void reproduceTest() throws IOException
    {
        String imageFilePath = Global.getBarcodeJavaIssuesTestImagePath(Global.pathCombine(this.getClass().getSimpleName(), "002.jpg"));
        FileInputStream fs = new FileInputStream(imageFilePath);
        BufferedInputStream is = new BufferedInputStream(fs);
        BufferedImage img = ImageIO.read(is);
        BarCodeReader reader = new BarCodeReader(img, DecodeType.CODE_128);
        BarCodeResult[] results = reader.readBarCodes();
        Assert.assertEquals(results.length, 1, "not recognized");
        Assert.assertEquals("02246082001001results@qc-dms.pharmastulln.de", results[0].getCodeText());
    }
}
