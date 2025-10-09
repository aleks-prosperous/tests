package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecognitionAztecSingleImages
{

    private String _folder;

        @BeforeMethod
    public void SetupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Recognition\\Aztec");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Aztec")]
    public void test_code2d_1error_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "code2d_1error.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Code 2D!", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_code2d_2errors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "code2d_2errors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Code 2D!", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_code2d_3errors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "code2d_3errors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Code 2D!", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer2_1_1error_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer2_1_1error.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IDAutomation.com, Inc.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer2_1_2errors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer2_1_2errors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IDAutomation.com, Inc.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer2_1_3errors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer2_1_3errors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IDAutomation.com, Inc.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer2_1_4errors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer2_1_4errors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IDAutomation.com, Inc.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer2_1_5errors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer2_1_5errors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IDAutomation.com, Inc.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer2_1_6errors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer2_1_6errors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IDAutomation.com, Inc.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer2_1_7errors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer2_1_7errors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IDAutomation.com, Inc.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer2_1_8errors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer2_1_8errors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IDAutomation.com, Inc.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer2_1_9errors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer2_1_9errors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IDAutomation.com, Inc.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer2_2_withErrors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer2_2_withErrors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Wikipedia, the free encyclopedia", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer3_1_withErrors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer3_1_withErrors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3rd layer message first picture!", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer9_1_withErrors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer9_1_withErrors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("The Australian Financial Review claimed that NDS's activities in Australia in 1999 caused millions of dollars of damage to Mr Murdoch's rivals in the country's nascent pay-TV market. The business models of Austar, Optus and Foxtel were all damaged by a wave of high-tech piracy at that time.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer9_2_withErrors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer9_2_withErrors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("NDS had no immediate comment but News Corp said: \"News Corporation is proud to have worked with NDS, whose industry-leading technology has transformed TV viewing for millions of people across the world, and to have supported them in their aggressive fight against piracy and copyright infringement.\"", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer4_2_withErrors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer4_2_withErrors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("When $20,000 disappeared from a small community bank near Birmingham, Ala@^", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer4_1_withErrors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer4_1_withErrors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Al-Jazeera decided Tuesday not to air a video that appears to show the attacks on" +
                    " soldiers and", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer5_2_withErrors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer5_2_withErrors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("You will only hear back from us if your submission request is considered a good f" +
                    "it by a channel director.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer6_2_withErrors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer6_2_withErrors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A cache of e-mails leaked to CNN is giving extraordinary insight into the life of" +
                    " Syria\'s first family during the regime\'s move to crush a now-yearlong civilian " +
                    "uprising.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer7_1_withErrors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer7_1_withErrors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Castro, who stepped down from power in 2006 due to illness, called the pope \"a ma" +
                    "n whose contact with children and humble members of society has, invariably, rai" +
                    "sed feelings of affection.\"", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer8_2_withErrors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer8_2_withErrors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("The young Western-educated couple initially received praise from the foreign pres" +
                    "s for attempts to reform the decades-old police state, only to be relentlessly c" +
                    "riticized starting in early 2011 for a brutal crackdown on demonstrators.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer9_2_bigHole_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer9_2_bigHole.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("NDS had no immediate comment but News Corp said: \"News Corporation is proud to have worked with NDS, whose industry-leading technology has transformed TV viewing for millions of people across the world, and to have supported them in their aggressive fight against piracy and copyright infringement.\"", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer1_1_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer1_1.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Code 2D!", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_code2d_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "code2d.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Code 2D!", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer1_2_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer1_2.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Here i am!", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer1_3_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer1_3.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Code 2D!", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer1_4_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer1_4.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer1_5_jpg_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer1_5.jpg"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer2_1_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer2_1.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IDAutomation.com, Inc.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer2_2_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer2_2.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Wikipedia, the free encyclopedia", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer2_3_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer2_3.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Message for you 2", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer3_1_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer3_1.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3rd layer message first picture!", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer3_2_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer3_2.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Right click and select 12 images to save @home", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer3_3_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer3_3.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Let is try to do 2 or 1 thing(s)", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer4_1_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer4_1.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Most Japanese mobile phones can read this code, because its 2 very useful for them", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer4_2_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer4_2.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("When $20,000 disappeared from a small community bank near Birmingham, Ala@^", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_compactLayer4_3_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "compactLayer4_3.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("The 3rd-generation iPad boasts a 5-megapixel camera as the iPhone 4S", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer4_1_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer4_1.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Al-Jazeera decided Tuesday not to air a video that appears to show the attacks on" +
                    " soldiers and", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer4_2_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer4_2.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Police traced the attacks to Mohamed Merah, a 23-year-old Frenchman, WHO was kill" +
                    "ed", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer5_1_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer5_1.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Replacement treatments are more costly, more toxic, need much longer durations of" +
                    " treatment, and may require treatment.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer5_2_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer5_2.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("You will only hear back from us if your submission request is considered a good f" +
                    "it by a channel director.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer6_1_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer6_1.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Former Cuban leader Fidel Castro says he has asked for a \"modest and simple\" meet" +
                    "ing with Pope Benedict XVI in Havana on Wednesday.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer6_2_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer6_2.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A cache of e-mails leaked to CNN is giving extraordinary insight into the life of" +
                    " Syria\'s first family during the regime\'s move to crush a now-yearlong civilian " +
                    "uprising.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer7_1_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer7_1.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Castro, who stepped down from power in 2006 due to illness, called the pope \"a ma" +
                    "n whose contact with children and humble members of society has, invariably, rai" +
                    "sed feelings of affection.\"", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer7_2_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer7_2.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(Al-Assad) wants to slow that down, and by accepting this peace plan, it makes it" +
                    " difficult for Clinton to announce further measures while the United Nations is " +
                    "carrying out a negotiation", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer8_1_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer8_1.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Benedict, 84, arrived in Santiago de Cuba on Monday. He later headed to the city\'" +
                    "s Basilica del Cobre where he prayed in front of the Virgin of Charity of Cobre," +
                    " a wooden statue considered to be the shrine of the island\'s patron saint.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer8_2_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer8_2.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("The young Western-educated couple initially received praise from the foreign pres" +
                    "s for attempts to reform the decades-old police state, only to be relentlessly c" +
                    "riticized starting in early 2011 for a brutal crackdown on demonstrators.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer9_1_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer9_1.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("The Australian Financial Review claimed that NDS's activities in Australia in 1999 caused millions of dollars of damage to Mr Murdoch's rivals in the country's nascent pay-TV market. The business models of Austar, Optus and Foxtel were all damaged by a wave of high-tech piracy at that time.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer9_2_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer9_2.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("NDS had no immediate comment but News Corp said: \"News Corporation is proud to have worked with NDS, whose industry-leading technology has transformed TV viewing for millions of people across the world, and to have supported them in their aggressive fight against piracy and copyright infringement.\"", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer10_1_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer10_1.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("The emails, said to be from the hard drive of a former head of security at NDS, a former News Corp subsidiary, appear to show that the company paid computer hackers to work with its \"operational security\" unit. The cache sheds further light on commercial disputes between News Corp and pay-TV rivals that now span Australasia, Europe, and the US.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        //[Category("Aztec")]
    public void test_regularLayer10_2_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer10_2.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("The television programme said that NDS used hackers to crack the security of the encryption cards of OnDigital, the UK broadcaster ITV's entrant in the pay-television market, which went bust in 2002 in the face of competition by News Corp's British Sky Broadcasting unit. In a detailed statement after the Panorama NDS denied", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_regularLayer11_1_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "regularLayer11_1.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("In one email purportedly from the hard drive, NDS employees discuss the fact that a European pay-TV company which News Corp was poised to take a stake in was \"totally hacked\" by pirates. The sender of the email debated whether, in light of the News Corp interest in the company, NDS should \"start to protect [the particular model of encryption used by the company] while leaving the main . . . platform compromised\".", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}