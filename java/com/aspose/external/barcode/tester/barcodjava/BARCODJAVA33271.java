package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
//import com.aspose.ms.System.Diagnostics.Stopwatch;

@Test
public class BARCODJAVA33271
{
    String Folder = Global.getTestDataFolder("BarCodeRelease/BARCODJAVA33273");

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
        files.add(filePath + "input.jpg");

        for (String fileName : files)
        {
            try
            {

                File file = new File(fileName);
                BarCodeReader reader = new BarCodeReader(file.getAbsolutePath(), DecodeType.CODE_128);

                int counter = 0;
                for (BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());

                    Assert.assertEquals(result.getCodeText(), "<FNC1>000152261241000432");
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
