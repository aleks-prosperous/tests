package com.aspose.external.barcode.tester.releases.v18_4;

import com.aspose.barcode.BarCodeException;
import com.aspose.barcode.auxiliary.StringExtensions;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;

public class Issue36843
{
    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testGenerateBarcodeWithIncorrectCodeText()
    {
        String cyrillicText = "АБВГД";
        generateAndCheckBarcodeWithIncorrectCodeText("ABC", EncodeTypes.CODABAR);
        generateAndCheckBarcodeWithIncorrectCodeText("ABC", EncodeTypes.CODE_11);
        generateAndCheckBarcodeWithIncorrectCodeText("demo text", EncodeTypes.CODE_39);
        generateAndCheckBarcodeWithIncorrectCodeText(cyrillicText, EncodeTypes.CODE_39_FULL_ASCII);
        generateAndCheckBarcodeWithIncorrectCodeText(cyrillicText, EncodeTypes.CODE_93);
        generateAndCheckBarcodeWithIncorrectCodeText("ABC", EncodeTypes.DEUTSCHE_POST_IDENTCODE);
        generateAndCheckBarcodeWithIncorrectCodeText("ABC", EncodeTypes.DEUTSCHE_POST_LEITCODE);
        generateAndCheckBarcodeWithIncorrectCodeText("1234", EncodeTypes.EAN_13);
        generateAndCheckBarcodeWithIncorrectCodeText("ABC", EncodeTypes.EAN_13);
        generateAndCheckBarcodeWithIncorrectCodeText("(02)1234567890123", EncodeTypes.EAN_14);
        generateAndCheckBarcodeWithIncorrectCodeText("(01)12345678901231", EncodeTypes.EAN_14);
        generateAndCheckBarcodeWithIncorrectCodeText("(01)A234567890123", EncodeTypes.EAN_14);
        generateAndCheckBarcodeWithIncorrectCodeText("12345678", EncodeTypes.EAN_8);
        generateAndCheckBarcodeWithIncorrectCodeText("A234569", EncodeTypes.EAN_8);
        generateAndCheckBarcodeWithIncorrectCodeText("A401234567", EncodeTypes.INTERLEAVED_2_OF_5);
        generateAndCheckBarcodeWithIncorrectCodeText("A23456789", EncodeTypes.OPC);
        generateAndCheckBarcodeWithIncorrectCodeText("A234567890123", EncodeTypes.ITF_14);
        generateAndCheckBarcodeWithIncorrectCodeText("A23456", EncodeTypes.ITF_6);
        generateAndCheckBarcodeWithIncorrectCodeText("A23456", EncodeTypes.MATRIX_2_OF_5);
        generateAndCheckBarcodeWithIncorrectCodeText("A23456", EncodeTypes.MSI);
        generateAndCheckBarcodeWithIncorrectCodeText("A23456", EncodeTypes.PHARMACODE);
        generateAndCheckBarcodeWithIncorrectCodeText(String.valueOf(3 - 1), EncodeTypes.PHARMACODE);
        generateAndCheckBarcodeWithIncorrectCodeText(String.valueOf(131070 + 1), EncodeTypes.PHARMACODE);
        generateAndCheckBarcodeWithIncorrectCodeText("12345679", EncodeTypes.PZN);
        generateAndCheckBarcodeWithIncorrectCodeText("A23456", EncodeTypes.PZN);
        generateAndCheckBarcodeWithIncorrectCodeText("(02)1234567890123", EncodeTypes.SCC_14);
        generateAndCheckBarcodeWithIncorrectCodeText(StringExtensions.concat("(01)1234567890123", "9"), EncodeTypes.SCC_14);
        generateAndCheckBarcodeWithIncorrectCodeText("(01)123456789012A", EncodeTypes.SCC_14);
        generateAndCheckBarcodeWithIncorrectCodeText("(01)12345678901234567", EncodeTypes.SSCC_18);
        generateAndCheckBarcodeWithIncorrectCodeText(StringExtensions.concat("(00)12345678901234567", "9"), EncodeTypes.SSCC_18);
        generateAndCheckBarcodeWithIncorrectCodeText("(00)1234567890123456A", EncodeTypes.SSCC_18);
        generateAndCheckBarcodeWithIncorrectCodeText("12345", EncodeTypes.SINGAPORE_POST);
        generateAndCheckBarcodeWithIncorrectCodeText(StringExtensions.concat("123456", "7"), EncodeTypes.SINGAPORE_POST);
        generateAndCheckBarcodeWithIncorrectCodeText("A23456", EncodeTypes.SINGAPORE_POST);
        generateAndCheckBarcodeWithIncorrectCodeText("A401234567", EncodeTypes.STANDARD_2_OF_5);
        generateAndCheckBarcodeWithIncorrectCodeText("A401234567", EncodeTypes.IATA_2_OF_5);
        generateAndCheckBarcodeWithIncorrectCodeText(StringExtensions.concat("12345678901", "1"), EncodeTypes.UPCA);
        generateAndCheckBarcodeWithIncorrectCodeText("1234567890", EncodeTypes.UPCA);
        generateAndCheckBarcodeWithIncorrectCodeText("A2345678901", EncodeTypes.UPCA);
        generateAndCheckBarcodeWithIncorrectCodeText(StringExtensions.concat("1234567", "1"), EncodeTypes.UPCE);
        generateAndCheckBarcodeWithIncorrectCodeText("123456A", EncodeTypes.UPCE);
        generateAndCheckBarcodeWithIncorrectCodeText("9234567", EncodeTypes.UPCE);
        generateAndCheckBarcodeWithIncorrectCodeText("92345A", EncodeTypes.UPCE);
        generateAndCheckBarcodeWithIncorrectCodeText("12345A", EncodeTypes.UPCE);
        generateAndCheckBarcodeWithIncorrectCodeText(StringExtensions.concat("57392347", "0"), EncodeTypes.CODE_32);
        generateAndCheckBarcodeWithIncorrectCodeText("5739234", EncodeTypes.CODE_32);
        generateAndCheckBarcodeWithIncorrectCodeText(StringExtensions.concat("573923479", "0"), EncodeTypes.CODE_32);
        generateAndCheckBarcodeWithIncorrectCodeText(StringExtensions.concat("57392347", "A"), EncodeTypes.CODE_32);
        generateAndCheckBarcodeWithIncorrectCodeText(StringExtensions.concat("123456789012345678", "9"), EncodeTypes.SWISS_POST_PARCEL);
        generateAndCheckBarcodeWithIncorrectCodeText("12345678901234567", EncodeTypes.SWISS_POST_PARCEL);
        generateAndCheckBarcodeWithIncorrectCodeText("12345678901234567A", EncodeTypes.SWISS_POST_PARCEL);
        generateAndCheckBarcodeWithIncorrectCodeText("9812345", EncodeTypes.SWISS_POST_PARCEL);
        generateAndCheckBarcodeWithIncorrectCodeText("9812345690", EncodeTypes.SWISS_POST_PARCEL);
        generateAndCheckBarcodeWithIncorrectCodeText("981234567", EncodeTypes.SWISS_POST_PARCEL);
        generateAndCheckBarcodeWithIncorrectCodeText("N981234569CH", EncodeTypes.SWISS_POST_PARCEL);
        generateAndCheckBarcodeWithIncorrectCodeText("RN981234569CA", EncodeTypes.SWISS_POST_PARCEL);
        generateAndCheckBarcodeWithIncorrectCodeText("RN981234567CH", EncodeTypes.SWISS_POST_PARCEL);
        generateAndCheckBarcodeWithIncorrectCodeText("0611", EncodeTypes.SWISS_POST_PARCEL);
        generateAndCheckBarcodeWithIncorrectCodeText("0610A", EncodeTypes.SWISS_POST_PARCEL);
        generateAndCheckBarcodeWithIncorrectCodeText("12345678A", EncodeTypes.POSTNET);
        generateAndCheckBarcodeWithIncorrectCodeText("12345678A", EncodeTypes.PLANET);
        generateAndCheckBarcodeWithIncorrectCodeText("(01)12345678901232", EncodeTypes.DATABAR_STACKED);
        generateAndCheckBarcodeWithIncorrectCodeText("0112345678901231", EncodeTypes.DATABAR_STACKED);
        generateAndCheckBarcodeWithIncorrectCodeText("(01)A2345678901231", EncodeTypes.DATABAR_STACKED);
        generateAndCheckBarcodeWithIncorrectCodeText("(01)12345678901232", EncodeTypes.DATABAR_OMNI_DIRECTIONAL);
        generateAndCheckBarcodeWithIncorrectCodeText("0112345678901231", EncodeTypes.DATABAR_OMNI_DIRECTIONAL);
        generateAndCheckBarcodeWithIncorrectCodeText("(01)A2345678901231", EncodeTypes.DATABAR_OMNI_DIRECTIONAL);
        generateAndCheckBarcodeWithIncorrectCodeText("(01)12345678901232", EncodeTypes.DATABAR_TRUNCATED);
        generateAndCheckBarcodeWithIncorrectCodeText("0112345678901231", EncodeTypes.DATABAR_TRUNCATED);
        generateAndCheckBarcodeWithIncorrectCodeText("(01)A2345678901231", EncodeTypes.DATABAR_TRUNCATED);
        generateAndCheckBarcodeWithIncorrectCodeText("(01)12345678901232", EncodeTypes.DATABAR_STACKED_OMNI_DIRECTIONAL);
        generateAndCheckBarcodeWithIncorrectCodeText("0112345678901231", EncodeTypes.DATABAR_STACKED_OMNI_DIRECTIONAL);
        generateAndCheckBarcodeWithIncorrectCodeText("(01)A2345678901231", EncodeTypes.DATABAR_STACKED_OMNI_DIRECTIONAL);
        generateAndCheckBarcodeWithIncorrectCodeText("(01)12345678901232", EncodeTypes.DATABAR_LIMITED);
        generateAndCheckBarcodeWithIncorrectCodeText("0112345678901231", EncodeTypes.DATABAR_LIMITED);
        generateAndCheckBarcodeWithIncorrectCodeText("(01)A2345678901231", EncodeTypes.DATABAR_LIMITED);
    }

    @Test
    public void testSingaporePostWithDifferentCodeTexts()
    {
        generateSingaporePostAndRecodnize("1", "000001");
        generateSingaporePostAndRecodnize("1A", "000001");
        generateSingaporePostAndRecodnize("567890", "567890");
        generateSingaporePostAndRecodnize("4567890", "456789");
        generateSingaporePostAndRecodnize("ABCD", "123456");
        generateSingaporePostAndRecodnize("000", "000000");
        generateSingaporePostAndRecodnize("000000", "000000");
    }

    private void generateSingaporePostAndRecodnize(String codeText, String expectedText)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.SINGAPORE_POST, codeText);
        {
            gen.setCodeText(codeText);
            gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);

            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(expectedText, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    private void generateAndCheckBarcodeWithIncorrectCodeText(String codeText, BaseEncodeType encodeType)
    {
        BarcodeGenerator gen = new BarcodeGenerator(encodeType, codeText);
        {
            gen.setCodeText(codeText);
            gen.getParameters().getBarcode().setThrowExceptionWhenCodeTextIncorrect(true);
            try
            {
                BufferedImage b = gen.generateBarCodeImage();
                Assert.fail("Must be exception.");
            }
            catch (BarCodeException e)
            {
            }
        }
    }
}
