package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue27855.")
public class Issue27855
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue27855");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void QR_1()
    {
        String fileName = Global.pathCombine(folder, "1.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SYSLOGPPS:V:2;T:1;F:1;D0:3;D1:111443;D2:AN;D3: ;D4: ;D5: ;DT:0;DA:Angebot;DO:7;TS:20110616T093101;;", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void QR_2()
    {
        String fileName = Global.pathCombine(folder, "nr3.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SYSLOGPPS:V:2;T:1;F:1;D0:3;D1:111417;D2:AN;D3: ;D4: ;D5: ;DT:0;DA: ;DO:0;TS:20110615T080318;;", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void QR_3()
    {
        String fileName = Global.pathCombine(folder, "nr4.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SYSLOGPPS:V:2;T:1;F:1;D0:3;D1:111443;D2:AN;D3: ;D4: ;D5: ;DT:0;DA:Angebot;DO:7;TS:20110616T093101;;", reader.getFoundBarCodes()[0].getCodeText());

    }

    @Test
    public void QR_4()
    {
        String fileName = Global.pathCombine(folder, "nr5.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SYSLOGPPS:V:2;T:1;F:1;D0:3;D1:401821;D2:T6;D3: ;D4: ;D5: ;DT:0;DA: ;DO:0;TS:20110621T081826;;", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void QR_5()
    {
        String fileName = Global.pathCombine(folder, "nr6.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SYSLOGPPS:V:2;T:1;F:1;D0:3;D1:401868;D2:T6;D3: ;D4: ;D5: ;DT:0;DA: ;DO:0;TS:20110621T081511;;", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void QR_6()
    {
        String fileName = Global.pathCombine(folder, "nrp1.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SYSLOGPPS:V:2;T:1;F:1;D0:3;D1:111290;D2:AN;D3: ;D4: ;D5: ;DT:0;DA:Angebot mit Anschreiben;DO:7;TS:20110526T131325;;", reader.getFoundBarCodes()[0].getCodeText());
    }
}

