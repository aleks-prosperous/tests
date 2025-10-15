package com.aspose.external.barcode.tester.releases.v17_3;

import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

import java.io.IOException;

public class BARCODEJSP13
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void generateBarcodeMatrix2of5() throws IOException
    {
       TestExternalHelper.generateAndRecognize("88888", "88888",
               EncodeTypes.MATRIX_2_OF_5, DecodeType.MATRIX_2_OF_5);
    }
}
