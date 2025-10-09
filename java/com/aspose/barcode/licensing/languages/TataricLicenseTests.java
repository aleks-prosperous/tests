package com.aspose.barcode.licensing.languages;

import org.testng.annotations.Test;

public class TataricLicenseTests
{
    LanguageLicenseTests languageLicenseTests = new LanguageLicenseTests("Tataric");

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
