package com.aspose.external.barcode.tester.releases.v19_9;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.io.OutputStream;

import static com.aspose.barcode.licensing.LicensePath.licenseAsposeBarcodeJava256Path;

@Test
public class BARCODEJAVA757
{
    @Test
    public void test() throws Exception
    {
        com.aspose.barcode.License license1 = new com.aspose.barcode.License();
//        license1.setLicense(Global.getTestDataFolder("License/Java") + "Aspose.BarCode.Java.lic");
        license1.setLicense(licenseAsposeBarcodeJava256Path);
        System.out.println("     Aspose.barcode.License()  Loaded. . . . ");
        OutputStream outputStream = new FileOutputStream(Global.getTempFolder("BARCODEJAVA757.png"));
        String barcodeText = "BARCODE 12345";
        BarcodeGenerator bb = new BarcodeGenerator(com.aspose.barcode.generation.EncodeTypes.CODE_39, barcodeText);
        bb.getParameters().getBarcode().getBarHeight().setPoint(30.0f);
        bb.save(outputStream, BarCodeImageFormat.PNG);
    }


}
