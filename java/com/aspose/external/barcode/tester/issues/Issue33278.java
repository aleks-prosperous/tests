//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33278.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="07.06.2012 16:36:47">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.BarCodeException;
import com.aspose.barcode.auxiliary.StringExtensions;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;

@Test(description = "Tests for Issue-33278.")
public class Issue33278
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Complex()
    {
        generateAndRecognize("(01)00012345678905(10)ABC123", "(01)00012345678905(10)ABC123");
        generateAndRecognize("(01)00012345678905(123)a345C", "(01)00012345678905(123)a345C");
        generateAndRecognize("(01)00012345678905(123)a3&*/45C", "(01)00012345678905(123)a3&*/45C");
        generateAndRecognize("(01)90012345678908(10)ABC", "(01)90012345678908(10)ABC");
        generateAndRecognize("(01)90012345678908(32022)001750(18)32432", "(01)90012345678908(32022)001750(18)32432"); // last () here are as chars not AI borders
    }

    @Test
    public void test_Numbers()
    {
        generateAndRecognize("(01)24012345678905", "(01)24012345678905"); // with checksum in the text
        generateAndRecognize("(01)24012345678900", "(01)24012345678905"); // without checksum in the text
        generateAndRecognize("(01)98763432222100", "(01)98763432222109");
        generateAndRecognize("(01)83748923738740", "(01)83748923738749");
        generateAndRecognize("(01)09409238438880", "(01)09409238438882");
        generateAndRecognize("(01)00042384723860", "(01)00042384723861");
        generateAndRecognize("(01)12372811198320", "(01)12372811198326");
        generateAndRecognize("(01)48098696869650", "(01)48098696869650");
        generateAndRecognize("(01)59438938498323", "(01)59438938498327"); // correct checksum value added
        generateAndRecognize("(01)94859348589851", "(01)94859348589857"); // correct checksum value added
    }

    @Test
    public void test_00()
    {
        generateAndRecognize("(35)24", "(35)24");
        generateAndRecognize("(35)242", "(35)242");
        generateAndRecognize("(35)2425", "(35)2425");
        generateAndRecognize("(35)24252", "(35)24252");
        generateAndRecognize("(35)2425211111", "(35)2425211111");
        generateAndRecognize("(35)24252111113", "(35)24252111113");
        generateAndRecognize("(35)242521111144444", "(35)242521111144444");
        generateAndRecognize("(35)2425211111444447", "(35)2425211111444447");

        generateAndRecognize("(12)15A", "(12)15A");
        generateAndRecognize("(12)15AB", "(12)15AB");
        generateAndRecognize("(12)15AB-D", "(12)15AB-D");
        generateAndRecognize("(12)15AB-1234", "(12)15AB-1234");
        generateAndRecognize("(12)15AB-12345678", "(12)15AB-12345678");
        generateAndRecognize("(12)15AB-1234CC12345", "(12)15AB-1234CC12345");

        generateAndRecognize("(12)1a", "(12)1a");
        generateAndRecognize("(12)13a", "(12)13a");
        generateAndRecognize("(12)13abc", "(12)13abc");
        generateAndRecognize("(12)13abc%AT", "(12)13abc%AT");
        generateAndRecognize("(12)13abc%AT123", "(12)13abc%AT123");
        generateAndRecognize("(12)13abc%12356778", "(12)13abc%12356778");
        generateAndRecognize("(12)13abc%AT1231212557788", "(12)13abc%AT1231212557788");
        generateAndRecognize("(12)13abc%AT1231212557788---az45ER4vv", "(12)13abc%AT1231212557788---az45ER4vv");
    }

    @Test
    public void test_0100()
    {
        generateAndRecognize("(01)90012345678908(3103)001750", "(01)90012345678908(3103)001750");
        generateAndRecognize("(01)90012345678900(3103)001750", "(01)90012345678908(3103)001750");
        generateAndRecognize("(01)90056745678900(3103)001750", "(01)90056745678908(3103)001750");
        generateAndRecognize("(01)90056745678908(3103)011250", "(01)90056745678908(3103)011250");
        generateAndRecognize("(01)90012345678908(3103)032767", "(01)90012345678908(3103)032767");
    }

    @Test
    public void test_0101()
    {
        generateAndRecognize("(01)90012345678908(3202)001750", "(01)90012345678908(3202)001750");
        generateAndRecognize("(01)90012345678900(3202)009999", "(01)90012345678908(3202)009999");
        generateAndRecognize("(01)90056745678900(3203)001750", "(01)90056745678908(3203)001750");
        generateAndRecognize("(01)90056745678908(3203)022767", "(01)90056745678908(3203)022767");
    }

    @Test
    public void test_01100()
    {
        generateAndRecognize("(01)90012345678908(3922)001750", "(01)90012345678908(3922)001750");
        generateAndRecognize("(01)90012345678900(3921)009999", "(01)90012345678908(3921)009999");
        generateAndRecognize("(01)90056745678900(3920)11111111111", "(01)90056745678908(3920)11111111111");
        generateAndRecognize("(01)90056745678908(3923)00", "(01)90056745678908(3923)00");
    }

    @Test
    public void test_01101()
    {
        generateAndRecognize("(01)90012345678908(3932)001750", "(01)90012345678908(3932)001750");
        generateAndRecognize("(01)90012345678900(3931)009999", "(01)90012345678908(3931)009999");
        generateAndRecognize("(01)90056745678900(3930)11111111111", "(01)90056745678908(3930)11111111111");
        generateAndRecognize("(01)90056745678908(3933)002", "(01)90056745678908(3933)002");
    }

    @Test
    public void test_0111000()
    {
        generateAndRecognize("(01)90012345678908(3107)012223(11)040101", "(01)90012345678908(3107)012223(11)040101");
    }

    @Test
    public void test_0111001()
    {
        generateAndRecognize("(01)90012345678908(3204)012223(11)450509", "(01)90012345678908(3204)012223(11)450509");
    }

    @Test
    public void test_0111010()
    {
        generateAndRecognize("(01)90012345678908(3100)012453(13)450525", "(01)90012345678908(3100)012453(13)450525");
    }

    @Test
    public void test_0111011()
    {
        generateAndRecognize("(01)90012345678908(3201)002454(13)000229", "(01)90012345678908(3201)002454(13)000229");
    }

    @Test
    public void test_0111100()
    {
        generateAndRecognize("(01)90012345678908(3107)000453(15)991231", "(01)90012345678908(3107)000453(15)991231");
    }

    @Test
    public void test_0111101()
    {
        generateAndRecognize("(01)90012345678908(3209)012454(15)170901", "(01)90012345678908(3209)012454(15)170901");
    }

    @Test
    public void test_0111110()
    {
        generateAndRecognize("(01)90012345678908(3104)002454(17)010101", "(01)90012345678908(3104)002454(17)010101");
    }

    @Test
    public void test_0111111()
    {
        generateAndRecognize("(01)90012345678908(3204)022454(17)000229", "(01)90012345678908(3204)022454(17)000229");
    }

    //>>>>>>>> #region  Test exceptions

    @Test
    public void test_Complex_1()
    {
        generateAndRecognize("(01)90012345678908(3202)001750(18)32432", "(01)90012345678908(3202)001750(18)32432"); // encode by "1" method
    }

    @Test
    public void testBrokenAIExceptions1()
    {
        try
        {
            generateAndRecognize("", "");
        } catch (BarCodeException ex)
        {
            return;
        }
        Assert.fail("BarCodeException expected");
    }

    @Test
    public void test_BrokenAI_2()
    {
        generateAndRecognize("()240123", "()240123");
    }

    @Test
    public void test_BrokenAI_3()
    {
        generateAndRecognize("(", "(");
    }

    @Test
    public void test_BrokenAI_4()
    {
        generateAndRecognize("z)f", "z)f");
    }

    @Test
    public void test_BrokenAI_5()
    {
        generateAndRecognize("(01)24012345678905(", "(01)24012345678905(");
    }

    @Test
    public void test_BrokenAI_6()
    {
        generateAndRecognize("(())", "(())");
    }

    @Test
    public void test_BrokenAI_7()
    {
        generateAndRecognize("((E3)123)", "((E3)123)");
    }

    @Test
    public void test_BrokenAI_8()
    {
        generateAndRecognize("((33))", "((33))");
    }

    @Test
    public void test_Numbers_1()
    {
        generateAndRecognize("(01)240123", "(01)240123"); // value length must be 13 or 14
    }

    @Test
    public void test_Numbers_2()
    {
        generateAndRecognize("(01)240123X", "(01)240123X"); // only digits
    }

    @Test
    public void test_Numbers_3()
    {
        generateAndRecognize("(01)987W*63400*001", "(01)987W*63400*001"); // only digits
    }

    @Test(expectedExceptions = BarCodeException.class)
    public void test_00_Exceptions_1()
    {
        generateAndRecognize(StringExtensions.concat("(11)", (char) 237), StringExtensions.concat("(11)", (char) 237)); // incorrect char
    }

    public void test00Exceptions2()
    {
        try
        {
            generateAndRecognize("(453)0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789", ""); // incorrect length
        } catch (BarCodeException ex)
        {
            return;
        }
        Assert.fail("BarCodeException expected");
    }

    @Test
    public void test_0100_1()
    {
        generateAndRecognize("(01)80012345678901(3103)001750", "(01)80012345678901(3103)001750"); // 8 instead of 9, "1" method encodation field
    }

    @Test
    public void test_0100_2()
    {
        generateAndRecognize("(01)90012345678908(3103)032768", "(01)90012345678908(3103)032768"); // bigger than 32767
    }

    @Test
    public void test_0101_1()
    {
        generateAndRecognize("(01)80012345678901(3202)001750", "(01)80012345678901(3202)001750"); // 8 instead of 9, "1" method encodation field
    }

    @Test
    public void test_0101_2()
    {
        generateAndRecognize("(01)90012345678908(3202)010000", "(01)90012345678908(3202)010000"); // max limit
    }

    @Test
    public void test_0101_3()
    {
        generateAndRecognize("(01)90012345678908(3203)022768", "(01)90012345678908(3203)022768"); // max limit
    }

    @Test
    public void test_01100_1()
    {
        generateAndRecognize("(01)90012345678908(3926)022768", "(01)90012345678908(3926)022768"); // incorrect 3926
    }

    @Test
    public void test_01100_2()
    {
        generateAndRecognize("(01)90012345678908(3921)123456789012345678901", "(01)90012345678908(3921)123456789012345678901"); // max limit
    }

    @Test
    public void test_01101_1()
    {
        generateAndRecognize("(01)90012345678908(3936)022768", "(01)90012345678908(3936)022768"); // incorrect 3936
    }

    @Test
    public void test_01101_2()
    {
        generateAndRecognize("(01)90012345678908(3931)123456789012345678901", "(01)90012345678908(3931)123456789012345678901"); // max limit
    }

    @Test
    public void test_01_7bits_1()
    {
        generateAndRecognize("(01)90012345678908(3104)142454(17)031229", "(01)90012345678908(3104)142454(17)031229"); // max limit
    }

    @Test
    public void test_01_7bitss_2()
    {
        generateAndRecognize("(01)90012345678908(3204)212454(17)031229", "(01)90012345678908(3204)212454(17)031229"); // max limit
    }

    @Test
    public void test_01_7bits_3()
    {
        generateAndRecognize("(01)90012345678908(3204)012454(17)032229", "(01)90012345678908(3204)012454(17)032229"); // month
    }

    @Test
    public void test_01_7bit_4()
    {
        generateAndRecognize("(01)90012345678908(3204)012454(17)032255", "(01)90012345678908(3204)012454(17)032255"); // day
    }

    //<<<<<<<< #endregion

    protected void generateAndRecognize(String codetext, String resulttext)
    {
        BufferedImage bitmap = generateInMemory(codetext);
        recognizeInMemory(resulttext, bitmap);
    }

    private static BufferedImage generateInMemory(String codetext)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_EXPANDED, codetext);
        return gen.generateBarCodeImage();
    }

    private static void recognizeInMemory(String resulttext, BufferedImage bitmap)
    {
        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATABAR_EXPANDED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(resulttext, reader.getFoundBarCodes()[0].getCodeText());
    }
}

