package com.aspose.barcode;

public class LicenseTestsCommon
{
    public static void resetLicense()
    {
        new License().resetLicense(); //TODO check
    }

    public static boolean isLicensed()
    {
        License license = new License();
        return license.isLicensed();
    }

    public static License setupLicense(String licensePath)
    {
        License license = new License();
        try
        {
            license = new License();
            license.setLicense(licensePath);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return license;
    }

    public static void resetLicense(License license)
    {
        try
        {
            license.setLicense("");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
