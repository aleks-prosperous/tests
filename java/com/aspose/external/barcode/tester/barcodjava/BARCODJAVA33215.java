package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Test
public class BARCODJAVA33215
{
    String folder = Global.getGeneratedImagesFolder("barcodjava_issues" + File.separator + this.getClass().getSimpleName());

    @BeforeClass
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testOne()
    {
        List<String> files = new ArrayList<String>();
        files.add(folder + "Aztec0.png");

        for (String fileName : files)
        {
            try
            {


                BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.AZTEC);
                builder.setCodeText("999$375099$21021$$$");
                builder.save(fileName, BarCodeImageFormat.PNG);

                BufferedImage img = ImageIO.read(new File(fileName));
                BarCodeReader reader = new BarCodeReader(img, DecodeType.AZTEC);

                int counter = 0;
                for (BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());

                    Assert.assertEquals(result.getCodeText(), "999$375099$21021$$$");
                    Assert.assertNotNull(result.getCodeType());
                }

                Assert.assertNotEquals(counter, 0);
            } catch (Exception e)
            {
                Assert.fail("Exception", e);
            }
        }
    }
}
