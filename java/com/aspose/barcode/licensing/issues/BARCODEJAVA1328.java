package com.aspose.barcode.licensing.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.annotations.Test;

import java.io.*;

public class BARCODEJAVA1328
{
    private String pathToCustomFile =
            Global.getTestDataFolder("Issues/BARCODEJAVA1328/Aspose.BarCode.Java.lic");


    private String readFromInputStream(InputStream inputStream) throws IOException
    {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();

    }

    //    @BeforeTest
    public void before()
    {
        System.out.println("Exists license file : " + new File(pathToCustomFile).exists());

        try
        {
            FileInputStream fileInputStream = new FileInputStream(pathToCustomFile);
            System.out.println(readFromInputStream(fileInputStream));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(expectedExceptions = Exception.class,
            expectedExceptionsMessageRegExp = "The subscription included in this license allows free upgrades until.*")
    public void testCustomLicenseFile() throws Exception
    {
        com.aspose.barcode.License barCodeLicense = new com.aspose.barcode.License();
        barCodeLicense.setLicense(pathToCustomFile);
        System.out.println("Barcode Successful reading of the license file");
    }
}
