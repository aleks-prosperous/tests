package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class BARCODJAVA33415
{
    String Folder = Global.getBarcodeJavaIssuesTestImagePath(this.getClass().getSimpleName());

    @BeforeMethod
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void reproduceTest() throws IOException
    {
        long s = System.currentTimeMillis();
        String strBasePath = Folder;
        ArrayList<String> strFiles = new ArrayList<String>();
        strFiles.add(strBasePath + "7102019531_177_1040_20137114224.tif");

        for (int i = 0; i < strFiles.size(); i++)
        {
            String fileName = strFiles.get(i);
            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
            long time = System.currentTimeMillis();
            for (BarCodeResult result : reader.readBarCodes())
            {
                System.out.println(fileName + " codetext: " + result.getCodeText());
            }
            System.out.println("Recognition time" + (System.currentTimeMillis() - time) / 1000d);

        }

        System.out.println("Total Time: " + (System.currentTimeMillis() - s) / 1000d + "Seconds");
    }
}
