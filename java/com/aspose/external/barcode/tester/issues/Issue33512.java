package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33512.")
public class Issue33512
{
    final String folder = Global.getTestDataFolder("Issues/Issue33512");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void test1()
    {
        String fileName = Global.pathCombine(folder, "Encrypt.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(
                "01904090619041999|MIIBoAYJKoZIhvcNAQcCoIIBkTCCAY0CAQExDjAMBggqhkiG9w0CBQUAMAsGCSqG\r\nSIb3DQEHATGCAWkwggFlAgEBMIG/MIGwMQswCQYDVQQGEwJJTjEkMCIGA1UEChMb\r\nTmF0aW9uYWwgSW5mb3JtYXRpY3MgQ2VudHJlMQ4wDAYDVQQLEwVOSUNDQTEhMB8G\r\nA1UEAxMYTklDIENlcnRpZnlpbmcgQXV0aG9yaXR5MRIwEAYDVQQHEwlOZXcgRGVs\r\naGkxJDAiBgkqhkiG9w0BCQEWFXN1cHBvcnRAY2FtYWlsLm5pYy5pbjEOMAwGA1UE\r\nCBMFRGVsaGkCCn2hARBBBzFxcSgwDAYIKoZIhvcNAgUFADANBgkqhkiG9w0BAQEF\r\nAASBgGLNIySheUX/sRNa+Ol3CkDOIpfHPWa/Ci1pj9Eab2vZHnQgE5Wr725z5a4v\r\nsqemadm7g4924eKivBL1+9qUM3StTwfWKDHL3j8rlSrWPlVq905qqYqjImpTMlLh\r\ns3MEk1G7/0Nwezw1WFWJ/4q50XnzkhWU1VXATj60zVT5o1+LAA==",
                reader.getFoundBarCodes()[0].getCodeText());
    }
}

