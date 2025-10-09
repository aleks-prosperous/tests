package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.logger.Logger;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class BARCODJAVA33462
{
    private final String folder = Global.getBarcodeJavaIssuesTestImagePath("BARCODJAVA33462");

    @BeforeMethod
    public void setUp()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }


    @Test
    public void databarExpandedStackedTest()
    {
        String file = "databarexpandedstacked.png";

        String resultExpected = "(01)90012345678908(3932)04055GBP";
        BarCodeReader reader = new BarCodeReader(folder + file, DecodeType.DATABAR_EXPANDED_STACKED);
        BarCodeResult[] results = reader.readBarCodes();
        Assert.assertEquals(resultExpected, results[0].getCodeText());
    }

    @Test(description = "BARCODJAVA-33495")
    public void databarStackedTest()
    {
        String file = "databarstacked.png";
        int expectedResultCount = 1;
        String resultExpected = "(01)00012345678905";
        BarCodeReader reader = new BarCodeReader(folder + file, DecodeType.DATABAR_STACKED);
        BarCodeResult[] results = reader.readBarCodes();
        Assert.assertEquals(resultExpected, results[0].getCodeText());
        Assert.assertEquals(results.length, expectedResultCount);
    }

    @Test
    public void databarStackedOmniDirectionalTest()
    {
        String file = "databarstackedomnidirectional.png";
        int expectedResultCount = 1;
        String resultExpected = "(01)00034567890125";
        BarCodeReader reader = new BarCodeReader(folder + file, DecodeType.DATABAR_STACKED_OMNI_DIRECTIONAL);
        BarCodeResult[] results = reader.readBarCodes();
        Assert.assertEquals(resultExpected, results[0].getCodeText());
        Assert.assertEquals(results.length, expectedResultCount);
    }
}
