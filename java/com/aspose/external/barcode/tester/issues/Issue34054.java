package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import java.io.File;
import java.io.IOException;

/**
 * <p>
 * Tests Issue34054 tests. Add support of Micro PDF417 code
 * </p>
 */
@Test(description = "Tests for Issue34054.")
public class Issue34054
{
    private final String folder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue34054");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Generate and save picures
     * </p>
     */
    public void generate() throws IOException
    {
        String codetext = "12345";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MICRO_PDF_417, codetext);
        gen.save(Global.pathCombine(folder, codetext + ".png"));

        codetext = "Barcode gen";
        gen = new BarcodeGenerator(EncodeTypes.MICRO_PDF_417, codetext);
        gen.save(Global.pathCombine(folder, codetext + ".png"));

        codetext = "BARCODENET-34054 - Add support of Micro PDF417 code";
        gen = new BarcodeGenerator(EncodeTypes.MICRO_PDF_417, codetext);
        gen.save(Global.pathCombine(folder, codetext + ".png"));
    }

    /**
     * <p>
     * Tests 1-column barcodes generation
     * </p>
     */
    @Test
    public void generateAndRecognize1Column()
    {
        // 1 column - 11 rows
        TestExternalHelper.generateAndRecognize("AABBCC", "AABBCC", EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
        // 1 - 14
        TestExternalHelper.generateAndRecognize("AABBCCEEAA", "AABBCCEEAA", EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
        // 1 - 17
        TestExternalHelper.generateAndRecognize("AABBCCAABBCCEEAASSAA", "AABBCCAABBCCEEAASSAA", EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
        // 1 - 24
        TestExternalHelper.generateAndRecognize("AABBCCAABBCCEEAASSAAEEAASSAA", "AABBCCAABBCCEEAASSAAEEAASSAA", EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
        // 1 - 28
        TestExternalHelper.generateAndRecognize("AABBCCAABBCCEEAASSAAEEAASSAAEEAASSAAWW", "AABBCCAABBCCEEAASSAAEEAASSAAEEAASSAAWW", EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
    }

    /**
     * <p>
     * Tests 2-column barcodes generation
     * </p>
     */
    @Test
    public void generateAndRecognize2Column()
    {
        // 2 - 17
        TestExternalHelper.generateAndRecognize("AABBCCAABBCCEEAASSAAEEAASSAAEEAASSAAWWMMTT", "AABBCCAABBCCEEAASSAAEEAASSAAEEAASSAAWWMMTT", EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
        // 2 - 20
        TestExternalHelper.generateAndRecognize("AABBCCAABBCCEEAASSAAEEAASSAAEEAASSAAWWMMTTAABBCCAA", "AABBCCAABBCCEEAASSAAEEAASSAAEEAASSAAWWMMTTAABBCCAA", EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
        // 2 - 23
        TestExternalHelper.generateAndRecognize("AABBCCAABBCCEEAASSAAEEAASSAAEEAASSAAWWMMTTAABBCCAABBCCEEAASSAA", "AABBCCAABBCCEEAASSAAEEAASSAAEEAASSAAWWMMTTAABBCCAABBCCEEAASSAA", EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
        // 2 - 26
        TestExternalHelper.generateAndRecognize("AABBCCAABBCCEEAASSAAEEAASSAAEEAASSAAWWMMTTAABBCCAABBCCEEAASSAAEEAASSAAEE", "AABBCCAABBCCEEAASSAAEEAASSAAEEAASSAAWWMMTTAABBCCAABBCCEEAASSAAEEAASSAAEE", EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
    }

    /**
     * <p>
     * Tests 3-column barcodes generation
     * </p>
     */
    @Test
    public void generateAndRecognize3Column()
    {
        // 3 - 26
        TestExternalHelper.generateAndRecognize(
                "AABBCCAABBCCEEAASSAAEEAASSAAEEAASSAAWWMMTTAABBCCAABBCCEEAASSAAEEAASSAAEEAABBCCAABBCC",
                "AABBCCAABBCCEEAASSAAEEAASSAAEEAASSAAWWMMTTAABBCCAABBCCEEAASSAAEEAASSAAEEAABBCCAABBCC",
                EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
        // 3 - 32
        TestExternalHelper.generateAndRecognize(
                "Other questions could involve the State Department response to the terrorist bombing of the U.S.",
                "Other questions could involve the State Department response to the terrorist bombing of the U.S.",
                EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
        // 3 - 38
        TestExternalHelper.generateAndRecognize(
                "Questions are expected to range from a security vacuum in Northern Africa to new cables suggesting that Ambassador Christopher Stevens",
                "Questions are expected to range from a security vacuum in Northern Africa to new cables suggesting that Ambassador Christopher Stevens",
                EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
        // 3 - 44
        TestExternalHelper.generateAndRecognize(
                "Questions are expected to range from a security vacuum in Northern Africa to new cables suggesting that Ambassador Christopher Stevens, who was killed",
                "Questions are expected to range from a security vacuum in Northern Africa to new cables suggesting that Ambassador Christopher Stevens, who was killed",
                EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
    }

    /**
     * <p>
     * Tests 4-column barcodes generation
     * </p>
     */
    @Test
    public void generateAndRecognize4Column()
    {
        // 4 - 32
        TestExternalHelper.generateAndRecognize(
                "Questions are expected to range from a security vacuum in Northern Africa to new cables suggesting that Ambassador Christopher Stevens, who was killed in the ",
                "Questions are expected to range from a security vacuum in Northern Africa to new cables suggesting that Ambassador Christopher Stevens, who was killed in the ",
                EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
        // 4 - 38
        TestExternalHelper.generateAndRecognize(
                "Questions are expected to range from a security vacuum in Northern Africa to new cables suggesting that Ambassador Christopher Stevens, who was killed in the September 11 assault.",
                "Questions are expected to range from a security vacuum in Northern Africa to new cables suggesting that Ambassador Christopher Stevens, who was killed in the September 11 assault.",
                EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
        // 4 - 44
        TestExternalHelper.generateAndRecognize(
                "Questions are expected to range from a security vacuum in Northern Africa to new cables suggesting that Ambassador Christopher Stevens, who was killed in the September 11 assault. Questions are expected to range from a security",
                "Questions are expected to range from a security vacuum in Northern Africa to new cables suggesting that Ambassador Christopher Stevens, who was killed in the September 11 assault. Questions are expected to range from a security",
                EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
    }

    /**
     * <p>
     * Tests digits
     * </p>
     */
    @Test
    public void generateAndRecognizeDigits()
    {
        TestExternalHelper.generateAndRecognize("AA23CC", "AA23CC", EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
        TestExternalHelper.generateAndRecognize("1234123456", "1234123456", EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
        TestExternalHelper.generateAndRecognize("AABBCCAABBCCEEAA88AA", "AABBCCAABBCCEEAA88AA", EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
    }
}

