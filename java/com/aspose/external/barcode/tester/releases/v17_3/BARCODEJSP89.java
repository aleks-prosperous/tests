package com.aspose.external.barcode.tester.releases.v17_3;

import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

import java.io.IOException;

public class BARCODEJSP89
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test(enabled = true) //TODO BARCODEJSP-181
    public void generateBarcodeUpcaGs1DatabarCoupon() throws IOException
    {
       TestExternalHelper.generateAndRecognize("512345678900(8110)001234502239811110555", "512345678900",
               EncodeTypes.UPCA_GS_1_DATABAR_COUPON, DecodeType.UPCA);
    }
}
