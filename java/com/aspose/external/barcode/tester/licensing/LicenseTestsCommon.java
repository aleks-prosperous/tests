package com.aspose.external.barcode.tester.licensing;

import com.aspose.barcode.License;
import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static com.aspose.barcode.licensing.LicensePath.*;

public class LicenseTestsCommon
{

    public static void resetLicense() throws Exception
    {
        License license = new License();
        license.setLicense("");
    }

    public static License setupLicense(String licensePath)
    {
        File f = new File(licensePath);
        if(!f.exists())
        {
            System.out.println("Path " + licensePath + " doesn't exist");
            return null;
        }
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

    @Test
    public void testPaths() throws Exception
    {
        Assert.assertTrue(existPath(licenseAsposeBarcodeJava256Path));
        Assert.assertTrue(existPath(licenseAsposeTotalJava256Path));
        Assert.assertTrue(existPath(licenseAsposeBarcodeProductFamily256Path));
        Assert.assertTrue(existPath(licenseAsposeTotalProductFamily256Path));
        Assert.assertTrue(existPath(licenseConholdateTotalJava256Path));
        Assert.assertTrue(existPath(licenseConholdateTotalProductFamily256Path));
    }

    private boolean existPath(String path)
    {
        boolean exists = new File(path).exists();
        if(exists)
        {
            System.out.println("Path " + path + " exists");
            return true;
        }
        else
        {
            System.out.println("Path " + path + " doesn't exist");
            return false;
        }
    }


    public static boolean isLicensed() throws IOException
    {
        String folder = Global.getTestDataFolder("License/LicenseRecognition/");
        String filePath = Global.pathCombine(folder, "Code128.png");
        File file = new File(filePath);
        BarCodeReader reader = new BarCodeReader(file.getCanonicalPath());
        BarCodeResult[] barCodeResults = reader.readBarCodes();
        return ("12312312345".equals(barCodeResults[0].getCodeText()));
    }
}
