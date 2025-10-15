package com.aspose.external.barcode.tester.releases.v21_9;

import com.aspose.barcode.barcoderecognition.AustraliaPostCustomerInformationDecoder;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.CustomerInformationInterpretingType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37829
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
    public void test_IgnoreEndingFillingPatternsForCTable()
    {
        TesterIgnoreEndingFillingPatternsForCTable("5901234567Ac", "5901234567Ac", true);
        TesterIgnoreEndingFillingPatternsForCTable("5901234567Ac", "5901234567Aczzz", false);
        TesterIgnoreEndingFillingPatternsForCTable("6212345678", "6212345678", true);
        TesterIgnoreEndingFillingPatternsForCTable("6212345678", "6212345678zzzzzzzzzz", false);
    }

    @Test
    public void test_AustraliaPostCustomerInformationDecoder()
    {
        TesterAustraliaPostCustomerInformationDecoder("59012345675678", "59012345675678",
                CustomerInformationInterpretingType.N_TABLE, CustomerInformationInterpretingType.C_TABLE, new NTableDecoder());
        TesterAustraliaPostCustomerInformationDecoder("59012345675678", "5901234567RHozz",
                CustomerInformationInterpretingType.N_TABLE, CustomerInformationInterpretingType.C_TABLE, null);
        TesterAustraliaPostCustomerInformationDecoder("59012345675678", "59012345671220212233333333",
                CustomerInformationInterpretingType.N_TABLE, CustomerInformationInterpretingType.C_TABLE, new ExceptionDecoder());

    }

    protected class NTableDecoder implements AustraliaPostCustomerInformationDecoder
{
    String[] N_Table = {"00", "01", "02", "10", "11", "12", "20", "21", "22", "30" };
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

    protected class ExceptionDecoder implements AustraliaPostCustomerInformationDecoder
{
    public String decode(String customerInformationField)
    {
        throw new RuntimeException("test exception");
    }
}

    private void TesterAustraliaPostCustomerInformationDecoder(String inputCodetext, String outputCodetext,
                                                               CustomerInformationInterpretingType inputInterpretationType, CustomerInformationInterpretingType outputInterpretationType,
                                                               AustraliaPostCustomerInformationDecoder decoder)
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.AUSTRALIA_POST, inputCodetext);
        {
            generator.getParameters().getBarcode().getAustralianPost().setAustralianPostEncodingTable(inputInterpretationType);
            BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), DecodeType.AUSTRALIA_POST);
            {
                reader.getBarcodeSettings().getAustraliaPost().setCustomerInformationInterpretingType(outputInterpretationType);
                reader.getBarcodeSettings().getAustraliaPost().setIgnoreEndingFillingPatternsForCTable(false);
                reader.getBarcodeSettings().getAustraliaPost().setCustomerInformationDecoder(decoder);

                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(outputCodetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    private void TesterIgnoreEndingFillingPatternsForCTable(String inputCodetext, String outputCodetext, boolean ignoreFillingPatterns)
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.AUSTRALIA_POST, inputCodetext);
        {
            generator.getParameters().getBarcode().getAustralianPost().setAustralianPostEncodingTable(CustomerInformationInterpretingType.C_TABLE);
            BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), DecodeType.AUSTRALIA_POST);
            {
                reader.getBarcodeSettings().getAustraliaPost().setCustomerInformationInterpretingType(CustomerInformationInterpretingType.C_TABLE);
                reader.getBarcodeSettings().getAustraliaPost().setIgnoreEndingFillingPatternsForCTable(ignoreFillingPatterns);

                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(outputCodetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }
}
