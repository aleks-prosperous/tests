package com.aspose.external.barcode.tester.releases.v24_2;

import com.aspose.barcode.License;
import com.aspose.external.barcode.tester.LicenseTestsHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.aspose.barcode.auxiliary.Global.*;

public class BARCODEJAVA1778
{
    @Test
    public void testLicFileWithNonASCII_1()
    {
        try
        {
            String pathToLicenseFile = pathCombine(getTestDataFolder("barcodjava_issues/BARCODEJAVA1758"),"Aspose.BarCode.Java.lic");
            printPathExists(pathToLicenseFile);
            License license = new License();
            license.setLicense(pathToLicenseFile);
            boolean isLicensed = LicenseTestsHelper.isLicensed();
            Assert.assertTrue(isLicensed);
            LicenseTestsHelper.resetLicense();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void testLicFileWithNonASCII_2()
    {
        try
        {
            String pathToLicenseFile = pathCombine(getTestDataFolder("barcodjava_issues/BARCODEJAVA1771"),"Aspose.Total.Java.lic");
            printPathExists(pathToLicenseFile);
            LicenseTestsHelper.resetLicense();
            boolean isLicensed = LicenseTestsHelper.isLicensed();
            Assert.assertFalse(isLicensed);
            License license = new License();
            license.setLicense(pathToLicenseFile);
            isLicensed = LicenseTestsHelper.isLicensed();
            Assert.assertTrue(isLicensed);
            LicenseTestsHelper.resetLicense();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
