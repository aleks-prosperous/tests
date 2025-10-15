package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue-32622.")
public class Issue32622
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue32622");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void recognize()
    {
        String fileName = Global.pathCombine(folder, "IMG0.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SYSLOGPPS:V:2;T:1;F:1;D0:2;D1:319222;D2:BE;D3:1;D4: ;D5: ;DT:0;DA: ;DO:0;TS:20110907T080132;;", reader.getFoundBarCodes()[0].getCodeText());
    }
}

