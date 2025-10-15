package com.aspose.external.barcode.tester.releases.v78;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Issue34373
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue34373_generated1913Bytes_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34373\\generated1913Bytes.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈ" +
                    "ÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÈÉÊËÌÍÎÏÐÑÒÓÔ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue34373_generated691Digits_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34373\\generated691Digits.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue34373_generated70Digits_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34373\\generated70Digits.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789012345678901234567890123456789012345678901234567890123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue34373_generatedAztecLotText_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34373\\generatedAztecLotText.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
