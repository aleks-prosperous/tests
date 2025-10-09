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
//import com.aspose.ms.System.Diagnostics.Stopwatch;

@Test
public class BARCODJAVA33255
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
        //Stopwatch s = new Stopwatch();
        //s.start();
        String filePath = Folder;
        List<String> files = new ArrayList<String>();
        files.add(filePath + "out.gif.png");

        for (String fileName : files)
        {
            try
            {

                BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);

                int counter = 0;
                for (BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());

                    Assert.assertEquals(result.getCodeText(), "ThisIsATest(){}|/=+- !@#$%^&*");
                    Assert.assertNotNull(result.getCodeType());
                }

                Assert.assertNotEquals(counter, 0);


            } catch (Exception e)
            {
                Assert.fail("Exception", e);
            }

        }

        //s.stop();

    }
}
