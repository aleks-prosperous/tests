package com.aspose.external.barcode.tester.releases.v24_4;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Issue38936
{
    private final String Folder = Global.getTestDataFolder("Issues/Issue38936");

    @BeforeMethod
    public void setUp(Method testMethod)
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_Image01()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Segment 001 of CHI_20240227150810.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("InnoSourceImaging|v1.0eDOC|MRP|14|dms/images/MRP/folders/_Digital Mailroom/Workflows/FloorUploads_BarcodeMail/|4|FMS|6|Checks|2||5|22-09670IL|9||6||8|Checks|4||76||", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Image02()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Segment 001 of Odd segment of ORL_20240220091643.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("InnoSourceImaging|v1.0eDOC|MRP|14|dms/images/MRP/folders/_Digital Mailroom/Workflows/FloorUploads_BarcodeMail/|4|FMS|6|FLSalesMail|2||5|21-04645FL|9||6||8|FLSalesMail|4||76||77|Cert of Sale|", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Image03()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Segment 001 of ORL_20240223123755 (003).png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("InnoSourceImaging|v1.0eDOC|MRP|14|dms/images/MRP/folders/_Digital Mailroom/Workflows/FloorUploads_BarcodeMail/|4|FMS|6|CertificationofNotePossession|2||5|23-08945FL|9||6||8|CertificationofNotePossession|4||76||", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
