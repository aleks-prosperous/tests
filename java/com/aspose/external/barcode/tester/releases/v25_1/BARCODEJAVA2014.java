package com.aspose.external.barcode.tester.releases.v25_1;

import com.aspose.barcode.complexbarcode.MailmarkCodetext;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class BARCODEJAVA2014
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test(expectedExceptions = com.aspose.barcode.BarCodeException.class,
    expectedExceptionsMessageRegExp = "Cannot init from string: constructedCodetext")
    public void test()
    {
        MailmarkCodetext mailmarkCodetext = new MailmarkCodetext();

//        Assert.expectThrows(NumberFormatException.class,
//                () -> mailmarkCodetext.initFromString("constructedCodetext"));
                mailmarkCodetext.initFromString("constructedCodetext");
    }
}