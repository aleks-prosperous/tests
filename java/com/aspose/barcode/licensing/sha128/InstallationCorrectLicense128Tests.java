package com.aspose.barcode.licensing.sha128;

import com.aspose.barcode.License;
import com.aspose.barcode.LicenseTestsCommon;
import com.aspose.barcode.logger.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.lang.reflect.Method;

import static com.aspose.barcode.LicenseTestsCommon.isLicensed;
import static com.aspose.barcode.LicenseTestsCommon.resetLicense;
import static com.aspose.barcode.licensing.LicensePath.*;

@Test(description = "Testing only the installation use cases of correct licenses without testing the influence of them")
public class InstallationCorrectLicense128Tests
{
    @AfterMethod
    public void afterFinish(Method testMethod)
    {
        Logger.methodFinished(getClass().getName() + "." + testMethod.getName());
    }

    @BeforeMethod
    public void before(Method testMethod) throws Exception
    {
        Logger.methodStarted(getClass().getName() + "." + testMethod.getName());
    }

    @Test
    public void testAsposeTotalJavaLicenseSHA128() throws Exception
    {
        Assert.assertFalse(isLicensed());
        License license = new License();
        license.setLicense(licenseAsposeBarcodeJava128Path);
        Assert.assertTrue(isLicensed());
        resetLicense(license);
    }


    @Test
    public void testAsposeBarcodeJavaLicenseSHA128() throws Exception
    {
        System.out.println(new File(licenseAsposeBarcodeJava128Path).exists());
        LicenseTestsCommon.resetLicense();
        boolean isLicensed = LicenseTestsCommon.isLicensed();
        Assert.assertFalse(isLicensed);
        License license = new License();
        license.setLicense(licenseAsposeBarcodeJava128Path);
        isLicensed = LicenseTestsCommon.isLicensed();
        Assert.assertTrue(isLicensed);
        LicenseTestsCommon.resetLicense();
        isLicensed = LicenseTestsCommon.isLicensed();
        Assert.assertFalse(isLicensed);
    }


    @Test
    public void testCorrectConholdateTotalJavaLicenseSHA128() throws Exception
    {
        LicenseTestsCommon.resetLicense();
        License license = new License();
        license.setLicense(licenseConholdateTotalJavaPath128);
        Assert.assertTrue(LicenseTestsCommon.isLicensed());
        LicenseTestsCommon.resetLicense();
    }

    @Test
    public void testCorrectConholdateTotalProductFamilyLicenseSHA128() throws Exception
    {
        License license = new License();
        license.setLicense(licenseConholdateTotalProductFamily128Path);
        Assert.assertTrue(LicenseTestsCommon.isLicensed());
        LicenseTestsCommon.resetLicense();
    }
}
