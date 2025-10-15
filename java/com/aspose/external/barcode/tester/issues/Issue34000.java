//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue34000.cs" company="Aspose Pty Ltd" author="Evgeniy Timofeev" date="30.10.2014 23:25:07">
//     Copyright (c) 2012-2014 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

/**
 * <p>
 * Tests for Issue 34000
 * </p>
 */
@Test(description = "Tests for Issue-34000.")
public class Issue34000
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void databarExpandedStackedTest()
    {
        TestExternalHelper.generateAndRecognize("(01)11235813213453(10)FIBONACCI", "(01)11235813213453(10)FIBONACCI",
                EncodeTypes.DATABAR_EXPANDED_STACKED, DecodeType.DATABAR_EXPANDED_STACKED);

        TestExternalHelper.generateAndRecognize("(01)23571113171907(22)data", "(01)23571113171907(22)data",
                EncodeTypes.DATABAR_EXPANDED_STACKED, DecodeType.DATABAR_EXPANDED_STACKED);

        TestExternalHelper.generateAndRecognize("(240)asposeBarcode", "(240)asposeBarcode", EncodeTypes.DATABAR_EXPANDED_STACKED,
                DecodeType.DATABAR_EXPANDED_STACKED);

        TestExternalHelper.generateAndRecognize("(10)GenerateRecognize", "(10)GenerateRecognize",
                EncodeTypes.DATABAR_EXPANDED_STACKED, DecodeType.DATABAR_EXPANDED_STACKED);
    }
}

