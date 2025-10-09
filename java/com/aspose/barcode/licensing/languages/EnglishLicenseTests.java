package com.aspose.barcode.licensing.languages;

import org.testng.annotations.Test;

public class EnglishLicenseTests
{
    LanguageLicenseTests languageLicenseTests = new LanguageLicenseTests("English");

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
