package com.aspose.barcode.licensing.issues;

import com.aspose.barcode.License;
import com.aspose.barcode.LicenseTestsCommon;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.aspose.barcode.auxiliary.Global.*;

public class BARCODEJAVA1758
{
    @Test
    public void testLicFile()
    {
        try
        {
            String pathToLicenseFile = pathCombine(getTestDataFolder("barcodjava_issues/BARCODEJAVA1758"),"Aspose.BarCode.Java.lic");
            printPathExists(pathToLicenseFile);
            License license = new License();
            license.setLicense(pathToLicenseFile);
            boolean isLicensed = LicenseTestsCommon.isLicensed();
            Assert.assertTrue(isLicensed);
            LicenseTestsCommon.resetLicense();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void testCorrectLicFile()
    {
        try
        {
            String pathToLicenseFile = pathCombine(getTestDataFolder("barcodjava_issues/BARCODEJAVA1758/updated"),"Aspose.BarCode.Java.new.lic");
            printPathExists(pathToLicenseFile);
            LicenseTestsCommon.resetLicense();
            boolean isLicensed = LicenseTestsCommon.isLicensed();
            Assert.assertFalse(isLicensed);
            License license = new License();
            license.setLicense(pathToLicenseFile);
            isLicensed = LicenseTestsCommon.isLicensed();
            Assert.assertTrue(isLicensed);
            LicenseTestsCommon.resetLicense();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
