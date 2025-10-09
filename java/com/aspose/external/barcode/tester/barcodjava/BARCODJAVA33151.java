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

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test
public class BARCODJAVA33151
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
        files.add(folder + "output.png");

        for (String fileName : files)
        {
            try
            {


                BarcodeGenerator bb = new BarcodeGenerator(EncodeTypes.EAN_13);
                bb.setCodeText("122345660");
//                bb.setImageQuality(com.aspose.barcode.ImageQualityMode.ANTI_ALIAS);
                bb.save(fileName);

                BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);

                int counter = 0;
                for (BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());

                    Assert.assertEquals(result.getCodeText(), "1223456600009");
                    Assert.assertNotNull(result.getCodeType());
                }

                Assert.assertEquals(counter, 1);
            } catch (Exception e)
            {
                Assert.fail("Exception", e);
            }
        }
    }
}
