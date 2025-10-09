package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

@Test
public class BARCODJAVA33302
{
    String Folder = Global.getBarcodeJavaIssuesTestImagePath(this.getClass().getSimpleName());

    @BeforeMethod
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testOne()
    {
        long s = System.currentTimeMillis();
        String filePath = Folder;
        List<String> files = new ArrayList<String>();
        files.add(filePath + "image004.jpg");

        for (String fileName : files)
        {
            try
            {
                System.out.println("File path: " + fileName);
                BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);

                int counter = 0;
                for (BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());
                    System.out.println("Code text: " + result.getCodeText());
                    Assert.assertNotNull(result.getCodeType());
                }

                Assert.assertNotEquals(counter, 0);
                System.out.println("Reads number: " + counter);
                System.out.println("Total Time File: " + fileName + " " + (System.currentTimeMillis() - s) + " MSeconds");
            } catch (Exception e)
            {
                Assert.fail("Exception", e);
            }

        }
        System.out.println("Total Time: " + (System.currentTimeMillis() - s) + " MSeconds");
    }

    @Test
    public void testTwo()
    {
        long s = System.currentTimeMillis();
        String filePath = Folder;
        List<String> files = new ArrayList<String>();
        files.add(filePath + "IMG_0041.JPG");

        for (String fileName : files)
        {
            try
            {
                System.out.println("File path: " + fileName);
                BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);

                int counter = 0;
                for (BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());
                    System.out.println("Code text: " + result.getCodeText());
                    Assert.assertNotNull(result.getCodeType());
                }

                Assert.assertNotEquals(counter, 0);
                System.out.println("Reads number: " + counter);
                System.out.println("Total Time File: " + fileName + " " + (System.currentTimeMillis() - s) + " MSeconds");
            } catch (Exception e)
            {
                Assert.fail("Exception", e);
            }

        }

        System.out.println("Total Time: " + (System.currentTimeMillis() - s) + " MSeconds");
    }
}
