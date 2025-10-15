//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33817.cs" company="Aspose Pty Ltd" author="Evgeniy Timofeev" date="18.11.2014 11:46:05">
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
 * Issue 33817 test, generate a Databar Expanded code with a specified string
 * </p>
 */
public class Issue33817
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
     * databar expanded
     * </p>
     */
    @Test
    public void testGenerateAndRecognize01()
    {
        String str = "08110100775670992573125110711101107219211030193140420";
        TestExternalHelper.generateAndRecognize(str, str, EncodeTypes.DATABAR_EXPANDED, DecodeType.DATABAR_EXPANDED);
    }

    /**
     * <p>
     * databar expanded stacked
     * </p>
     */
    @Test
    public void testGenerateAndRecognize02()
    {
        String str = "08110100775670992573125110711101107219211030193140420";
        TestExternalHelper.generateAndRecognize(str, str, EncodeTypes.DATABAR_EXPANDED_STACKED, DecodeType.DATABAR_EXPANDED_STACKED);
    }
}

