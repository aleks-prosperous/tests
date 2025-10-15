package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.lang.reflect.Method;


@Test(description = "Tests for Issue33167.")
public class Issue33167
{
    private final String folder = Global.
            getTestDataFolder("Issues" + File.separator + "Issue33167");

    @BeforeMethod
    public void setUp(Method testMethod)
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void File1()
    {
        String fileName = Global.pathCombine(folder, "1.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("1470.113051722", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("1470.113051722", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
        public void File2()
        {
            String fileName = Global.pathCombine(folder, "2.tif");
            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
            {
                reader.setQualitySettings(QualitySettings.getHighQuality());
                Assert.assertEquals(reader.readBarCodes().length, 2);
                Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII), reader.getFoundBarCodes()[0].getCodeType().getTypeName());
                CheckCodetextWithErrors("1470.115232944", reader.getFoundBarCodes()[0].getCodeText(), 1);
                Assert.assertTrue(reader.getFoundBarCodes()[1].getCodeType().containsAny(DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII), reader.getFoundBarCodes()[1].getCodeType().getTypeName());
                CheckCodetextWithErrors("1470.115232944", reader.getFoundBarCodes()[1].getCodeText(), 2);
            }
        }

    private void CheckCodetextWithErrors(String expected, String actual, int allowedErrors)
    {
        if (expected.length() != actual.length()) Assert.assertEquals(expected, actual);//fail error

        int errors = 0;
        for (int i = 0; i < expected.length(); ++i)
            if (expected.charAt(i) != actual.charAt(i))
                errors++;

        if (allowedErrors < errors)//fail error
            Assert.assertEquals(expected, actual);
    }
}

