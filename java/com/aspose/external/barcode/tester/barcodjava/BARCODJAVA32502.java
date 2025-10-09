package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


@Test
public class BARCODJAVA32502
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


        String filePath = Folder;
        List<String> files = new ArrayList<String>();
        files.add(filePath + "BarCodes.bmp");

        for (String fileName : files)
        {
            try
            {


                BarCodeReader reader = new BarCodeReader(fileName);

                int counter = 0;
                for (BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());

                    Assert.assertEquals(result.getCodeText(), "12345678");
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
