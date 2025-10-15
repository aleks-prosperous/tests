package com.aspose.external.barcode.tester.releases.v17_3;

import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

import java.io.IOException;

public class BARCODEJSP3
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void generateBarcodeSwissPostParcel() throws IOException
    {
         TestExternalHelper.generateAndRecognize("999123456CH", "RN999123458CH",
                 EncodeTypes.SWISS_POST_PARCEL, DecodeType.SWISS_POST_PARCEL);
    }
}

