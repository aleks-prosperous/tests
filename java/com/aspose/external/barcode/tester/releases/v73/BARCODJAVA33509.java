package com.aspose.external.barcode.tester.releases.v73;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.logger.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

@Test
public class BARCODJAVA33509
{
    @AfterMethod
    public void afterFinish(Method testMethod)
    {
        Logger.methodFinished(getClass().getName() + "." + testMethod.getName());
    }

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


    @Test
    public void testIssue() throws IOException
    {
        BarCodeReader reader = new BarCodeReader(Global.getBarcodeJavaIssuesTestImagePath("BARCODJAVA33509") + "/test1.jpg", DecodeType.AZTEC);
//        reader.setManualHints(ManualHint.MEDIAN_SMOOTHING);

        int actualBarcodeCount = 0;
        int expectedBarcodeCount = 1;
        for (BarCodeResult result : reader.readBarCodes())
        {
            Logger.debug("codeText: " + result.getCodeText() + " Type: " + result.getCodeType());
            Assert.assertEquals(DecodeType.AZTEC, result.getCodeType());
            actualBarcodeCount++;
        }
        Assert.assertEquals(actualBarcodeCount, expectedBarcodeCount);

    }
}
