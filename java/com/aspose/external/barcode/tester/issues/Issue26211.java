package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.MultyDecodeType;
import com.aspose.external.barcode.tester.helpers.RecognitionHelper;
import com.aspose.external.barcode.tester.helpers.data.CodetextWithType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue26211.")
public class Issue26211
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue26211");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void aztecDatamatrix()
    {
        RecognitionHelper.testRecognized(folder, "page_2.tif", new MultyDecodeType(DecodeType.AZTEC, DecodeType.DATA_MATRIX),
                new CodetextWithType[] {
                        new CodetextWithType(DecodeType.DATA_MATRIX, "46092$P$33124$P$0"),
                        new CodetextWithType(DecodeType.AZTEC, "165844"),
                        new CodetextWithType(DecodeType.AZTEC, "418085"),
                        new CodetextWithType(DecodeType.AZTEC, "418087"),
                        new CodetextWithType(DecodeType.DATA_MATRIX, "46092$P$33124$P$0"),
                }, true, false, true);
    }
}

