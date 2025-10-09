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

public class BARCODJAVA33440
{
    final String folder = com.aspose.barcode.auxiliary.Global.getTestDataFolder("Issues/Issue33855");

    @BeforeMethod
    public void setUp()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }


    @Test
    public void testMainImage()
    {
        String fileName = Global.pathCombine(folder, "DOC+1+-+172.124.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        List<String> lResults = new ArrayList<String>();
        for (BarCodeResult result : reader.readBarCodes())
        {
            lResults.add(result.getCodeText());
        }

        Assert.assertEquals("McCode={LTE=313\r\nCLI=02790541736\r\nSPE=20347901\r\nEMP=20347886\r\nBLC=BLOCO 02\r\nUNI=301\r\nTPO=172.124}", lResults.get(0));


    }
}
