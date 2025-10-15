package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(description = "Tests for Issue33643.")
public class Issue33643
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33643");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void testPictureFromIssue33512()
    {
        String fileName = Global.pathCombine(folder, "Encrypt.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01904090619041999|MIIBoAYJKoZIhvcNAQcCoIIBkTCCAY0CAQExDjAMBggqhkiG9w0CBQUAMAsGCSqG\r\nSIb3DQEHATGCAWkwggFlAgEBMIG/MIGwMQswCQYDVQQGEwJJTjEkMCIGA1UEChMb\r\nTmF0aW9uYWwgSW5mb3JtYXRpY3MgQ2VudHJlMQ4wDAYDVQQLEwVOSUNDQTEhMB8G\r\nA1UEAxMYTklDIENlcnRpZnlpbmcgQXV0aG9yaXR5MRIwEAYDVQQHEwlOZXcgRGVs\r\naGkxJDAiBgkqhkiG9w0BCQEWFXN1cHBvcnRAY2FtYWlsLm5pYy5pbjEOMAwGA1UE\r\nCBMFRGVsaGkCCn2hARBBBzFxcSgwDAYIKoZIhvcNAgUFADANBgkqhkiG9w0BAQEF\r\nAASBgGLNIySheUX/sRNa+Ol3CkDOIpfHPWa/Ci1pj9Eab2vZHnQgE5Wr725z5a4v\r\nsqemadm7g4924eKivBL1+9qUM3StTwfWKDHL3j8rlSrWPlVq905qqYqjImpTMlLh\r\ns3MEk1G7/0Nwezw1WFWJ/4q50XnzkhWU1VXATj60zVT5o1+LAA==",
                    reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testPDF417_FedEx_jpg()
    {
        String fileName = Global.pathCombine(folder, "PDF417-FedEx.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("[)>\u001e01\u001d0210011\u001d840\u001d26\u001d7910002710790201\u001dFDE\u001d131189974\u001d151\u001d \u001d1/1\u001d1LB\u001dN\u001d133 West 19th Street\u001dNew York\u001dNY\u001dPaul Sutton\u001e06\u001d10ZED003\u001d11ZDuomo Photography\u001d12Z2122431150\u001d13Z0000\u001c\u001d15Z3058641\u001d18Z197806818\u001cE3\u001d20Z0.00\u001c1\u001d28Z\u001dK \u001d26Z09c6\u001c\u001d\u001e\u0004",
                    reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testpdf417_barcode_generator_101_1_jpg()
    {
        String fileName = Global.pathCombine(folder, "pdf417-barcode-generator-101-1.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(
                    "Input texts (up to 200 characters) and click \"Encode\" to get the Pdf417 barcode. click \"Save\" to save the barcode image to your phone Gallery. click \"Clear\" to erase the texts and the barcode.",
                    reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testIDAutomation_png()
    {
        String fileName = Global.pathCombine(folder, "IDAutomation.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Softpedia Image Generator Example\r\n", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test2d_bin2_png()
    {
        byte[] OriginalTextInBytes = new byte[]
        {
            64, 10, 30, 13, 65, 78, 83, 73, 32, 54, 51, 54, 48, 49, 49, 48, 52, 48, 48, 48, 50, 68, 76, 48, 48, 52, 49,
                    48, 52, 54, 51, 90, 68, 48, 53, 48, 52, 48, 48, 48, 51, 68, 76, 68, 65, 81, 49, 54, 56, 54, 54, 53, 55,
                    32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 10, 68, 67, 83, 67, 72, 65, 75,
                    82, 65, 66, 79, 82, 84, 89, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32,
                    32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 10, 68, 68, 69, 78, 10, 68, 65, 67, 83, 65, 85, 82, 65, 86, 32,
                    32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32,
                    32, 32, 32, 32, 32, 32, 32, 10, 68, 68, 70, 78, 10, 68, 65, 68, 78, 79, 78, 69, 32, 32, 32, 32, 32, 32,
                    32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32,
                    32, 32, 32, 32, 10, 68, 68, 71, 78, 10, 68, 67, 65, 68, 32, 32, 32, 32, 32, 10, 68, 67, 66, 66, 32, 32,
                    32, 32, 32, 32, 32, 32, 32, 32, 32, 10, 68, 67, 68, 78, 79, 78, 69, 32, 10, 68, 66, 68, 48, 55, 48, 54,
                    50, 48, 49, 50, 10, 68, 66, 66, 48, 51, 49, 54, 49, 57, 55, 57, 10, 68, 66, 65, 48, 51, 48, 53, 50, 48,
                    49, 52, 10, 68, 66, 67, 49, 10, 68, 65, 85, 48, 54, 55, 32, 105, 110, 10, 68, 65, 89, 66, 82, 79, 10, 68,
                    65, 71, 50, 52, 49, 52, 32, 83, 79, 67, 73, 69, 84, 89, 32, 68, 82, 32, 32, 32, 32, 32, 32, 32, 32, 32,
                    32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 10, 68, 65, 73, 67, 76, 65, 89, 77, 79, 78, 84, 32, 32, 32,
                    32, 32, 32, 32, 32, 32, 32, 32, 32, 10, 68, 65, 74, 68, 69, 10, 68, 65, 75, 49, 57, 55, 48, 51, 49, 55,
                    54, 49, 32, 32, 10, 68, 67, 70, 50, 48, 49, 50, 48, 55, 48, 54, 54, 56, 57, 53, 48, 57, 57, 49, 54, 56,
                    54, 54, 53, 55, 32, 32, 32, 10, 68, 67, 71, 85, 83, 65, 10, 68, 67, 85, 78, 79, 78, 69, 32, 10, 68, 65,
                    87, 49, 54, 49, 10, 68, 65, 72, 87, 72, 73, 84, 78, 69, 89, 32, 65, 80, 84, 83, 32, 32, 32, 32, 32, 32,
                    32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 10, 68, 68, 65, 77, 10, 68, 68, 66,
                    48, 50, 48, 56, 50, 48, 49, 48, 13, 90, 68, 13
        };
        String OriginalText =
                "@\n\rANSI 636011040002DL00410463ZD05040003DLDAQ1686657                  \nDCSCHAKRABORTY                             \nDDEN\nDACSAURAV                                  \nDDFN\nDADNONE                                    \nDDGN\nDCAD     \nDCBB           \nDCDNONE \nDBD07062012\nDBB03161979\nDBA03052014\nDBC1\nDAU067 in\nDAYBRO\nDAG2414 SOCIETY DR                    \nDAICLAYMONT            \nDAJDE\nDAK197031761  \nDCF2012070668950991686657   \nDCGUSA\nDCUNONE \nDAW161\nDAHWHITNEY APTS                       \nDDAM\nDDB02082010\nZD";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < OriginalTextInBytes.length; i++)
        {
            sb.append((char) OriginalTextInBytes[i]);
        }
        OriginalText = sb.toString();
        String fileName = Global.pathCombine(folder, "2d_bin2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(OriginalText, reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

