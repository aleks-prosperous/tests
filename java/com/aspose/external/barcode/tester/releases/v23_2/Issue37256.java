package com.aspose.external.barcode.tester.releases.v23_2;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Issue37256 {
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue37256");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp() {
        LicenseAssistant.setupLicense();
    }


    @Test
    public void test_SimpleNarrow() {
        String fileName = Global.pathCombine(Folder, "SimpleNarrow.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            List<String> Codetexts = new ArrayList<>();
            for (BarCodeResult result : reader.readBarCodes())
                Codetexts.add(result.getCodeText());

            Assert.assertEquals(1, Codetexts.size());
            assertContains("ABCDEF0", Codetexts);
        }
    }

    @Test
    public void test_SimpleHorizontal() {
        String fileName = Global.pathCombine(Folder, "SimpleHorizontal.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            List<String> Codetexts = new ArrayList<>();
            for (BarCodeResult result : reader.readBarCodes())
                Codetexts.add(result.getCodeText());

            Assert.assertEquals(1, Codetexts.size());
            assertContains("ABCDEF-1", Codetexts);
        }
    }

    @Test
    public void test_SimpleVertical() {
        String fileName = Global.pathCombine(Folder, "SimpleVertical.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            List<String> Codetexts = new ArrayList<>();
            for (BarCodeResult result : reader.readBarCodes())
                Codetexts.add(result.getCodeText());

            Assert.assertEquals(1, Codetexts.size());
            assertContains("ABCDEF-1", Codetexts);
        }
    }

    @Test
    public void test_SimpleNarrowVertical() {
        String fileName = Global.pathCombine(Folder, "SimpleNarrowVertical.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            List<String> Codetexts = new ArrayList<>();
            for (BarCodeResult result : reader.readBarCodes())
                Codetexts.add(result.getCodeText());

            Assert.assertEquals(1, Codetexts.size());
            assertContains("ABCDEF127Y", Codetexts);
        }
    }

    @Test
    public void test_Squared() {
        String fileName = Global.pathCombine(Folder, "Squared.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            List<String> Codetexts = new ArrayList<>();
            for (BarCodeResult result : reader.readBarCodes())
                Codetexts.add(result.getCodeText());

            Assert.assertEquals(1, Codetexts.size());
            assertContains("0123456789", Codetexts);
        }
    }

    private static void assertContains(String text, List<String> list) {
        Assert.assertTrue(list.contains(text));
    }

    @Test
    public void test_4Codes3DDistortion() {
        String fileName = Global.pathCombine(Folder, "4Codes3DDistortion.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            reader.readBarCodes();
            Assert.assertEquals(4, reader.getFoundCount());

            for (BarCodeResult result : reader.getFoundBarCodes())
                Assert.assertEquals("http://www.vintasoft.com", result.getCodeText());
        }
    }

    @Test
    public void test_FromClient1()
    {
        String fileName = Global.pathCombine(Folder, "FromClient1.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            List<String> Codetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                Codetexts.add(result.getCodeText());

            Assert.assertEquals(9, Codetexts.size());
            assertContains("AE00001290H20000R19053017", Codetexts);
            assertContains("AE0000128XE2L000R19053017", Codetexts);
            assertContains("AE0000128VW29000R19053017", Codetexts);
            assertContains("AE0000128TJ6K000R19053017", Codetexts);
            assertContains("AE0000128YJ5B000R19053017", Codetexts);
            assertContains("AE0000128WWK3000R19053017", Codetexts);
            assertContains("AE0000128UTLB000R19053017", Codetexts);
            assertContains("AE0000128SA6F000R19053017", Codetexts);
            assertContains("AE0000128P40D000R19053017", Codetexts);
        }
    }

    @Test
    public void test_FromClient2()
    {
        String fileName = Global.pathCombine(Folder, "FromClient2.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);

            List<String> Codetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                Codetexts.add(result.getCodeText());

            Assert.assertEquals(8, Codetexts.size());
            assertContains("AE00001290H20000R19053017", Codetexts);
            assertContains("AE0000128XE2L000R19053017", Codetexts);
            assertContains("AE0000128VW29000R19053017", Codetexts);
            assertContains("AE0000128TJ6K000R19053017", Codetexts);
            assertContains("AE0000128YJ5B000R19053017", Codetexts);
            assertContains("AE0000128WWK3000R19053017", Codetexts);
            assertContains("AE0000128UTLB000R19053017", Codetexts);
            assertContains("AE0000128P40D000R19053017", Codetexts);
        }
    }
    @Test
    public void test_FromClient3()
    {
        String fileName = Global.pathCombine(Folder, "FromClient3.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);

            List<String> Codetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                Codetexts.add(result.getCodeText());

            Assert.assertEquals(7, Codetexts.size());
            assertContains("AE00001290H20000R19053017", Codetexts);
            assertContains("AE0000128XE2L000R19053017", Codetexts);
            assertContains("AE0000128VW29000R19053017", Codetexts);
            assertContains("AE0000128YJ5B000R19053017", Codetexts);
            assertContains("AE0000128WWK3000R19053017", Codetexts);
            assertContains("AE0000128UTLB000R19053017", Codetexts);
            assertContains("AE0000128P40D000R19053017", Codetexts);
        }
    }
    @Test
    public void test_FromClient4()
    {
        String fileName = Global.pathCombine(Folder, "FromClient4.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);

            List<String> Codetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                Codetexts.add(result.getCodeText());

            Assert.assertEquals(7, Codetexts.size());
            assertContains("AE00001290H20000R19053017", Codetexts);
            assertContains("AE0000128VW29000R19053017", Codetexts);
            assertContains("AE0000128TJ6K000R19053017", Codetexts);
            assertContains("AE0000128YJ5B000R19053017", Codetexts);
            assertContains("AE0000128WWK3000R19053017", Codetexts);
            assertContains("AE0000128UTLB000R19053017", Codetexts);
            assertContains("AE0000128P40D000R19053017", Codetexts);
        }
    }
    @Test
    public void test_FromClient5()
    {
        String fileName = Global.pathCombine(Folder, "FromClient5.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);

            List<String> Codetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                Codetexts.add(result.getCodeText());

            Assert.assertEquals(8, Codetexts.size());
            assertContains("AE00001290H20000R19053017", Codetexts);
            assertContains("AE0000128XE2L000R19053017", Codetexts);
            assertContains("AE0000128VW29000R19053017", Codetexts);
            assertContains("AE0000128TJ6K000R19053017", Codetexts);
            assertContains("AE0000128YJ5B000R19053017", Codetexts);
            assertContains("AE0000128WWK3000R19053017", Codetexts);
            assertContains("AE0000128UTLB000R19053017", Codetexts);
            assertContains("AE0000128P40D000R19053017", Codetexts);
        }
    }
    
    @Test
    public void test_FromClient6()
    {
        String fileName = Global.pathCombine(Folder, "FromClient6.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);

            List<String> Codetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                Codetexts.add(result.getCodeText());

            Assert.assertEquals(8, Codetexts.size());
            assertContains("AE0000128XE2L000R19053017", Codetexts);
            assertContains("AE0000128VW29000R19053017", Codetexts);
            assertContains("AE0000128TJ6K000R19053017", Codetexts);
            assertContains("AE0000128YJ5B000R19053017", Codetexts);
            assertContains("AE0000128WWK3000R19053017", Codetexts);
            assertContains("AE0000128UTLB000R19053017", Codetexts);
            assertContains("AE0000128SA6F000R19053017", Codetexts);
            assertContains("AE0000128P40D000R19053017", Codetexts);
        }
    }

    @Test
    public void test_Blurred() {
        String fileName = Global.pathCombine(Folder, "Blurred.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            List<String> Codetexts = new ArrayList<>();
            for (BarCodeResult result : reader.readBarCodes())
                Codetexts.add(result.getCodeText());

            Assert.assertEquals(1, Codetexts.size());
            assertContains("http://www.vintasoft.com", Codetexts);
        }
    }

    @Test
    public void test_Printed() {
        String fileName = Global.pathCombine(Folder, "Printed.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            List<String> Codetexts = new ArrayList<>();
            for (BarCodeResult result : reader.readBarCodes())
                Codetexts.add(result.getCodeText());

            Assert.assertEquals(4, reader.getFoundBarCodes().length);
            List<String> expected = Arrays.asList("VintaSoft", "http://www.vintasoft.com", "http://www.vintasoft.com", "http://www.vintasoft.com");
            CollectionAssert.areEquivalent(expected, Codetexts);
        }
    }

    @Test
    public void test_7Codes() {
        String fileName = Global.pathCombine(Folder, "7Codes.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            List<String> Codetexts = new ArrayList<>();
            for (BarCodeResult result : reader.readBarCodes())
                Codetexts.add(result.getCodeText());

            Assert.assertEquals(7, reader.getFoundBarCodes().length);
            List<String> expected = Arrays.asList("www.idautomation.com", "www.idautomation.com", "www.idautomation.com", "www.idautomation.com", "www.idautomation.com", "www.idautomation.com", "www.idautomation.com");
            CollectionAssert.areEquivalent(expected, Codetexts);

        }
    }

    @Test
    public void test_SmallSize() {
        String fileName = Global.pathCombine(Folder, "SmallSize.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            reader.readBarCodes();
            Assert.assertEquals(1, reader.getFoundCount());
            Assert.assertEquals("A12345678ADR DDE FFT EEE TTT ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Screenshot() {
        String fileName = Global.pathCombine(Folder, "Screenshot.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            reader.readBarCodes();
            Assert.assertEquals(1, reader.getFoundCount());
            Assert.assertEquals("www.idautomation.com", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Masks() {
        String fileName = Global.pathCombine(Folder, "Masks.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            reader.readBarCodes();
            Assert.assertEquals(2, reader.getFoundCount());
            Assert.assertEquals("0242FZ5CGW0D", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("0242FZ5CGW0D", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

    @Test
    public void test_SmallSize2() {
        String fileName = Global.pathCombine(Folder, "SmallSize2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            reader.readBarCodes();
            Assert.assertEquals(1, reader.getFoundCount());
            Assert.assertEquals("This_1s_Hard_P@ssW0rd", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Rotated() {
        String fileName = Global.pathCombine(Folder, "Rotated.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            reader.readBarCodes();
            Assert.assertEquals(1, reader.getFoundCount());
            Assert.assertEquals("ABCDEF-1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_3Codes() {
        String fileName = Global.pathCombine(Folder, "3Codes.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            reader.readBarCodes();
            Assert.assertEquals(3, reader.getFoundCount());
            Assert.assertEquals("https://www.vintasoft.com", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("https://www.vintasoft.com", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("https://www.vintasoft.com", reader.getFoundBarCodes()[2].getCodeText());
        }
    }

    @Test
    public void test_SimpleFlipped() {
        String fileName = Global.pathCombine(Folder, "SimpleFlipped.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            reader.readBarCodes();
            Assert.assertEquals(1, reader.getFoundCount());
            Assert.assertEquals("ABCDEF-1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_InversedLowQuality() {
        String fileName = Global.pathCombine(Folder, "InversedLowQuality.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.GS_1_DOT_CODE);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.readBarCodes();
            Assert.assertEquals(1, reader.getFoundCount());
            Assert.assertEquals("(235)5vBZr-AjR8!5'S:m(01)01234567890128(8008)19052001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_InversedBig() {
        String fileName = Global.pathCombine(Folder, "InversedBig.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            reader.readBarCodes();
            Assert.assertEquals(1, reader.getFoundCount());
            Assert.assertEquals("65088H31K1U5A0K16CRRABCDEFGHIJKLMNOPQRSTTPD2BATROM", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_InversedSmall() {
        String fileName = Global.pathCombine(Folder, "InversedSmall.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.readBarCodes();
            Assert.assertEquals(1, reader.getFoundCount());
            Assert.assertEquals("65088H31K1U5A0K16CRRABCDEFGHIJKLMNOPQRSTTPD2BATROM", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
