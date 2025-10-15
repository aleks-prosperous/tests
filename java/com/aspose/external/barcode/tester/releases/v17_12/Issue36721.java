package com.aspose.external.barcode.tester.releases.v17_12;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.external.barcode.tester.helpers.RecognitionHelper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36721
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36721");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void testCode16KLink_pl()
    {
        String lVal1 = "<FNC2>Generator kodw Code-16K\r\n\r\n\r\n\r\n\r\nhttp://www.generatorkodowkreskowych.pl/c";
        String lVal2 = "ode-16k/";

        RecognitionHelper.testRecognized(folder, "code-16k_link_pl.png", DecodeType.CODE_16_K, new String[] { lVal1, lVal2 },
            ChecksumValidation.DEFAULT, false, false, false, true);
    }

        @Test
    public void testCode16K01()
    {
        RecognitionHelper.testRecognized(folder, "code-16k.png", DecodeType.CODE_16_K,
            "Nintendo 3DS Community is AWESOME!!!", true);
    }


        @Test
    public void testPharmacodeAspirin()
    {
        RecognitionHelper.testRecognized(folder, "laetus_aspirin.png", DecodeType.PHARMACODE, "177", true);
    }

        @Test
    public void testPharmacode1()
    {
        RecognitionHelper.testRecognized(folder, "Pharmacode.gif", DecodeType.PHARMACODE, "123456", true);
    }

        @Test
    public void testCode128_Nonreccode()
    {
        RecognitionHelper.testRecognized(folder, "nonreccode128.png", DecodeType.CODE_128, "AZ000000393744", true);
    }
}
