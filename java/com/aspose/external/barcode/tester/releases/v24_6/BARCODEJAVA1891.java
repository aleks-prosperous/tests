package com.aspose.external.barcode.tester.releases.v24_6;

import com.aspose.barcode.complexbarcode.SecondaryAndAdditionalData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BARCODEJAVA1891
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test(expectedExceptions = com.aspose.barcode.BarCodeException.class, expectedExceptionsMessageRegExp = "Incorrectly encoded date.")
    public void test1()
    {
        String prepared = "SPC/0200/1/CH450023023099999999A/K/Creditor.Name/Creditor.AddressLine1/Creditor.AddressLine2"+
            "/NL/1024.00/CHF/K/Debtor.Name/Debtor.AddressLine1/Debtor.AddressLine2/LU/QRR/Reference" +
            "/UnstructuredMessage/EPD/BillInformation/AlternativeSchemeInstruction1/AlternativeSchemeInstruction2";

        SecondaryAndAdditionalData secondaryAndAdditionalData = new SecondaryAndAdditionalData();
        secondaryAndAdditionalData.parseFromString(prepared);
    }
}
