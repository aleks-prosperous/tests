package com.aspose.external.barcode.tester.releases.v21_9;

import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class ApiChangesTest_21_9
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }


    @Test
    public void testApi1()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.AUSTRALIA_POST, "6212345678");
        generator.getParameters().getBarcode().getAustralianPost().setAustralianPostEncodingTable(CustomerInformationInterpretingType.N_TABLE);

        BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), DecodeType.AUSTRALIA_POST);

        BarcodeSettings barcodeSettings = reader.getBarcodeSettings();

        barcodeSettings.setChecksumValidation(ChecksumValidation.OFF);
        Assert.assertEquals(ChecksumValidation.OFF, barcodeSettings.getChecksumValidation());
        barcodeSettings.setChecksumValidation(ChecksumValidation.ON);
        Assert.assertEquals(ChecksumValidation.ON, barcodeSettings.getChecksumValidation());
        barcodeSettings.setChecksumValidation(ChecksumValidation.DEFAULT);
        Assert.assertEquals(ChecksumValidation.DEFAULT, barcodeSettings.getChecksumValidation());

        barcodeSettings.setStripFNC(false);
        Assert.assertFalse(barcodeSettings.getStripFNC());

        barcodeSettings.setDetectEncoding(false);
        Assert.assertFalse(barcodeSettings.getDetectEncoding());

        AustraliaPostSettings australiaPostSettings = barcodeSettings.getAustraliaPost();

        australiaPostSettings.setCustomerInformationInterpretingType(CustomerInformationInterpretingType.C_TABLE);
        Assert.assertEquals(CustomerInformationInterpretingType.C_TABLE, australiaPostSettings.getCustomerInformationInterpretingType());

        australiaPostSettings.setIgnoreEndingFillingPatternsForCTable(false);
        Assert.assertFalse(australiaPostSettings.getIgnoreEndingFillingPatternsForCTable());

        AustraliaPostCustomerInformationDecoder decoder = new NTableDecoder();
        australiaPostSettings.setCustomerInformationDecoder(decoder);
        Assert.assertEquals(decoder, australiaPostSettings.getCustomerInformationDecoder());
        Assert.assertEquals("5", decoder.decode("1234")); //TODO

        Assert.assertEquals(1, reader.readBarCodes().length);
        Assert.assertEquals("6212345678", reader.getFoundBarCodes()[0].getCodeText());

    }

    @Test
    public void testApi2()
    {
        try
        {
            throw new BarCodeRecognitionException("BarCodeRecognitionException");
        }
        catch (BarCodeRecognitionException e)
        {
            Assert.assertEquals("BarCodeRecognitionException",e.getMessage());
        }
    }

    @Test
   public void testApi3()
    {
        try
        {
            throw new RecognitionAbortedException("RecognitionAbortedException", 10);
        }
        catch (RecognitionAbortedException e)
        {
            Assert.assertEquals("RecognitionAbortedException", e.getMessage());
            Assert.assertEquals(10, e.getExecutionTime());
        }
    }
  @Test
   public void testApi4()
    {
        try
        {
            RecognitionAbortedException recognitionAbortedException = new RecognitionAbortedException("RecognitionAbortedException", 10);
            recognitionAbortedException.setExecutionTime(20);
            throw recognitionAbortedException;
        }
        catch (RecognitionAbortedException e)
        {
            Assert.assertEquals(20, e.getExecutionTime());
        }
    }


}

class NTableDecoder implements AustraliaPostCustomerInformationDecoder
{
    String[] N_Table = {"00", "01", "02", "10", "11", "12", "20", "21", "22", "30"};

    public String decode(String customerInformationField)
    {
        StringBuilder bd = new StringBuilder();
        for (int i = 0; i < customerInformationField.length(); i += 2)
        {
            if (i + 2 <= customerInformationField.length())
            {
                String tmp = customerInformationField.substring(i, i + 2);
                for (int j = 0; j < N_Table.length; j++)
                {
                    if (N_Table[j].equals(tmp))
                    {
                        bd.append(j);
                        break;
                    }
                }
            }
        }
        return bd.toString();
    }
}
