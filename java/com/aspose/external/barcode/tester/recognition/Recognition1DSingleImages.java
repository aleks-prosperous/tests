package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.*;
import utils.TestExternalHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recognition1DSingleImages
{

    private String _folder;

    @BeforeMethod
    public void SetupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Recognition\\1D\\");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void Test_EAN8_ean8_barcode_label_jpg_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN8\\ean8_barcode_label.jpg"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("50123452", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_Code11_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\Code11.png"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCE")]
    public void test_UPCE_UPCE_gif_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCE\\UPC-E.gif"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("05623365", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("VIN")]
    public void test_VIN_barcode_gif_VIN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "VIN\\barcode.gif"), DecodeType.VIN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IGFJG5489U54IJG59G", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISSN")]
    public void test_ISSN_iwinsoft_gif_ISSN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISSN\\iwinsoft.gif"), DecodeType.ISSN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9781234567897", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Matrix2of5")]
    public void test_Matrix2of5_Matrix6_gif_Matrix2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Matrix2of5\\Matrix6.gif"), DecodeType.MATRIX_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("46743788", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_Standard2of5_CodeStandard2Of5_png_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Standard2of5\\CodeStandard2Of5.png"), DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234565", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISMN")]
    public void test_ISMN_xismn_gif_ISMN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISMN\\x-ismn.gif"), DecodeType.ISMN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9780123456786", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard_Code39Extended")]
    public void test_Code39_wiz_png_Code39Standard_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code39\\wiz.png"), DecodeType.scanSets(DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234C", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128_barcode_i_am_not_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128\\barcode_i_am_not.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("I AM NOT A NUMBER", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose1_png_AustralianPosteParcel()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose1.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99700160777123456701021502000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose2_png_AustralianPosteParcel()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose2.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99700160ZSW123456708943302066", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose3_png_AustralianPosteParcel()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose3.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99700160123837403858943302066", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose4_png_AustralianPosteParcel()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose4.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99700160123409605459569603233", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose5_png_AustralianPosteParcel()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose5.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99753850AAA564568468430801133", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose6_png_AustralianPosteParcel()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose6.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99753850BBB534389838389201133", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose7_png_AustralianPosteParcel()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose7.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99743350999534344448389205453", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_bax_png_AustralianPosteParcel()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\bax.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99700160ER6123456701021502111", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_barcode_jpg_AustralianPosteParcel()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\barcode.jpg"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99700160AWV000018401021501234", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose1_png_AustralianPosteParcel2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose1.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99700160777123456701021502000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose2_png_AustralianPosteParcel2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose2.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99700160ZSW123456708943302066", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose3_png_AustralianPosteParcel2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose3.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99700160123837403858943302066", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose4_png_AustralianPosteParcel2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose4.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99700160123409605459569603233", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose5_png_AustralianPosteParcel2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose5.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99753850AAA564568468430801133", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose6_png_AustralianPosteParcel2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose6.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99753850BBB534389838389201133", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose7_png_AustralianPosteParcel2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose7.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99743350999534344448389205453", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_bax_png_AustralianPosteParcel2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\bax.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99700160ER6123456701021502111", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_barcode_jpg_AustralianPosteParcel2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\barcode.jpg"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99700160AWV000018401021501234", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose1_png_AustralianPosteParcel3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose1.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99700160777123456701021502000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose2_png_AustralianPosteParcel3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose2.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99700160ZSW123456708943302066", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose3_png_AustralianPosteParcel3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose3.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99700160123837403858943302066", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose4_png_AustralianPosteParcel3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose4.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99700160123409605459569603233", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose5_png_AustralianPosteParcel3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose5.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99753850AAA564568468430801133", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose6_png_AustralianPosteParcel3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose6.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99753850BBB534389838389201133", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_aspose7_png_AustralianPosteParcel3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\aspose7.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99743350999534344448389205453", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_bax_png_AustralianPosteParcel3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\bax.png"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99700160ER6123456701021502111", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustralianPosteParcel")]
    public void test_AustralianPosteParcel_barcode_jpg_AustralianPosteParcel3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustralianPosteParcel\\barcode.jpg"), DecodeType.AUSTRALIAN_POSTE_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("99700160AWV000018401021501234", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_CD_gif_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\CD.gif"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("31117013206375", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabarXZ_gif_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabarXZ.gif"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10000000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabarZZZZZ_gif_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabarZZZZZ.gif"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3419500", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabar115_gif_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabar115.gif"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01-235+12", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabar123_jpg_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabar123.jpg"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabar_jpg_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabar.jpg"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_barcodeimage_gif_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\barcode-image.gif"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2030405060", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_asposeCodabar1_png_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\asposeCodabar1.png"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("6829443", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabar_png_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabar.png"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12344", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabar__3_png_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabar__3.png"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678$", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_CD_gif_Codabar2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\CD.gif"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("31117013206375", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabarXZ_gif_Codabar2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabarXZ.gif"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10000000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabarZZZZZ_gif_Codabar2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabarZZZZZ.gif"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3419500", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabar115_gif_Codabar2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabar115.gif"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01-235+12", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabar123_jpg_Codabar2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabar123.jpg"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabar_jpg_Codabar2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabar.jpg"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_barcodeimage_gif_Codabar2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\barcode-image.gif"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2030405060", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_asposeCodabar1_png_Codabar2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\asposeCodabar1.png"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("6829443", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabar_png_Codabar2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabar.png"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12344", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabar__3_png_Codabar2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabar__3.png"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678$", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_CD_gif_Codabar3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\CD.gif"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("31117013206375", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabarXZ_gif_Codabar3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabarXZ.gif"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10000000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabarZZZZZ_gif_Codabar3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabarZZZZZ.gif"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3419500", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabar115_gif_Codabar3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabar115.gif"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01-235+12", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabar123_jpg_Codabar3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabar123.jpg"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabar_jpg_Codabar3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabar.jpg"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_barcodeimage_gif_Codabar3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\barcode-image.gif"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2030405060", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_asposeCodabar1_png_Codabar3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\asposeCodabar1.png"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("6829443", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabar_png_Codabar3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabar.png"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12344", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_codabar__3_png_Codabar3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar\\codabar__3.png"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678$", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_code11_1234567890_gif_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\code11_1234567890.gif"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_asposeCode111_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\asposeCode111.png"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("6829443", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_asposeCode112_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\asposeCode112.png"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("111", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_asposeCode113_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\asposeCode113.png"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("87867", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_asposeCode114_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\asposeCode114.png"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("00067675", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_asposeCode115_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\asposeCode115.png"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("098333345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_asposeCode116_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\asposeCode116.png"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("8978555", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_asposeCode117_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\asposeCode117.png"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("843777009", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_Code11A_bmp_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\Code11-A.bmp"), DecodeType.CODE_11);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("02340678905", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_code11_bmp_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\code11.bmp"), DecodeType.CODE_11);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789015", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_c11comp_GIF_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\c11comp.GIF"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("9", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_code11_gif_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\code11.gif"), DecodeType.CODE_11);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567890", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_code111_gif_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\code11 (1).gif"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("9", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_S_Code11_gif_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\S_Code11.gif"), DecodeType.CODE_11);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_QR_Intro_Code11_Sample_jpg_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\QR_Intro_Code11_Sample.jpg"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("654321", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_barcode123456789019_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\barcode123456789019.png"), DecodeType.CODE_11);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789019", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_code111_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\code11 (1).png"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("124578", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_Code11_barcode_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\Code11_barcode.png"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("012345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_ean128_non_standard_sample_96dpi_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\ean128_non_standard_sample_96dpi.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>810105432112002112345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_barcode_uccean128_gif_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\barcode.uccean128.gif"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>3202000150", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_gs1128_parameter_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\gs1128_parameter.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>01128", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_EAN128_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\EAN128.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>00100380001228681668", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_0460100302003_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\0460100302003.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>019061414100041815991230", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_EAN128Barcode_gif_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\EAN-128-Barcode.gif"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>4001382786<FNC1>9712920000000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_asposeEAN1281_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\asposeEAN1281.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>IT\'S ONLY TEST", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_asposeEAN1282_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\asposeEAN1282.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>5544332211 Right", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_ean128_non_standard_sample_96dpi_png_Code1282()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\ean128_non_standard_sample_96dpi.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>810105432112002112345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_barcode_uccean128_gif_Code1282()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\barcode.uccean128.gif"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>3202000150", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_gs1128_parameter_png_Code1282()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\gs1128_parameter.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>01128", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_EAN128_jpg_Code1282()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\EAN128.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>00100380001228681668", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_0460100302003_png_Code1282()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\0460100302003.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>019061414100041815991230", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_EAN128Barcode_gif_Code1282()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\EAN-128-Barcode.gif"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>4001382786<FNC1>9712920000000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_asposeEAN1281_png_Code1282()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\asposeEAN1281.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>IT\'S ONLY TEST", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_asposeEAN1282_png_Code1282()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\asposeEAN1282.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>5544332211 Right", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_ean128_non_standard_sample_96dpi_png_Code1283()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\ean128_non_standard_sample_96dpi.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>810105432112002112345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_barcode_uccean128_gif_Code1283()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\barcode.uccean128.gif"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>3202000150", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_gs1128_parameter_png_Code1283()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\gs1128_parameter.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>01128", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_EAN128_jpg_Code1283()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\EAN128.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>00100380001228681668", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_0460100302003_png_Code1283()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\0460100302003.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>019061414100041815991230", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_EAN128Barcode_gif_Code1283()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\EAN-128-Barcode.gif"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>4001382786<FNC1>9712920000000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_asposeEAN1281_png_Code1283()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\asposeEAN1281.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>IT\'S ONLY TEST", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128FNC_asposeEAN1282_png_Code1283()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128FNC\\asposeEAN1282.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>5544332211 Right", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128_Code128_Right_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128\\Code128_Right.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("BARCODE", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128_BarcodeCode128Small_gif_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128\\BarcodeCode128Small.gif"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345 Part#356", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128_serial_barcode_normal_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128\\serial_barcode_normal.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("PGD5WK", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128_barcode_sample_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128\\barcode_sample.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("177326014300796", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128_bccode128_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128\\bc-code128.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678901234", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128_asposeCode1281_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128\\asposeCode1281.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Night. Street. Lamp.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128_Code128Bar_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128\\Code128Bar.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("102030405060708090", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128_Code128_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128\\Code128.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>BARCODE12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128_whatiscode128barcode_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128\\what-is-code-128-barcode.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AMLABELS12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128_Code128FontTool_gif_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128\\Code128-Font-Tool.gif"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128_bcspec128ex_gif_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128\\bcspec128ex.gif"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128_mzl_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128\\mzl.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("13700161000002703182204000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostIdentcode")]
    public void test_DeutschePostIdentcode_AE_gif_DeutschePostIdentcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostIdentcode\\AE.gif"), DecodeType.DEUTSCHE_POST_IDENTCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789016", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostIdentcode")]
    public void test_DeutschePostIdentcode_DeutschePostIdentcode02_gif_DeutschePostIdentcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostIdentcode\\DeutschePostIdentcode02.gif"), DecodeType.DEUTSCHE_POST_IDENTCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("564000000050", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostIdentcode")]
    public void test_DeutschePostIdentcode_asposeDPIC1_png_DeutschePostIdentcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostIdentcode\\asposeDPIC1.png"), DecodeType.DEUTSCHE_POST_IDENTCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789117", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostIdentcode")]
    public void test_DeutschePostIdentcode_asposeDPIC2_png_DeutschePostIdentcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostIdentcode\\asposeDPIC2.png"), DecodeType.DEUTSCHE_POST_IDENTCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("358834747548", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostIdentcode")]
    public void test_DeutschePostIdentcode_asposeDPIC3_png_DeutschePostIdentcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostIdentcode\\asposeDPIC3.png"), DecodeType.DEUTSCHE_POST_IDENTCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("567650333851", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostIdentcode")]
    public void test_DeutschePostIdentcode_asposeDPIC4_png_DeutschePostIdentcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostIdentcode\\asposeDPIC4.png"), DecodeType.DEUTSCHE_POST_IDENTCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("459082102786", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostIdentcode")]
    public void test_DeutschePostIdentcode_asposeDPIC5_png_DeutschePostIdentcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostIdentcode\\asposeDPIC5.png"), DecodeType.DEUTSCHE_POST_IDENTCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("878760333831", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostIdentcode")]
    public void test_DeutschePostIdentcode_asposeDPIC6_png_DeutschePostIdentcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostIdentcode\\asposeDPIC6.png"), DecodeType.DEUTSCHE_POST_IDENTCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("004873447445", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostIdentcode")]
    public void test_DeutschePostIdentcode_asposeDPIC7_png_DeutschePostIdentcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostIdentcode\\asposeDPIC7.png"), DecodeType.DEUTSCHE_POST_IDENTCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("098040747447", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostIdentcode")]
    public void test_DeutschePostIdentcode_asposeDPIC8_png_DeutschePostIdentcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostIdentcode\\asposeDPIC8.png"), DecodeType.DEUTSCHE_POST_IDENTCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("676876434551", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostLeitcode")]
    public void test_DeutschePostLeitcode_DeutschePostLeitcode02_gif_DeutschePostLeitcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostLeitcode\\DeutschePostLeitcode02.gif"), DecodeType.DEUTSCHE_POST_LEITCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("81739083002001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostLeitcode")]
    public void test_DeutschePostLeitcode_asposeDPLC1_png_DeutschePostLeitcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostLeitcode\\asposeDPLC1.png"), DecodeType.DEUTSCHE_POST_LEITCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("09476467437642", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostLeitcode")]
    public void test_DeutschePostLeitcode_asposeDPLC2_png_DeutschePostLeitcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostLeitcode\\asposeDPLC2.png"), DecodeType.DEUTSCHE_POST_LEITCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("83495349839049", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostLeitcode")]
    public void test_DeutschePostLeitcode_asposeDPLC3_png_DeutschePostLeitcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostLeitcode\\asposeDPLC3.png"), DecodeType.DEUTSCHE_POST_LEITCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("49349049328549", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostLeitcode")]
    public void test_DeutschePostLeitcode_asposeDPLC4_png_DeutschePostLeitcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostLeitcode\\asposeDPLC4.png"), DecodeType.DEUTSCHE_POST_LEITCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("90480534345487", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostLeitcode")]
    public void test_DeutschePostLeitcode_asposeDPLC5_png_DeutschePostLeitcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostLeitcode\\asposeDPLC5.png"), DecodeType.DEUTSCHE_POST_LEITCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("34098540373679", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostLeitcode")]
    public void test_DeutschePostLeitcode_asposeDPLC6_png_DeutschePostLeitcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostLeitcode\\asposeDPLC6.png"), DecodeType.DEUTSCHE_POST_LEITCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("45960596083381", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostLeitcode")]
    public void test_DeutschePostLeitcode_asposeDPLC7_png_DeutschePostLeitcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostLeitcode\\asposeDPLC7.png"), DecodeType.DEUTSCHE_POST_LEITCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("11854354937369", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostLeitcode")]
    public void test_DeutschePostLeitcode_asposeDPLC8_png_DeutschePostLeitcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostLeitcode\\asposeDPLC8.png"), DecodeType.DEUTSCHE_POST_LEITCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("09454800466438", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostLeitcode")]
    public void test_DeutschePostLeitcode_images_jpg_DeutschePostLeitcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostLeitcode\\images.jpg"), DecodeType.DEUTSCHE_POST_LEITCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678901236", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_EAN8_Barcode5_png_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN8\\Bar-code5.png"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("20123451", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_EAN8_ean8barcodesourcecode_gif_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN8\\ean8-barcode-source-code.gif"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("54490109", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_EAN8_EAN8_50184385_jpg_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN8\\EAN8_50184385.jpg"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("50184385", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_EAN8_ceu02b_gif_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN8\\ceu02b.gif"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("80674313", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_EAN8_barcode_ean8_jpg_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN8\\barcode_ean8.jpg"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("50487066", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_EAN8_ean81_gif_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN8\\ean8-1.gif"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("55123457", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_EAN8_ean8___123_gif_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN8\\ean8___123.gif"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345670", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_EAN8_ean8_jpg_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN8\\ean8.jpg"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("81296538", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_EAN8_EAN8CCB_gif_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN8\\EAN-8-CC-B.gif"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("20123451", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_EAN13_asposeEAN131_png_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN13\\asposeEAN131.png"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("7845210000005", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_EAN13_asposeEAN132_png_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN13\\asposeEAN132.png"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234560000005", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_EAN13_registraciya_jpg_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN13\\registraciya.jpg"), DecodeType.EAN_13);
        {
            //single barcode is split on two by inscription
            Map<String, String> lResDic = new HashMap<String, String>();
            for(BarCodeResult result : reader.readBarCodes())
            {
                if (lResDic.containsKey(result.getCodeText())) continue;
                lResDic.put(result.getCodeText(), result.getCodeText());
            }

            Assert.assertEquals(lResDic.values().size(), 1);
            Assert.assertTrue(lResDic.containsKey("1010101010104"));
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_EAN13_ean13_barcode_sample_jpg_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN13\\ean13_barcode_sample.jpg"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9310779300005", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_EAN13_symbols_ean13_gif_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN13\\symbols_ean13.gif"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5012345678900", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_EAN13_EAN13Barcode_jpg_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN13\\EAN13Barcode.jpg"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9789069744063", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_EAN13_ean13barcodesourcecode_gif_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN13\\ean13-barcode-source-code.gif"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5012345678900", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_EAN13_barcode_ean13_jpg_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN13\\barcode_ean13.jpg"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5000204892734", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN14")]
    public void test_EAN14_ean1286_jpg_EAN14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN14\\ean128-6.jpg"), DecodeType.EAN_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01) 3 08 01234 99999 0", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN14")]
    public void test_EAN14_ean14_gif_EAN14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN14\\ean14.gif"), DecodeType.EAN_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345678901231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN14")]
    public void test_EAN14_ean14_png_EAN14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN14\\ean14.png"), DecodeType.EAN_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)05001234567890", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN14")]
    public void test_EAN14_ean14_2_png_EAN14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN14\\ean14_2.png"), DecodeType.EAN_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)12345678901235", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN14")]
    public void test_EAN14_ean14a_png_EAN14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN14\\ean14a.png"), DecodeType.EAN_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)04601234567893", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN14")]
    public void test_EAN14_dun14_gif_EAN14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN14\\dun-14.gif"), DecodeType.EAN_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345678901231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN14")]
    public void test_EAN14_page25_1_gif_EAN14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN14\\page25_1.gif"), DecodeType.EAN_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345678901231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN14")]
    public void test_EAN14_asposeEAN141_png_EAN14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN14\\asposeEAN141.png"), DecodeType.EAN_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(3564)567000(00)00008", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN14")]
    public void test_EAN14_asposeEAN142_png_EAN14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN14\\asposeEAN142.png"), DecodeType.EAN_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345600000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN14")]
    public void test_EAN14_ean14_3_png_EAN14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN14\\ean14_3.png"), DecodeType.EAN_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)33893600009188", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_aspose1_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128\\aspose1.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("f01084269505116011713102710312044-016", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_aspose2_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128\\aspose2.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("f3142123456240312044-0161", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_aspose3_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128\\aspose3.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("f70011234567890123f4001234f391112345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_aspose4_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128\\aspose4.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("f3103456789101", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_aspose5_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128\\aspose5.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("f25312345678901234567f20333712345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_aspose6_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128\\aspose6.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("f9221345390233f15112345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_clip_image0025_thumb1_jpg_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128\\clip_image0025_thumb1.jpg"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)007141415555555557", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_diagram_sscc18_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128\\diagram_sscc18.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)001234560000000018", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_ean128_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128\\ean128.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(8002)123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_GS11281_gif_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128\\GS1-128(1).gif"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)106141410123456786", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_gs1128_jpg_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128\\gs1-128.jpg"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)123456789012345675", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_gs1128Extended_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128\\gs1-128Extended.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(8101)0678900799", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_code128gs1_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128\\code-128-gs1.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)95012345678903(3103)000123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_1_GS1128_structure_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128\\1_GS1-128_structure.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)350123451234567894", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_220pxGs1128_example_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128\\220px-Gs1-128_example.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)95012345678903(3103)000123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("IATA2of5")]
    public void test_IATA2of5_asposeIATA2of51_png_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "IATA2of5\\asposeIATA2of51.png"), DecodeType.IATA_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("456784", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("IATA2of5")]
    public void test_IATA2of5_asposeIATA2of52_png_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "IATA2of5\\asposeIATA2of52.png"), DecodeType.IATA_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("7567681", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("IATA2of5")]
    public void test_IATA2of5_asposeIATA2of53_png_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "IATA2of5\\asposeIATA2of53.png"), DecodeType.IATA_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("77879089098091", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("IATA2of5")]
    public void test_IATA2of5_asposeIATA2of54_png_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "IATA2of5\\asposeIATA2of54.png"), DecodeType.IATA_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("77453", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("IATA2of5")]
    public void test_IATA2of5_asposeIATA2of55_png_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "IATA2of5\\asposeIATA2of55.png"), DecodeType.IATA_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1118889", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("IATA2of5")]
    public void test_IATA2of5_asposeIATA2of56_png_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "IATA2of5\\asposeIATA2of56.png"), DecodeType.IATA_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("777890043225", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("IATA2of5")]
    public void test_IATA2of5_IATA2of5_gif_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "IATA2of5\\IATA2of5.gif"), DecodeType.IATA_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678905", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("IATA2of5")]
    public void test_IATA2of5_iata2of5_jpg_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "IATA2of5\\iata2of5.jpg"), DecodeType.IATA_2_OF_5);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("IATA2of5")]
    public void test_IATA2of5_iata_bmp_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "IATA2of5\\iata.bmp"), DecodeType.IATA_2_OF_5);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("IATA2of5")]
    public void test_IATA2of5_iata_1_png_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "IATA2of5\\iata_1.png"), DecodeType.IATA_2_OF_5);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_Interleaved2of5_I2of5Toolssample_gif_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Interleaved2of5\\I2of5Tools-sample.gif"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0340098126", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_Interleaved2of5_tim_png_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Interleaved2of5\\tim.png"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0000000050009219", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_Interleaved2of5_42_as_Interleaved_jpg_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Interleaved2of5\\42_as_Interleaved.jpg"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("42", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_Interleaved2of5_2of5_gif_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Interleaved2of5\\2of5.gif"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("101215344505", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_Interleaved2of5_itfil_gif_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Interleaved2of5\\itfil.gif"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("05012345678900", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_Interleaved2of5_i2of5word_jpg_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Interleaved2of5\\i2of5word.jpg"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("02342342323424", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_Interleaved2of5_I2of5_gif_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Interleaved2of5\\I2of5.gif"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("080904", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_Interleaved2of5_article_png_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Interleaved2of5\\article.png"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("074066", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_Interleaved2of5_I2of5Toolswizard_gif_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Interleaved2of5\\I2of5Tools-wizard.gif"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2063419500", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_Interleaved2of5_interleaved_2_of_5_gif_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Interleaved2of5\\interleaved_2_of_5.gif"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789012345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_Interleaved2of5_220px_png_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Interleaved2of5\\220px.png"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("602003", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISBN")]
    public void test_ISBN_barcodeimage_gif_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISBN\\barcode-image.gif"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9780735621534", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISBN")]
    public void test_ISBN__Bookland_gif_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISBN\\_Bookland.gif"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9781234567897", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISBN")]
    public void test_ISBN_screenshot_3_png_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISBN\\screenshot_3.png"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9780000000002", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISBN")]
    public void test_ISBN_barcode_bookland_png_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISBN\\barcode_bookland.png"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9780486639260", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISBN")]
    public void test_ISBN_image5_24_png_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISBN\\image5_24.png"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9781234567897", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISBN")]
    public void test_ISBN_text_jpg_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISBN\\text.jpg"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9781234567002", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISBN")]
    public void test_ISBN_isbn_png_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISBN\\isbn.png"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9781234567897", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISBN")]
    public void test_ISBN_przyklad1_gif_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISBN\\przyklad1.gif"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9788301013738", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISBN")]
    public void test_ISBN_bookland_ex2_png_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISBN\\bookland_ex2.png"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9781862073050", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISBN")]
    public void test_ISBN_barcode_jpg_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISBN\\barcode.jpg"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9780835200004", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISMN")]
    public void test_ISMN_ismn_barcode_jpg_ISMN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISMN\\ismn_barcode.jpg"), DecodeType.ISMN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9790123456785", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISMN")]
    public void test_ISMN_ean13ismn_gif_ISMN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISMN\\ean13ismn.gif"), DecodeType.ISMN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9790260000438", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISMN")]
    public void test_ISMN_ean13ismn1_gif_ISMN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISMN\\ean13ismn1.gif"), DecodeType.ISMN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9790260000438", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISMN")]
    public void test_ISMN_ISMN300x159_jpg_ISMN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISMN\\ISMN-300x159.jpg"), DecodeType.ISMN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9790123456785", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISMN")]
    public void test_ISMN_ismnbarcode_png_ISMN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISMN\\ismn-barcode.png"), DecodeType.ISMN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9790000001213", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISMN")]
    public void test_ISMN_ismn_gif_ISMN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISMN\\ismn.gif"), DecodeType.ISMN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9790345246805", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISMN")]
    public void test_ISMN_ismn_1_png_ISMN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISMN\\ismn_1.png"), DecodeType.ISMN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9790345246805", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISMN")]
    public void test_ISMN_ismn_barcode_png_ISMN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISMN\\ismn_barcode.png"), DecodeType.ISMN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9790260000438", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISSN")]
    public void test_ISSN_issn_987654321_gif_ISSN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISSN\\issn_987654321.gif"), DecodeType.ISSN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("98765434", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISSN")]
    public void test_ISSN_issn_22_gif_ISSN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISSN\\issn_22.gif"), DecodeType.ISSN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345679", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISSN")]
    public void test_ISSN_issn_eg1_png_ISSN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISSN\\issn_eg1.png"), DecodeType.ISSN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345679", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISSN")]
    public void test_ISSN_issn_barcode_png_ISSN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISSN\\issn_barcode.png"), DecodeType.ISSN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("03178471", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISSN")]
    public void test_ISSN_capture_jpg_ISSN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISSN\\capture.jpg"), DecodeType.ISSN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1144875X", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISSN")]
    public void test_ISSN_issn_sup2_gif_ISSN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISSN\\issn_sup2.gif"), DecodeType.ISSN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("56996330", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISSN")]
    public void test_ISSN_ISSN2222_gif_ISSN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISSN\\ISSN2222.gif"), DecodeType.ISSN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01235672", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISSN")]
    public void test_ISSN_Issnbarcodeexplained_png_ISSN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISSN\\Issn-barcode-explained.png"), DecodeType.ISSN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("20493630", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISSN")]
    public void test_ISSN_Barcode_sm_png_ISSN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISSN\\Barcode_sm.png"), DecodeType.ISSN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("08674566", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ItalianPost25")]
    public void test_ItalianPost2of5_ItalianPost25_gif_ItalianPost25()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ItalianPost2of5\\ItalianPost25.gif"), DecodeType.ITALIAN_POST_25);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("126523258710", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ItalianPost25")]
    public void test_ItalianPost2of5_asposeITPost2of51_png_ItalianPost25()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ItalianPost2of5\\asposeITPost2of51.png"), DecodeType.ITALIAN_POST_25);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("011112", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ItalianPost25")]
    public void test_ItalianPost2of5_asposeITPost2of52_png_ItalianPost25()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ItalianPost2of5\\asposeITPost2of52.png"), DecodeType.ITALIAN_POST_25);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("022224", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ItalianPost25")]
    public void test_ItalianPost2of5_asposeITPost2of53_png_ItalianPost25()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ItalianPost2of5\\asposeITPost2of53.png"), DecodeType.ITALIAN_POST_25);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("033336", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ItalianPost25")]
    public void test_ItalianPost2of5_asposeITPost2of54_png_ItalianPost25()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ItalianPost2of5\\asposeITPost2of54.png"), DecodeType.ITALIAN_POST_25);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("4575676769", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ItalianPost25")]
    public void test_ItalianPost2of5_asposeITPost2of55_png_ItalianPost25()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ItalianPost2of5\\asposeITPost2of55.png"), DecodeType.ITALIAN_POST_25);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9789784446", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ItalianPost25")]
    public void test_ItalianPost2of5_asposeITPost2of56_png_ItalianPost25()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ItalianPost2of5\\asposeITPost2of56.png"), DecodeType.ITALIAN_POST_25);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0066557906", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ItalianPost25")]
    public void test_ItalianPost2of5_asposeITPost2of57_png_ItalianPost25()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ItalianPost2of5\\asposeITPost2of57.png"), DecodeType.ITALIAN_POST_25);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1212145558", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ItalianPost25")]
    public void test_ItalianPost2of5_asposeITPost2of58_png_ItalianPost25()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ItalianPost2of5\\asposeITPost2of58.png"), DecodeType.ITALIAN_POST_25);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("7889784441", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ItalianPost25")]
    public void test_ItalianPost2of5_asposeITPost2of59_png_ItalianPost25()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ItalianPost2of5\\asposeITPost2of59.png"), DecodeType.ITALIAN_POST_25);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("009900442118", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_ITF14_332_itfsize_gif_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF14\\332_itfsize.gif"), DecodeType.ITF_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("19312345678904", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_ITF14_barcodelibitf14_png_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF14\\barcodelib-itf14.png"), DecodeType.ITF_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("30112345000018", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_ITF14_barcodingimage_jpg_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF14\\barcodingimage.jpg"), DecodeType.ITF_14);
        {
            //1 barcode split on 2
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());
            TestExternalHelper.contains("29400550605963", lCodetexts);
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_ITF14_asposeITF141_png_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF14\\asposeITF141.png"), DecodeType.ITF_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("35454500000002", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_ITF14_diagram_gtin_fam_png_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF14\\diagram_gtin_fam.png"), DecodeType.ITF_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("00012345600012", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_ITF14_ITF14Symbology_jpg_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF14\\ITF-14-Symbology.jpg"), DecodeType.ITF_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("00012345678905", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_ITF14_itf14_gif_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF14\\itf14.gif"), DecodeType.ITF_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("05012345678900", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_ITF14_itf14_2_gif_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF14\\itf14_2.gif"), DecodeType.ITF_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("89057729232561", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_ITF14_638739955_jpg_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF14\\638739955.jpg"), DecodeType.ITF_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("11010101010101", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_ITF14_bar25eg_png_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF14\\bar25eg.png"), DecodeType.ITF_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("00712345678904", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF6")]
    public void test_ITF6_image5_33_png_ITF6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF6\\image5_33.png"), DecodeType.ITF_6);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF6")]
    public void test_ITF6_itf6only_png_ITF6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF6\\itf6only.png"), DecodeType.ITF_6);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123457", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF6")]
    public void test_ITF6_itf6_gif_ITF6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF6\\itf6.gif"), DecodeType.ITF_6);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF6")]
    public void test_ITF6_itf62_gif_ITF6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF6\\itf62.gif"), DecodeType.ITF_6);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123457", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF6")]
    public void test_ITF6_asposeITF61_png_ITF6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF6\\asposeITF61.png"), DecodeType.ITF_6);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF6")]
    public void test_ITF6_asposeITF62_png_ITF6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF6\\asposeITF62.png"), DecodeType.ITF_6);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("125545", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF6")]
    public void test_ITF6_asposeITF63_png_ITF6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF6\\asposeITF63.png"), DecodeType.ITF_6);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("100000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF6")]
    public void test_ITF6_asposeITF64_png_ITF6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF6\\asposeITF64.png"), DecodeType.ITF_6);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("653950", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF6")]
    public void test_ITF6_asposeITF65_png_ITF6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF6\\asposeITF65.png"), DecodeType.ITF_6);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("195000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF6")]
    public void test_ITF6_asposeITF66_png_ITF6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF6\\asposeITF66.png"), DecodeType.ITF_6);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("644995", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Matrix2of5")]
    public void test_Matrix2of5_Matrix2of5_gif_Matrix2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Matrix2of5\\Matrix2of5.gif"), DecodeType.MATRIX_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567895", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Matrix2of5")]
    public void test_Matrix2of5_mat_png_Matrix2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Matrix2of5\\mat.png"), DecodeType.MATRIX_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234565", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Matrix2of5")]
    public void test_Matrix2of5_asposeMatrix2of51_png_Matrix2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Matrix2of5\\asposeMatrix2of51.png"), DecodeType.MATRIX_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("111", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Matrix2of5")]
    public void test_Matrix2of5_asposeMatrix2of52_png_Matrix2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Matrix2of5\\asposeMatrix2of52.png"), DecodeType.MATRIX_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("222", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Matrix2of5")]
    public void test_Matrix2of5_asposeMatrix2of53_png_Matrix2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Matrix2of5\\asposeMatrix2of53.png"), DecodeType.MATRIX_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("333", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Matrix2of5")]
    public void test_Matrix2of5_asposeMatrix2of54_png_Matrix2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Matrix2of5\\asposeMatrix2of54.png"), DecodeType.MATRIX_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("76758434797", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Matrix2of5")]
    public void test_Matrix2of5_asposeMatrix2of55_png_Matrix2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Matrix2of5\\asposeMatrix2of55.png"), DecodeType.MATRIX_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("098083453", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Matrix2of5")]
    public void test_Matrix2of5_asposeMatrix2of56_png_Matrix2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Matrix2of5\\asposeMatrix2of56.png"), DecodeType.MATRIX_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5589", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MSI")]
    public void test_MSI_images_jpg_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MSI\\images.jpg"), DecodeType.MSI);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("20461", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MSI")]
    public void test_MSI_MSI_jpg_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MSI\\MSI.jpg"), DecodeType.MSI);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456782", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MSI")]
    public void test_MSI_msi_1_png_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MSI\\msi_1.png"), DecodeType.MSI);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123414", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MSI")]
    public void test_MSI_msi_intro_gif_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MSI\\msi_intro.gif"), DecodeType.MSI);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("20461", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MSI")]
    public void test_MSI_test_png_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MSI\\test.png"), DecodeType.MSI);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345674", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MSI")]
    public void test_MSI_test2_png_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MSI\\test2.png"), DecodeType.MSI);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("895447332", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MSI")]
    public void test_MSI_msi_3_gif_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MSI\\msi_3.gif"), DecodeType.MSI);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("80523", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MSI")]
    public void test_MSI_MSI300x117_jpg_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MSI\\MSI-300x117.jpg"), DecodeType.MSI);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456782", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MSI")]
    public void test_MSI_msiplessey_jpg_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MSI\\msiplessey.jpg"), DecodeType.MSI);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456782", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MSI")]
    public void test_MSI_box_AZMP_gif_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MSI\\box_AZMP.gif"), DecodeType.MSI);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3400", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SCC14")]
    public void test_SCC14_page25_1_gif_SCC14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SCC14\\page25_1.gif"), DecodeType.SCC_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345678901231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SCC14")]
    public void test_SCC14_scc14_gif_SCC14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SCC14\\scc14.gif"), DecodeType.SCC_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)00012345678905", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SCC14")]
    public void test_SCC14_dun14_gif_SCC14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SCC14\\dun-14.gif"), DecodeType.SCC_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345678901231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SCC14")]
    public void test_SCC14_asposeSCC141_png_SCC14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SCC14\\asposeSCC141.png"), DecodeType.SCC_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)60483038300007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SCC14")]
    public void test_SCC14_asposeSCC142_png_SCC14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SCC14\\asposeSCC142.png"), DecodeType.SCC_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)67878989865553", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SCC14")]
    public void test_SCC14_asposeSCC143_png_SCC14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SCC14\\asposeSCC143.png"), DecodeType.SCC_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)11133545450002", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SCC14")]
    public void test_SCC14_asposeSCC144_png_SCC14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SCC14\\asposeSCC144.png"), DecodeType.SCC_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)89879433300004", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SCC14")]
    public void test_SCC14_asposeSCC145_png_SCC14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SCC14\\asposeSCC145.png"), DecodeType.SCC_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)67879454323349", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SCC14")]
    public void test_SCC14_ean1286_jpg_SCC14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SCC14\\ean128-6.jpg"), DecodeType.SCC_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01) 3 08 01234 99999 0", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SCC14")]
    public void test_SCC14_scc14_test_gif_SCC14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SCC14\\scc14_test.gif"), DecodeType.SCC_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)71234567890134", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SSCC18")]
    public void test_SSCC18_SSCC18_png_SSCC18()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SSCC18\\SSCC18.png"), DecodeType.SSCC_18);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)123456789012345675", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SSCC18")]
    public void test_SSCC18_testsscc18_png_SSCC18()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SSCC18\\testsscc18.png"), DecodeType.SSCC_18);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)100651234544444123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SSCC18")]
    public void test_SSCC18_numeric_png_SSCC18()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SSCC18\\numeric.png"), DecodeType.SSCC_18);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)123456789000000005", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SSCC18")]
    public void test_SSCC18_ssccbarcode_gif_SSCC18()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SSCC18\\sscc-barcode.gif"), DecodeType.SSCC_18);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)007189085627231896", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SSCC18")]
    public void test_SSCC18_asposeSSCC181_png_SSCC18()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SSCC18\\asposeSSCC181.png"), DecodeType.SSCC_18);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)789330554648088002", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SSCC18")]
    public void test_SSCC18_asposeSSCC182_png_SSCC18()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SSCC18\\asposeSSCC182.png"), DecodeType.SSCC_18);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)111870900000000007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SSCC18")]
    public void test_SSCC18_asposeSSCC183_png_SSCC18()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SSCC18\\asposeSSCC183.png"), DecodeType.SSCC_18);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)597069068589586580", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SSCC18")]
    public void test_SSCC18_images_jpg_SSCC18()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SSCC18\\images.jpg"), DecodeType.SSCC_18);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)000521775138957172", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_Standard2of5_asposeStandard2of51_png_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Standard2of5\\asposeStandard2of51.png"), DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("235767", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_Standard2of5_asposeStandard2of52_png_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Standard2of5\\asposeStandard2of52.png"), DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2111", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_Standard2of5_asposeStandard2of53_png_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Standard2of5\\asposeStandard2of53.png"), DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0003", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_Standard2of5_asposeStandard2of54_png_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Standard2of5\\asposeStandard2of54.png"), DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("111111122", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_Standard2of5_asposeStandard2of55_png_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Standard2of5\\asposeStandard2of55.png"), DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("354545", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_Standard2of5_s2of5_png_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Standard2of5\\s2of5.png"), DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456782", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_Standard2of5_bcstf_gif_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Standard2of5\\bcstf.gif"), DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("23456785", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_Standard2of5_2of51_gif_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Standard2of5\\2of5-1.gif"), DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345670", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_Standard2of5_industrial_2_of_5_png_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Standard2of5\\industrial_2_of_5.png"), DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234565", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Supplement")]
    public void test_Supplement_4_jpg_Supplement()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Supplement\\4.jpg"), DecodeType.SUPPLEMENT);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Supplement")]
    public void test_Supplement_barcodeEan1314_gif_Supplement()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Supplement\\bar-code-Ean-13-14.gif"), DecodeType.SUPPLEMENT);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("23", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Supplement")]
    public void test_Supplement_asposeSUP1_png_Supplement()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Supplement\\asposeSUP1.png"), DecodeType.SUPPLEMENT);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("34", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Supplement")]
    public void test_Supplement_asposeSUP2_png_Supplement()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Supplement\\asposeSUP2.png"), DecodeType.SUPPLEMENT);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("74531", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Supplement")]
    public void test_Supplement_asposeSUP3_png_Supplement()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Supplement\\asposeSUP3.png"), DecodeType.SUPPLEMENT);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("45659", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Supplement")]
    public void test_Supplement_barcode_gif_Supplement()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Supplement\\barcode.gif"), DecodeType.SUPPLEMENT);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Supplement")]
    public void test_Supplement_barcodeEan1317_gif_Supplement()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Supplement\\bar-code-Ean-13-17.gif"), DecodeType.SUPPLEMENT);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("23456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Supplement")]
    public void test_Supplement_ean13_sup_png_Supplement()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Supplement\\ean13_sup.png"), DecodeType.SUPPLEMENT);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_UPCA_16461_scr_png_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCA\\16461_scr.png"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("055712067018", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_UPCA_databarupca_jpg_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCA\\databar-upca.jpg"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789012", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_UPCA_UPCEAN_Overlay_png_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCA\\UPC-EAN_Overlay.png"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("012345678905", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_UPCA_UPCABarcode_png_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCA\\UPC-A-Barcode.png"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("081224651230", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_UPCA_UPCdiagram_gif_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCA\\UPCdiagram.gif"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("012000002304", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_UPCA_barcode_upca_jpg_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCA\\barcode_upca.jpg"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("016000336100", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_UPCA_UPC_A_Non_Digit_Sections_gif_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCA\\UPC_A_Non_Digit_Sections.gif"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("012345678905", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_UPCA_barcode_scanner_for_iphone_jpg_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCA\\barcode_scanner_for_iphone.jpg"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("794043848025", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_UPCA_thumb_UPC_EAN_barcode_font_gif_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCA\\thumb_UPC_EAN_barcode_font.gif"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789012", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_UPCA_barcode_jpg_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCA\\barcode.jpg"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("965258838341", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCE")]
    public void test_UPCE_gtin12upcebarcode_png_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCE\\gtin12upcebarcode.png"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234565", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCE")]
    public void test_UPCE_SelectUPCEBarcode_jpg_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCE\\Select-UPCE-Barcode.jpg"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234565", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCE")]
    public void test_UPCE_UPCESuppressionA_gif_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCE\\UPCE-Suppression-A.gif"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("02345673", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCE")]
    public void test_UPCE_0481_gif_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCE\\0481.gif"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("02242901", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCE")]
    public void test_UPCE_barcode_upce_055_ex1_png_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCE\\barcode_upce_055_ex1.png"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("05512014", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCE")]
    public void test_UPCE_UPCE654321_png_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCE\\UPC-E-654321.png"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("06543217", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCE")]
    public void test_UPCE_UPCEBarcode_jpg_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCE\\UPCEBarcode.jpg"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("04252614", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCE")]
    public void test_UPCE_barcode4_jpg_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCE\\barcode[4].jpg"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234565", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("VIN")]
    public void test_VIN_androidVinScanner1_jpg_VIN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "VIN\\androidVinScanner1.jpg"), DecodeType.VIN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("WVWAD63B35P027068", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("VIN")]
    public void test_VIN_vin002_jpg_VIN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "VIN\\vin-002.jpg"), DecodeType.VIN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1B7MF3361XJ503719", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("VIN")]
    public void test_VIN_VINbarcode2_png_VIN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "VIN\\VIN-barcode2.png"), DecodeType.VIN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1M8GDM9AXKP042788", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("VIN")]
    public void test_VIN_asposeVIN1_png_VIN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "VIN\\asposeVIN1.png"), DecodeType.VIN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("895443XR54733FE9D", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("VIN")]
    public void test_VIN_asposeVIN2_png_VIN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "VIN\\asposeVIN2.png"), DecodeType.VIN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("GFL0S8339JG3935W3", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("VIN")]
    public void test_VIN_asposeVIN3_png_VIN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "VIN\\asposeVIN3.png"), DecodeType.VIN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Y04LFD0L973599FF3", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("VIN")]
    public void test_VIN_asposeVIN4_png_VIN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "VIN\\asposeVIN4.png"), DecodeType.VIN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("LG0597847D94J09GK", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("VIN")]
    public void test_VIN_asposeVIN5_png_VIN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "VIN\\asposeVIN5.png"), DecodeType.VIN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("98FG5945798GK4K49", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("VIN")]
    public void test_VIN_asposeVIN6_png_VIN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "VIN\\asposeVIN6.png"), DecodeType.VIN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("059GLK4370HKF048G", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Code93_C93Sample_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93\\C93Sample.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("WEBSCAN", reader.getFoundBarCodes()[0].getCodeText());
            BaseDecodeType expectedType = DecodeType.scanSets(DecodeType.CODE_93, DecodeType.CODE_93);
            Assert.assertTrue(expectedType.containsAny(reader.getFoundBarCodes()[0].getCodeType()));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Code93_code93_abc123456789_gif_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93\\code93_abc123456789.gif"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABC1234567890", reader.getFoundBarCodes()[0].getCodeText());
            BaseDecodeType expectedType = DecodeType.scanSets(DecodeType.CODE_93, DecodeType.CODE_93);
            Assert.assertTrue(expectedType.containsAny(reader.getFoundBarCodes()[0].getCodeType()));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Code93_code93barcode_gif_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93\\code93-barcode.gif"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("CODE 93", reader.getFoundBarCodes()[0].getCodeText());
            BaseDecodeType expectedType = DecodeType.scanSets(DecodeType.CODE_93, DecodeType.CODE_93);
            Assert.assertTrue(expectedType.containsAny(reader.getFoundBarCodes()[0].getCodeType()));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Code93_code93_gif_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93\\code93.gif"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
            BaseDecodeType expectedType = DecodeType.scanSets(DecodeType.CODE_93, DecodeType.CODE_93);
            Assert.assertTrue(expectedType.containsAny(reader.getFoundBarCodes()[0].getCodeType()));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Code93_code93sample_gif_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93\\code93-sample.gif"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("505 Consumers Road", reader.getFoundBarCodes()[0].getCodeText());
            BaseDecodeType expectedType = DecodeType.scanSets(DecodeType.CODE_93, DecodeType.CODE_93);
            Assert.assertTrue(expectedType.containsAny(reader.getFoundBarCodes()[0].getCodeType()));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Code93_Barcode4_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93\\Barcode4.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("DATA", reader.getFoundBarCodes()[0].getCodeText());
            BaseDecodeType expectedType = DecodeType.scanSets(DecodeType.CODE_93, DecodeType.CODE_93);
            Assert.assertTrue(expectedType.containsAny(reader.getFoundBarCodes()[0].getCodeType()));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Code93_Code93Barcode_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93\\Code93Barcode.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678", reader.getFoundBarCodes()[0].getCodeText());
            BaseDecodeType expectedType = DecodeType.scanSets(DecodeType.CODE_93, DecodeType.CODE_93);
            Assert.assertTrue(expectedType.containsAny(reader.getFoundBarCodes()[0].getCodeType()));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Code93_Code93D_bmp_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93\\Code93-D.bmp"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            BaseDecodeType expectedType = DecodeType.scanSets(DecodeType.CODE_93, DecodeType.CODE_93);
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("DATA200001115", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(expectedType.containsAny(reader.getFoundBarCodes()[0].getCodeType()));
            Assert.assertEquals("DATA200001116", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertTrue(expectedType.containsAny(reader.getFoundBarCodes()[1].getCodeType()));
        }
    }
}
