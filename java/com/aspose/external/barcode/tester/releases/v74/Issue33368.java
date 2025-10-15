package com.aspose.external.barcode.tester.releases.v74;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue33368
{
    private final String folder = Global.getIssuesTestImagePath("Issue33368");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


        @Test
    public void Bad()
    {
        String filename = Global.pathCombine(folder, "2012103010000052.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("28002 21241552  010", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("SIGI 21241552  987   09272012102117  WC BENEFITS ACCEPTANCE                                                                                        ", reader.getFoundBarCodes()[1].getCodeText());
        }
    }
}
