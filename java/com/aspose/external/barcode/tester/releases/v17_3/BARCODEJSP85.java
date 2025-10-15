package com.aspose.external.barcode.tester.releases.v17_3;

import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

import java.io.IOException;

public class BARCODEJSP85
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void generateBarcodeCode32() throws IOException
    {
         TestExternalHelper.generateAndRecognize("123456788", "123456788",
                 EncodeTypes.CODE_32, DecodeType.CODE_32);
    }
}
