package com.aspose.barcode.licensing.sha256;

import com.aspose.barcode.License;
import com.aspose.barcode.LicenseTestsCommon;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.aspose.barcode.licensing.LicensePath.*;

public class InstallationCorrectLicense256Tests
{
    @Test
    public void testAsposeBarCodeJavaLicenseSHA256() throws Exception
    {
        LicenseTestsCommon.resetLicense();
        License license = new License();
        license.setLicense(licenseAsposeBarcodeJava256Path);
        Assert.assertTrue(LicenseTestsCommon.isLicensed());
        LicenseTestsCommon.resetLicense();
    }

    @Test
    public void testAsposeTotalJava256LicenseSHA256() throws Exception
    {
        LicenseTestsCommon.resetLicense();
        License license = new License();
        license.setLicense(licenseAsposeTotalJava256Path);
        Assert.assertTrue(LicenseTestsCommon.isLicensed());
        LicenseTestsCommon.resetLicense();
    }


    @Test
    public void testConholdateTotalJavaLicenseSHA256() throws Exception
    {
        LicenseTestsCommon.resetLicense();
        License license = new License();
        license.setLicense(licenseConholdateTotalJava256Path);
        Assert.assertTrue(LicenseTestsCommon.isLicensed());
        LicenseTestsCommon.resetLicense();
    }

    @Test
    public void testConholdateTotalProductFamilyLicenseSHA256() throws Exception
    {
        LicenseTestsCommon.resetLicense();
        License license = new License();
        license.setLicense(licenseConholdateTotalProductFamily256Path);
        Assert.assertTrue(LicenseTestsCommon.isLicensed());
        LicenseTestsCommon.resetLicense();
    }

    @Test
    public void testAsposeBarCodeProductFamilyLicenseSHA256() throws Exception
    {
        LicenseTestsCommon.resetLicense();
        License license = new License();
        license.setLicense(licenseAsposeBarcodeProductFamily256Path);
        Assert.assertTrue(LicenseTestsCommon.isLicensed());
        LicenseTestsCommon.resetLicense();
    }
    @Test
    public void testAsposeTotalProductFamilyLicenseSHA256() throws Exception
    {
        LicenseTestsCommon.resetLicense();
        License license = new License();
        license.setLicense(licenseAsposeTotalProductFamily256Path);
        Assert.assertTrue(LicenseTestsCommon.isLicensed());
        LicenseTestsCommon.resetLicense();
    }
}
