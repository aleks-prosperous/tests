package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

import java.awt.image.BufferedImage;


/**
 * <p>
 * Tests Issue34153 tests. Extra letters in codetext when checksum off
 * </p>
 */
@Test(description = "Tests for Issue34153.")
public class Issue34153
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
     * Test for AustralianPostParcel
     * </p>
     */
    @Test
    public void testAustralianPostParcel()
    {
        BufferedImage bmp = TestExternalHelper.generateInMemory("99700160DJS123456701021502000", EncodeTypes.AUSTRALIAN_POSTE_PARCEL);
        recognizeWithChecksumOff(bmp, DecodeType.AUSTRALIAN_POSTE_PARCEL, "99700160DJS123456701021502000");
    }

    /**
     * <p>
     * Test for SwissPostParcel
     * </p>
     */
    @Test
    public void testSwissPostParcel()
    {
        BufferedImage bmp = TestExternalHelper.generateInMemory("0610", EncodeTypes.SWISS_POST_PARCEL);
        recognizeWithChecksumOff(bmp, DecodeType.SWISS_POST_PARCEL, "0610");
    }

    /**
     * <p>
     * Test for Code128
     * </p>
     */
    @Test
    public void testCode128()
    {
        BufferedImage bmp = TestExternalHelper.generateInMemory("ABCD12345", EncodeTypes.CODE_128);
        recognizeWithChecksumOff(bmp, DecodeType.CODE_128, "ABCD12345");
    }

    /// <summary>
    /// Test for GS1Code128
    /// </summary>
    @Test
    public void testGs1Code128()
    {
        BufferedImage bmp = TestExternalHelper.generateInMemory("(02)04006664241007(37)1(400)7019590754", EncodeTypes.GS_1_CODE_128);
        recognizeWithChecksumOff(bmp, DecodeType.GS_1_CODE_128, "(02)04006664241007(37)1(400)7019590754");
    }

    /**
     * <p>
     * Recognize barcode without checksum validation
     * </p>
     *
     * @param bitmap           Barcode bitmap
     * @param barcodeReadType  Barcode read type
     * @param expectedCodetext Expected codetext
     */
    private void recognizeWithChecksumOff(BufferedImage bitmap, BaseDecodeType barcodeReadType, String expectedCodetext)
    {
        final BarCodeReader reader = new BarCodeReader(bitmap, barcodeReadType);
        reader.setQualitySettings(QualitySettings.getHighPerformance());

        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(expectedCodetext, reader.getFoundBarCodes()[0].getCodeText());
    }
}

