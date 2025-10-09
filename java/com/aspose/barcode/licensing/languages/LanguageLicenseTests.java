package com.aspose.barcode.licensing.languages;

import com.aspose.barcode.License;
import com.aspose.barcode.LicenseTestsCommon;
import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;

public class LanguageLicenseTests
{
    String folderPath = null;

    public void testLicense(String fileName) throws Exception
    {
        String filePath = folderPath + fileName;
        Assert.assertTrue(Global.isPathExists(filePath));
        LicenseTestsCommon.resetLicense();
        License license = new License();
        license.setLicense(filePath);
        boolean isLicensed = LicenseTestsCommon.isLicensed();
        Assert.assertTrue(isLicensed);
    }

    public LanguageLicenseTests(String language)
    {
        this.folderPath = Global.getTestDataFolder("License/languages/" + language);
    }

}
