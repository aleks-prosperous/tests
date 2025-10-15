//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33480.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="28.08.2013 13:31:15">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
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

//import com.aspose.barcode.barcoderecognition.RecognitionHints;


@Test(description = "Tests for Issue33480.")
public class Issue33480
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33480");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testRotated()
    {
        String fileName = Global.pathCombine(folder, "PDF-417.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(
                "In addition to features typical of two dimensional bar codes, PDF417's capabilities include:\n\n    * Linking. PDF417 symbols can link to other symbols which are scanned in sequence allowing even more data to be stored.\n    * User-specified dimensions. The user can decide how wide the narrowest vertical bar (X dimension) is, and how tall the rows are (Y dimension).\n    * Public domain format. Anyone can implement systems using this format without any license.[citati\n\nEncoding\n\nOf the 929 available codewords, 900 are used for data, and 29 for special functions. Three different encoding schemes are defined and can be mixed as necessary within a single symbol.\n\n    * Text: each codeword represents one or two characters.\n    * Byte: each group of 5 codewords represents 6 bytes.\n    * Numeric: groups of up to 15 codewords represent as many as 44 decimal digits.",
                reader.getFoundBarCodes()[0].getCodeText());
    }
}
