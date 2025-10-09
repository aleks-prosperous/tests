package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class BARCODJAVA33495
{
    private final String folder = Global.getBarcodeJavaIssuesTestImagePath("BARCODJAVA33495");

    @BeforeMethod
    public void setUp()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }


    @Test(description = "BARCODJAVA-33495")
    public void databarStackedTest()
    {
        String file = "databarstacked.png";
        int expectedResultCount = 1;
        String expectedText = "(01)00012345678905";
        BarCodeReader reader = new BarCodeReader(folder + file, DecodeType.DATABAR_STACKED);
        int actualResultCount = 0;
        for(BarCodeResult result : reader.readBarCodes())
        {
            Assert.assertEquals(expectedText, result.getCodeText());
            actualResultCount++;
        }
        Assert.assertEquals(actualResultCount, expectedResultCount);
    }
}
