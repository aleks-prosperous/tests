package com.aspose.external.barcode.tester.releases.v17_3;

import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

import java.io.IOException;

public class BARCODEJSP14
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void generateBarcodeItalianPost25() throws IOException
    {
        TestExternalHelper.generateAndRecognize("7878978", "07878978",
                EncodeTypes.ITALIAN_POST_25, DecodeType.ITALIAN_POST_25);
    }
}
