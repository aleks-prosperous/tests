package com.aspose.external.barcode.tester.releases.v21_4;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.MaxiCodeMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37722
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_MaxiCode_Single_Zero()
    {
        String lorig = "";
        lorig += (char)0;

        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.MAXI_CODE, lorig);
        generator.getParameters().getBarcode().getMaxiCode().setMaxiCodeMode(MaxiCodeMode.MODE_4);
        BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), DecodeType.MAXI_CODE);
        BarCodeResult[] res = reader.readBarCodes();

        Assert.assertEquals(1, res.length);
        Assert.assertEquals(lorig, res[0].getCodeText());
    }
}
