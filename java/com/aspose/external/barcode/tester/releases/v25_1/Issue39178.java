package com.aspose.external.barcode.tester.releases.v25_1;

import com.aspose.barcode.BarCodeException;
import com.aspose.barcode.complexbarcode.Address;
import com.aspose.barcode.complexbarcode.SwissQRBill;
import com.aspose.barcode.complexbarcode.SwissQRCodetext;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue39178
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_Empty_Address_Hash()
    {
        boolean exception = false;
        try
        {
            Address address = new Address();
            int hashcode = address.hashCode();
        }
        catch (Exception e)
        {
            exception = true;
        }
        Assert.assertFalse(exception);
    }

    // Related to the Issue39170
    @Test
    public void test_SwissQR_No_Country_Exception()
    {
        SwissQRCodetext swissQRCodetext2 = new SwissQRCodetext();
        SwissQRBill swissQRBill2 = swissQRCodetext2.getBill();
        swissQRBill2.setAccount("DE89370400440532013000");
        swissQRBill2.setAmount(1000);
        swissQRBill2.setCurrency("CHF");
        swissQRBill2.setReference("210000000003139471430009017");
        Address address2 = new Address();
        address2.setName("Creditor 1 Address");
        swissQRBill2.setCreditor(address2);

        BarCodeException ex = Assert.expectThrows(BarCodeException.class, swissQRCodetext2::getConstructedCodetext);
        Assert.assertEquals(ex.getMessage(), "Creditor's CountryCode is a mandatory field and must be valid two-letter ISO country code.");
    }
}
