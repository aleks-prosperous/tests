package com.aspose.external.barcode.tester.releases.v21_9;

import com.aspose.barcode.generation.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Issue37828
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
    public void test_ChecksumValidation()
    {
        TesterChecksumValidation("012345678901", EncodeTypes.EAN_13, EnableChecksum.DEFAULT, "012345678901", DecodeType.EAN_13, ChecksumValidation.DEFAULT);
        TesterChecksumValidation("012345678901", EncodeTypes.EAN_13, EnableChecksum.DEFAULT, "012345678901", DecodeType.EAN_13, ChecksumValidation.ON);
        TesterChecksumValidation("012345678901", EncodeTypes.EAN_13, EnableChecksum.DEFAULT, "0123456789012", DecodeType.EAN_13, ChecksumValidation.OFF);

        TesterChecksumValidation("012345678901", EncodeTypes.CODE_39_FULL_ASCII, EnableChecksum.YES, "0123456789013", DecodeType.CODE_39_FULL_ASCII, ChecksumValidation.DEFAULT);
        TesterChecksumValidation("012345678901", EncodeTypes.CODE_39_FULL_ASCII, EnableChecksum.YES, "012345678901", DecodeType.CODE_39_FULL_ASCII, ChecksumValidation.ON);
        TesterChecksumValidation("012345678901", EncodeTypes.CODE_39_FULL_ASCII, EnableChecksum.YES, "0123456789013", DecodeType.CODE_39_FULL_ASCII, ChecksumValidation.OFF);
    }

    @Test
    public void test_StripFNC()
    {
        TesterStripFNC("(01)24012345678905", EncodeTypes.GS_1_CODE_128, "<FNC1>0124012345678905", DecodeType.CODE_128, false);
        TesterStripFNC("(01)24012345678905", EncodeTypes.GS_1_CODE_128, "0124012345678905", DecodeType.CODE_128, true);

        TesterStripFNC("(01)24012345678905", EncodeTypes.GS_1_DATA_MATRIX, "<FNC1>0124012345678905", DecodeType.DATA_MATRIX, false);
        TesterStripFNC("(01)24012345678905", EncodeTypes.GS_1_DATA_MATRIX, "0124012345678905", DecodeType.DATA_MATRIX, true);
    }

    @Test
    public void test_DetectEncoding()
    {
        TesterDetectEncoding("english слово ᴒᴆᴃ", "english слово ᴒᴆᴃ", true);
        TesterDetectEncoding("english слово ᴒᴆᴃ", "ï»¿english ÑÐ»Ð¾Ð²Ð¾ á´á´á´", false);
    }

    @Test
    public void test_CustomerInformationInterpretingType()
    {
        TesterCustomerInformationInterpretingType("590123456745678", "590123456745678", CustomerInformationInterpretingType.N_TABLE);
        TesterCustomerInformationInterpretingType("5901234567Aabc", "5901234567Aabc", CustomerInformationInterpretingType.C_TABLE);
        TesterCustomerInformationInterpretingType("590123456701230123", "59012345670123012333333333", CustomerInformationInterpretingType.OTHER);
    }

    @Test
    public void test_SimpleSettings()
    {
        BarCodeReader reader = new BarCodeReader();

        //set
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
        reader.getBarcodeSettings().setDetectEncoding(false);
        reader.getBarcodeSettings().setStripFNC(true);
        reader.getBarcodeSettings().getAustraliaPost().setCustomerInformationDecoder(new FakeDecoder());
        reader.getBarcodeSettings().getAustraliaPost().setCustomerInformationInterpretingType(CustomerInformationInterpretingType.C_TABLE);
        reader.getBarcodeSettings().getAustraliaPost().setIgnoreEndingFillingPatternsForCTable(false);

        //check
        Assert.assertNotEquals(null, reader.getBarcodeSettings());
        Assert.assertNotEquals(null, reader.getBarcodeSettings().getAustraliaPost());
        Assert.assertEquals(ChecksumValidation.ON, reader.getBarcodeSettings().getChecksumValidation());
        Assert.assertEquals(false, reader.getBarcodeSettings().getDetectEncoding());
        Assert.assertEquals(true, reader.getBarcodeSettings().getStripFNC());
        Assert.assertNotEquals(null, reader.getBarcodeSettings().getAustraliaPost().getCustomerInformationDecoder());
        Assert.assertEquals(CustomerInformationInterpretingType.C_TABLE, reader.getBarcodeSettings().getAustraliaPost().getCustomerInformationInterpretingType());
        Assert.assertEquals(false, reader.getBarcodeSettings().getAustraliaPost().getIgnoreEndingFillingPatternsForCTable());
    }

    @Test
    public void test_SimpleSettingsObsolete()
    {
        BarCodeReader reader = new BarCodeReader();

        //set
        reader.getBarcodeSettings().setChecksumValidation( ChecksumValidation.ON);
        reader.getBarcodeSettings().setDetectEncoding(false);
        reader.getBarcodeSettings().setStripFNC(true);
        reader.getBarcodeSettings().getAustraliaPost().setCustomerInformationInterpretingType(CustomerInformationInterpretingType.C_TABLE);

        //check
        Assert.assertEquals(ChecksumValidation.ON, reader.getBarcodeSettings().getChecksumValidation());
        Assert.assertEquals(false, reader.getBarcodeSettings().getDetectEncoding());
        Assert.assertEquals(true, reader.getBarcodeSettings().getStripFNC());
        Assert.assertEquals(CustomerInformationInterpretingType.C_TABLE, reader.getBarcodeSettings().getAustraliaPost().getCustomerInformationInterpretingType());

        Assert.assertEquals(ChecksumValidation.ON, reader.getBarcodeSettings().getChecksumValidation());
        Assert.assertEquals(false, reader.getBarcodeSettings().getDetectEncoding());
        Assert.assertEquals(true, reader.getBarcodeSettings().getStripFNC());
        Assert.assertEquals(CustomerInformationInterpretingType.C_TABLE, reader.getBarcodeSettings().getAustraliaPost().getCustomerInformationInterpretingType());
    }

    @Test
    public void test_SettingsWithSerialization() throws IOException {
        BarCodeReader reader = new BarCodeReader();

        //set
        reader.getBarcodeSettings().setChecksumValidation( ChecksumValidation.ON);
        reader.getBarcodeSettings().setDetectEncoding(false);
        reader.getBarcodeSettings().setStripFNC(true);
        reader.getBarcodeSettings().getAustraliaPost().setCustomerInformationInterpretingType(CustomerInformationInterpretingType.C_TABLE);
        reader.getBarcodeSettings().getAustraliaPost().setIgnoreEndingFillingPatternsForCTable(false);

        //serialize
        ByteArrayOutputStream ms = new ByteArrayOutputStream();
        reader.exportToXml(ms);
        //deserialize
//        ms.Position = 0;
        reader = BarCodeReader.importFromXml(new ByteArrayInputStream(ms.toByteArray()));

        //check
        Assert.assertNotEquals(null, reader.getBarcodeSettings());
        Assert.assertNotEquals(null, reader.getBarcodeSettings().getAustraliaPost());
        Assert.assertEquals(ChecksumValidation.ON, reader.getBarcodeSettings().getChecksumValidation());
        Assert.assertEquals(false, reader.getBarcodeSettings().getDetectEncoding());
        Assert.assertEquals(true, reader.getBarcodeSettings().getStripFNC());
        Assert.assertEquals(CustomerInformationInterpretingType.C_TABLE, reader.getBarcodeSettings().getAustraliaPost().getCustomerInformationInterpretingType());
        Assert.assertEquals(false, reader.getBarcodeSettings().getAustraliaPost().getIgnoreEndingFillingPatternsForCTable());
    }

    protected class FakeDecoder implements AustraliaPostCustomerInformationDecoder
    {
        public String decode(String customerInformationField)
        {
            return "";
        }
    }

    private void TesterCustomerInformationInterpretingType(String inputCodetext, String outputCodetext, CustomerInformationInterpretingType interpretType)
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.AUSTRALIA_POST, inputCodetext);
        {
            generator.getParameters().getBarcode().getAustralianPost().setAustralianPostEncodingTable(interpretType);
            BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), DecodeType.AUSTRALIA_POST);
            {
                reader.getBarcodeSettings().getAustraliaPost().setCustomerInformationInterpretingType(interpretType);

                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(outputCodetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    private void TesterDetectEncoding(String inputCodetext, String outputCodetext, boolean detectEncoding)
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.QR, inputCodetext);
        {
            generator.getParameters().getBarcode().getQR().setQrEncodeMode(QREncodeMode.UTF_8_BOM);
            BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), DecodeType.QR);
            {
                reader.getBarcodeSettings().setDetectEncoding(detectEncoding);

                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(outputCodetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    private void TesterStripFNC(String inputCodetext, BaseEncodeType encodeType, String outputCodetext, BaseDecodeType decodeType, boolean stripFNC)
    {
        BarcodeGenerator generator = new BarcodeGenerator(encodeType, inputCodetext);
        {
            BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), decodeType);
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            {
                reader.getBarcodeSettings().setStripFNC(stripFNC);

                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(outputCodetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    private void TesterChecksumValidation(String inputCodetext, BaseEncodeType encodeType, EnableChecksum enableChecksum,
                                          String output1DCodetext, BaseDecodeType decodeType, ChecksumValidation checksumValidation)
    {
        BarcodeGenerator generator = new BarcodeGenerator(encodeType, inputCodetext);
        {
            generator.getParameters().getBarcode().setChecksumEnabled(enableChecksum);
            BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), decodeType);
            {
                reader.getBarcodeSettings().setChecksumValidation( checksumValidation);

                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(output1DCodetext, reader.getFoundBarCodes()[0].getExtended().getOneD().getValue());
            }
        }
    }
}
