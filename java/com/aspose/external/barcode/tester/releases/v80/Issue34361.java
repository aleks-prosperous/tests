package com.aspose.external.barcode.tester.releases.v80;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue34361
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_1_0_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\1_0.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_1_char1_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\1_char1.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_1111a11_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\1111a11.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1111a11", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_11a11_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\11a11.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("11a11", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test(enabled = false) //TODO BARCODEJAVA-1542
        //[Category("DotCode")]
    public void test_Issue34361_1AAa11a_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\1AAa11a.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1AAa11a", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_22_char1_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\22_char1.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("22", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_a_char1_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\a_char1.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("a", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_a0_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\a0.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("a", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test(enabled = false) //TODO BARCODEJAVA-1542
        //[Category("DotCode")]
    public void test_Issue34361_aa0_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\aa0.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("aa", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test(enabled = false) //TODO BARCODEJAVA-1542
        //[Category("DotCode")]
    public void test_Issue34361_aaa0_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\aaa0.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("aaa", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_aaaa0_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\aaaa0.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("aaaa", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_aaaa11_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\aaaa11.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("aaaa11", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_AAAAA_0_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\AAAAA_0.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AAAAA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_aaaaa0_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\aaaaa0.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("aaaaa", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_ab_char1_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\ab_char1.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ab", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_abc_char1_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\abc_char1.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_abcd_char1_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\abcd_char1.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcd", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_abcde_char1_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\abcde_char1.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcde", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_dotcoderotate1_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\dot-code-rotate1.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AAAAA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_dotcoderotate2_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\dot-code-rotate2.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AAAAA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_AA11_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\!AA-11.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("!AA-11;", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_1111a11_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\1111a11.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1111a11", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_11a11_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\11a11.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("11a11", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_1AAa11a_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\1AAa11a.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1AAa11a", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_22_char1_1_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\22_char1_1.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("22", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_22_char1_15_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\22_char1_15.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("22", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_aa_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\aa.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("aa", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_aaaa11_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\aaaa11.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("aaaa11", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_AAAAA_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\AAAAA.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AAAAA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_abcde_char1_1_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\abcde_char1_1.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcde", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_abcde_char1_15_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\abcde_char1_15.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcde", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_char1_1_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\char1_1.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_char1_1_011223344_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\char1_1_011223344.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("011223344", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_char1_1_0112233445566_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\char1_1_0112233445566.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0112233445566", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_char1_1_a_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\char1_1_a.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("a", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_char1_1_abcdefg_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\char1_1_abcdefg.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefg", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_char1_15_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\char1_15.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_namecity0_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\namecity0.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("name;city;", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_namecity1_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\namecity1.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("name;city;", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_namecity2_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\namecity2.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("name;city;", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_namecity3_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\namecity3.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("name;city;", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_punctuation_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\punctuation.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("!@#$%^&*()_+", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_Generator_user_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\Generator\\user.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("name;city;user@gmail.com;", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_namecity1_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\namecity1.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("name;city;", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_namecity2_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\namecity2.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("name;city;", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_namecity3_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\namecity3.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("name;city;", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_setA_char1_1_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\setA_char1_1.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_setA_char1_1_2222222_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\setA_char1_1_2222222.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2222222", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_setA_char1_1_a_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\setA_char1_1_a.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("a", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_setA_char1_1_aa_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\setA_char1_1_aa.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("aa", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_setA_char1_1_aaa_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\setA_char1_1_aaa.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("aaa", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_setA_char1_1_abcd_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\setA_char1_1_abcd.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcd", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_setA_char1_1_abcde_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\setA_char1_1_abcde.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcde", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_setA_char1_1_abcdef_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\setA_char1_1_abcdef.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdef", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_setA_char1_1_abcdefg_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\setA_char1_1_abcdefg.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefg", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_setA_char1_1_abcdefgh_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\setA_char1_1_abcdefgh.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefgh", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_setA_char1_15_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\setA_char1_15.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_setA_char1_2_011223344_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\setA_char1_2_011223344.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("011223344", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_setA_char1_2_0112233445566_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\setA_char1_2_0112233445566.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0112233445566", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_setA_char1_2_22222_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\setA_char1_2_22222.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("22222", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_setA_char1_2_2222222_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\setA_char1_2_2222222.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2222222", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_signs_0_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\signs_0.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("!@#$%^&*()_+", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test(enabled = false) //TODO BARCODEJAVA-1542
        //[Category("DotCode")]
    public void test_Issue34361_signs1_0_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\signs1_0.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("!AA-11;", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DotCode")]
    public void test_Issue34361_user_png_DotCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34361\\user.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("name;city;user@gmail.com;", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
