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
import java.io.File;
import java.io.IOException;

public class BARCODJAVA33241
{
    @BeforeMethod
    public void setLicense() throws Exception
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testOne() throws IOException
    {
        BufferedImage img = ImageIO.read(new File(Global.getBarcodeJavaIssuesTestImagePath(Global.pathCombine(this.getClass().getSimpleName(), "crm_pdf_print128.PNG"))));
        BarCodeReader reader = new BarCodeReader(img, DecodeType.CODE_128);
        BarCodeResult[] results = reader.readBarCodes();
        Assert.assertEquals(results.length, 1);
        Assert.assertEquals("8000000315", results[0].getCodeText());
    }
}
