package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BARCODJAVA33492
{
    @BeforeClass
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test(description = "Java specific issue that found in Issue34032.recognitionBigPicture(),blocked by CSPORT-ODS-35297")
    public void reproduceTest()
    {
        String folder = Global.getTestDataFolder("Issues/Issue34032");
        String fileName = Global.pathCombine(folder, "20141029152021675_00052.tif");
        try
        {
            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417, DecodeType.CODE_128);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(reader.readBarCodes()[0].getCodeText(), "EXP|KY|IRTF|2|1172|2013|1|A55|!");
        } catch (Exception e)
        {
            Assert.fail();
        }
    }

}
