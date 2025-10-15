package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33595.")
public class Issue33595
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33595");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


        @Test
    public void testCJpg()
    {
        String fileName = Global.pathCombine(folder, "c.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("COMME TOI, J'AI ETE INFECTEE PAR LA MALADIE.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

