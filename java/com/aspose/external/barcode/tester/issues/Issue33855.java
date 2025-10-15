package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33855.")
public class Issue33855
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33855");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }


    @Test
    public void testMainImage()
    {
        String fileName = Global.pathCombine(folder, "DOC+1+-+172.124.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("McCode={LTE=313\r\nCLI=02790541736\r\nSPE=20347901\r\nEMP=20347886\r\nBLC=BLOCO 02\r\nUNI=301\r\nTPO=172.124}", reader.getFoundBarCodes()[0].getCodeText());
    }
}

