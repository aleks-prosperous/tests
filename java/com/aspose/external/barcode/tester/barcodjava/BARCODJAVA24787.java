package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(description = "Tests for BARCODJAVA-24787")
public class BARCODJAVA24787
{
    final String Folder = Global.getTestDataFolder("Issues/Issue33136");

    @BeforeMethod
    public void setUp()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void test0001_213944213946tif()
    {

        String fileName = Global.pathCombine(Folder, "0001_213944213946.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
            org.testng.Assert.assertTrue(reader.readBarCodes().length == 1, "Not recognized.");
            Assert.assertEquals("0058", reader.readBarCodes()[0].getCodeText());
    }

    @Test
    public void test0001_213944213946tif_Second()
    {
        String fileName = Global.pathCombine(Folder, "0001_213944213946.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        org.testng.Assert.assertTrue(reader.readBarCodes().length == 1, "Not recognized.");
            Assert.assertEquals("0058", reader.readBarCodes()[0].getCodeText());
    }


    @Test
    public void testcisco_MP_fax45tif()
    {
        String fileName = Global.pathCombine(Folder, "cisco_MP_fax45.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        BarCodeResult[] results = reader.readBarCodes();
            org.testng.Assert.assertTrue(results.length > 0, "Not recognized.");
            Assert.assertEquals("046346", results[0].getCodeText());
            Assert.assertEquals("046344", results[1].getCodeText(), "Correct! Need fix this test.");
    }

}
