package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
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

public class Issue33210
{
    static final String folder = Global.getIssuesTestImagePath("Issue33210");

        @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void test1D() throws IOException
        {
        String fileName = Global.pathCombine(folder, "code128_3items.png");
        BaseDecodeType type = DecodeType.CODE_128;
        BufferedImage bitmap = ImageIO.read(new File(fileName));
        BarCodeReader reader = new BarCodeReader(bitmap, type);

        int readCount = 0;
        final int readMust = 3;
        List<String> answers = new ArrayList<>();
        answers.add("Mamma-mia");
        answers.add("Triple shot");
        answers.add("Superstar");

            for(BarCodeResult result : reader.readBarCodes())
            {
                Assert.assertTrue(answers.contains(result.getCodeText()));
                readCount++;
            }

        Assert.assertEquals(readMust, readCount);
    }
}
