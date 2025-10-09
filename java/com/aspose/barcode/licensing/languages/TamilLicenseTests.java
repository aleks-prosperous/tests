package com.aspose.barcode.licensing.languages;

import org.testng.annotations.Test;

public class TamilLicenseTests
{
    LanguageLicenseTests languageLicenseTests = new LanguageLicenseTests("Tamil");

    @Test
    public void testAsposeBarCodeJavaLicense() throws Exception
    {
        languageLicenseTests.testLicense("Aspose.BarCode.Java.lic");
    }

    @Test
    public void testAsposeTotalProductFamilyLicense() throws Exception
    {
        languageLicenseTests.testLicense("Aspose.Total.Product.Family.lic");
    }
}
