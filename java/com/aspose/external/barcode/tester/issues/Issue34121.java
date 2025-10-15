package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;


/**
 * <p>
 * Tests Issue34121 tests. Сode128 recognizer confuses f and "FNC1".
 * </p>
 */
@Test(description = "Tests for Issue34121.")
public class Issue34121
{
    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Generate and recognize  Code128 with start char "f"
     * </p>
     */
    @Test
    public void testCode128()
    {
        TestExternalHelper.generateAndRecognize("ff", "ff", EncodeTypes.CODE_128, DecodeType.CODE_128);
        TestExternalHelper.generateAndRecognize("fb9b777c-4dd0-4cfe-8354-386e38d7f48b",
                "fb9b777c-4dd0-4cfe-8354-386e38d7f48b", EncodeTypes.CODE_128, DecodeType.CODE_128);
    }
}

