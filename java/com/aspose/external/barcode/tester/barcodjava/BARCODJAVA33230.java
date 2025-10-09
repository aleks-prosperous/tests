package com.aspose.external.barcode.tester.barcodjava;


import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BARCODJAVA33230
{
    @BeforeMethod
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testOne() throws IOException
    {
        BufferedImage img = ImageIO.read(new File(Global.getBarcodeJavaIssuesTestImagePath(Global.pathCombine(this.getClass().getSimpleName(), "code93-sample.gif"))));
        BarCodeReader reader = new BarCodeReader(img, DecodeType.CODE_93);
        for(BarCodeResult result : reader.readBarCodes())
        {
            Assert.assertTrue(result.getCodeType().getTypeIndex() == DecodeType.CODE_93.getTypeIndex());
            Assert.assertEquals("505 Consumers Road", result.getCodeText());
        }

    }
}
