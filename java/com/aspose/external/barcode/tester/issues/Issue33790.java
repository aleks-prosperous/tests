//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33790.cs" company="Aspose Pty Ltd" author="Evgeniy Timofeev" date="16.01.2015 12:36:06">
//     Copyright (c) 2012-2015 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


/**
 * <p>
 * Tests for the issue 33790
 * </p>
 */
@Test(description = "Tests for Issue33790.")
public class Issue33790
{
    /**
     * <p>
     * Path to generatedFolder with files for testing Issue33790.
     * </p>
     */
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33790");

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

    @Test
    public void testWithoutSimbology()
    {
        final String fileName = "02.tif";
        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("(00)359007731648000207", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("(00)359007731648000207", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void testWithSymbology()
    {
        final String fileName = "02.tif";
        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128, DecodeType.GS_1_CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("(00)359007731648000207", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("(00)359007731648000207", reader.getFoundBarCodes()[1].getCodeText());
    }
}

