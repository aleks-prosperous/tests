package com.aspose.external.barcode.tester.releases.v21_10;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37880
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_GenerateSwissQR_UTF8()
    {
        SwissQRCodetext qrCode = new SwissQRCodetext();
        qrCode.getBill().setVersion(QrBillStandardVersion.V2_0);
        qrCode.getBill().setAccount("CH4431999123000889012");
        qrCode.getBill().setAmount(1000.25);
        qrCode.getBill().setCurrency("CHF");
        qrCode.getBill().setReference("210000000003139471430009017");
        Address creditor = new Address();
        creditor.setName("Muster & Söhne");
        creditor.setStreet("Musterstrasse");
        creditor.setHouseNo("12b");
        creditor.setPostalCode("8200");
        creditor.setTown("Zürich");
        creditor.setCountryCode("CH");
        qrCode.getBill().setCreditor(creditor);
        Address deptor = new Address();
        deptor.setName("Muster AG");
        deptor.setStreet("Musterstrasse");
                deptor.setHouseNo("1");
                deptor.setPostalCode("3030");
                deptor.setTown("Bern");
                deptor.setCountryCode("CH");
        qrCode.getBill().setDebtor(deptor);

        ComplexBarcodeGenerator generator = new ComplexBarcodeGenerator(qrCode);
        generator.getParameters().getBarcode().getPadding().getBottom().setMillimeters(0);
        generator.getParameters().getBarcode().getPadding().getTop().setMillimeters(0);
        generator.getParameters().getBarcode().getPadding().getLeft().setMillimeters(0);
        generator.getParameters().getBarcode().getPadding().getRight().setMillimeters(0);
        generator.getParameters().getImageWidth().setMillimeters(46);

        BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), DecodeType.QR);
        BarCodeResult[] res = reader.readBarCodes();
        Assert.assertEquals(1, res.length);
        Assert.assertEquals(qrCode.getConstructedCodetext(), res[0].getCodeText());
    }
}
