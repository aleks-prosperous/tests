//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue34008.cs" company="Aspose Pty Ltd" author="Evgeniy Timofeev" date="18.11.2014 12:46:00">
//     Copyright (c) 2012-2014 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import java.awt.image.BufferedImage;
import java.io.File;


/**
 * <p>
 * Tests for Issue 34008 - Add support to encode PatchCode symbology
 * </p>
 */
public class Issue34008
{

    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34008");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Tests Patch I
     * </p>
     */
    @Test
    public void testPatch1()
    {
        testPatchCode("Patch I");
    }


    /**
     * <p>
     * Tests Patch II
     * </p>
     */
    @Test
    public void testPatch2()
    {
        testPatchCode("Patch II");
    }

    /**
     * <p>
     * Tests Patch III
     * </p>
     */
    @Test
    public void testPatch3()
    {
        testPatchCode("Patch III");
    }

    /**
     * <p>
     * Tests Patch IV
     * </p>
     */
    @Test
    public void testPatch4()
    {
        testPatchCode("Patch IV");
    }

    /**
     * <p>
     * Tests Patch T
     * </p>
     */
    @Test
    public void testPatch5()
    {
        testPatchCode("Patch T");
    }

    /**
     * <p>
     * Tests Patch VI
     * </p>
     */
    @Test
    public void testPatch6()
    {
        testPatchCode("Patch VI");
    }

    /**
     * <p>
     * Generates and recognizes PatchCode barcode from codetext
     * </p>
     *
     * @param str PatchCode value
     */
    private static void testPatchCode(String str)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.PATCH_CODE, str);
        {
            BufferedImage bitmap = gen.generateBarCodeImage();
            TestExternalHelper.recognizeInMemory(str, bitmap, DecodeType.PATCH_CODE);
        }
    }
}

