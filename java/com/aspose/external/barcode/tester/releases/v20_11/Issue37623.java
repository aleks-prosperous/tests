package com.aspose.external.barcode.tester.releases.v20_11;

import com.aspose.barcode.BarCodeException;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;

public class Issue37623
{
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
        GenerateAndRecognize("(01)00628250992083(13)200828(10)P200004");
    }

    @Test
    public void test_0111000_0111111_Full()
    {
        //7.2.5.4.4 Encodation method fields '0111000' through '0111111' – variable weight item plus date
        GenerateAndRecognize("(01)90012345678908(3100)012233(11)991231");
        GenerateAndRecognize("(01)90012345678908(3109)012233(11)991231");
        GenerateAndRecognize("(01)90012345678908(3200)012233(11)991231");
        GenerateAndRecognize("(01)90012345678908(3209)012233(11)991231");

        GenerateAndRecognize("(01)90012345678908(3100)012233(13)991231");
        GenerateAndRecognize("(01)90012345678908(3109)012233(13)991231");
        GenerateAndRecognize("(01)90012345678908(3200)012233(13)991231");
        GenerateAndRecognize("(01)90012345678908(3209)012233(13)991231");

        GenerateAndRecognize("(01)90012345678908(3100)012233(15)991231");
        GenerateAndRecognize("(01)90012345678908(3109)012233(15)991231");
        GenerateAndRecognize("(01)90012345678908(3200)012233(15)991231");
        GenerateAndRecognize("(01)90012345678908(3209)012233(15)991231");

        GenerateAndRecognize("(01)90012345678908(3100)012233(17)991231");
        GenerateAndRecognize("(01)90012345678908(3109)012233(17)991231");
        GenerateAndRecognize("(01)90012345678908(3200)012233(17)991231");
        GenerateAndRecognize("(01)90012345678908(3209)012233(17)991231");
    }

    @Test
    public void test_0111000_0111111_Partial()
    {
        //7.2.5.4.4 Encodation method fields '0111000' through '0111111' – variable weight item plus date
        //partial encoding with date and 38400 as hook
        GenerateAndRecognize("(01)90012345678908(3100)012233");
        GenerateAndRecognize("(01)90012345678908(3109)012233");
        GenerateAndRecognize("(01)90012345678908(3200)012233");
        GenerateAndRecognize("(01)90012345678908(3209)012233");
    }

    @Test
    public void test_01100_01101()
    {
        //7.2.5.4.5 Encodation method field '01100' – variable measure item and price
        //7.2.5.4.6 Encodation method field '01101' – variable measure item and price with ISO 4217 Currency Code
        GenerateAndRecognize("(01)90012345678908(3920)001123");
        GenerateAndRecognize("(01)90012345678908(3923)001123");
        GenerateAndRecognize("(01)90012345678908(3930)001123");
        GenerateAndRecognize("(01)90012345678908(3933)001123");
        GenerateAndRecognize("(01)90012345678908(3930)001");
        GenerateAndRecognize("(01)90012345678908(3920)0");
        GenerateAndRecognize("(01)90012345678908(3920)001123(10)123(3920)001123");
        GenerateAndRecognize("(01)90012345678908(3923)001123(10)123(3920)001123");
        GenerateAndRecognize("(01)90012345678908(3930)001123(10)123(3920)001123");
        GenerateAndRecognize("(01)90012345678908(3933)001123(10)123(3920)001123");
    }

    @Test
    public void test_0100_0101()
    {
        //7.2.5.4.2 Encodation method field '0100' – variable weight item(0, 001 kilogram increments)
        //7.2.5.4.3 Encodation method field '0101' – variable weight item (0,01 or 0,001 pound increments)
        GenerateAndRecognize("(01)90012345678908(3103)000000");
        GenerateAndRecognize("(01)90012345678908(3103)032767");
        GenerateAndRecognize("(01)90012345678908(3202)000000");
        GenerateAndRecognize("(01)90012345678908(3202)009999");
        GenerateAndRecognize("(01)90012345678908(3203)000000");
        GenerateAndRecognize("(01)90012345678908(3203)022767");
    }

    @Test
    public void test_1()
    {
        //7.2.5.4.1 Encodation method field '1' – general item identification data
        GenerateAndRecognize("(01)90012345678908");
        GenerateAndRecognize("(01)30012345678906");
        GenerateAndRecognize("(01)90012345678908(10)123(3920)001123");
        GenerateAndRecognize("(01)30012345678906(10)123(3920)001123");
    }

    @Test
    public void test_00_Main()
    {
        //7.2.5.5 General-purpose data compaction field

        //With splitting FNC1 AI (10) must have splitting FNC1 character after
        GenerateAndRecognize("(10)123(3920)001123");
        GenerateAndRecognize("(10)123(3920)001123(10)24563(99)987");

        //Numeric Encoding
        //Digits
        GenerateAndRecognize("50123456789");

        //Alphanumeric Encoding
        //Digits
        GenerateAndRecognize("A0A1A2A3A4A5A6A7A8A9");
        //A to Z
        GenerateAndRecognize("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        //special
        GenerateAndRecognize("*,-./");

        //ISO/IEC 646 Encoding
        //Digits
        GenerateAndRecognize("a0a1a2a3a4a5a6a7a8a9");
        //A to Z
        GenerateAndRecognize("!ABC!DEF!GHI!JK!LM");
        GenerateAndRecognize("!NOP!QRS!TUV!WX!YZ");
        //a to z
        GenerateAndRecognize("abcdefghijklmnopqrstuvwxyz");
        //special
        GenerateAndRecognize("!\"%&\'()*+,-/:;<=>?_ ");
        //"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        //"abcdefghijklmnopqrstuvwxyz"
        //"*,-./"
        //"!\"%&\'()*+,-/:;<=>?_ "
    }

    @Test
    public void test_00_SpecialCases()
    {
        //7.2.5.5 General-purpose data compaction field
        //Numeric Encoding odd characters
        //encode with last ignored FNC1
        GenerateAndRecognize("50123456789");
        //encode last in 4-6 bits
        GenerateAndRecognize("A!50123456789");

        //normal even
        GenerateAndRecognize("5012345678");

        //latch to alpha and ISO/IEC 646
        GenerateAndRecognize("50-12345678!12345678");
        GenerateAndRecognize("50!-12345678-12345678");
        GenerateAndRecognize("5!-12345678-1234567");

        //Alphanumeric Encoding
        //Latch to numeric
        GenerateAndRecognize("A501234A50123");

        //ISO/IEC 646 Encoding
        //Latch to numeric and alphanumeric
        GenerateAndRecognize("!5012ABCDEF!A50123456");

        //Short symbols < 36 bits
        GenerateAndRecognize("501");
        GenerateAndRecognize("-");
        GenerateAndRecognize("!");

        //long symbol close to 252
        GenerateAndRecognize("(10)1234567890(10)1234567890(10)1234567890(10)1234567890(10)1234567890(10)12");

        //Pads from encodings
        GenerateAndRecognize("501234567890");
        GenerateAndRecognize("AAAAAA");
        GenerateAndRecognize("aaa");

        //normal pads
        GenerateAndRecognize("5012345678000000");
        GenerateAndRecognize("AAAAA");
        GenerateAndRecognize("aaaa");
    }

    @Test
    public void test_00_LongException()
    {
        //7.2.4 Symbol binary value
        try
        {
            GenerateAndRecognize("(10)1234567890(10)1234567890(10)1234567890(10)1234567890(10)1234567890(10)1234567890");
        }
        catch (BarCodeException e)
        {
            return;
        }
        Assert.fail("Codetext which exceed 252 bits must raise excetion.");
    }

    private static void GenerateAndRecognize(String codetext)
    {
        GenerateAndRecognize(codetext, codetext);
    }

    private static void GenerateAndRecognize(String codetext, String resultCodetext)
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DATABAR_EXPANDED, codetext);
        {
            BufferedImage bmp = generator.generateBarCodeImage();
            {
                BarCodeReader reader = new BarCodeReader(bmp, DecodeType.DATABAR_EXPANDED, DecodeType.DATABAR_EXPANDED_STACKED);
                {
                    Assert.assertEquals(reader.readBarCodes().length, 1);
                    Assert.assertEquals(resultCodetext, reader.getFoundBarCodes()[0].getCodeText());
                }
            }
        }
    }
}
