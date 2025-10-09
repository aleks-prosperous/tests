package com.aspose.barcode.complexbarcode;

import com.aspose.barcode.BarCodeException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;

public class SecondaryAndAdditionalDataTests
{
    @Test
    public void testSetExpiryDateFormat()
    {
        SecondaryAndAdditionalData secondaryAndAdditionalData = new SecondaryAndAdditionalData();
        HIBCLICDateFormat expectedFormat = HIBCLICDateFormat.YYYYMMDD;
        secondaryAndAdditionalData.setExpiryDateFormat(expectedFormat);
        Assert.assertEquals(secondaryAndAdditionalData.getExpiryDateFormat(), expectedFormat);
    }

    @Test
    public void testSetExpiryDate()
    {
        SecondaryAndAdditionalData secondaryAndAdditionalData = new SecondaryAndAdditionalData();
        LocalDateTime localDateTime = secondaryAndAdditionalData.getExpiryDate();
        System.out.println(localDateTime.getYear());
        Assert.assertEquals(localDateTime.getYear(), 1970);
        Assert.assertEquals(localDateTime.getHour(), 0);
        LocalDateTime expected = LocalDateTime.of(2024, 9, 19, 15, 19);
        secondaryAndAdditionalData.setExpiryDate(expected);
        Assert.assertEquals(secondaryAndAdditionalData.getExpiryDate(), expected);
    }

    @Test
    public void testSetLotNumber()
    {
        SecondaryAndAdditionalData secondaryAndAdditionalData = new SecondaryAndAdditionalData();
        Assert.assertNull(secondaryAndAdditionalData.getLotNumber());
        secondaryAndAdditionalData.setLotNumber("1100");
        Assert.assertEquals(secondaryAndAdditionalData.getLotNumber(), "1100");

    }

    @Test
    public void testSetDateOfManufacture()
    {
        SecondaryAndAdditionalData secondaryAndAdditionalData = new SecondaryAndAdditionalData();
        LocalDateTime expected = LocalDateTime.of(1970, 1, 1, 0, 0);
        Assert.assertEquals(secondaryAndAdditionalData.getDateOfManufacture(), expected);
        expected = LocalDateTime.of(2024, 12, 13, 14, 34);
        secondaryAndAdditionalData.setDateOfManufacture(expected);
        Assert.assertEquals(secondaryAndAdditionalData.getDateOfManufacture(), expected);

    }

   @Test
    public void testSetQuantity1()
    {
        SecondaryAndAdditionalData secondaryAndAdditionalData = new SecondaryAndAdditionalData();
        int expected = -1;
        Assert.assertEquals(secondaryAndAdditionalData.getQuantity(), expected);
        expected = 34;
        secondaryAndAdditionalData.setQuantity(expected);
        Assert.assertEquals(secondaryAndAdditionalData.getQuantity(), expected);
    }

   @Test (expectedExceptions = BarCodeException.class,
   expectedExceptionsMessageRegExp = "Quantity must be integer value from 0 to 500. Also it can be set to -1 in order not to use this field.")
    public void testSetQuantity2()
    {
        SecondaryAndAdditionalData secondaryAndAdditionalData = new SecondaryAndAdditionalData();
        secondaryAndAdditionalData.setQuantity(1010);
    }

    @Test(enabled = false) //TODO BARCODEJAVA-1891
    public void testParseFromString()
    {
        String prepared = "SPC/0200/1/CH450023023099999999A/K/Creditor.Name/Creditor.AddressLine1/Creditor.AddressLine2"+
                "/NL/1024.00/CHF/K/Debtor.Name/Debtor.AddressLine1/Debtor.AddressLine2/LU/QRR/Reference" +
                "/UnstructuredMessage/EPD/BillInformation/AlternativeSchemeInstruction1/AlternativeSchemeInstruction2";
//        String prepared = "SPC\n0200\n1\nCH450023023099999999A\nK\nCreditor.Name\nCreditor.AddressLine1\nCreditor.AddressLine2"+
//                "\nNL\n1024.00\nCHF\nK\nDebtor.Name\nDebtor.AddressLine1\nDebtor.AddressLine2\nLU\nQRR\nReference" +
//                "\nUnstructuredMessage\nEPD\nBillInformation\nAlternativeSchemeInstruction1\nAlternativeSchemeInstruction2";

        SecondaryAndAdditionalData secondaryAndAdditionalData = new SecondaryAndAdditionalData();
        secondaryAndAdditionalData.parseFromString(prepared);

    }

   @Test
    public void testSetSerialNumber1()
    {
        SecondaryAndAdditionalData secondaryAndAdditionalData = new SecondaryAndAdditionalData();
        Assert.assertNull(secondaryAndAdditionalData.getSerialNumber());
        secondaryAndAdditionalData.setSerialNumber("456789");
        Assert.assertEquals(secondaryAndAdditionalData.getSerialNumber(), "456789");

    }

    @Test(expectedExceptions = com.aspose.barcode.BarCodeException.class,
            expectedExceptionsMessageRegExp = "Lot/batch number must be up to 18 sybmols length.")
    public void testSetSerialNumber2()
    {
        SecondaryAndAdditionalData secondaryAndAdditionalData = new SecondaryAndAdditionalData();
        secondaryAndAdditionalData.setSerialNumber("ASDFGHJKLZXCVBNMqwertyui456789");
    }

    @Test(expectedExceptions = com.aspose.barcode.BarCodeException.class,
            expectedExceptionsMessageRegExp = "Lot/batch number must be alphanumeric string.")
    public void testSetSerialNumber3()
    {
        SecondaryAndAdditionalData secondaryAndAdditionalData = new SecondaryAndAdditionalData();
        secondaryAndAdditionalData.setSerialNumber("ASDF&?_-G");
    }
}
