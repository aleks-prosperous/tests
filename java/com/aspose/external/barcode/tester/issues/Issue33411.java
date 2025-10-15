package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.barcode.generation.EnableChecksum;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue33411
{
    private static List<BaseEncodeType> checksumEncodeTypes = new ArrayList<BaseEncodeType>();

    /**
     * Prepares to run these tests
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
        checksumEncodeTypes.add(EncodeTypes.CODE_11);
        checksumEncodeTypes.add(EncodeTypes.IATA_2_OF_5);
        checksumEncodeTypes.add(EncodeTypes.CODE_93);
        checksumEncodeTypes.add(EncodeTypes.CODE_128);
        checksumEncodeTypes.add(EncodeTypes.GS_1_CODE_128);
        checksumEncodeTypes.add(EncodeTypes.EAN_14);
        checksumEncodeTypes.add(EncodeTypes.SCC_14);
        checksumEncodeTypes.add(EncodeTypes.SSCC_18);
        checksumEncodeTypes.add(EncodeTypes.SWISS_POST_PARCEL);
        checksumEncodeTypes.add(EncodeTypes.EAN_13);
        checksumEncodeTypes.add(EncodeTypes.EAN_8);
        checksumEncodeTypes.add(EncodeTypes.UPCA);
        checksumEncodeTypes.add(EncodeTypes.UPCE);
        checksumEncodeTypes.add(EncodeTypes.ISBN);
        checksumEncodeTypes.add(EncodeTypes.DEUTSCHE_POST_IDENTCODE);
        checksumEncodeTypes.add(EncodeTypes.DEUTSCHE_POST_LEITCODE);
    }

        @Test
    public void generation_ThrowChecksumAvailabilityException()
    {
        generation_ThrowChecksumAvailabilityException(EncodeTypes.CODE_11, "12345");
        generation_ThrowChecksumAvailabilityException(EncodeTypes.IATA_2_OF_5, "12345");
        generation_ThrowChecksumAvailabilityException(EncodeTypes.CODE_93, "12345");
        generation_ThrowChecksumAvailabilityException(EncodeTypes.CODE_128, "12345");
        generation_ThrowChecksumAvailabilityException(EncodeTypes.GS_1_CODE_128, "(02)04006664241007(37)1(400)7019590754");
        generation_ThrowChecksumAvailabilityException(EncodeTypes.EAN_14, "(01)09876543210982");
        generation_ThrowChecksumAvailabilityException(EncodeTypes.SCC_14, "(01)17174591806423");
        generation_ThrowChecksumAvailabilityException(EncodeTypes.SSCC_18, "(00)108528960018123006");
        generation_ThrowChecksumAvailabilityException(EncodeTypes.SWISS_POST_PARCEL, "RN999123458CH");
        generation_ThrowChecksumAvailabilityException(EncodeTypes.EAN_13, "123456789012");
        generation_ThrowChecksumAvailabilityException(EncodeTypes.EAN_8, "4321987");
        generation_ThrowChecksumAvailabilityException(EncodeTypes.UPCA, "12345678901");
        generation_ThrowChecksumAvailabilityException(EncodeTypes.UPCE, "0234567");
        generation_ThrowChecksumAvailabilityException(EncodeTypes.ISBN, "978155615484");
    }

    protected void generation_ThrowChecksumAvailabilityException(BaseEncodeType symbology, String Codetext)
    {
        BarcodeGenerator gen = new BarcodeGenerator(symbology, Codetext);
        {
            gen.getParameters().getBarcode().setChecksumEnabled(EnableChecksum.NO);
            try
            {
                gen.generateBarCodeImage();
            }
            catch (Exception ex)
            {
                if (ex instanceof BarCodeException)
                    if (!ex.getMessage().equals("Unable to use " + symbology + " symbology without checksum."))
                        Assert.fail("Checksum availability broken for " + symbology);
            }
        }
    }

//    public static List<BaseEncodeType> getGenerationInvalidEnumValues()
//    {
//
//        {
//            List<BaseEncodeType> data = new ArrayList<>();
//
//            for(BaseEncodeType s : EncodeTypes.getAllEncodeTypes())
//            {
//                if (checksumEncodeTypes.contains(s))
//                    data.add(s);
//            }
//
//            return data;
//        }
//    }

    @Test
    public void generation_NotThrowChecksumAvailabilityException()
    {
        for(BaseEncodeType symbology : getGenerationValidEnumValues())
        {
            BarcodeGenerator gen = new BarcodeGenerator(symbology, "12345");
            gen.getParameters().getBarcode().setChecksumEnabled(EnableChecksum.NO);
            try
            {
                gen.generateBarCodeImage();
            }
                catch (Exception ex)
                {
                    if (ex instanceof BarCodeException)
                        if (ex.getMessage().equals("Unable to use " + symbology + " symbology without checksum."))
                            Assert.fail("Checksum availability broken for " + symbology);
                }
        }
    }

    public static List<BaseEncodeType> getGenerationValidEnumValues()
    {

        {
            List<BaseEncodeType> list = new ArrayList<>();
            for(BaseEncodeType s : EncodeTypes.getAllEncodeTypes())
            {
                if (!checksumEncodeTypes.contains(s))
                    list.add(s);
            }
            return list;
        }
    }
}
