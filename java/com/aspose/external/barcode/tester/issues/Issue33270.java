//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33270.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="03.07.2012 14:20:27">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;


@Test(description = "Tests for Issue-33270.")
public class Issue33270
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33270");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void testNumbersAndLetters_1()
    {
        String fileName = Global.pathCombine(folder, "1012A.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(10)12A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testNumbersAndLetters_2()
    {
        String fileName = Global.pathCombine(folder, "1012SSA56.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(10)12SSA56", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testNumbersAndLetters_3()
    {
        String fileName = Global.pathCombine(folder, "108.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(10)8", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testNumbersAndLetters_4()
    {
        String fileName = Global.pathCombine(folder, "10WEH101S4.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(10)WEH101S4", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testNumbersAndLetters_5()
    {
        String fileName = Global.pathCombine(folder, "34abc.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("34abc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testNumbersAndLetters_6()
    {
        String fileName = Global.pathCombine(folder, "34abdr.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("34ab//dr", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testNumbersAndLetters_7()
    {
        String fileName = Global.pathCombine(folder, "344ER-9,876F.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("344ER-9,876F", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testNumbers_1()
    {
        String fileName = Global.pathCombine(folder, "(01)00012345678905.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)00012345678905", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testNumbers_2()
    {
        String fileName = Global.pathCombine(folder, "(01)74292345678906.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)74292345678906", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testNumbers_3()
    {
        String fileName = Global.pathCombine(folder, "(01)73399311836405.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)73399311836405", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testNumbers_4()
    {
        String fileName = Global.pathCombine(folder, "(01)13554987082091.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)13554987082091", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void testNumbers_5()
    {
        String fileName = Global.pathCombine(folder, "(01)84651892382105.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)84651892382105", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void testComplex_1()
    {
        String fileName = Global.pathCombine(folder, "Complex_1.png");//unknown generator
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)00012345678905h08821599003", reader.getFoundBarCodes()[0].getCodeText());
        }

        fileName = Global.pathCombine(folder, "Complex_1(v6.6).png");//generated the same in aspose, bytescout, tec-it
        reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)00012345678905(10)ABC123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void testComplex_2()
    {
        String fileName = Global.pathCombine(folder, "Complex_2.png");//unknown generator
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)0001234567890509321501405331531", reader.getFoundBarCodes()[0].getCodeText());
        }

        fileName = Global.pathCombine(folder, "Complex_2(v6.6).png");//generated the same in aspose, bytescout, tec-it
        reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)00012345678905123a345C", reader.getFoundBarCodes()[0].getCodeText());//AI 12 requires 6 digits but not 3a345C
        }
    }

    // Non-ISO standard
        @Test//, ExpectedException(typeof(BarCodeRecognitionException))]
        
    public void testComplex_3()
    {
        String fileName = Global.pathCombine(folder, "Complex_3.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)43212345678904(3103)123456(10)ETRd4y7F,6+Tt", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test0100_1()
    {
        String fileName = Global.pathCombine(folder, "0100_1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3103)001750", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test0100_2()
    {
        String fileName = Global.pathCombine(folder, "0100_2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3103)030457", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test0101_1()
    {
        String fileName = Global.pathCombine(folder, "0101_1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3202)000156", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test0101_2()
    {
        String fileName = Global.pathCombine(folder, "0101_2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3203)012345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test0101_3()
    {
        String fileName = Global.pathCombine(folder, "0101_3.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3203)010000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    // Non-ISO standard
        @Test//, ExpectedException(typeof(BarCodeRecognitionException))]
        
    public void test0101_4()
    {
        String fileName = Global.pathCombine(folder, "0101_4.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3202)673683", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test01100_1()
    {
        String fileName = Global.pathCombine(folder, "01100_1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3922)795", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test01100_2()
    {
        String fileName = Global.pathCombine(folder, "01100_2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3923)045", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test01101_1()
    {
        String fileName = Global.pathCombine(folder, "01101_1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3932)0401237", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test01101_2()
    {
        String fileName = Global.pathCombine(folder, "01101_2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3933)0125678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test0111000()
    {
        String fileName = Global.pathCombine(folder, "0111000.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3107)012223(11)040101", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test0111001()
    {
        String fileName = Global.pathCombine(folder, "0111001.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3204)012223(11)450509", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test0111010()
    {
        String fileName = Global.pathCombine(folder, "0111010.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3100)012453(13)450525", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test0111011()
    {
        String fileName = Global.pathCombine(folder, "0111011.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3201)002454(13)000229", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test0111100()
    {
        String fileName = Global.pathCombine(folder, "0111100.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3107)000453(15)991231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test0111101()
    {
        String fileName = Global.pathCombine(folder, "0111101.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3209)012454(15)170901", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test0111110()
    {
        String fileName = Global.pathCombine(folder, "0111110.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3104)002454(17)010101", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test0111111()
    {
        String fileName = Global.pathCombine(folder, "0111111.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3204)022454(17)000229", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
