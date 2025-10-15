package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33426.")
public class Issue33426
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33426");

    private static final String[] Texts = {
    "0:903C00FC008007401B006C00800060074019007200CC019006C01B006E00F4002002400C002E00C0E0A8D0214600632C022043F1E4198D24AB00A002C0088016"
            ,
            "1:1E01D820B970221D00614EB20C9AF062C6871B3B66BCD871A00F000D00280010700A80210082007002E069D4A901A5002852B36B4E1C006E00984115C00B0062"
            ,
            "2:C9DAF42AB52D93AC00AE00C83216AED9806FEF6AD5CB97AC58BA600134C14B93A661B3233FA255CBB60648919823B77DBB586BE3BE87A1D60D88F56E92BE5C69"
            ,
            "3:627D028048DFA79A65E45C48BB64EDDBB673E3DEADBB776DC0570198463D33386BD76411B73D42FCB1D6BB4F5963156B95E6699B36813327CBD5B970B35F9737"
            ,
            "4:F7FB7CED5FB700B66F058DF72E5BE501D57727FF9DC6F9B7F2D997B70F3FFD78B1E559F69476FFB5078080A225969F7777EDF4941000280180550F45D4504529"
            ,
            "5:3D349115120100854A11A55407442DE915D44F3F55D8615019B1C4E1452312C89D7EDF3998A0783332989659B2C576534E23E1F4D14E0BADE62100A7D1042000"
            ,
            "6:4B94E4D884C5C9B89E8E6AF5B7207D77A1F594911F4A39DF925982379A7F396209400E667DE4258D77A1696581E57D34D280E85D092690622A08E7771F7D4427"
            ,
            "7:7E7BDED5679E384E69E647B2FD49A6A177224A687C81E6F4DE668B7E69E04793860769998D02C01FA5765EEAE9A395B29913826BEAF811829A96AAAA4EF7B97A"
            ,
            "8:28ACFD89C59A4CD6ADC7DC5356C9B4D862C0D90A00AE48EA4A2A72504E57EC87B9B2C695A2C85AA5EC69CC16EB2CA94F8AB5184D7C7D98DC77D132591C6B5DA2"
            ,
            "9:97AD62C575FBDA8D0141A8155796727BE4B7C0B9BB5EBC7BCD4BAA4D629D36A36B77F1252CB1DFBAA621003F5594D1892D1905800E25F58AEE620BF151924D17"
            ,
            "10:457410C3102F249D5FD5158B5D4916170954870F0D85F0C90B618CD04A2645D43100104A48218917A264D2861D7E98B1CE23465491892BA748E2442CC2FC2200"
            ,
            "11:23567CB14A09B1A4E2CC3DE6249B9098614DA4714726495F930B3D19B2D30B7D18D14366B454D0CC5C925C12840C1F3CF3476453CA6FB1FF7E273000B716F76D"
            ,
            "12:AB5C69B5D8B7585D04474B3F4514D41A94068EEEDF635A95F7635BF2DD75714B360904941F9E765767EB0996D76546028B9EE4EB211B1AE07DD1A4176B6235F9"
            ,
            "13:45B1AE554E6EB14AE2D52470F3B96E79EC00CC7E5AEDEC9E1EDCBB8402",
            "0:903C00FC008007401B006C00800060074019007200CC019006C01B006E00F4002002400C002E00C0E0A8D0214600632C022043F1E4198D24AB00A002C0088016"
            ,
            "1:1E01D820B970221D00614EB20C9AF062C6871B3B66BCD871A00F000D00280010700A80210082007002E069D4A901A5002852B36B4E1C006E00984115C00B0062"
            ,
            "2:C9DAF42AB52D93AC00AE00C83216AED9806FEF6AD5CB97AC58BA600134C14B93A661B3233FA255CBB60648919823B77DBB586BE3BE87A1D60D88F56E92BE5C69"
            ,
            "3:627D028048DFA79A65E45C48BB64EDDBB673E3DEADBB776DC0570198463D33386BD76411B73D42FCB1D6BB4F5963156B95E6699B36813327CBD5B970B35F9737"
            ,
            "4:F7FB7CED5FB700B66F058DF72E5BE501D57727FF9DC6F9B7F2D997B70F3FFD78B1E559F69476FFB5078080A225969F7777EDF4941000280180550F45D4504529"
            ,
            "5:3D349115120100854A11A55407442DE915D44F3F55D8615019B1C4E1452312C89D7EDF3998A0783332989659B2C576534E23E1F4D14E0BADE62100A7D1042000"
            ,
            "6:4B94E4D884C5C9B89E8E6AF5B7207D77A1F594911F4A39DF925982379A7F396209400E667DE4258D77A1696581E57D34D280E85D092690622A08E7771F7D4427"
            ,
            "7:7E7BDED5679E384E69E647B2FD49A6A177224A687C81E6F4DE668B7E69E04793860769998D02C01FA5765EEAE9A395B29913826BEAF811829A96AAAA4EF7B97A"
            ,
            "8:28ACFD89C59A4CD6ADC7DC5356C9B4D862C0D90A00AE48EA4A2A72504E57EC87B9B2C695A2C85AA5EC69CC16EB2CA94F8AB5184D7C7D98DC77D132591C6B5DA2"
            ,
            "9:97AD62C575FBDA8D0141A8155796727BE4B7C0B9BB5EBC7BCD4BAA4D629D36A36B77F1252CB1DFBAA621003F5594D1892D1905800E25F58AEE620BF151924D17"
            ,
            "10:457410C3102F249D5FD5158B5D4916170954870F0D85F0C90B618CD04A2645D43100104A48218917A264D2861D7E98B1CE23465491892BA748E2442CC2FC2200"
            ,
            "11:23567CB14A09B1A4E2CC3DE6249B9098614DA4714726495F930B3D19B2D30B7D18D14366B454D0CC5C925C12840C1F3CF3476453CA6FB1FF7E273000B716F76D"
            ,
            "12:AB5C69B5D8B7585D04474B3F4514D41A94068EEEDF635A95F7635BF2DD75714B360904941F9E765767EB0996D76546028B9EE4EB211B1AE07DD1A4176B6235F9"
            ,
            "13:45B1AE554E6EB14AE2D52470F3B96E79EC00CC7E5AEDEC9E1EDCBB8402",
            "904300BC010007401A007400C8011006C01A0020004C013086210037100108B1881163198519A1583C03E063442A00EE080400"
};

        @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void testCount()
    {
        String fileName = Global.pathCombine(folder, "banner.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            int count = 0;
            for(BarCodeResult result : reader.readBarCodes())
            count++;
            Assert.assertEquals(29, count);
        }
    }

        @Test
    public void testOriginalImage()
    {
        String fileName = Global.pathCombine(folder, "banner.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            reader.readBarCodes();
            int lInd = 0;
            for (int i = 0; i < Texts.length; i++)
            {
                Assert.assertEquals(Texts[i], reader.getFoundBarCodes()[lInd].getCodeText(), "Barcode index: " + i + ".");
                lInd++;
            }
        }
    }

        @Test
    public void testBarCode00()
    {
        String text = Texts[0];
        String fileName = Global.pathCombine(folder, "00.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode01()
    {
        String text = Texts[1];
        String fileName = Global.pathCombine(folder, "01.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode02()
    {
        String text = Texts[2];
        String fileName = Global.pathCombine(folder, "02.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode03()
    {
        String text = Texts[3];
        String fileName = Global.pathCombine(folder, "03.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode04()
    {
        String text = Texts[4];
        String fileName = Global.pathCombine(folder, "04.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode05()
    {
        String text = Texts[5];
        String fileName = Global.pathCombine(folder, "05.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode06()
    {
        String text = Texts[6];
        String fileName = Global.pathCombine(folder, "06.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode07()
    {
        String text = Texts[7];
        String fileName = Global.pathCombine(folder, "07.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode08()
    {
        String text = Texts[8];
        String fileName = Global.pathCombine(folder, "08.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode09()
    {
        String text = Texts[9];
        String fileName = Global.pathCombine(folder, "09.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode10()
    {
        String text = Texts[10];
        String fileName = Global.pathCombine(folder, "10.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode11()
    {
        String text = Texts[11];
        String fileName = Global.pathCombine(folder, "11.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode12()
    {
        String text = Texts[12];
        String fileName = Global.pathCombine(folder, "12.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode13()
    {
        String text = Texts[13];
        String fileName = Global.pathCombine(folder, "13.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode14()
    {
        String text = Texts[14];
        String fileName = Global.pathCombine(folder, "14.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode15()
    {
        String text = Texts[15];
        String fileName = Global.pathCombine(folder, "15.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode16()
    {
        String text = Texts[16];
        String fileName = Global.pathCombine(folder, "16.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode17()
    {
        String text = Texts[17];
        String fileName = Global.pathCombine(folder, "17.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode19()
    {
        String text = Texts[19];
        String fileName = Global.pathCombine(folder, "19.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode20()
    {
        String text = Texts[20];
        String fileName = Global.pathCombine(folder, "20.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode21()
    {
        String text = Texts[21];
        String fileName = Global.pathCombine(folder, "21.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode23()
    {
        String text = Texts[23];
        String fileName = Global.pathCombine(folder, "23.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode24()
    {
        String text = Texts[24];
        String fileName = Global.pathCombine(folder, "24.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode25()
    {
        String text = Texts[25];
        String fileName = Global.pathCombine(folder, "25.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode26()
    {
        String text = Texts[26];
        String fileName = Global.pathCombine(folder, "26.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode27()
    {
        String text = Texts[27];
        String fileName = Global.pathCombine(folder, "27.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode28()
    {
        String text = Texts[28];
        String fileName = Global.pathCombine(folder, "28.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testBarCode00_01()
    {
        String fileName = Global.pathCombine(folder, "00_01.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals(Texts[0], reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(Texts[1], reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
    public void testBarCode00_06()
    {
        String fileName = Global.pathCombine(folder, "00_06.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals(Texts[0], reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(Texts[6], reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
    public void testBarCode00to05()
    {
        String fileName = Global.pathCombine(folder, "00-05.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 6);
            Assert.assertEquals(Texts[0], reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(Texts[1], reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals(Texts[2], reader.getFoundBarCodes()[2].getCodeText());
            Assert.assertEquals(Texts[3], reader.getFoundBarCodes()[3].getCodeText());
            Assert.assertEquals(Texts[4], reader.getFoundBarCodes()[4].getCodeText());
            Assert.assertEquals(Texts[5], reader.getFoundBarCodes()[5].getCodeText());
        }
    }

        @Test
    public void testBarCode00_01_06_07()
    {
        String fileName = Global.pathCombine(folder, "00_01_06_07.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 4);
            Assert.assertEquals(Texts[0], reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(Texts[1], reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals(Texts[6], reader.getFoundBarCodes()[2].getCodeText());
            Assert.assertEquals(Texts[7], reader.getFoundBarCodes()[3].getCodeText());
        }
    }

        @Test
    public void testBarCode00_07()
    {
        String fileName = Global.pathCombine(folder, "00_07.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals(Texts[0], reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(Texts[7], reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
    public void testBarCode00_01_07()
    {
        String fileName = Global.pathCombine(folder, "00_01_07.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 3);
            Assert.assertEquals(Texts[0], reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(Texts[1], reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals(Texts[7], reader.getFoundBarCodes()[2].getCodeText());
        }
    }

        @Test
    public void testBarCode00_06_07()
    {
        String fileName = Global.pathCombine(folder, "00_06_07.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 3);
            Assert.assertEquals(Texts[0], reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(Texts[6], reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals(Texts[7], reader.getFoundBarCodes()[2].getCodeText());
        }
    }

        @Test
    public void testBarCode01_06_07()
    {
        String fileName = Global.pathCombine(folder, "01_06_07.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 3);
            Assert.assertEquals(Texts[1], reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(Texts[6], reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals(Texts[7], reader.getFoundBarCodes()[2].getCodeText());
        }
    }

        @Test
    public void testBarCodeFrom12()
    {
        String fileName = Global.pathCombine(folder, "from12.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            reader.readBarCodes();
            int lInd = 0;
            for (int i = 12; i < Texts.length - 1; i++)
            {
                Assert.assertEquals(Texts[i], reader.getFoundBarCodes()[lInd].getCodeText(), "Barcode index: " + i + ".");
                lInd++;
            }
        }
    }

        @Test
    public void testBarCodeFrom14()
    {
        String fileName = Global.pathCombine(folder, "from14.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            reader.readBarCodes();
            int lInd = 0;
            for (int i = 14; i < Texts.length - 1; i++)
            {
                Assert.assertEquals(Texts[i], reader.getFoundBarCodes()[lInd].getCodeText(), "Barcode index: " + i + ".");
                lInd++;
            }
        }
    }

        @Test
    public void testBarCode06_07_12_13()
    {
        String fileName = Global.pathCombine(folder, "06_07_12_13.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 4);
            Assert.assertEquals(Texts[6], reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(Texts[7], reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals(Texts[12], reader.getFoundBarCodes()[2].getCodeText());
            Assert.assertEquals(Texts[13], reader.getFoundBarCodes()[3].getCodeText());
        }
    }

        @Test
    public void testBarCodeTo13()
    {
        String fileName = Global.pathCombine(folder, "to13.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            reader.readBarCodes();
            int lInd = 0;
            for (int i = 0; i < 14; i++)
            {
                Assert.assertEquals(Texts[i], reader.getFoundBarCodes()[lInd].getCodeText(), "Barcode index: " + i + ".");
                lInd++;
            }
        }
    }

        @Test
    public void testBarCode06to13()
    {
        String fileName = Global.pathCombine(folder, "06-13.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            reader.readBarCodes();
            int lInd = 0;
            for (int i = 6; i < 14; i++)
            {
                Assert.assertEquals(Texts[i], reader.getFoundBarCodes()[lInd].getCodeText(), "Barcode index: " + i + ".");
                lInd++;
            }
        }
    }

        @Test
    public void testBarCode00_01_06_07_12_13()
    {
        String fileName = Global.pathCombine(folder, "00_01_06_07_12_13.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 6);
            Assert.assertEquals(Texts[0], reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(Texts[1], reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals(Texts[6], reader.getFoundBarCodes()[2].getCodeText());
            Assert.assertEquals(Texts[7], reader.getFoundBarCodes()[3].getCodeText());
            Assert.assertEquals(Texts[12], reader.getFoundBarCodes()[4].getCodeText());
            Assert.assertEquals(Texts[13], reader.getFoundBarCodes()[5].getCodeText());
        }
    }
}

