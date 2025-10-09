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
public class BARCODJAVA33296
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
}
