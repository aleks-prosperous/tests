package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;


/**
 * <p>
 * Issue 34022 tests, GS1 encoding and decoding logic for nonstandard variants
 * </p>
 */
@Test
public class Issue34022
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Generate And Recognize "00" method encodation
     * </p>
     */
    @Test
    public void testGenerateAndRecognize00()
    {
        String str = "010001234567890510ABC123";
        String res = "(01)00012345678905(10)ABC123";
        TestExternalHelper.generateAndRecognize(str, res, EncodeTypes.DATABAR_EXPANDED, DecodeType.DATABAR_EXPANDED);
    }

    /**
     * <p>
     * Generate And Recognize "0111101" method encodation
     * </p>
     */
    @Test
    public void testGenerateAndRecognize01()
    {
        String str = "(01)98898765432106(3202)012345(15)311231";
        TestExternalHelper.generateAndRecognize(str, str, EncodeTypes.DATABAR_EXPANDED, DecodeType.DATABAR_EXPANDED);
    }

    /**
     * <p>
     * Generate And Recognize "1" method encodation
     * </p>
     */
    @Test
    public void testGenerateAndRecognize02()
    {
        String str = "(01)88898765432109(3202)01234515311231";
        TestExternalHelper.generateAndRecognize(str, str, EncodeTypes.DATABAR_EXPANDED, DecodeType.DATABAR_EXPANDED);
    }

    /**
     * <p>
     * Generate And Recognize "00" method encodation
     * </p>
     */
    @Test
    public void testGenerateAndRecognize03()
    {
        String str = "(12)651212";
        TestExternalHelper.generateAndRecognize(str, str, EncodeTypes.DATABAR_EXPANDED, DecodeType.DATABAR_EXPANDED);
    }

    /**
     * <p>
     * Generate And Recognize "00" method encodation
     * </p>
     */
    @Test
    public void testGenerateAndRecognize04()
    {
        String str = "(10)ABC(12)03";
        TestExternalHelper.generateAndRecognize(str, str, EncodeTypes.DATABAR_EXPANDED, DecodeType.DATABAR_EXPANDED);
    }

    /**
     * <p>
     * Generate And Recognize "00" method encodation
     * </p>
     */
    @Test
    public void testGenerateAndRecognize05()
    {
        String str = "(10)ABC(12)03(1203)3*3*0*(";
        TestExternalHelper.generateAndRecognize(str, str, EncodeTypes.DATABAR_EXPANDED, DecodeType.DATABAR_EXPANDED);
    }
}

