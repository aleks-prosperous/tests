package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue34129
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34129");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue34129PolPngCompactPdf417()
    {
        BarCodeReader reader = new BarCodeReader(folder + "pol.png", DecodeType.COMPACT_PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("\0ôR¿Æ;~¸]Cô_]_]Û^CiÔ\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0u\0\0¢]yaÝ\0N\r\nZò:jÙ%Á{HïïÎäó\'W¢üý×ès{ÇÏä&dÐêâ½[°÷rêgó?", reader.getFoundBarCodes()[0].getCodeText());
    }
}
