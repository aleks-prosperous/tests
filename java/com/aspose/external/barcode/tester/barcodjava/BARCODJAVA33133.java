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
public class BARCODJAVA33133
{
    @BeforeClass
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testOne()
    {


        String filePath = Global.getBarcodeJavaIssuesTestImagePath("BARCODJAVA33133/");
        List<String> files = new ArrayList<String>();
        files.add(filePath + "Postnet_1.png");

        for (String fileName : files)
        {
            try
            {


                BarCodeReader reader = new BarCodeReader(fileName, DecodeType.POSTNET);

                int counter = 0;
                for (BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());

                    Assert.assertEquals(result.getCodeText(), "12345");
                    Assert.assertNotNull(result.getCodeType());
                }

                Assert.assertEquals(counter, 1);


            } catch (Exception e)
            {
                Assert.fail("Exception", e);
            }

        }


    }

    @Test
    public void testTwo()
    {
        String filePath = Global.getBarcodeJavaIssuesTestImagePath("BARCODJAVA33133/");
        List<String> files = new ArrayList<String>();
        files.add(filePath + "Postnet_2.png");

        for (String fileName : files)
        {
            try
            {


                BarCodeReader reader = new BarCodeReader(fileName, DecodeType.POSTNET);

                int counter = 0;
                for (BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());

                    Assert.assertEquals(result.getCodeText(), "3473");
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
