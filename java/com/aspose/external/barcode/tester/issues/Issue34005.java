//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue34005.cs" company="Aspose Pty Ltd" author="Evgeniy Timofeev" date="17.10.2014 11:46:05">
//     Copyright (c) 2012-2014 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import java.awt.image.BufferedImage;
import java.io.File;

/**
 * <p>
 * Issue34005 tests, Databar expanded format errors
 * </p>
 */
@Test
public class Issue34005
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34005");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Generate And Recognize Test (From issue description)
     * </p>
     */
    @Test
    public void testGenerateAndRecognizeExpanded()
    {
        TestExternalHelper.generateAndRecognize("(01)98765432109879(10)119586718332", "(01)98765432109879(10)119586718332",
                EncodeTypes.DATABAR_EXPANDED, DecodeType.DATABAR_EXPANDED);
    }

    /**
     * <p>
     * Test of recognition corrected databar expanded (From issue description)
     * </p>
     */
    @Test
    public void testRecognitionAi01_11_10()
    {
        String fileName = Global.pathCombine(folder, "Recognition\\(01)08481234500016(11)080919(10)XYZ.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)08481234500016(11)080919(10)XYZ", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Encode "(" as text
     * </p>
     */
    @Test
    public void testGenerationParentheses()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_EXPANDED, "(");
        {
            BufferedImage real = gen.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(real, DecodeType.DATABAR_EXPANDED);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("(", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }
}



