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
public class BARCODJAVA33214
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
        files.add(filePath + "Three_Barcodes.png");

        for (String fileName : files)
        {
            try
            {


                BufferedImage img = ImageIO.read(new File(fileName));
                BarCodeReader reader = new BarCodeReader(img, DecodeType.ALL_SUPPORTED_TYPES);

                int counter = 0;
                for (BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());

                    if (counter == 1)
                    {
                        Assert.assertEquals(result.getCodeText(), "01234321");
                    } else if (counter == 2)
                    {
                        Assert.assertEquals(result.getCodeText(), "Pegasus Imaging - BarcodeXpress 5 - 1D and 2D barcode reader/writer");
                    } else if (counter == 3)
                    {
                        Assert.assertEquals(result.getCodeText(), "44123123456123456789");
                    }
                    Assert.assertNotNull(result.getCodeType());
                }

                Assert.assertNotEquals(counter, 0);


            } catch (Exception e)
            {
                Assert.fail("Exception", e);
            }

        }

        //s.stop();

    }
}
