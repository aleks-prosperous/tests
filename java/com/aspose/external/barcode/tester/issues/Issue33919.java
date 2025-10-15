package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

/**
 * <p>
 * Tests Issue33919 tests. Can't create Code128 barcode with standard 'f' character
 * </p>
 */
@Test(description = "Tests for Issue33919.")
public class Issue33919
{
    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Generate and recognize Code128 with char 'f'
     * </p>
     */
    @Test
    public void testChar_f()
    {
        TestExternalHelper.generateAndRecognize("fABCf123", "fABCf123", EncodeTypes.CODE_128, DecodeType.CODE_128);
    }

    /**
     * <p>
     * Generate and recognize Code128, GS1Code128, GS1Datamatrix with FNC1
     * </p>
     */
    @Test
    public void testFnc1()
    {
        TestExternalHelper.generateAndRecognize("(02)04006664241007(37)1(400)7019590754",
                "(02)04006664241007(37)1(400)7019590754", EncodeTypes.CODE_128, DecodeType.CODE_128);
        TestExternalHelper.generateAndRecognize("(02)04006664241007(37)1(400)7019590754",
                "(02)04006664241007(37)1(400)7019590754", EncodeTypes.GS_1_CODE_128, DecodeType.GS_1_CODE_128);
        TestExternalHelper.generateAndRecognize("(02)04006664241007(37)1(400)7019590754",
                "(02)04006664241007(37)1(400)7019590754", EncodeTypes.GS_1_DATA_MATRIX, DecodeType.GS_1_DATA_MATRIX);
    }
}

