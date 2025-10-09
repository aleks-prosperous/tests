package com.aspose.external.barcode.tester.recognition.han_xin;

import com.aspose.barcode.InvalidCodeException;
import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.generation.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class HanXinRecognitionTests
{

    private final static String _folderRecognition = Global.getTestDataFolder("Recognition\\2D\\HanXin");
    private final static String _folderGenerated = Global.getGeneratedImagesFolder("HanXin");
    static final Random _random = new Random();

    @BeforeMethod
    public void setupTestFixture()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void HanXin_Generation_Recognition_01() throws IOException
    {
        String str = "1234567890";

        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, str);
        {
            bg.getParameters().setResolution(66f);
            BufferedImage img = bg.generateBarCodeImage();
            ImageIO.write(img, "PNG", new File(Global.pathCombine(_folderGenerated, "debug1234567890_66f.png")));

            BarCodeReader r = new BarCodeReader(img, DecodeType.HAN_XIN);
            {
                BarCodeResult[] found = r.readBarCodes();
                Assert.assertEquals(1, found.length);
                Assert.assertEquals(str, found[0].getCodeText());
            }
        }
    }

    @Test
    public void HanXin_Generation_Recognition_02()
    {
        // Text + Region One + Region Two
        String str = "abc123全ň全螅全ň螅螅螅";

        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, str);
        {
            bg.getParameters().setResolution(66f);
            BufferedImage img = bg.generateBarCodeImage();

            BarCodeReader r = new BarCodeReader(img, DecodeType.HAN_XIN);
            {
                BarCodeResult[] found = r.readBarCodes();
                Assert.assertEquals(1, found.length);
                Assert.assertEquals(str, found[0].getCodeText());
            }
        }
    }

    @Test
    public void HanXin_Generation_Recognition_03()
    {
        // Text + Region One + Region Two + GB18030 2 Byte
        String str = "abc123全ň全漄灟漄灟螅全ň螅螅螅";

        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, str);
        {
            bg.getParameters().setResolution(66f);
            BufferedImage img = bg.generateBarCodeImage();

            BarCodeReader r = new BarCodeReader(img, DecodeType.HAN_XIN);
            {
                BarCodeResult[] found = r.readBarCodes();
                Assert.assertEquals(1, found.length);
                Assert.assertEquals(str, found[0].getCodeText());
            }
        }
    }

    @Test
    public void HanXin_Generation_Recognition_04()
    {
        // GB18030 4 Byte
        String str = "㐁㐁㐁";

        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, str);
        {
            bg.getParameters().setResolution(66f);
            BufferedImage img = bg.generateBarCodeImage();

            BarCodeReader r = new BarCodeReader(img, DecodeType.HAN_XIN);
            {
                BarCodeResult[] found = r.readBarCodes();
                Assert.assertEquals(1, found.length);
                Assert.assertEquals(str, found[0].getCodeText());
                Assert.assertEquals("HanXin", found[0].getCodeTypeName());
            }
        }
    }

    @Test
    public void HanXin_Generation_Recognition_05()
    {
        // GS1
        String str = "(01)03453120000011(17)191125(10)ABCD1234(21)10";

        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.GS_1_HAN_XIN, str);
        {
            bg.getParameters().setResolution(66f);
            BufferedImage img = bg.generateBarCodeImage();

            BarCodeReader r = new BarCodeReader(img, DecodeType.HAN_XIN);
            {
                BarCodeResult[] found = r.readBarCodes();
                Assert.assertEquals(1, found.length);
                Assert.assertEquals(str, found[0].getCodeText());
                Assert.assertEquals("GS1HanXin", found[0].getCodeTypeName());
            }
        }
    }

    @Test
    public void HanXin_Generation_Recognition_06()
    {
        // Unicode mode
        String str = "abcd АБВ ıntəˈnæʃənəl 语言语言 แผ่นดินฮั่นเสื่ ∑ f(i) = ∏ 🖨 🚘✉🥇⚽ 你好測試測試 こんにちは テスト テスト 안녕하세요 테스트 테스트";

        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, str);
        {
            bg.getParameters().setResolution(66f);
            bg.getParameters().getBarcode().getHanXin().setHanXinEncodeMode(HanXinEncodeMode.UNICODE);
            BufferedImage img = bg.generateBarCodeImage();

            BarCodeReader r = new BarCodeReader(img, DecodeType.HAN_XIN);
            {
                BarCodeResult[] found = r.readBarCodes();
                Assert.assertEquals(1, found.length);
                Assert.assertEquals(str, found[0].getCodeText());
            }
        }
    }

    @Test
    public void HanXin_Generation_Recognition_07()
    {
        // Binary mode
        String str = "IJK";

        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, str);
        {
            bg.getParameters().setResolution(66f);
            bg.getParameters().getBarcode().getHanXin().setHanXinEncodeMode(HanXinEncodeMode.BINARY);
            BufferedImage img = bg.generateBarCodeImage();

            BarCodeReader r = new BarCodeReader(img, DecodeType.HAN_XIN);
            {
                BarCodeResult[] found = r.readBarCodes();
                Assert.assertEquals(1, found.length);
                String binary = "494a4b";
                Assert.assertEquals(binary.toLowerCase(), found[0].getCodeText().toLowerCase());
            }
        }
    }

    @Test
    public void HanXin_Generation_Recognition_08()
    {
        // URI mode
        String str = "https://www.test.com/%BC%DE%%%ab/search=test";

        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, str);
        {
            bg.getParameters().setResolution(66f);
            bg.getParameters().getBarcode().getHanXin().setHanXinEncodeMode(HanXinEncodeMode.URI);
            BufferedImage img = bg.generateBarCodeImage();

            BarCodeReader r = new BarCodeReader(img, DecodeType.HAN_XIN);
            {
                BarCodeResult[] found = r.readBarCodes();
                Assert.assertEquals(1, found.length);
                Assert.assertEquals(str.toLowerCase(), found[0].getCodeText().toLowerCase());
            }
        }
    }

    @Test
    public void HanXin_Generation_Recognition_09()
    {
        // ECI mode, Latin/Greek alphabet encoding. ECI Id:"\000009"
        String str = "ΑΒΓΔΕ";

        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, str);
        {
            bg.getParameters().setResolution(66f);
            bg.getParameters().getBarcode().getHanXin().setHanXinEncodeMode(HanXinEncodeMode.ECI);
            bg.getParameters().getBarcode().getHanXin().setHanXinECIEncoding(ECIEncodings.ISO_8859_7);
            BufferedImage img = bg.generateBarCodeImage();

            BarCodeReader r = new BarCodeReader(img, DecodeType.HAN_XIN);
            {
                BarCodeResult[] found = r.readBarCodes();
                Assert.assertEquals(1, found.length);
                Assert.assertEquals(str, found[0].getCodeText());
            }
        }
    }

    @Test
    public void HanXin_Generation_Recognition_10()
    {
        // Extended Mode
        String str = "\\auto:abc\\000009:ΑΒΓΔΕ\\auto:abc";

        String expectedStr = str.replace("\\auto:", "");
        expectedStr = expectedStr.replace("\\000009:", "");

        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, str);
        {
            bg.getParameters().setResolution(66f);
            bg.getParameters().getBarcode().getHanXin().setHanXinEncodeMode(HanXinEncodeMode.EXTENDED);
            BufferedImage img = bg.generateBarCodeImage();

            BarCodeReader r = new BarCodeReader(img, DecodeType.HAN_XIN);
            {
                BarCodeResult[] found = r.readBarCodes();
                Assert.assertEquals(1, found.length);
                Assert.assertEquals(expectedStr, found[0].getCodeText());
            }
        }
    }

    @Test
    public void HanXin_Generation_Recognition_10a()
    {
        // Extended Mode with HanXinExtCodetextBuilder
        HanXinExtCodetextBuilder codeTextBuilder = new HanXinExtCodetextBuilder();

        codeTextBuilder.addAuto("abc");
        codeTextBuilder.addECI("ΑΒΓΔΕ", 9);
        codeTextBuilder.addAuto("abc");

        String str = codeTextBuilder.getExtendedCodetext();

        String expectedStr = "abcΑΒΓΔΕabc";

        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, str);
        {
            bg.getParameters().setResolution(66f);
            bg.getParameters().getBarcode().getHanXin().setHanXinEncodeMode(HanXinEncodeMode.EXTENDED);
            BufferedImage img = bg.generateBarCodeImage();

            BarCodeReader r = new BarCodeReader(img, DecodeType.HAN_XIN);
            {
                BarCodeResult[] found = r.readBarCodes();
                Assert.assertEquals(1, found.length);
                Assert.assertEquals(expectedStr, found[0].getCodeText());
            }
        }
    }

    @Test
    public void HanXin_Generation_Recognition_11()
    {
        // Extended Mode
        String str = "\\gb180302b:漄\\gb180304b:㐁\\region1:全\\region2:螅\\numeric:123\\text:qwe\\unicode:ıntəˈnæʃənəl" +
        "\\000009:ΑΒΓΔΕ\\auto:abc\\binary:abc\\uri:backslashes_should_be_doubled\\\\000555:test\\gs1:(01)03453120000011(17)191125(10)ABCD1234(21)10";

        String expectedStr = str.replace("\\auto:", "");
        expectedStr = expectedStr.replace("\\gb180302b:", "");
        expectedStr = expectedStr.replace("\\gb180304b:", "");
        expectedStr = expectedStr.replace("\\region1:", "");
        expectedStr = expectedStr.replace("\\region2:", "");
        expectedStr = expectedStr.replace("\\numeric:", "");
        expectedStr = expectedStr.replace("\\text:", "");
        expectedStr = expectedStr.replace("\\000009:", "");
        expectedStr = expectedStr.replace("\\unicode:", "");
        expectedStr = expectedStr.replace("\\binary:", "");
        expectedStr = expectedStr.replace("\\uri:", "");
        expectedStr = expectedStr.replace("\\gs1:", "");

        expectedStr = expectedStr.replace("\\\\", "\\");

        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, str);
        {
            bg.getParameters().setResolution(66f);
            bg.getParameters().getBarcode().getHanXin().setHanXinEncodeMode(HanXinEncodeMode.EXTENDED);
            BufferedImage img = bg.generateBarCodeImage();

            BarCodeReader r = new BarCodeReader(img, DecodeType.HAN_XIN);
            {
                BarCodeResult[] found = r.readBarCodes();
                Assert.assertEquals(1, found.length);
                Assert.assertEquals(expectedStr, found[0].getCodeText());
            }
        }
    }

    @Test
    public void HanXin_Generation_Recognition_11a()
    {
        // Extended Mode with HanXinExtCodetextBuilder

        HanXinExtCodetextBuilder codeTextBuilder = new HanXinExtCodetextBuilder();
        codeTextBuilder.addGB18030TwoByte("漄");
        codeTextBuilder.addGB18030FourByte("㐁");
        codeTextBuilder.addCommonChineseRegionOne("全");
        codeTextBuilder.addCommonChineseRegionTwo("螅");
        codeTextBuilder.addNumeric("123");
        codeTextBuilder.addText("qwe");
        codeTextBuilder.addUnicode("ıntəˈnæʃənəl");
        codeTextBuilder.addECI("ΑΒΓΔΕ", 9);
        codeTextBuilder.addAuto("abc");
        codeTextBuilder.addBinary("abc");
        codeTextBuilder.addURI("backslashes_should_be_doubled\\000555:test");
        codeTextBuilder.addGS1("(01)03453120000011(17)191125(10)ABCD1234(21)10");
        String str = codeTextBuilder.getExtendedCodetext();

        String expectedStr = "漄㐁全螅123qweıntəˈnæʃənəlΑΒΓΔΕabcabcbackslashes_should_be_doubled\\000555:test(01)03453120000011(17)191125(10)ABCD1234(21)10";

        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, str);
        {
            bg.getParameters().setResolution(66f);
            bg.getParameters().getBarcode().getHanXin().setHanXinEncodeMode(HanXinEncodeMode.EXTENDED);
            BufferedImage img = bg.generateBarCodeImage();

            BarCodeReader r = new BarCodeReader(img, DecodeType.HAN_XIN);
            {
                BarCodeResult[] found = r.readBarCodes();
                Assert.assertEquals(1, found.length);
                Assert.assertEquals(expectedStr, found[0].getCodeText());
            }
        }
    }

    @Test
    public void HanXin_Generation_Wrong_Mode_After_ECI()
    {
        HanXinExtCodetextBuilder codeTextBuilder = new HanXinExtCodetextBuilder();

        codeTextBuilder.addECI("ΑΒΓΔΕ", 9);

        InvalidCodeException ex = Assert.expectThrows(InvalidCodeException.class, () -> codeTextBuilder.addUnicode("ıntəˈnæʃənəl"));
        Assert.assertEquals("unicode mode is not allowed if ECI segment has appeared before in the message. Allowed modes are: ECI, Auto, Binary, URI, Text, Numeric, GS1.", ex.getMessage());
    }


    @Test
    public void HanXin_Generation_Empty_Message_Exception_Test()
    {
        String str = "";
        Throwable ex = Assert.expectThrows(InvalidCodeException.class, () -> {
            BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, str);
            bg.getParameters().setResolution(66f);
            BufferedImage img = bg.generateBarCodeImage();
        });
        Assert.assertEquals("Error: empty message", ex.getMessage());
    }

    @Test
    public void HanXin_Generation_Wrong_Version_Exception_Test()
    {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
                " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex" +
                " ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat" +
                " nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim" +
                " id est laborum.";
        Throwable ex = Assert.expectThrows(InvalidCodeException.class, () -> {
                        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, str);
                        bg.getParameters().setResolution(66f);
                        bg.getParameters().getBarcode().getHanXin().setHanXinVersion(HanXinVersion.VERSION_01);
                        BufferedImage img = bg.generateBarCodeImage();
                });
        Assert.assertEquals("Chosen version is too small, minimum version for this error correction level is 26", ex.getMessage());
    }

    @Test
    public void HanXin_Random_String_Generation_Recognition() throws IOException
    {
        int length = (int) (Math.random() * 1000);
        String str = createRandomString(length);

        BarcodeGenerator bg = new BarcodeGenerator(EncodeTypes.HAN_XIN, str);
        {
            bg.getParameters().setResolution(66f);
            BufferedImage img = null;
            try
            {
                img = bg.generateBarCodeImage();
            }
            catch (Exception e )
            {
                try (PrintWriter out = new PrintWriter(Global.pathCombine(_folderGenerated, "notGeneratedStrings.txt"))) {
                    out.println(str);
                } catch (FileNotFoundException fileNotFoundException)
                {
                    fileNotFoundException.printStackTrace();
                }
                throw e ;
            }


            BarCodeReader r = new BarCodeReader(img, DecodeType.HAN_XIN);
            {
                BarCodeResult[] found = r.readBarCodes();
                if (found.length == 0)
                {
                    ImageIO.write(img, "PNG", new File(Global.pathCombine(_folderGenerated, "NotRecognizedHanXin.png")));
                    try (PrintWriter out = new PrintWriter(Global.pathCombine(_folderGenerated, "notRecognizedStrings.txt"))) {
                        out.println(str);
                    } catch (FileNotFoundException fileNotFoundException)
                    {
                        fileNotFoundException.printStackTrace();
                    }
                }
                Assert.assertEquals(1, found.length);
                Assert.assertEquals(str, found[0].getCodeText());
            }
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Clean_1()
    {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
                " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex" +
                " ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat" +
                " nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim" +
                " id est laborum.";

        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "outsideHXTextTest1.png"), DecodeType.HAN_XIN);
        {
            r.setQualitySettings(QualitySettings.getHighQuality());
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Clean_1_90_Deg()
    {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
                " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex" +
                " ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat" +
                " nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim" +
                " id est laborum.";

        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "outsideHXTextTest1_090.png"), DecodeType.HAN_XIN);
        {
            r.setQualitySettings(QualitySettings.getHighQuality());
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Clean_1_180_Deg()
    {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
                " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex" +
                " ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat" +
                " nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim" +
                " id est laborum.";

        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "outsideHXTextTest1_180.png"), DecodeType.HAN_XIN);
        {
            r.setQualitySettings(QualitySettings.getHighQuality());
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Clean_1_270_Deg()
    {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
                " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex" +
                " ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat" +
                " nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim" +
                " id est laborum.";

        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "outsideHXTextTest1_270.png"), DecodeType.HAN_XIN);
        {
            r.setQualitySettings(QualitySettings.getHighQuality());
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Clean_2()
    {
        String str = "Han Xin Code is a two-dimensional (2d) matrix symbology, which is developed and designed for both Chinese market and global market. \r\n" +
                "Han Xin Code was designed in 2005. Han Xin Code is a result of a key research of tenth Chinese Five-Year Plan. The Chinese National Standard of Han Xin Code was published in 2007. The AIM Global's specification of this symbology was published in 2011.";
        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "outsideHXTextTest2.jpg"), DecodeType.HAN_XIN);
        {
            r.setQualitySettings(QualitySettings.getHighQuality());
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Clean_3()
    {
        String str = "Han Xin Code";
        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "outsideHXTextTest3.jpg"), DecodeType.HAN_XIN);
        {
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Clean_4()
    {
        String str = "汉信码（Chinese-sensible code）及2维条码介绍汉信码（Chinese-sensible code）及2维条码介绍汉信码" +
                "（Chinese-sensible code）及2维条码介绍汉信码（Chinese-sensible code）及2维条码介绍";
        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "outsideHXTextTest4Chinese.jpg"), DecodeType.HAN_XIN);
        {
            r.setQualitySettings(QualitySettings.getHighQuality());
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Clean_5()
    {
        String str = "12345678";
        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "outsideHXTextTest5Human.png"), DecodeType.HAN_XIN);
        {
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }


    @Test
    public void HanXin_Recognition_From_File_Clean_6()
    {
        String str = "Summer Palace Ticket for 6 June 2015 13:00;2015年6月6日夜01時00分PM頤和園のチケット;" +
                "2015년6월6일13시오후여름궁전티켓.2015年6月6号下午13:00的颐和园门票;";
        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "outsideHXTextTest6ExampleK3.png"), DecodeType.HAN_XIN);
        {
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Clean_7()
    {
        String str = "hG$pgMU_A0?5w9qgsUr7v83ZB3P2CxuIj@@_G!gvT22N!kdB@AQGGSwqSmnt?i@TG4V1?rax4@n8FqegZN7CfnCQPVwjW3y06iGFPtDTpjSLv3jtHGTzr93i2Ems@7ZAN3BmjYRxKoc@U6mb1CcPj-I?wnTKHbXyJR_71_Jy5npDf7N@hJ68eJfOuE6$FGpyPv2C8ur39ua$ZFh4YXt_keT-20NxHMsz?630FKD3hD-0zi4pmCnycrM1b2QIg!vxCs-jRyyOU5fhfiPS@pLFq!VVuCXS9!WoXRyHjUW3TYcnLvU8n_M7zqHHVt5OZfUZi8JN1IzrRX1QgyK-yfw@ye5yKr26eId4EDETkGHdPkqb46qnh6g!0YsEDaCKW8MJ9?Mdu7drYRwM4c!UAOXorjDvb-QJD$HWYfh6tL8rc5khtePqfyJHjphZ!hCvrTnbJY4Y@Er4WxL2_mC$0quV2A3z_I$LJNAISJXTq7vaGU02cwaXeF!AqRpJkEa2IfvJxDj4NzV9@SOhPAVRyowES-hAkOymg8RqqrFZMmJwzBEWCH9jyIEk0q6xkiT-A0bDAo7o@@FLd-VQ@L?cUN3X3x6A1X5uRKw_pBVeQUp3D9H0Uq2Yk7v2?EPTx63nGb9TTWr!5iM-pAU!qGwKmgIae9Ak1CxZhBws-3f?_8jBuwN?zUurKtBqSh4";
        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "outsideHXTextTest7.png"), DecodeType.HAN_XIN);
        {
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_No_HanXin()
    {
        BarCodeReader r = new BarCodeReader(Global.pathCombine(_folderRecognition, "Barcode_on_a_Coke_can.jpg"), DecodeType.HAN_XIN);
        {
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(0, found.length);
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Photo_Big_000Rot()
    {
        String str = "hG$pgMU_A0?5w9qgsUr7v83ZB3P2CxuIj@@_G!gvT22N!kdB@AQGGSwqSmnt?i@TG4V1?rax4@n8FqegZN7CfnCQPVwjW3y06iGFPtDTpjSLv3jtHGTzr93i2Ems@7ZAN3BmjYRxKoc@U6mb1CcPj-I?wnTKHbXyJR_71_Jy5npDf7N@hJ68eJfOuE6$FGpyPv2C8ur39ua$ZFh4YXt_keT-20NxHMsz?630FKD3hD-0zi4pmCnycrM1b2QIg!vxCs-jRyyOU5fhfiPS@pLFq!VVuCXS9!WoXRyHjUW3TYcnLvU8n_M7zqHHVt5OZfUZi8JN1IzrRX1QgyK-yfw@ye5yKr26eId4EDETkGHdPkqb46qnh6g!0YsEDaCKW8MJ9?Mdu7drYRwM4c!UAOXorjDvb-QJD$HWYfh6tL8rc5khtePqfyJHjphZ!hCvrTnbJY4Y@Er4WxL2_mC$0quV2A3z_I$LJNAISJXTq7vaGU02cwaXeF!AqRpJkEa2IfvJxDj4NzV9@SOhPAVRyowES-hAkOymg8RqqrFZMmJwzBEWCH9jyIEk0q6xkiT-A0bDAo7o@@FLd-VQ@L?cUN3X3x6A1X5uRKw_pBVeQUp3D9H0Uq2Yk7v2?EPTx63nGb9TTWr!5iM-pAU!qGwKmgIae9Ak1CxZhBws-3f?_8jBuwN?zUurKtBqSh4";
        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "big_good_crop.jpg"), DecodeType.HAN_XIN);
        {
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Photo_Big_005Rot()
    {
        String str = "hG$pgMU_A0?5w9qgsUr7v83ZB3P2CxuIj@@_G!gvT22N!kdB@AQGGSwqSmnt?i@TG4V1?rax4@n8FqegZN7CfnCQPVwjW3y06iGFPtDTpjSLv3jtHGTzr93i2Ems@7ZAN3BmjYRxKoc@U6mb1CcPj-I?wnTKHbXyJR_71_Jy5npDf7N@hJ68eJfOuE6$FGpyPv2C8ur39ua$ZFh4YXt_keT-20NxHMsz?630FKD3hD-0zi4pmCnycrM1b2QIg!vxCs-jRyyOU5fhfiPS@pLFq!VVuCXS9!WoXRyHjUW3TYcnLvU8n_M7zqHHVt5OZfUZi8JN1IzrRX1QgyK-yfw@ye5yKr26eId4EDETkGHdPkqb46qnh6g!0YsEDaCKW8MJ9?Mdu7drYRwM4c!UAOXorjDvb-QJD$HWYfh6tL8rc5khtePqfyJHjphZ!hCvrTnbJY4Y@Er4WxL2_mC$0quV2A3z_I$LJNAISJXTq7vaGU02cwaXeF!AqRpJkEa2IfvJxDj4NzV9@SOhPAVRyowES-hAkOymg8RqqrFZMmJwzBEWCH9jyIEk0q6xkiT-A0bDAo7o@@FLd-VQ@L?cUN3X3x6A1X5uRKw_pBVeQUp3D9H0Uq2Yk7v2?EPTx63nGb9TTWr!5iM-pAU!qGwKmgIae9Ak1CxZhBws-3f?_8jBuwN?zUurKtBqSh4";
        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "big_good_crop_rot5.jpg"), DecodeType.HAN_XIN);
        {
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Photo_Big_010Rot()
    {
        String str = "hG$pgMU_A0?5w9qgsUr7v83ZB3P2CxuIj@@_G!gvT22N!kdB@AQGGSwqSmnt?i@TG4V1?rax4@n8FqegZN7CfnCQPVwjW3y06iGFPtDTpjSLv3jtHGTzr93i2Ems@7ZAN3BmjYRxKoc@U6mb1CcPj-I?wnTKHbXyJR_71_Jy5npDf7N@hJ68eJfOuE6$FGpyPv2C8ur39ua$ZFh4YXt_keT-20NxHMsz?630FKD3hD-0zi4pmCnycrM1b2QIg!vxCs-jRyyOU5fhfiPS@pLFq!VVuCXS9!WoXRyHjUW3TYcnLvU8n_M7zqHHVt5OZfUZi8JN1IzrRX1QgyK-yfw@ye5yKr26eId4EDETkGHdPkqb46qnh6g!0YsEDaCKW8MJ9?Mdu7drYRwM4c!UAOXorjDvb-QJD$HWYfh6tL8rc5khtePqfyJHjphZ!hCvrTnbJY4Y@Er4WxL2_mC$0quV2A3z_I$LJNAISJXTq7vaGU02cwaXeF!AqRpJkEa2IfvJxDj4NzV9@SOhPAVRyowES-hAkOymg8RqqrFZMmJwzBEWCH9jyIEk0q6xkiT-A0bDAo7o@@FLd-VQ@L?cUN3X3x6A1X5uRKw_pBVeQUp3D9H0Uq2Yk7v2?EPTx63nGb9TTWr!5iM-pAU!qGwKmgIae9Ak1CxZhBws-3f?_8jBuwN?zUurKtBqSh4";
        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "big_good_crop_rot10.jpg"), DecodeType.HAN_XIN);
        {
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Photo_Big_020Rot()
    {
        String str = "hG$pgMU_A0?5w9qgsUr7v83ZB3P2CxuIj@@_G!gvT22N!kdB@AQGGSwqSmnt?i@TG4V1?rax4@n8FqegZN7CfnCQPVwjW3y06iGFPtDTpjSLv3jtHGTzr93i2Ems@7ZAN3BmjYRxKoc@U6mb1CcPj-I?wnTKHbXyJR_71_Jy5npDf7N@hJ68eJfOuE6$FGpyPv2C8ur39ua$ZFh4YXt_keT-20NxHMsz?630FKD3hD-0zi4pmCnycrM1b2QIg!vxCs-jRyyOU5fhfiPS@pLFq!VVuCXS9!WoXRyHjUW3TYcnLvU8n_M7zqHHVt5OZfUZi8JN1IzrRX1QgyK-yfw@ye5yKr26eId4EDETkGHdPkqb46qnh6g!0YsEDaCKW8MJ9?Mdu7drYRwM4c!UAOXorjDvb-QJD$HWYfh6tL8rc5khtePqfyJHjphZ!hCvrTnbJY4Y@Er4WxL2_mC$0quV2A3z_I$LJNAISJXTq7vaGU02cwaXeF!AqRpJkEa2IfvJxDj4NzV9@SOhPAVRyowES-hAkOymg8RqqrFZMmJwzBEWCH9jyIEk0q6xkiT-A0bDAo7o@@FLd-VQ@L?cUN3X3x6A1X5uRKw_pBVeQUp3D9H0Uq2Yk7v2?EPTx63nGb9TTWr!5iM-pAU!qGwKmgIae9Ak1CxZhBws-3f?_8jBuwN?zUurKtBqSh4";
        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "big_good_crop_rot20.jpg"), DecodeType.HAN_XIN);
        {
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Photo_Big_040Rot()
    {
        String str = "hG$pgMU_A0?5w9qgsUr7v83ZB3P2CxuIj@@_G!gvT22N!kdB@AQGGSwqSmnt?i@TG4V1?rax4@n8FqegZN7CfnCQPVwjW3y06iGFPtDTpjSLv3jtHGTzr93i2Ems@7ZAN3BmjYRxKoc@U6mb1CcPj-I?wnTKHbXyJR_71_Jy5npDf7N@hJ68eJfOuE6$FGpyPv2C8ur39ua$ZFh4YXt_keT-20NxHMsz?630FKD3hD-0zi4pmCnycrM1b2QIg!vxCs-jRyyOU5fhfiPS@pLFq!VVuCXS9!WoXRyHjUW3TYcnLvU8n_M7zqHHVt5OZfUZi8JN1IzrRX1QgyK-yfw@ye5yKr26eId4EDETkGHdPkqb46qnh6g!0YsEDaCKW8MJ9?Mdu7drYRwM4c!UAOXorjDvb-QJD$HWYfh6tL8rc5khtePqfyJHjphZ!hCvrTnbJY4Y@Er4WxL2_mC$0quV2A3z_I$LJNAISJXTq7vaGU02cwaXeF!AqRpJkEa2IfvJxDj4NzV9@SOhPAVRyowES-hAkOymg8RqqrFZMmJwzBEWCH9jyIEk0q6xkiT-A0bDAo7o@@FLd-VQ@L?cUN3X3x6A1X5uRKw_pBVeQUp3D9H0Uq2Yk7v2?EPTx63nGb9TTWr!5iM-pAU!qGwKmgIae9Ak1CxZhBws-3f?_8jBuwN?zUurKtBqSh4";
        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "big_good_crop_rot40.jpg"), DecodeType.HAN_XIN);
        {
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Photo_Big_060Rot()
    {
        String str = "hG$pgMU_A0?5w9qgsUr7v83ZB3P2CxuIj@@_G!gvT22N!kdB@AQGGSwqSmnt?i@TG4V1?rax4@n8FqegZN7CfnCQPVwjW3y06iGFPtDTpjSLv3jtHGTzr93i2Ems@7ZAN3BmjYRxKoc@U6mb1CcPj-I?wnTKHbXyJR_71_Jy5npDf7N@hJ68eJfOuE6$FGpyPv2C8ur39ua$ZFh4YXt_keT-20NxHMsz?630FKD3hD-0zi4pmCnycrM1b2QIg!vxCs-jRyyOU5fhfiPS@pLFq!VVuCXS9!WoXRyHjUW3TYcnLvU8n_M7zqHHVt5OZfUZi8JN1IzrRX1QgyK-yfw@ye5yKr26eId4EDETkGHdPkqb46qnh6g!0YsEDaCKW8MJ9?Mdu7drYRwM4c!UAOXorjDvb-QJD$HWYfh6tL8rc5khtePqfyJHjphZ!hCvrTnbJY4Y@Er4WxL2_mC$0quV2A3z_I$LJNAISJXTq7vaGU02cwaXeF!AqRpJkEa2IfvJxDj4NzV9@SOhPAVRyowES-hAkOymg8RqqrFZMmJwzBEWCH9jyIEk0q6xkiT-A0bDAo7o@@FLd-VQ@L?cUN3X3x6A1X5uRKw_pBVeQUp3D9H0Uq2Yk7v2?EPTx63nGb9TTWr!5iM-pAU!qGwKmgIae9Ak1CxZhBws-3f?_8jBuwN?zUurKtBqSh4";
        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "big_good_crop_rot60.jpg"), DecodeType.HAN_XIN);
        {
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Photo_Big_090Rot()
    {
        String str = "hG$pgMU_A0?5w9qgsUr7v83ZB3P2CxuIj@@_G!gvT22N!kdB@AQGGSwqSmnt?i@TG4V1?rax4@n8FqegZN7CfnCQPVwjW3y06iGFPtDTpjSLv3jtHGTzr93i2Ems@7ZAN3BmjYRxKoc@U6mb1CcPj-I?wnTKHbXyJR_71_Jy5npDf7N@hJ68eJfOuE6$FGpyPv2C8ur39ua$ZFh4YXt_keT-20NxHMsz?630FKD3hD-0zi4pmCnycrM1b2QIg!vxCs-jRyyOU5fhfiPS@pLFq!VVuCXS9!WoXRyHjUW3TYcnLvU8n_M7zqHHVt5OZfUZi8JN1IzrRX1QgyK-yfw@ye5yKr26eId4EDETkGHdPkqb46qnh6g!0YsEDaCKW8MJ9?Mdu7drYRwM4c!UAOXorjDvb-QJD$HWYfh6tL8rc5khtePqfyJHjphZ!hCvrTnbJY4Y@Er4WxL2_mC$0quV2A3z_I$LJNAISJXTq7vaGU02cwaXeF!AqRpJkEa2IfvJxDj4NzV9@SOhPAVRyowES-hAkOymg8RqqrFZMmJwzBEWCH9jyIEk0q6xkiT-A0bDAo7o@@FLd-VQ@L?cUN3X3x6A1X5uRKw_pBVeQUp3D9H0Uq2Yk7v2?EPTx63nGb9TTWr!5iM-pAU!qGwKmgIae9Ak1CxZhBws-3f?_8jBuwN?zUurKtBqSh4";
        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "big_good_crop_rot90.jpg"), DecodeType.HAN_XIN);
        {
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Photo_Big_120Rot()
    {
        String str = "hG$pgMU_A0?5w9qgsUr7v83ZB3P2CxuIj@@_G!gvT22N!kdB@AQGGSwqSmnt?i@TG4V1?rax4@n8FqegZN7CfnCQPVwjW3y06iGFPtDTpjSLv3jtHGTzr93i2Ems@7ZAN3BmjYRxKoc@U6mb1CcPj-I?wnTKHbXyJR_71_Jy5npDf7N@hJ68eJfOuE6$FGpyPv2C8ur39ua$ZFh4YXt_keT-20NxHMsz?630FKD3hD-0zi4pmCnycrM1b2QIg!vxCs-jRyyOU5fhfiPS@pLFq!VVuCXS9!WoXRyHjUW3TYcnLvU8n_M7zqHHVt5OZfUZi8JN1IzrRX1QgyK-yfw@ye5yKr26eId4EDETkGHdPkqb46qnh6g!0YsEDaCKW8MJ9?Mdu7drYRwM4c!UAOXorjDvb-QJD$HWYfh6tL8rc5khtePqfyJHjphZ!hCvrTnbJY4Y@Er4WxL2_mC$0quV2A3z_I$LJNAISJXTq7vaGU02cwaXeF!AqRpJkEa2IfvJxDj4NzV9@SOhPAVRyowES-hAkOymg8RqqrFZMmJwzBEWCH9jyIEk0q6xkiT-A0bDAo7o@@FLd-VQ@L?cUN3X3x6A1X5uRKw_pBVeQUp3D9H0Uq2Yk7v2?EPTx63nGb9TTWr!5iM-pAU!qGwKmgIae9Ak1CxZhBws-3f?_8jBuwN?zUurKtBqSh4";
        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "big_good_crop_rot120.jpg"), DecodeType.HAN_XIN);
        {
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Photo_Big_210Rot()
    {
        String str = "hG$pgMU_A0?5w9qgsUr7v83ZB3P2CxuIj@@_G!gvT22N!kdB@AQGGSwqSmnt?i@TG4V1?rax4@n8FqegZN7CfnCQPVwjW3y06iGFPtDTpjSLv3jtHGTzr93i2Ems@7ZAN3BmjYRxKoc@U6mb1CcPj-I?wnTKHbXyJR_71_Jy5npDf7N@hJ68eJfOuE6$FGpyPv2C8ur39ua$ZFh4YXt_keT-20NxHMsz?630FKD3hD-0zi4pmCnycrM1b2QIg!vxCs-jRyyOU5fhfiPS@pLFq!VVuCXS9!WoXRyHjUW3TYcnLvU8n_M7zqHHVt5OZfUZi8JN1IzrRX1QgyK-yfw@ye5yKr26eId4EDETkGHdPkqb46qnh6g!0YsEDaCKW8MJ9?Mdu7drYRwM4c!UAOXorjDvb-QJD$HWYfh6tL8rc5khtePqfyJHjphZ!hCvrTnbJY4Y@Er4WxL2_mC$0quV2A3z_I$LJNAISJXTq7vaGU02cwaXeF!AqRpJkEa2IfvJxDj4NzV9@SOhPAVRyowES-hAkOymg8RqqrFZMmJwzBEWCH9jyIEk0q6xkiT-A0bDAo7o@@FLd-VQ@L?cUN3X3x6A1X5uRKw_pBVeQUp3D9H0Uq2Yk7v2?EPTx63nGb9TTWr!5iM-pAU!qGwKmgIae9Ak1CxZhBws-3f?_8jBuwN?zUurKtBqSh4";
        BarCodeReader r = new BarCodeReader(Global.pathCombine(_folderRecognition, "big_good_crop_rot210.jpg"), DecodeType.HAN_XIN);
        {
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Perspective()
    {
        String str = "1234567890";
        BarCodeReader r = new BarCodeReader(Global.pathCombine(_folderRecognition, "persp_transf3.png"), DecodeType.HAN_XIN);
        {
            r.setQualitySettings(QualitySettings.getHighQuality());
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Crumpled_1()
    {
        String str = "1234567890";
        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "simple_crumpled_2_crop.jpg"), DecodeType.HAN_XIN);
        {
            r.setQualitySettings(QualitySettings.getHighQuality());
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Crumpled_2()
    {
        String str = "1234567890";
        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "simple_crumpled_2.jpg"), DecodeType.HAN_XIN);
        {
            r.setQualitySettings(QualitySettings.getHighQuality());
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test
    public void HanXin_Recognition_From_File_Photo_Display()
    {
        String str = "Han Xin Code is a two-dimensional (2d) matrix symbology, which is developed and designed for both Chinese market and global market. \r\n" +
                "Han Xin Code was designed in 2005. Han Xin Code is a result of a key research of tenth Chinese Five-Year Plan. The Chinese National Standard of Han Xin Code was published in 2007. The AIM Global's specification of this symbology was published in 2011.";

        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "hanxin_display.png"), DecodeType.HAN_XIN);
        {
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    @Test(enabled = false)
    public void HanXin_Debug_From_File()
    {
        String str = "1234567890";
        BarCodeReader r = new BarCodeReader(Global.pathCombine
                (_folderRecognition, "hanxin_display.png"), DecodeType.HAN_XIN);
        {
            //r.setQualitySettings(QualitySettings.getHighQuality());
            BarCodeResult[] found = r.readBarCodes();
            Assert.assertEquals(1, found.length);
            Assert.assertEquals(str, found[0].getCodeText());
        }
    }

    static String createRandomString(int stringLength) 
    {
        String allowedCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz0123456789!@$?_-";
        char[] chars = new char[stringLength];

        for (int i = 0; i < stringLength; i++) {
            chars[i] = allowedCharacters.charAt(_random.nextInt(allowedCharacters.length()));
        }

        return new String(chars);
    }
}
