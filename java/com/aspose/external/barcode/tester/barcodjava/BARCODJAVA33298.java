package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Test
public class BARCODJAVA33298
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
        files.add(folder + "code39ext.png");

        for (String fileName : files)
        {
            try
            {
                BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.CODE_39_FULL_ASCII);
                builder.setCodeText("BG10.99/657552/C");
                builder.save(fileName, BarCodeImageFormat.PNG);
                BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
                int counter = 0;
                for (BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());
                    Assert.assertEquals(result.getCodeText(), "BG10.99/657552/C");

                    Assert.assertNotNull(result.getCodeType());
                }

                Assert.assertNotEquals(counter, 0);
            } catch (Exception e)
            {
                Assert.fail("Exception", e);
            }

        }
    }

    @Test
    public void testTwo()
    {
        List<String> files = new ArrayList<String>();
        files.add(folder + "code39ext.png");

        for (String fileName : files)
        {
            try
            {
                BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.CODE_39_FULL_ASCII);
                builder.setCodeText("BG10.99/657552/C");
                builder.save(fileName, BarCodeImageFormat.PNG);


                BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39_FULL_ASCII);

                int counter = 0;
                for (BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());
                    Assert.assertEquals(result.getCodeText(), "BG10.99/657552/C");

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
