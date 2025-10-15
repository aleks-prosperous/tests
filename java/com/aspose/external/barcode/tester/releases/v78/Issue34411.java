package com.aspose.external.barcode.tester.releases.v78;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class Issue34411
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34411");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test //TODO check, it was OutOfMemoryError: Java heap space on Jenkins. Fixed by incresng Xmx in build.gradle
    public void test()
    {
        BarCodeReader reader = new BarCodeReader(folder + "/Page1.jpg", DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("ND062", reader.getFoundBarCodes()[0].getCodeText());
    }
}
