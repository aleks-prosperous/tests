package com.aspose.external.barcode.tester.releases.v19_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;

public class BARCODEJAVA772
{
    /// <summary>
    /// Path to folder with files for testing Issue37235.
    /// </summary>
    private String Folder = Global.getBarcodeJavaIssuesTestImagePath("BARCODEJAVA772");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }


    private SwissQRCodetext defaultSwissQR()
    {
        SwissQRCodetext swissQRCodetext = new SwissQRCodetext();
        swissQRCodetext.getBill().setAccount("CH450023023099999999A");
        swissQRCodetext.getBill().getCreditor().setName("Name");
        swissQRCodetext.getBill().getCreditor().setCountryCode("NL");

        return swissQRCodetext;
    }

    @Test
    public void ComplexBarcode_Empty_Test()
    {
        SwissQRCodetext swissQRCodetext = defaultSwissQR();

        ComplexBarcodeGenerator cg = new ComplexBarcodeGenerator(swissQRCodetext);
        BufferedImage res = cg.generateBarCodeImage();

        BarCodeReader cr = new BarCodeReader(res, DecodeType.QR);
        BarCodeResult[] results = cr.readBarCodes();
        SwissQRCodetext test = ComplexCodetextReader.tryDecodeSwissQR(results[0].getCodeText());

        Assert.assertEquals(swissQRCodetext.getBill(), test.getBill());

    }

    @Test
    public void ComplexBarcode_PartlyInitialized_Test()
    {
        SwissQRCodetext swissQRCodetext = defaultSwissQR();
        swissQRCodetext.getBill().setAccount("CH450023023099999999A");
        swissQRCodetext.getBill().setBillInformation("BillInformation");

        ComplexBarcodeGenerator cg = new ComplexBarcodeGenerator(swissQRCodetext);
        BufferedImage res = cg.generateBarCodeImage();

        BarCodeReader cr = new BarCodeReader(res, DecodeType.QR);
        BarCodeResult[] results = cr.readBarCodes();
        SwissQRCodetext test = ComplexCodetextReader.tryDecodeSwissQR(results[0].getCodeText());

        Assert.assertEquals(swissQRCodetext.getBill(), test.getBill());

    }

    @Test
    public void ComplexBarcode_FullyInitialized_Test()
    {
        SwissQRCodetext swissQRCodetext = defaultSwissQR();
        swissQRCodetext.getBill().setAccount("CH450023023099999999A");
        swissQRCodetext.getBill().setBillInformation("BillInformation");
        swissQRCodetext.getBill().setAmount(1024);
        swissQRCodetext.getBill().getCreditor().setName("Creditor.Name");
        swissQRCodetext.getBill().getCreditor().setAddressLine1("Creditor.AddressLine1");
        swissQRCodetext.getBill().getCreditor().setAddressLine2("Creditor.AddressLine2");
        swissQRCodetext.getBill().getCreditor().setCountryCode("NL");
        swissQRCodetext.getBill().setUnstructuredMessage("UnstructuredMessage");
        swissQRCodetext.getBill().setReference("Reference");
        swissQRCodetext.getBill().getAlternativeSchemes().add(new AlternativeScheme("AlternativeSchemeInstruction1"));
        swissQRCodetext.getBill().getAlternativeSchemes().add(new AlternativeScheme("AlternativeSchemeInstruction2"));
        swissQRCodetext.getBill().setDebtor(new Address());
        swissQRCodetext.getBill().getDebtor().setName("Debtor.Name");
        swissQRCodetext.getBill().getDebtor().setAddressLine1("Debtor.AddressLine1");
        swissQRCodetext.getBill().getDebtor().setAddressLine2("Debtor.AddressLine2");
        swissQRCodetext.getBill().getDebtor().setCountryCode("LU");

        ComplexBarcodeGenerator cg = new ComplexBarcodeGenerator(swissQRCodetext);
        BufferedImage res = cg.generateBarCodeImage();

        BarCodeReader cr = new BarCodeReader(res, DecodeType.QR);
        BarCodeResult[] results = cr.readBarCodes();
        SwissQRCodetext test = ComplexCodetextReader.tryDecodeSwissQR(results[0].getCodeText());

        Assert.assertEquals(swissQRCodetext.getBill(), test.getBill());
    }
}
