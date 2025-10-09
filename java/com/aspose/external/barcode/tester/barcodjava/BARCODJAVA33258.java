package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
//import com.aspose.ms.System.Diagnostics.Stopwatch;

@Test
public class BARCODJAVA33258
{
    String Folder = Global.getBarcodeJavaIssuesTestImagePath(this.getClass().getSimpleName());

    @BeforeClass
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testOne()
    {
        //Stopwatch s = new Stopwatch();
        //s.start();
        String filePath = Folder;
        List<String> files = new ArrayList<String>();
        files.add(filePath + "code93-sample.gif");

        for (String fileName : files)
        {
            try
            {

                BufferedImage img = ImageIO.read(new File(fileName));
                BarCodeReader reader = new BarCodeReader(img, DecodeType.CODE_93);

                int counter = 0;
                for (BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());

                    Assert.assertEquals(result.getCodeText(), "505 Consumers Road");
                    Assert.assertNotNull(result.getCodeType());
                }

                Assert.assertNotEquals(counter, 0);

                //System.out.println("Total Time File: " + fileName + " " + s.getElapsedMilliseconds() + " MSeconds");
            } catch (Exception e)
            {
                Assert.fail("Exception", e);
            }

        }

        //s.stop();
        //System.out.println("Total Time: " + s.getElapsedMilliseconds() + " MSeconds");
    }
}
