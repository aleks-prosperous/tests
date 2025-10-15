package com.aspose.external.barcode.tester.releases.v17_3;

import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

import java.io.IOException;

public class BARCODEJSP87
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void generateBarcodeDutchKIX() throws IOException
    {
        TestExternalHelper.generateAndRecognize("258369AA", "258369AA",
                EncodeTypes.DUTCH_KIX, DecodeType.DUTCH_KIX);
    }
}
