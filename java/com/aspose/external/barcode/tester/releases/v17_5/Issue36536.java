package com.aspose.external.barcode.tester.releases.v17_5;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Test
public class Issue36536
{
    /**
     * <p>
     * Path to folder with files for testing Issue36536.
     * </p>
     */
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36536");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Code128")]
        //[Category("Interleaved2of5")]
        //[Category("ITF14")]
        //[Category("Code39Standard")]
        //[Category("GS1Code128")]
        //[Category("EAN13")]
        //[Category("UPCE")]
        //[Category("AllSupportedTypes")]
    public void test_barcode_examples_1()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_1_out.jpg");

        String[] expectedText = new String[]
                {
                        "Code128: Hello World!",
                        "Interleaved2of5: 0123456789",
                        "ITF14: 15400141288763",
                        "Code39: 0123456789",
                        "Code128: 0123456789",
                        "GS1Code128: (01)01234567890128(10)0123456789(15)041220",
//                        //"Codabar: ?????", //not correct barcode
                        "UPCA: 001234567895", //is equal UPC-A
                        "UPCE: 01234133"
                };

        RecognizePictureAndCheckWithExpectedList(fileName, expectedText, QualitySettings.getHighPerformance());
    }

        @Test
        //[Category("UPCA")]
    public void test_barcode_examples_1_UPCA()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_1_out_UPCA.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("001234567895", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
        //[Category("Supplement")]
        //[Category("EAN8")]
        //[Category("RM4SCC")]
        //[Category("OneCode")]
        //[Category("Pdf417")]
        //[Category("DataMatrix")]
        //[Category("AllSupportedTypes")]
    public void test_barcode_examples_2()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_2_out.jpg");

        String[] expectedText = new String[]
                {
                        "EAN13: 2001234567893",
                        "Supplement: 12",
                        "EAN8: 20123451",
                        //"Postnet: ????", //not correct barcode: incorrect checksum
                        "RM4SCC: SN34RD1A",
                        "OneCode: 01234567094987654321012345678",
                        "Pdf417: 0123456789_ABC-abc",
                        "DataMatrix: 123456",
                        "DataMatrix: Barcode4J is cool!",
                        "DataMatrix: Barcode4J is a flexible generator for barcodes written in Java. It's free, available under the Apache License, version 2.0.",
                };

        RecognizePictureAndCheckWithExpectedList(fileName, expectedText, QualitySettings.getHighPerformance());
    }

        @Test
        //[Category("Postnet")]
    public void test_barcode_examples_1_Postnet()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_2_out_Postnet.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.POSTNET);
        {
            //false beacuse check sum is incorrect
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code128")]
        //[Category("ISBN")]
        //[Category("EAN13")]
        //[Category("Supplement")]
        //[Category("EAN8")]
        //[Category("Code128")]
        //[Category("DataMatrix")]
        //[Category("AllSupportedTypes")]
    public void test_barcode_examples_3()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_3_out.jpg");

        String[] expectedText = new String[]
                {
                        "Code128: O5-2C0272AD0126",
                        "ISBN: 9781556154843",
                        "EAN13: 4194586705506",
                        "Supplement: 04",
                        "EAN8: 80135463",
                        "Code128: 0509",
                        "Code128: 990080530005275708",
                        "DataMatrix: 30Q324343430794<OQQ"
                };

        QualitySettings settings = QualitySettings.getNormalQuality();
        settings.setBarcodeQuality(BarcodeQualityMode.LOW);
        settings.setXDimension(XDimensionMode.SMALL);
        RecognizePictureAndCheckWithExpectedList(fileName, expectedText, settings);
    }

        @Test
        //[Category("ISBN")]
        //[Category("AllSupportedTypes")]
    public void test_barcode_examples_3_ISBN()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_3_out_ISBN.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9781556154843", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.ISBN, reader.getFoundBarCodes()[0].getCodeType());
        }
    }


        @Test
        //[Category("EAN13")]
    public void test_barcode_examples_3_ISBN_inEAN13()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_3_out_ISBN.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9781556154843", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.EAN_13, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("EAN13")]
        //[Category("GS1Code128")]
        //[Category("Code39Standard")]
        //[Category("AllSupportedTypes")]
    public void test_barcode_examples_4()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_4_out.jpg");

        String[] expectedText = new String[]
                {
                        "EAN13: 2001234567893",
                        "EAN13: 2001234567893",
                        "EAN13: 2001234567893",
                        "EAN13: 2001234567893",
                        "EAN13: 2001234567893",
                        "EAN13: 2001234567893",
                        "GS1Code128: (420)12345(91)01123456789123456780",
                        "Code39: 0123456789",
                        "Code39: 01234567892",
                        "Code39: 0123456789"
                };

        QualitySettings settings = QualitySettings.getNormalQuality();
        settings.setBarcodeQuality(BarcodeQualityMode.LOW);
        settings.setXDimension(XDimensionMode.SMALL);
        RecognizePictureAndCheckWithExpectedList(fileName, expectedText, settings);
    }

        @Test
        //[Category("EAN13")]
    public void test_barcode_examples_4_Ean13_1()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_4_out_EAN13_1.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2001234567893", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_barcode_examples_4_Ean13_2()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_4_out_EAN13_2.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2001234567893", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_barcode_examples_4_Ean13_3()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_4_out_EAN13_3.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2001234567893", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_barcode_examples_4_Ean13_4()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_4_out_EAN13_4.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2001234567893", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_barcode_examples_4_Ean13_5()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_4_out_EAN13_5.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2001234567893", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_barcode_examples_4_Ean13_6()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_4_out_EAN13_6.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2001234567893", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
        //[Category("Code39Extended")]
        //[Category("Interleaved2of5")]
        //[Category("UPCE")]
        //[Category("Supplement")]
        //[Category("AllSupportedTypes")]
    public void test_barcode_examples_5()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_5_out.jpg");

        String[] expectedText = new String[]
                {
                        "Code39: 0123456789",
                        //"Code39: ????", //incorrect barcode
                        "Code39FullASCII: Hello *World*!",
                        "Interleaved2of5: 0123456789",
                        "Interleaved2of5: 001234567895",
                        "UPCE: 04252614",
                        "UPCE: 04252614",
                        "UPCE: 04252614",
                        "Supplement: 34",
                        "UPCE: 04252614",
                        "Supplement: 56789",
                        //"Postnet: ????", //not correct barcode: incorrect checksum
                        //"Postnet: ????", //not correct barcode: incorrect checksum
                };

        RecognizePictureAndCheckWithExpectedList(fileName, expectedText, QualitySettings.getNormalQuality());
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_barcode_examples_5_Interleaved2of5()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_5_out_Interleaved2of5.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.INTERLEAVED_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("001234567895", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("5", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("RM4SCC")]
        //[Category("AllSupportedTypes")]
    public void test_barcode_examples_6()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_6_out.jpg");

        String[] expectedText = new String[]
                {
                        //"Postnet: ????", //not correct barcode: incorrect checksum
                        "RM4SCC: B31HQ1A",
                        "RM4SCC: B31HQ1A",
                };

        RecognizePictureAndCheckWithExpectedList(fileName, expectedText, QualitySettings.getHighPerformance());
    }

        @Test
        //[Category("Interleaved2of5")]
        //[Category("VIN")]
        //[Category("Code39Standard")]
        //[Category("Code128")]
        //[Category("EAN13")]
        //[Category("AllSupportedTypes")]
    public void test_barcode_examples_7()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_7_out.jpg");

        String[] expectedText = new String[]
                {
                        "Interleaved2of5: 0123456789",
                        "VIN: 0123456789 -.$/+%", //is subset of Code39
                        "Code39: ABCDEFGHIJKLMNOPQRSTUVWXYZ",
                        "Code128: 0123456789",
                        "Code128: ABCDEFGHIJKLMNOPQRSTUVWXYZ",
                        "Code128: abcdefghijklmnopqrstuvwxyz",
                        //"Cobabar: ???", //not correct barcode
                        "UPCA: 001234567895", //is equal UPC-A
                        "EAN13: 2001234567893", //is equal UPC-A
                        //"Postnet: ????", //not correct barcode: incorrect checksum
                };

        RecognizePictureAndCheckWithExpectedList(fileName, expectedText, QualitySettings.getNormalQuality());
    }

        @Test
        //[Category("Code39Standard")]
    public void test_barcode_examples_7_Code39()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_7_out_Code39.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789 -.$/+%", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("RM4SCC")]
        //[Category("AllSupportedTypes")]
    public void test_barcode_examples_8()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_8_out.jpg");

        String[] expectedText = new String[]
                {
                        "RM4SCC: 0123456789",
                };

        RecognizePictureAndCheckWithExpectedList(fileName, expectedText, QualitySettings.getHighPerformance());
    }

        @Test
        //[Category("EAN13")]
        //[Category("AllSupportedTypes")]
    public void test_barcode_examples_9()
    {
        String fileName = Global.pathCombine(folder, "barcode-examples_9_out.jpg");

        String[] expectedText = new String[]
                {
                        "EAN13: 4006408551379",
                        "EAN13: 4006408551379",
                };
        QualitySettings settings = QualitySettings.getNormalQuality();
        settings.setBarcodeQuality(BarcodeQualityMode.LOW);
        RecognizePictureAndCheckWithExpectedList(fileName, expectedText, settings);
    }

        @Test
        //[Category("Code39Standard")]
        //[Category("Code39Extended")]
        //[Category("Code93Standard")]
        //[Category("Standard2of5")]
        //[Category("Interleaved2of5")]
        //[Category("Code128")]
        //[Category("AllSupportedTypes")]
    public void test_example_027_1()
    {
        String fileName = Global.pathCombine(folder, "example_027_1_out.jpg");

        String[] expectedText = new String[]
                {
                        "Code39: CODE 39",
                        "Code39FullASCII: CODE 39 k", //equal to "Code39: CODE 39 +K"
                        "Code39: CODE 39 E",
                        "Code39FullASCII: CODE 39 E+A", //equal to "Code39: CODE 39 E+
                        "Code93: TEST93",
                        "Standard2of5: 01234567",
                        "Standard2of5: 12345670",
                        "Interleaved2of5: 01234567",
                        "Interleaved2of5: 12345670",
                        "Code128: 2015-08-02 12:22:17"
                };
        QualitySettings settings = QualitySettings.getNormalQuality();
        settings.setBarcodeQuality(BarcodeQualityMode.LOW);
        RecognizePictureAndCheckWithExpectedList(fileName, expectedText, settings);
    }

        @Test
        //[Category("Code39Standard")]
    public void test_example_027_1_out_2()
    {
        String fileName = Global.pathCombine(folder, "example_027_1_out_2.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("CODE 39 +K", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("K", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_example_027_1_out_4()
    {
        String fileName = Global.pathCombine(folder, "example_027_1_out_4.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39_FULL_ASCII);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("CODE 39 E+A", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("A", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_example_027_1_out_7()
    {
        String fileName = Global.pathCombine(folder, "example_027_1_out_7.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.STANDARD_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345670", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("0", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_example_027_1_out_8()
    {
        String fileName = Global.pathCombine(folder, "example_027_1_out_8.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.INTERLEAVED_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
        reader = new BarCodeReader(fileName, DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_example_027_1_out_9()
    {
        String fileName = Global.pathCombine(folder, "example_027_1_out_9.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.INTERLEAVED_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345670", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("0", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Code128")]
        //[Category("EAN8")]
        //[Category("EAN13")]
        //[Category("UPCE")]
        //[Category("AllSupportedTypes")]
    public void test_example_027_2()
    {
        String fileName = Global.pathCombine(folder, "example_027_2_out.jpg");

        String[] expectedText = new String[]
                {
                        "Code128: CODE 128 AUTO",
                        "Code128: CODE 128 A",
                        "Code128: CODE 128 B",
                        "Code128: 0123456789",
                        "EAN8: 12345670",
                        "EAN13: 1234567890128",
                        "UPCA: 123456789012", //is equal to UPC-A
                        "UPCE: 04252614",
                        "Code128: 2015-08-02 12:22:17",
                };

        RecognizePictureAndCheckWithExpectedList(fileName, expectedText, QualitySettings.getNormalQuality());
    }

        @Test
        //[Category("UPCA")]
    public void test_example_027_2_out_UPCA()
    {
        String fileName = Global.pathCombine(folder, "example_027_2_out_UPCA.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789012", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MSI")]
        //[Category("Codabar")]
        //[Category("Code128")]
        //[Category("AllSupportedTypes")]
    public void test_example_027_3()
    {
        String fileName = Global.pathCombine(folder, "example_027_3_out.jpg");

        String[] expectedText = new String[]
                {
                        //"Supplement: 51234", //Supplement must be only with special barcode types
                        //"Supplement: 34", //Supplement must be only with special barcode types
                        "MSI: 8052",
                        //"MSI: 805238", //we use another checksum validation
                        "Codabar: 123456789",
                        //"Pharmacode: 789", //Pharmacode is very special code, and there may be many fakes, we Pharomacode excluded from the results
                        "Code128: 2015-08-02 12:22:17",
                };
        QualitySettings settings = QualitySettings.getNormalQuality();
        settings.setBarcodeQuality(BarcodeQualityMode.LOW);
        RecognizePictureAndCheckWithExpectedList(fileName, expectedText, settings);
    }

        @Test
        //[Category("Supplement")]
    public void test_example_027_3_out_Supplement1()
    {
        String fileName = Global.pathCombine(folder, "example_027_3_out_Supplement1.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SUPPLEMENT);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("51234", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Supplement")]
    public void test_example_027_3_out_Supplement2()
    {
        String fileName = Global.pathCombine(folder, "example_027_3_out_Supplement2.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SUPPLEMENT);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("34", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MSI")]
    public void test_example_027_3_out_MSI2()
    {
        String fileName = Global.pathCombine(folder, "example_027_3_out_MSI2.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.MSI);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            //we used other checksum algorithm
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_example_027_3_out_Code11()
    {
        String fileName = Global.pathCombine(folder, "example_027_3_out_Code11.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Pharmacode")]
    public void test_example_027_3_out_Pharmacode()
    {
        String fileName = Global.pathCombine(folder, "example_027_3_out_Pharmacode.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PHARMACODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("OneCode")]
        //[Category("Postnet")]
        //[Category("Planet")]
        //[Category("RM4SCC")]
        //[Category("DutchKIX")]
        //[Category("Code128")]
        //[Category("AllSupportedTypes")]
    public void test_example_027_4()
    {
        String fileName = Global.pathCombine(folder, "example_027_4_out.jpg");

        String[] expectedText = new String[]
                {
                        "OneCode: 0123456709498765432101234567891",
                        "Postnet: 98000",
                        "Planet: 98000",
                        "RM4SCC: SN34RD1A",
                        "DutchKIX: SN34RDX1A",
                        "Code128: 2015-08-02 12:22:17",
                };

        RecognizePictureAndCheckWithExpectedList(fileName, expectedText, QualitySettings.getHighPerformance());
    }

        @Test
        //[Category("Code128")]
        //[Category("Code39Extended")]
        //[Category("AllSupportedTypes")]
    public void test_example_027_5()
    {
        String fileName = Global.pathCombine(folder, "example_027_5_out.jpg");

        String[] expectedText = new String[]
                {
                        "Code128: LEFT",
                        "Code128: CENTER",
                        "Code128: RIGHT",
                        "Code128: LEFT",
                        "Code128: CENTER",
                        "Code128: RIGHT",
                        "Code128: LEFT",
                        "Code128: CENTER",
                        "Code128: RIGHT",
                        "Code128: LEFT",
                        "Code128: CENTER",
                        "Code128: RIGHT",
                        "Code39FullASCII: CODE 39 E+A",
                        "Code128: 2015-08-02 12:22:17"
                };

        RecognizePictureAndCheckWithExpectedList(fileName, expectedText, QualitySettings.getNormalQuality());
    }

        @Test
        //[Category("Code39Extended")]
    public void test_example_027_5_out_Code39()
    {
        String fileName = Global.pathCombine(folder, "example_027_5_out_Code39.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39_FULL_ASCII);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("CODE 39 E+A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }


    private void RecognizePictureAndCheckWithExpectedList(String fileName, String[] expectedText, QualitySettings svmDetectorSettings)
    {
        List<String> readText = new ArrayList<String>();
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            reader.setQualitySettings(svmDetectorSettings);
            for(BarCodeResult result : reader.readBarCodes())
                readText.add(result.getCodeType().toString() + ": " + result.getCodeText());
        }

        for(String item : expectedText)
        {
            Assert.assertTrue(readText.contains(item), ("Didn't recognize: " + item));
        }

        List<String> expectedList = new ArrayList<String>();
        for(String string : expectedText)
            expectedList.add(string);
        for(String item : readText)
        {
            Assert.assertTrue(expectedList.contains(item), ("Fake recognition: " + item));
        }

        Assert.assertEquals(expectedList.size(), readText.size(), "Incorrect number of recognized barcodes.");
    }
}
