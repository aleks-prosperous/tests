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
public class BARCODJAVA33316
{
    String folder = Global.getBarcodeJavaIssuesTestImagePath(this.getClass().getSimpleName());

    @BeforeClass
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testOne()
    {
        List<String> files = new ArrayList<String>();
        files.add(folder + "SKMBT_C35310102115451_2.png");

        for (String fileName : files)
        {
            try
            {
                BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);

                int counter = 0;
                for(BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());
                    Assert.assertNotNull(result.getCodeType());
                }

                Assert.assertEquals(counter, 6);
            } catch (Exception e)
            {
                Assert.fail("Exception", e);
            }

        }
    }
}
