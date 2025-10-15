package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33361.")
public class Issue33361
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33361");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void demo_data_matrix_encodergif()
    {
        String fileName = Global.pathCombine(folder, "data-matrix-encoder.gif");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Barcodesoft | autoid, bar code, RFID", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void demo_DMxDescgif()
    {
        String fileName = Global.pathCombine(folder, "DMxDesc.gif");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SYMBOLOGY RESEARCH CENTER", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void demo_Datamatrix12jpg()
    {
        String fileName = Global.pathCombine(folder, "Datamatrix12.jpg");
        BarCodeReader reader = new BarCodeReader(fileName);
        try
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            int[] expected = {87, 105, 107, 105, 112, 101, 100, 105, 97, 32, 111, 110, 32, 101, 114, 105,
                    110, 111, 109, 97, 105, 110, 101, 110, 32, 116, 105, 101, 116, 111, 115, 97, 110, 97,
                    107, 105, 114, 106, 97, 44, 32, 106, 111, 115, 116, 97, 32, 108, 246, 121, 116, 121,
                    121, 32, 112, 97, 108, 106, 111, 110, 32, 116, 105, 101, 116, 111, 97, 32, 109, 109,
                    46, 32, 118, 105, 105, 118, 97, 107, 111, 111, 100, 101, 105, 115, 116, 97, 46};
            String actual = reader.getFoundBarCodes()[0].getCodeText();
            for (int i = 0; i < actual.length(); i++)
            {
                Assert.assertEquals(expected[i], (int) actual.charAt(i));
            }
        } finally
        {
        }
    }

    @Test
    public void demo_pixecodejpg()
    {
        String fileName = Global.pathCombine(folder, "pixecode.jpg");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("http://www.acomputerportal.com/wap/index.wml", reader.getFoundBarCodes()[0].getCodeText());
    }
}

