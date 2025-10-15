package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Issue33207
{
    static final String folder = Global.getIssuesTestImagePath("Issue33207");

        @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void testAllFiles() throws IOException
        {
        List<String> listOK = new ArrayList<>();
        listOK.add("0123456789_good.png");
        listOK.add("0123456789_bad1.png");
        listOK.add("0123456789_bad2.png");
        listOK.add("0123456789_bad3.png");
        listOK.add("0123456789_bad4.png");
        listOK.add("0123456789_bad5.png");
        listOK.add("0123456789_bad6.png");
        listOK.add("0123456789_bad7.png");
        listOK.add("0123456789_bad8.png");
        listOK.add("0123456789_bad10.png");
        listOK.add("0123456789_bad7_falseSymbol.png");
        listOK.add("0123456789_bad9_falseSymbol.png");
        for(String s : listOK)
        testFileOK(s);

        testFileFalse("0123456789_bad11.png", false);
    }

    public void testFileOK(String filename) throws IOException
    {
        String fileName = Global.pathCombine(folder, filename);
        BaseDecodeType type = DecodeType.CODE_128;
        BufferedImage bitmap = ImageIO.read(new File(fileName));
        BarCodeReader reader = new BarCodeReader(bitmap, type);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0123456789", reader.getFoundBarCodes()[0].getCodeText());
    }

    public void testFileFalse(String filename, boolean read) throws IOException
    {
        String fileName = Global.pathCombine(folder, filename);
        BaseDecodeType type = DecodeType.CODE_128;
        BufferedImage bitmap = ImageIO.read(new File(fileName));
        BarCodeReader reader = new BarCodeReader(bitmap, type);
        if (read)
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertNotEquals("0123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
        else
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
    }
}
