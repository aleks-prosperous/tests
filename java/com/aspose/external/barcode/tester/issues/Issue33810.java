package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.aspose.barcode.barcoderecognition.RecognitionHints;


@Test(description = "Tests for Issue33810.")
public class Issue33810
{
    String folder = Global.getIssuesTestImagePath(this.getClass().getSimpleName());

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void testDataMatrixRotated()
    {
        String fileName = Global.pathCombine(folder, "2.PNG");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10056004350113100300004", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testDataMatrixRotatedAllSymbologies()
    {
        String fileName = Global.pathCombine(folder, "2.PNG");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10056004350113100300004", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testDataMatrixFileRotated()
    {
        String fileName = Global.pathCombine(folder, "2_rotated.PNG");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10056004350113100300004", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

