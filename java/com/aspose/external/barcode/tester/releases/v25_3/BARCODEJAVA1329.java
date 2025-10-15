package com.aspose.external.barcode.tester.releases.v25_3;

import com.aspose.barcode.License;
import com.aspose.barcode.PleaseReportException;
import com.aspose.external.barcode.tester.licensing.LicenseTestsCommon;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.aspose.barcode.licensing.LicensePath.licenseAsposeTotalNET256Path;

public class BARCODEJAVA1329
{
    @Test
    public void testInstallNETLicense() throws Exception
    {
        LicenseTestsCommon.resetLicense();
        License license = new License();
        Assert.expectThrows(PleaseReportException.class,() -> license.setLicense(licenseAsposeTotalNET256Path));
        LicenseTestsCommon.resetLicense();
    }
}
