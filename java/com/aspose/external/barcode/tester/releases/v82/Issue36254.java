package com.aspose.external.barcode.tester.releases.v82;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Issue36254
{
    final String folder = Global.getTestDataFolder("Issues/Issue36254");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        String filename = Global.pathCombine(folder, "irregular-matrix.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("424D4F43543135425243136B492AA1C20BF4DFA964498C50214294EC4BB75E6769E75A6EB2313A83C" +
                "075", reader.getFoundBarCodes()[0].getCodeText());
    }
}
