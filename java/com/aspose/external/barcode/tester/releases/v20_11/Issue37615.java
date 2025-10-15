package com.aspose.external.barcode.tester.releases.v20_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue37615
{
    /// <summary>
    /// Path to folder with files for testing Issue37615.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues\\Issue37615");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_UserSequence()
    {
        RecognizeDataBarExpanded("(01)00628250992083(13)200828(10)P200004.png", "(01)00628250992083(13)200828(10)P200004");
        RecognizeDataBarExpanded("fromUser\\barcode.gif", "(01)00628250992083(13)200828(10)P200004");
        RecognizeDataBarExpanded("fromUser\\UserBarcode(20.8)GS1FNC1.png", "(01)00628250992083(13)200828(10)P200004");
        RecognizeDataBarExpanded("fromUser\\UserBarcode(20.8)NOTGS1FNC1.png", "5(01)<FNC1>00628250992083(13)200828(10)P<FNC1>200004");
    }

    @Test
    public void test_0111000_0111111_Full()
    {
        //7.2.5.4.4 Encodation method fields '0111000' through '0111111' – variable weight item plus date
        RecognizeDataBarExpanded("(01)90012345678908(3100)012233(11)991231.png", "(01)90012345678908(3100)012233(11)991231");
        RecognizeDataBarExpanded("(01)90012345678908(3109)012233(11)991231.png", "(01)90012345678908(3109)012233(11)991231");
        RecognizeDataBarExpanded("(01)90012345678908(3200)012233(11)991231.png", "(01)90012345678908(3200)012233(11)991231");
        RecognizeDataBarExpanded("(01)90012345678908(3209)012233(11)991231.png", "(01)90012345678908(3209)012233(11)991231");

        RecognizeDataBarExpanded("(01)90012345678908(3100)012233(13)991231.png", "(01)90012345678908(3100)012233(13)991231");
        RecognizeDataBarExpanded("(01)90012345678908(3109)012233(13)991231.png", "(01)90012345678908(3109)012233(13)991231");
        RecognizeDataBarExpanded("(01)90012345678908(3200)012233(13)991231.png", "(01)90012345678908(3200)012233(13)991231");
        RecognizeDataBarExpanded("(01)90012345678908(3209)012233(13)991231.png", "(01)90012345678908(3209)012233(13)991231");

        RecognizeDataBarExpanded("(01)90012345678908(3100)012233(15)991231.png", "(01)90012345678908(3100)012233(15)991231");
        RecognizeDataBarExpanded("(01)90012345678908(3109)012233(15)991231.png", "(01)90012345678908(3109)012233(15)991231");
        RecognizeDataBarExpanded("(01)90012345678908(3200)012233(15)991231.png", "(01)90012345678908(3200)012233(15)991231");
        RecognizeDataBarExpanded("(01)90012345678908(3209)012233(15)991231.png", "(01)90012345678908(3209)012233(15)991231");

        RecognizeDataBarExpanded("(01)90012345678908(3100)012233(17)991231.png", "(01)90012345678908(3100)012233(17)991231");
        RecognizeDataBarExpanded("(01)90012345678908(3109)012233(17)991231.png", "(01)90012345678908(3109)012233(17)991231");
        RecognizeDataBarExpanded("(01)90012345678908(3200)012233(17)991231.png", "(01)90012345678908(3200)012233(17)991231");
        RecognizeDataBarExpanded("(01)90012345678908(3209)012233(17)991231.png", "(01)90012345678908(3209)012233(17)991231");
    }

    @Test
    public void test_0111000_0111111_Partial()
    {
        //7.2.5.4.4 Encodation method fields '0111000' through '0111111' – variable weight item plus date
        //partial encoding with date and 38400 as hook
        RecognizeDataBarExpanded("(01)90012345678908(3100)012233.png", "(01)90012345678908(3100)012233");
        RecognizeDataBarExpanded("(01)90012345678908(3109)012233.png", "(01)90012345678908(3109)012233");
        RecognizeDataBarExpanded("(01)90012345678908(3200)012233.png", "(01)90012345678908(3200)012233");
        RecognizeDataBarExpanded("(01)90012345678908(3209)012233.png", "(01)90012345678908(3209)012233");
    }

    @Test
    public void test_01100_01101()
    {
        //7.2.5.4.5 Encodation method field '01100' – variable measure item and price
        //7.2.5.4.6 Encodation method field '01101' – variable measure item and price with ISO 4217 Currency Code
        RecognizeDataBarExpanded("(01)90012345678908(3920)001123.png", "(01)90012345678908(3920)001123");
        RecognizeDataBarExpanded("(01)90012345678908(3923)001123.png", "(01)90012345678908(3923)001123");
        RecognizeDataBarExpanded("(01)90012345678908(3930)001123.png", "(01)90012345678908(3930)001123");
        RecognizeDataBarExpanded("(01)90012345678908(3933)001123.png", "(01)90012345678908(3933)001123");
        RecognizeDataBarExpanded("(01)90012345678908(3930)001.png", "(01)90012345678908(3930)001");
        RecognizeDataBarExpanded("(01)90012345678908(3920)0.png", "(01)90012345678908(3920)0");
        RecognizeDataBarExpanded("(01)90012345678908(3920)001123(10)123(3920)001123.png", "(01)90012345678908(3920)001123(10)123(3920)001123");
        RecognizeDataBarExpanded("(01)90012345678908(3923)001123(10)123(3920)001123.png", "(01)90012345678908(3923)001123(10)123(3920)001123");
        RecognizeDataBarExpanded("(01)90012345678908(3930)001123(10)123(3920)001123.png", "(01)90012345678908(3930)001123(10)123(3920)001123");
        RecognizeDataBarExpanded("(01)90012345678908(3933)001123(10)123(3920)001123.png", "(01)90012345678908(3933)001123(10)123(3920)001123");
    }

    @Test
    public void test_0100_0101()
    {
        //7.2.5.4.2 Encodation method field '0100' – variable weight item(0, 001 kilogram increments)
        //7.2.5.4.3 Encodation method field '0101' – variable weight item (0,01 or 0,001 pound increments)
        RecognizeDataBarExpanded("(01)90012345678908(3103)000000.png", "(01)90012345678908(3103)000000");
        RecognizeDataBarExpanded("(01)90012345678908(3103)032767.png", "(01)90012345678908(3103)032767");
        RecognizeDataBarExpanded("(01)90012345678908(3202)000000.png", "(01)90012345678908(3202)000000");
        RecognizeDataBarExpanded("(01)90012345678908(3202)009999.png", "(01)90012345678908(3202)009999");
        RecognizeDataBarExpanded("(01)90012345678908(3203)000000.png", "(01)90012345678908(3203)000000");
        RecognizeDataBarExpanded("(01)90012345678908(3203)022767.png", "(01)90012345678908(3203)022767");
    }


    @Test
    public void test_1()
    {
        //7.2.5.4.1 Encodation method field '1' – general item identification data
        RecognizeDataBarExpanded("(01)90012345678908.png", "(01)90012345678908");
        RecognizeDataBarExpanded("(01)30012345678906.png", "(01)30012345678906");
        RecognizeDataBarExpanded("(01)90012345678908(10)123(3920)001123.png", "(01)90012345678908(10)123(3920)001123");
        RecognizeDataBarExpanded("(01)30012345678906(10)123(3920)001123.png", "(01)30012345678906(10)123(3920)001123");
    }

    @Test
    public void test_00_Main()
    {
        //7.2.5.5 General-purpose data compaction field
        //With splitting FNC1 AI (10) must have splitting FNC1 character after
        RecognizeDataBarExpanded("(10)123(3920)001123.png", "(10)123(3920)001123");
        RecognizeDataBarExpanded("(10)123(3920)001123(10)24563(99)987.png", "(10)123(3920)001123(10)24563(99)987");

        //Numeric Encoding
        //Digits
        RecognizeDataBarExpanded("numeric_digits.png", "50123456789");

        //Alphanumeric Encoding
        //Digits
        RecognizeDataBarExpanded("alpha_digits.png", "A0A1A2A3A4A5A6A7A8A9");
        //A to Z
        RecognizeDataBarExpanded("alpha_chars.png", "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        //special
        RecognizeDataBarExpanded("alpha_special.png", "*,-./");

        //ISO/IEC 646 Encoding
        //Digits
        RecognizeDataBarExpanded("iso_digits.png", "a0a1a2a3a4a5a6a7a8a9");
        //A to Z
        RecognizeDataBarExpanded("iso_char_high1.png", "!ABC!DEF!GHI!JK!LM");
        RecognizeDataBarExpanded("iso_char_high2.png", "!NOP!QRS!TUV!WX!YZ");
        //a to z
        RecognizeDataBarExpanded("iso_char_low.png", "abcdefghijklmnopqrstuvwxyz");
        //special
        RecognizeDataBarExpanded("iso_special.png", "!\"%&\'()*+,-/:;<=>?_ ");
    }

    @Test
    public void test_00_SpecialCases()
    {
        //7.2.5.5 General-purpose data compaction field
        //Numeric Encoding odd characters
        //encode with last ignored FNC1
        RecognizeDataBarExpanded("50123456789.png", "50123456789");

        //encode last in 4-6 bits
        RecognizeDataBarExpanded("A!50123456789.png", "A!50123456789");

        //normal even
        RecognizeDataBarExpanded("5012345678.png", "5012345678");

        //latch to alpha and ISO/IEC 646
        RecognizeDataBarExpanded("50-12345678!12345678.png", "50-12345678!12345678");
        RecognizeDataBarExpanded("50!-12345678-12345678.png", "50!-12345678-12345678");
        RecognizeDataBarExpanded("5!-12345678-1234567.png", "5!-12345678-1234567");

        //Alphanumeric Encoding
        //Latch to numeric
        RecognizeDataBarExpanded("A501234A50123.png", "A501234A50123");

        //ISO/IEC 646 Encoding
        //Latch to numeric and alphanumeric
        RecognizeDataBarExpanded("!5012ABCDEF!A50123456.png", "!5012ABCDEF!A50123456");

        //Short symbols < 36 bits
        RecognizeDataBarExpanded("501.png", "501");
        RecognizeDataBarExpanded("-.png", "-");
        RecognizeDataBarExpanded("!.png", "!");

        //long symbol close to 252
        RecognizeDataBarExpanded("(10)1234567890(10)1234567890(10)1234567890(10)1234567890(10)1234567890(10)12.png", "(10)1234567890(10)1234567890(10)1234567890(10)1234567890(10)1234567890(10)12");

        //Pads from encodings
        RecognizeDataBarExpanded("pads_01.png", "501234567890");
        RecognizeDataBarExpanded("pads_02.png", "AAAAAA");
        RecognizeDataBarExpanded("pads_03.png", "aaa");

        //normal pads
        RecognizeDataBarExpanded("pads_04.png", "5012345678000000");
        RecognizeDataBarExpanded("pads_05.png", "AAAAA");
        RecognizeDataBarExpanded("pads_06.png", "aaaa");
    }

    //[Test]
    //used to generate images with changes in encoder
    public void test_DemoGenerate()
    {
        //Issue37623
        //public void test_0111000_0111111_Full()
        GenerateDataBarExpandedImage("(01)90012345678908(3100)012233(11)991231");
        GenerateDataBarExpandedImage("(01)90012345678908(3109)012233(11)991231");
        GenerateDataBarExpandedImage("(01)90012345678908(3200)012233(11)991231");
        GenerateDataBarExpandedImage("(01)90012345678908(3209)012233(11)991231");

        GenerateDataBarExpandedImage("(01)90012345678908(3100)012233(13)991231");
        GenerateDataBarExpandedImage("(01)90012345678908(3109)012233(13)991231");
        GenerateDataBarExpandedImage("(01)90012345678908(3200)012233(13)991231");
        GenerateDataBarExpandedImage("(01)90012345678908(3209)012233(13)991231");

        GenerateDataBarExpandedImage("(01)90012345678908(3100)012233(15)991231");
        GenerateDataBarExpandedImage("(01)90012345678908(3109)012233(15)991231");
        GenerateDataBarExpandedImage("(01)90012345678908(3200)012233(15)991231");
        GenerateDataBarExpandedImage("(01)90012345678908(3209)012233(15)991231");

        GenerateDataBarExpandedImage("(01)90012345678908(3100)012233(17)991231");
        GenerateDataBarExpandedImage("(01)90012345678908(3109)012233(17)991231");
        GenerateDataBarExpandedImage("(01)90012345678908(3200)012233(17)991231");
        GenerateDataBarExpandedImage("(01)90012345678908(3209)012233(17)991231");

        //public void test_0111000_0111111_Partial()
        GenerateDataBarExpandedImage("(01)90012345678908(3100)012233");
        GenerateDataBarExpandedImage("(01)90012345678908(3109)012233");
        GenerateDataBarExpandedImage("(01)90012345678908(3200)012233");
        GenerateDataBarExpandedImage("(01)90012345678908(3209)012233");

        //public void test_01100_01101()
        GenerateDataBarExpandedImage("(01)90012345678908(3920)001123");
        GenerateDataBarExpandedImage("(01)90012345678908(3923)001123");
        GenerateDataBarExpandedImage("(01)90012345678908(3930)001123");
        GenerateDataBarExpandedImage("(01)90012345678908(3933)001123");
        GenerateDataBarExpandedImage("(01)90012345678908(3930)001");
        GenerateDataBarExpandedImage("(01)90012345678908(3920)0");
        GenerateDataBarExpandedImage("(01)90012345678908(3920)001123(10)123(3920)001123");
        GenerateDataBarExpandedImage("(01)90012345678908(3923)001123(10)123(3920)001123");
        GenerateDataBarExpandedImage("(01)90012345678908(3930)001123(10)123(3920)001123");
        GenerateDataBarExpandedImage("(01)90012345678908(3933)001123(10)123(3920)001123");

        //public void test_0100_0101()
        GenerateDataBarExpandedImage("(01)90012345678908(3103)000000");
        GenerateDataBarExpandedImage("(01)90012345678908(3103)032767");
        GenerateDataBarExpandedImage("(01)90012345678908(3202)000000");
        GenerateDataBarExpandedImage("(01)90012345678908(3202)009999");
        GenerateDataBarExpandedImage("(01)90012345678908(3203)000000");
        GenerateDataBarExpandedImage("(01)90012345678908(3203)022767");

        //public void test_1()
        GenerateDataBarExpandedImage("(01)90012345678908");
        GenerateDataBarExpandedImage("(01)30012345678906");
        GenerateDataBarExpandedImage("(01)90012345678908(10)123(3920)001123");
        GenerateDataBarExpandedImage("(01)30012345678906(10)123(3920)001123");

        //public void test_00_Main()
        //With splitting FNC1 AI (10) must have splitting FNC1 character after
        GenerateDataBarExpandedImage("(10)123(3920)001123");
        GenerateDataBarExpandedImage("(10)123(3920)001123(10)24563(99)987");

        //Numeric Encoding
        //Digits
        GenerateDataBarExpandedImage("50123456789", "numeric_digits");

        //Alphanumeric Encoding
        //Digits
        GenerateDataBarExpandedImage("A0A1A2A3A4A5A6A7A8A9", "alpha_digits");
        //A to Z
        GenerateDataBarExpandedImage("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "alpha_chars");
        //special
        GenerateDataBarExpandedImage("*,-./", "alpha_special");

        //ISO/IEC 646 Encoding
        //Digits
        GenerateDataBarExpandedImage("a0a1a2a3a4a5a6a7a8a9", "iso_digits");
        //A to Z
        GenerateDataBarExpandedImage("!ABC!DEF!GHI!JK!LM", "iso_char_high1");
        GenerateDataBarExpandedImage("!NOP!QRS!TUV!WX!YZ", "iso_char_high2");
        //a to z
        GenerateDataBarExpandedImage("abcdefghijklmnopqrstuvwxyz", "iso_char_low");
        //special
        GenerateDataBarExpandedImage("!\"%&\'()*+,-/:;<=>?_ ", "iso_special");

        //public void test_00_SpecialCases()
        //Numeric Encoding odd characters
        //encode with last ignored FNC1
        GenerateDataBarExpandedImage("50123456789");
        //encode last in 4-6 bits
        GenerateDataBarExpandedImage("A!50123456789");

        //normal even
        GenerateDataBarExpandedImage("5012345678");

        //latch to alpha and ISO/IEC 646
        GenerateDataBarExpandedImage("50-12345678!12345678");
        GenerateDataBarExpandedImage("50!-12345678-12345678");
        GenerateDataBarExpandedImage("5!-12345678-1234567");

        //Alphanumeric Encoding
        //Latch to numeric
        GenerateDataBarExpandedImage("A501234A50123");

        //ISO/IEC 646 Encoding
        //Latch to numeric and alphanumeric
        GenerateDataBarExpandedImage("!5012ABCDEF!A50123456");

        //Short symbols < 36 bits
        GenerateDataBarExpandedImage("501");
        GenerateDataBarExpandedImage("-");
        GenerateDataBarExpandedImage("!");

        //long symbol close to 252
        GenerateDataBarExpandedImage("(10)1234567890(10)1234567890(10)1234567890(10)1234567890(10)1234567890(10)12");

        //Pads from encodings
        GenerateDataBarExpandedImage("501234567890", "pads_01");
        GenerateDataBarExpandedImage("AAAAAA", "pads_02");
        GenerateDataBarExpandedImage("aaa", "pads_03");

        //normal pads
        GenerateDataBarExpandedImage("5012345678000000", "pads_04");
        GenerateDataBarExpandedImage("AAAAA", "pads_05");
        GenerateDataBarExpandedImage("aaaa", "pads_06");

        //public void test_UserSequence()
        GenerateDataBarExpandedImage("(01)00628250992083(13)200828(10)P200004");
    }

    private void RecognizeDataBarExpanded(String fileName, String codetext)
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, fileName), DecodeType.DATABAR_EXPANDED, DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.readBarCodes();
            Assert.assertEquals(reader.getFoundBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    private void GenerateDataBarExpandedImage(String codetext)
    {
        GenerateDataBarExpandedImage(Folder, "", codetext);
    }

    private void GenerateDataBarExpandedImage(String codetext, String filename)
    {
        GenerateDataBarExpandedImage(Folder, filename, codetext);
    }

    private static void GenerateDataBarExpandedImage(String folder, String filename, String codetext)
    {
        try
        {
            String lFileName = "";
            if (filename != null && !filename.isEmpty())
                lFileName = Global.pathCombine(folder, filename + ".png");
            else
                lFileName = GenerateFileName(folder, codetext);

            if (new File(lFileName).exists())
            {
                new File(lFileName).delete();
//                File.SetAttributes(lFileName, FileAttributes.Normal);
//                File.Delete(lFileName);
            }

            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_EXPANDED, codetext);
            {
                gen.getParameters().getBarcode().getXDimension().setPixels(3);
                gen.save(lFileName);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static String GenerateFileName(String folder, String codetext)
    {
        String lFileName = codetext;

        lFileName = lFileName.replace("\"", "(em)");
        lFileName = lFileName.replace("\'", "(ap)");
        lFileName = lFileName.replace("*", "(at)");
        lFileName = lFileName.replace(".", "(dt)");
        lFileName = lFileName.replace("/", "(sl)");
        lFileName = lFileName.replace(":", "(cl)");
        lFileName = lFileName.replace("<", "(gl)");
        lFileName = lFileName.replace("=", "(ge)");
        lFileName = lFileName.replace(">", "(gg)");
        lFileName = lFileName.replace("?", "(qs)");
        lFileName = lFileName.replace(" ", "(sp)");

        return Global.pathCombine(folder, lFileName + ".png");
    }
}
