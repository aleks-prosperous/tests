package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.License;
import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.aspose.barcode.licensing.LicensePath.licenseAsposeBarcodeJava128Path;

public class BARCODEJAVA383
{
    @Test
    public void test() throws IOException
    {
        InputStream is = Files.newInputStream(Paths.get(licenseAsposeBarcodeJava128Path));
        BufferedReader buf = new BufferedReader(new java.io.InputStreamReader(is));
        String line = buf.readLine();
        StringBuilder sb = new StringBuilder();
        System.out.println(line.trim());
        while (line != null)
        {
            sb.append(line);
            line = buf.readLine();
            line = (line != null) ? line.trim() : null;
            System.out.println(line);
        }
        String fileAsString = sb.toString();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(fileAsString.getBytes());
        License license = new License();
        try
        {
            license.setLicense(inputStream);
        } catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }


}
