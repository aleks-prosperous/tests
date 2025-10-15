package com.aspose.external.barcode.tester.releases.v22_4;

import com.aspose.barcode.complexbarcode.Address;
import com.aspose.barcode.complexbarcode.QrBillStandardVersion;
import com.aspose.barcode.complexbarcode.SwissQRCodetext;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
//BARCODENET-38136: Aspose.BarCode should throw exception for SwissQRBill empty element StrdBkgInf
public class Issue38125
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
    public void test_SwissQR_Codetext()
    {
        SwissQRCodetext qrCodeText = new SwissQRCodetext();
        qrCodeText.getBill().setVersion(QrBillStandardVersion.V2_0);

        qrCodeText.getBill().setAccount("CH4431999123000889012");
        qrCodeText.getBill().setAmount(1000d);
        qrCodeText.getBill().setCurrency("CHF");
        qrCodeText.getBill().setReference("210000000003139471430009017");

        Address address = new Address();
        address.setName("Robert Schneider AG");
        address.setStreet("Rue de Lac");
        address.setHouseNo("1268");
        address.setPostalCode("2501");
        address.setTown("Biel");
        address.setCountryCode("CH");

        qrCodeText.getBill().setCreditor(address);

        Address debtor = new Address();

        debtor.setName("Pia-Maria Rutschmann-Schnyder");
        debtor.setStreet("Grosse Marktgasse");
        debtor.setHouseNo("28");
        debtor.setPostalCode("9400");
        debtor.setTown("Rorschach");
        debtor.setCountryCode("CH");

        qrCodeText.getBill().setDebtor(debtor);

        String actual = qrCodeText.getConstructedCodetext();

        String expected = "SPC\n0200\n1\nCH4431999123000889012\nS\nRobert Schneider AG\nRue de Lac\n1268\n2501\nBiel\nCH\n\n\n\n\n\n\n\n1000.00\nCHF\nS\nPia-Maria Rutschmann-Schnyder\nGrosse Marktgasse\n28\n9400\nRorschach\nCH\nQRR\n210000000003139471430009017\n\nEPD";

        Assert.assertEquals(expected, actual);
    }
}
