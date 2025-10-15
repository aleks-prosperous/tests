package com.aspose.external.barcode.tester.licensing;

import static com.aspose.barcode.licensing.LicensePath.licenseAsposeBarcodeJava256Path;

public class LicenseSingleton
{
    private static LicenseSingleton instance;
    private LicenseSingleton(String pathToLicenseFile)
    {
        try
        {
            com.aspose.barcode.License license = new com.aspose.barcode.License();
            license.setLicense(pathToLicenseFile);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static synchronized void setLicense()
    {
        if (instance == null)
        {
            instance = new LicenseSingleton(licenseAsposeBarcodeJava256Path);
        }
    }
}
