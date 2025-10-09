package com.aspose.external.barcode.tester;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Generated_SingleImage
{

    private String _folder = Global.getTestDataFolder("Issues");

        @BeforeMethod
    public void SetupTestFixture()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        
    public void test_Generated_Code128CodesetA_0_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetA_0.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AZ54", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetA_1_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetA_1.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AZ54", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetA_2_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetA_2.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("@#", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetA_3_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetA_3.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ZZ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetA_4_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetA_4.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1ZZ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetA_5_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetA_5.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1ZZA4", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetA_6_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetA_6.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1ZZA4AT", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetA_7_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetA_7.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1ZZA4345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetB_10_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetB_10.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A4", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetB_11_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetB_11.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("aZ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetB_12_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetB_12.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("asd4CXS", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetB_13_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetB_13.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3Xde", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetB_14_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetB_14.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("7rtj7j", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetB_15_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetB_15.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("utfn", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetB_8_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetB_8.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetB_9_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetB_9.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetC_16_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetC_16.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("00", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetC_17_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetC_17.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("012", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetC_18_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetC_18.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0202", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetC_19_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetC_19.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("02025", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetC_20_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetC_20.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("530503", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetC_21_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetC_21.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5305032", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetC_22_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetC_22.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("53026503", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetC_23_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetC_23.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("530503355", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetC_24_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetC_24.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5305034564", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetC_25_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetC_25.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("53050376478", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetC_26_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetC_26.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("530503543345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetC_27_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetC_27.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5305035433435", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128CodesetC_28_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128CodesetC_28.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("53042322469503", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_29_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_29.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("?{dEsD7|eA0", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_30_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_30.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ajnmP2a.Oc J^", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_31_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_31.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3?|OSUqh>}hL", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_32_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_32.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("&4$@~8E4X8Et", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_33_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_33.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9p8eLgA_JGo?`", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_34_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_34.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("R0,$*N_J4)3Et*", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_35_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_35.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("y+:r*S~=rCtF", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_36_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_36.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("GZdF:#=Xil?h", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_37_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_37.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\'0KDO*C9D},+$W", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_38_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_38.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("7jk!W`=&M|(*", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_39_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_39.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("R\'e5~4*x0.He", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_40_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_40.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("~d0^4gRUOO,`", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_41_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_41.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Fs:%Y=JDhg(", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_42_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_42.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("6@t?>&wJc}Q%K", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_43_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_43.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(`2K s1O)/R", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_44_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_44.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("n~i;(\'lQ.{RV\'", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_45_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_45.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Y@&}g9!`*$$KR32", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_46_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_46.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("G|Wws~$$|<s_|+", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_47_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_47.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("M,AZ7*F\'\\-M&", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_48_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_48.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("QTG.P12Za(C*)OE", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_49_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_49.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Ab}V.HqW`^&_", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_50_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_50.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("U}xj::?:ycqIo|>", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_51_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_51.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Y_a)IO;2UVAO", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_52_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_52.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("`zJGm+/d:67c", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_53_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_53.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("cWs\'>|{$sLG.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_54_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_54.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("dhx8Pv~7`ls4V(", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_55_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_55.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("`J`VMB`=?Hb}M1g", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_56_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_56.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("6a,4&=Zkc.d`!", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_57_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_57.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("4bI`uxj9Gnlx", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_58_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_58.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("?5kV(1doxih`", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_59_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_59.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("{9+6XWj.,`k2.0k", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_60_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_60.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("tjxr2(=\'Ioa,X", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_61_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_61.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(V+F#/TeW,", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_62_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_62.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2y#ovDyL!`lh", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_63_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_63.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("URy``V)kW2dQ]", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_64_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_64.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("B4Nj&uL<S(`Y\\H", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_65_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_65.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("lY9YKbD]K1e6&", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_66_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_66.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("`)3E&Q6TrSJS~_L", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_67_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_67.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Hy_}NX:v _op.S", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_68_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_68.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(")$%r~mr&1)`F", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_69_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_69.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("E|}U68Vm<Ue6", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_70_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_70.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("`M.84=`]Ua=bm", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_71_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_71.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("SrpP9r/?+#kMj", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_72_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_72.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("@+@yHWD\'[Z^9+.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_73_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_73.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TVTgAzJE#{l#H", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_74_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_74.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("o/P,80B)$Z$Cp", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_75_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_75.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("V>VL&e7$ud+}Zp", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_76_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_76.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("6$F!nYV3`9Q2/", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_77_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_77.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("51{%e]:V0v:6R", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128RandomChars_78_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128RandomChars_78.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("DN3D\\1t{~g18l", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128Shift_79_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128Shift_79.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0011AZxZxZ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128Shift_80_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128Shift_80.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0176ArTRrTrT", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128Shift_81_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128Shift_81.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("azxsCDC$#$#$", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128Shift_82_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128Shift_82.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("CXCX345678ZZAaaa", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128Shift_83_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128Shift_83.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("XZX12345aq", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128Shift_84_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128Shift_84.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("454554", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128Shift_85_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128Shift_85.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("530Taz11111", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Code128Shift_86_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Code128Shift_86.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("53kopfEWUYaz11111", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue30966_01_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue30966_01.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ALL MY STUFF 124", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue30966_02_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue30966_02.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ADBCDEZ456733TT", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue30966_03_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue30966_03.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("one thing 123 lost two 22", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue30966_04_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue30966_04.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("DM thing 123 lost two 22", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue30966_05_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue30966_05.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("DM thing 123 lost two 22", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue30966_06_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue30966_06.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue30966_07_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue30966_07.png"), DecodeType.POSTNET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("456733", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Generated_Issue30966_08_png_RM4SCC()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue30966_08.png"), DecodeType.RM_4_SCC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ADBCDEZ456733TT", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("M", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        
    public void test_Generated_Issue30966_09_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue30966_09.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ALL MY STUFF 124", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue30966_10_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue30966_10.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ADBCDEZ456733TT", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue30966_11_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue30966_11.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("one thing 123 lost two 22", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue30966_12_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue30966_12.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("DM thing 123 lost two 22", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue30966_13_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue30966_13.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("DM thing 123 lost two 22", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue30966_14_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue30966_14.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue30966_15_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue30966_15.png"), DecodeType.POSTNET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("456733", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Generated_Issue30966_16_png_RM4SCC()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue30966_16.png"), DecodeType.RM_4_SCC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ADBCDEZ456733TT", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("M", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        
    public void test_Generated_Issue33123_Good_01_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33123_Good_01.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("#################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "########################################################################", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33123_Good_02_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33123_Good_02.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("#################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "##########", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33123_Good_03_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33123_Good_03.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("#################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "##############################################################", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33123_Good_04_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33123_Good_04.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33123_Good_05_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33123_Good_05.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("#################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "########################################################################", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33123_Good_06_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33123_Good_06.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("#################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "##########", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33123_Good_07_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33123_Good_07.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("#################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "################################################################################" +
                    "##############################################################", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33123_Good_08_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33123_Good_08.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33123_Good_09_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33123_Good_09.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33123_Good_10_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33123_Good_10.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33123_Good_11_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33123_Good_11.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33123_Good_12_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33123_Good_12.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" +
                    "AAAAAAAAAAA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_BinaryMode1_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_BinaryMode1.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
        }
    }

        @Test
        
    public void test_Generated_Issue33134_BinaryMode10_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_BinaryMode10.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\"BT_SO\" | \"12971\" | \"GALAK\" | \"YURIY\" | \"61690\" | \"08/28/2011\"", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_BinaryMode3_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_BinaryMode3.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("P@d", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_BinaryMode4_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_BinaryMode4.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\u001FTr\u0016ñ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_BinaryMode5_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_BinaryMode5.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("çe\u000BaÍ\u0002", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_BinaryMode6_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_BinaryMode6.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("çeaÍ#±", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_BinaryMode8_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_BinaryMode8.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(ÐùZTAn6BZ,iÔD", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_MaxSizeNumeric1_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_MaxSizeNumeric1.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("555555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "555555555555555555555555555555555555555555555555555555555555555555555", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_MaxSizeNumeric3_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_MaxSizeNumeric3.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("555555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555555555555555555555555555555555555" +
                    "55555555555555555555555555555555555555555555555", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_MaxSizeText1_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_MaxSizeText1.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTT", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_MaxSizeText3_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_MaxSizeText3.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT" +
                    "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_Mode1_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_Mode1.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_Mode2_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_Mode2.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("984265013", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_Mode3_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_Mode3.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("000213298174000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_Mode4_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_Mode4.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789012345777888999444222", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_Mode5_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_Mode5.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("36895489608371569839451122914853172288901272668995", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_Mode6_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_Mode6.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0719564918246031298420114764552211267785960570663218115483997683965415669525786193644788991015803632", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode1_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode1.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("T", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode10_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode10.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ab22", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode11_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode11.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ab6", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode12_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode12.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("zz;", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode13_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode13.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("&#", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode14_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode14.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("&#k", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode15_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode15.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("&#kk", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode16_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode16.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("&#P", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode17_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode17.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("&#PP", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode18_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode18.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("&#]", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode19_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode19.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\nT", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode2_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode2.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TF", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode20_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode20.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\nTU", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode21_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode21.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\nfg>X", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode22_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode22.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\nfg>XX", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode23_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode23.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\nTU\rXX", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode24_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode24.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\n45<>XX", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode25_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode25.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\n89[][]QWERTY|abc@A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode26_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode26.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("qq?W+%35(X Y45@@@@@@", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode27_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode27.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("qq?WtttQ+%35(X Y45@@@@@@", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode28_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode28.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TU12@XY", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode29_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode29.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TUpp@XY", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode3_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode3.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TFabc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode30_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode30.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TUpp@P", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode31_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode31.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TF012>>,:", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode32_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode32.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("345,{}$/WE", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode33_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode33.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ZZZrs11*??*ZZ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode34_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode34.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01\r\n\r]SERT", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode4_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode4.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TF012", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode5_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode5.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TF@", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode6_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode6.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("a", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode7_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode7.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ab", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode8_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode8.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abE", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33134_TextMode9_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33134_TextMode9.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abEW", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33245_Good_0_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33245_Good_0.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ððððððððððððððððððððððððððððððððððð", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33245_Good_1_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33245_Good_1.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ðððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððððð" +
                    "ððððððððððððððððððððððððððððððððððð", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33245_Good_2_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33245_Good_2.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("000000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000000000000000000000000000000000000000000000000" +
                    "00000000000000000000000000000000000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_00_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_00.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)00012345678905(10)ABC123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_01_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_01.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)00012345678905(123)a345C", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_03_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_03.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(10)ABC", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_04_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_04.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(32022)001750(18)32432", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_05_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_05.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)24012345678905", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_06_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_06.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)24012345678905", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_07_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_07.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)98763432222109", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_08_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_08.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)83748923738749", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_09_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_09.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)09409238438882", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_10_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_10.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)00042384723861", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_11_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_11.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12372811198326", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_12_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_12.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)48098696869650", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_13_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_13.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)59438938498327", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_15_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_15.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)94859348589857", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_16_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_16.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(35)24", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_17_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_17.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(35)242", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_18_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_18.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(35)2425", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_19_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_19.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(35)24252", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_20_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_20.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(35)2425211111", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_21_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_21.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(35)24252111113", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_22_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_22.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(35)242521111144444", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_23_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_23.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(35)2425211111444447", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_24_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_24.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(12)15A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_25_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_25.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(12)15AB", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_26_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_26.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1215AB-D", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_27_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_27.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(12)15AB-1234", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_28_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_28.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(12)15AB-12345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_29_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_29.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(12)15AB-1234CC12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_30_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_30.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(12)1a", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_31_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_31.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(12)13a", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_32_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_32.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(12)13abc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_33_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_33.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(12)13abc%AT", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_34_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_34.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(12)13abc%AT123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_35_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_35.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(12)13abc%12356778", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_36_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_36.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(12)13abc%AT1231212557788", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_37_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_37.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(12)13abc%AT1231212557788---az45ER4vv", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_38_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_38.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3103)001750", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_39_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_39.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3103)001750", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_40_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_40.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90056745678908(3103)001750", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_41_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_41.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90056745678908(3103)011250", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_42_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_42.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3103)032767", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_43_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_43.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3202)001750", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_44_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_44.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3202)009999", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_45_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_45.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90056745678908(3203)001750", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_46_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_46.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90056745678908(3203)022767", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_47_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_47.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3922)001750", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_48_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_48.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3921)009999", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_49_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_49.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90056745678908(3920)11111111111", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_50_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_50.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90056745678908(3923)00", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_51_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_51.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3932)001750", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_52_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_52.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3931)009999", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_53_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_53.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90056745678908(3930)11111111111", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_54_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_54.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90056745678908(3933)002", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_55_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_55.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3107)012223(11)040101", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_56_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_56.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3204)012223(11)450509", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_57_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_57.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3100)012453(13)450525", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_58_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_58.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3201)002454(13)000229", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_59_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_59.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3107)000453(15)991231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_60_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_60.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3209)012454(15)170901", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_61_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_61.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3104)002454(17)010101", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_62_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_62.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3204)022454(17)000229", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_63_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_63.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3202)001750(18)32432", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_65_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_65.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("()240123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_66_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_66.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_67_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_67.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("z)f", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_68_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_68.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)24012345678905(", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_69_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_69.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(())", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_70_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_70.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("((E3)123)", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_71_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_71.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("((33))", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_72_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_72.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)240123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_73_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_73.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)240123X", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_74_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_74.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01987W*63400*001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_77_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_77.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)80012345678901(3103)001750", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_78_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_78.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3103)032768", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_79_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_79.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)80012345678901(3202)001750", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_80_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_80.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3202)010000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_81_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_81.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3203)022768", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_82_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_82.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3926)022768", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_83_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_83.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3921)123456789012345678901", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_84_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_84.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3936)022768", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_85_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_85.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3931)123456789012345678901", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_86_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_86.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3104)142454(17)031229", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_87_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_87.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3204)212454(17)031229", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_88_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_88.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3204)012454(17)032229", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33278_89_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33278_89.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3204)012454(17)032255", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33724_420T5H2S4_26_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33724_420T5H2S4_26.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("420T5H2S4", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33724_420T5H2S4_39_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33724_420T5H2S4_39.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("420T5H2S4", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33817_00_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33817_00.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("08110100775670992573125110711101107219211030193140420", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33817_01_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33817_01.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("08110100775670992573125110711101107219211030193140420", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33853_FNC3code128_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33853_FNC3code128.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC3>1234567", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Generated_Issue33856Barcode_png_SSCC18()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33856Barcode.png"), DecodeType.SSCC_18);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)100278158001135828", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33919_00_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33919_00.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("fABCf123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33919_01_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33919_01.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(02)04006664241007(37)1(400)7019590754", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33919_02_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33919_02.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>0204006664241007371<FNC1>4007019590754", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Generated_Issue33919_03_png_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33919_03.png"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(02)04006664241007(37)1(400)7019590754", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33987_03_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33987_03.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33987_05_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33987_05.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue33987_07_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue33987_07.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue34000_00_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34000_00.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)11235813213453(10)FIBONACCI", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue34000_01_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34000_01.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)23571113171907(22)data", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue34000_02_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34000_02.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(240)asposeBarcode", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue34000_03_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34000_03.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(10)GenerateRecognize", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue34005_00_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34005_00.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)98765432109879(10)119586718332", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue34005_01_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34005_01.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue34022_00_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34022_00.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)00012345678905(10)ABC123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue34022_01_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34022_01.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)98898765432106(3202)012345(15)311231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue34022_02_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34022_02.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)88898765432109(3202)01234515311231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue34022_03_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34022_03.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(12)651212", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue34022_04_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34022_04.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(10)ABC(12)03", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue34022_05_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34022_05.png"), DecodeType.DATABAR_EXPANDED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(10)ABC(12)03(1203)3*3*0*(", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue34121_00_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34121_00.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ff", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue34121_01_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34121_01.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("fb9b777c-4dd0-4cfe-8354-386e38d7f48b", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue34185_01234567094987654321_png_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34185_01234567094987654321.png"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567094987654321", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue34185_0123456709498765432101234_png_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34185_0123456709498765432101234.png"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456709498765432101234", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue34185_01234567094987654321012345678_png_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34185_01234567094987654321012345678.png"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567094987654321012345678", reader.getFoundBarCodes()[0].getCodeText());

        }
    }

        @Test
        
    public void test_Generated_Issue34185_0123456709498765432101234567891_png_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34185_0123456709498765432101234567891.png"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456709498765432101234567891", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Generated_Issue34185_34160265194042788110_png_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Generated/Issue34185_34160265194042788110.png"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("34160265194042788110", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
