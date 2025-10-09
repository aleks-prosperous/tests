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

//import com.aspose.barcode.barcoderecognition.RecognitionHints.Orientation;

@Test
public class BARCODJAVA33295
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
        String fileName = filePath + "1.tif";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39_FULL_ASCII);
        int counter = 0;
        for (BarCodeResult result : reader.readBarCodes())
        {
            counter++;
            Assert.assertNotNull(result.getCodeText());

            Assert.assertNotNull(result.getCodeType());
        }

        Assert.assertNotEquals(counter, 0);
    }

    @Test
    public void testTwo()
    {
        //Stopwatch s = new Stopwatch();
        //s.start();
        String filePath = Folder;
        List<String> files = new ArrayList<String>();
        files.add(filePath + "2.tif");

        for (String fileName : files)
        {
            try
            {

                BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39_FULL_ASCII);

                int counter = 0;
                for (BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());

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
