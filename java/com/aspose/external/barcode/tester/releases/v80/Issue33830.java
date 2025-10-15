package com.aspose.external.barcode.tester.releases.v80;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class Issue33830
{
    private static final String folder = Global.getTestDataFolder("Issues/Issue33830");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Tests recognition of image from Issue33830
    /// </summary>
        @Test
    public void testIssue33830()
    {
        String fileName = Global.pathCombine(folder, "00000020_00000006_5.tif");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("AZ000000393741", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals("AZ000000393741", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[1].getCodeType());
        }
    }
}
