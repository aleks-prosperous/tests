package com.aspose.barcode.licensing.languages;

import org.testng.annotations.Test;

public class HindiLicenseTests
{
    LanguageLicenseTests languageLicenseTests = new LanguageLicenseTests("Hindi");

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
