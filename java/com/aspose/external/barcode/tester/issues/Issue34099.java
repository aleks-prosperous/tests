//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue34099.cs" company="Aspose Pty Ltd" author="Evgeniy Timofeev" date="12.02.2015 11:36:24">
//     Copyright (c) 2015 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;


/**
 * <p>
 * Tests Issue34099 tests. Incorrect encoding punctuaion in PDF417 and MicroPDF417 barcodes
 * </p>
 */
@Test(description = "Tests for Issue34099.")
public class Issue34099
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

    @Test
    public void generateAndRecognizePunctuation()
    {
        String codetext = ";@[]_~!";
        TestExternalHelper.generateAndRecognize(codetext, codetext, EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);

        codetext = "););";
        TestExternalHelper.generateAndRecognize(codetext, codetext, EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);

        codetext = "(){}?";
        TestExternalHelper.generateAndRecognize(codetext, codetext, EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);

        codetext = "123);";
        TestExternalHelper.generateAndRecognize(codetext, codetext, EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);

        codetext = ";A!";
        TestExternalHelper.generateAndRecognize(codetext, codetext, EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);

        codetext = "https://ocr.aspose.com/jira/browse/BARCODENET-34099";
        TestExternalHelper.generateAndRecognize(codetext, codetext, EncodeTypes.MICRO_PDF_417, DecodeType.MICRO_PDF_417);
    }
}

