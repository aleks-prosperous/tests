package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BARCODJAVA33441
{
    final String folder = Global.getTestDataFolder("Issues/Issue33857");

    @BeforeMethod
    public void setUp()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }


    @Test
    public void testMainImage()
    {
        String fileName = Global.pathCombine(folder, "saved109.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        List<String> lResults = new ArrayList<String>();
        for (BarCodeResult result : reader.readBarCodes())
        {
            lResults.add(result.getCodeText());
        }

        Assert.assertEquals("McCode={MATR=290964\nUNIDADE=20\nNOME=ALEXANDRE FERREIRA SENNA}", lResults.get(0));


    }
}
