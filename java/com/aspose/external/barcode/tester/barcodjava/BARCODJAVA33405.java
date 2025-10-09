package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.logger.Logger;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

@Test
public class BARCODJAVA33405
{
    @BeforeMethod
    public void setUp()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void reproduceTest() throws IOException
    {
        String strBasePath = Global.getBarcodeJavaIssuesTestImagePath("BARCODJAVA33405");
        ArrayList<String> strFiles = new ArrayList<String>();
//        strFiles.add(strBasePath + "full_page.tiff");
        strFiles.add(strBasePath + "clear_page.tiff");

        for (int i = 0; i < strFiles.size(); i++)
        {
            String fileName = strFiles.get(i);
            long startTime = System.currentTimeMillis();
            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.INTERLEAVED_2_OF_5);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            long elapsedTime = System.currentTimeMillis() - startTime;
            Assert.assertEquals(reader.readBarCodes()[0].getCodeText(), "08005172169970");
        }
    }
}
