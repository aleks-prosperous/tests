package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test
public class BARCODJAVA33254
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
        files.add(folder + "AustraliaPostJava.png");

        for (String fileName : files)
        {
            try
            {
                BarcodeGenerator bd = new BarcodeGenerator(EncodeTypes.AUSTRALIAN_POSTE_PARCEL);
                bd.setCodeText("99700160DJS123456701021502000");
                bd.save(fileName);

                BufferedImage img = ImageIO.read(new File(fileName));
                BarCodeReader reader = new BarCodeReader(img, DecodeType.ALL_SUPPORTED_TYPES);

                int counter = 0;
                for (BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());

                    Assert.assertEquals(result.getCodeText(), "99700160DJS123456701021502000");
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
