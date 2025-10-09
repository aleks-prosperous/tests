package com.aspose.barcode.licensing.requirements;

import com.aspose.barcode.License;
import com.aspose.barcode.PleaseReportException;
import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static com.aspose.barcode.LicenseTestsCommon.isLicensed;
import static com.aspose.barcode.LicenseTestsCommon.resetLicense;
import static com.aspose.barcode.licensing.LicensePath.*;

public class StructureTests
{
    /*
    Test checks the field <LicenseExpire> that is included in the trial license files
     */
    @Test
    public void testCorrectTempLicense() throws Exception
    {
        String licensePath = Global.getLicenseFolder("structure/Aspose.BarCode.Product.Family-temporary.lic");
        System.out.println(new File(licensePath).exists());
        Assert.assertFalse(isLicensed());
        License license = new License();
        license.setLicense(licensePath);
        Assert.assertTrue(isLicensed());
        resetLicense(license);
    }
 /*
    Test checks the field <LicenseExpire> that is included in the trial license files
     */
    @Test(expectedExceptions = PleaseReportException.class,
    expectedExceptionsMessageRegExp = "The license has expired.*")
    public void testTempLicenseExpire() throws Exception
    {
        String licensePath = Global.getLicenseFolder("sha128/Aspose/Java/expired/Aspose.BarCode.LicenseExpired.lic");
        System.out.println(new File(licensePath).exists());
        Assert.assertFalse(isLicensed());
        License license = new License();
        license.setLicense(licensePath);
        Assert.assertTrue(isLicensed());
        resetLicense(license);
    }

    /*
    Test checks the field <SubscriptionExpire> that is included in the trial license files
     */
   @Test(expectedExceptions = PleaseReportException.class,
    expectedExceptionsMessageRegExp = "The subscription included in this license allows free upgrades until 08 Nov 2012, but this version of the product was released on .* Please renew the subscription or use a previous version of the product.")
    public void testSubscriptionExpire() throws Exception
    {
        String licensePath = Global.getLicenseFolder("sha128/Aspose/Java/expired/Aspose.Total.Java.SubscriptionExpired.lic");
        System.out.println(new File(licensePath).exists());
        Assert.assertFalse(isLicensed());
        License license = new License();
        license.setLicense(licensePath);
        Assert.assertTrue(isLicensed());
        resetLicense(license);
    }

@Test(expectedExceptions = PleaseReportException.class,
    expectedExceptionsMessageRegExp = "The license has expired.*")
    public void testTotalJavaLicenseExpire() throws Exception
    {
        String licensePath = Global.getLicenseFolder("sha128/Aspose/Java/expired/Aspose.Total.Java.LicenseExpired.lic");
        System.out.println(new File(licensePath).exists());
        Assert.assertFalse(isLicensed());
        License license = new License();
        license.setLicense(licensePath);
        Assert.assertTrue(isLicensed());
        resetLicense(license);
    }

    /**
     * Test field <SubscriptionExpiry>
     * @throws Exception
     */
    @Test
    public void testAsposeBarcodeJava128SubscriptionExpire() throws Exception
    {
        String licensePath = Global.getLicenseFolder("structure/Aspose.BarCode.Java.128.lic");
        System.out.println(new File(licensePath).exists());
        Assert.assertFalse(isLicensed());
        License license = new License();
        license.setLicense(licensePath);
        Assert.assertTrue(isLicensed());
        resetLicense(license);
    }

 @Test(expectedExceptions = PleaseReportException.class,
 expectedExceptionsMessageRegExp = "The license signature is invalid.*")
    public void testAsposeBarcodeJavaPHPAddedLine() throws Exception
    {
        String licensePath = Global.getLicenseFolder("structure/Aspose.BarCode.Java.PHP.128.lic");
        System.out.println(new File(licensePath).exists());
        Assert.assertFalse(isLicensed());
        License license = new License();
        license.setLicense(licensePath);
        Assert.assertTrue(isLicensed());
        resetLicense(license);
    }

    @Test(expectedExceptions = Exception.class,
    expectedExceptionsMessageRegExp = "Failed to set license. Details: Premature end of file.")
    public void testIncorectLicenseFileForBarCode() throws Exception
    {
        resetLicense();
        String licensePath = Global.getLicenseFolder("structure/emptyLicense.lic");
        License license = new License();
        license.setLicense(licensePath);
        resetLicense(license);
    }

    @Test(expectedExceptions = Exception.class,
            expectedExceptionsMessageRegExp = "Failed to set license. Details: Cannot find license 'Wrong.Name.lic'.")
    public void testProcessingAbsentFile() throws Exception
    {
            License license = new License();
            license.setLicense("Wrong.Name.lic"); //This file isn't presented
    }

    @Test(testName = "compromised license in Aspose blacklist", expectedExceptions = PleaseReportException.class,
            expectedExceptionsMessageRegExp = "This license is disabled, please contact Aspose to obtain .*",
            enabled = false) //TODO request a license file with a compromised serial number
    public void testCompromisedAsposeBarCodeJavaLicenseSHA256() throws Exception
    {
        System.out.println(new File(licenseCompromisedAsposeBarcodeJava256Path).exists());
        License license = new License();
        license.setLicense(licenseCompromisedAsposeBarcodeJava256Path);
    }

    @Test(testName = "changed signature license", expectedExceptions = Exception.class,
            expectedExceptionsMessageRegExp = "Failed to set license. Details: Last unit does not have enough valid bits")
    public void testChangedSignatureBarCodeJavaLicenseSHA256() throws Exception
    {
        System.out.println(new File(licenseChangedAsposeBarcodeJava256Path).exists());
        License license = new License();
        license.setLicense(licenseChangedAsposeBarcodeJava256Path);
    }
    @Test(testName = "changed serial number license", expectedExceptions = Exception.class,
            expectedExceptionsMessageRegExp = "The license signature is invalid.*")
    public void testChangedSerialNumBarCodeJavaLicenseSHA256() throws Exception
    {
        System.out.println(new File(licenseChangedSerialNumAsposeBarcodeJava256Path).exists());
        License license = new License();
        license.setLicense(licenseChangedSerialNumAsposeBarcodeJava256Path);
    }
}
