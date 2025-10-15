package com.aspose.external.barcode.tester.releases.v17_3;


import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

import java.io.IOException;

public class BARCODEJSP86
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void generateBarcodeDataLogic2of5() throws IOException
    {
        TestExternalHelper.generateAndRecognize("8500060000", "8500060000",
                EncodeTypes.DATA_LOGIC_2_OF_5, DecodeType.DATA_LOGIC_2_OF_5);
    }
}
