package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


@Test
public class BARCODJAVA33196
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
        files.add(filePath + "image095020101129.tif");

        for (String fileName : files)
        {
            try
            {


                BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);

                int counter = 0;
                for (BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());

                    Assert.assertEquals(result.getCodeText(), "179848");
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
