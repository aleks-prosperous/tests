package com.aspose.external.barcode.tester.licensing;

import com.aspose.barcode.License;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.aspose.barcode.licensing.LicensePath.licenseAsposeBarcodeJava256Path;

public class InstallationType
{
    @Test
    public void testInstallLicensePath() throws Exception
    {
        LicenseTestsCommon.resetLicense();
        License license = new License();
        license.setLicense(licenseAsposeBarcodeJava256Path);
        Assert.assertTrue(LicenseTestsCommon.isLicensed());
        LicenseTestsCommon.resetLicense();
    }

    @Test
    public void testInstallLicenseFile() throws Exception
    {
        LicenseTestsCommon.resetLicense();
        License license = new License();
        license.setLicense(new File(licenseAsposeBarcodeJava256Path));
        Assert.assertTrue(LicenseTestsCommon.isLicensed());
        LicenseTestsCommon.resetLicense();
    }

    @Test
    public void testInstallStream() throws Exception
    {
        LicenseTestsCommon.resetLicense();
        Assert.assertFalse(LicenseTestsCommon.isLicensed());
        License license = new License();
        Path filePath = Paths.get(licenseAsposeBarcodeJava256Path);
        try (InputStream inputStream = Files.newInputStream(filePath))
        {
            license.setLicense(inputStream);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        Assert.assertTrue(LicenseTestsCommon.isLicensed());
        LicenseTestsCommon.resetLicense();
    }
}
