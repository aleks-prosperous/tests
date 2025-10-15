package com.aspose.external.barcode.tester.releases.v77;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class Issue34324
{
    final String Folder = Global.getTestDataFolder("Issues/Issue34324");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        String codeText = "SCN000184622";
        BarCodeReader reader = new BarCodeReader(Folder + "/Test3.png", DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SCN000184622", reader.getFoundBarCodes()[0].getCodeText());
    }
}
