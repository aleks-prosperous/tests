package com.aspose.external.barcode.tester.licensing;

import static com.aspose.barcode.licensing.LicensePath.licenseAsposeBarcodeJava256Path;

public class LicenseSingleton1
{
    static {
        // Initialize the license
        try
        {
            com.aspose.barcode.License license = new com.aspose.barcode.License();
            license.setLicense(licenseAsposeBarcodeJava256Path);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    // No need for instance or explicit method
    private LicenseSingleton1() {
        throw new UnsupportedOperationException("Utility class");
    }
}