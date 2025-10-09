package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseProcessorsReadOnly
{

    private String _folder;

    @BeforeMethod
    public void setupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Recognition");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    //[Category("EAN13")]
    public void test_MBaseProcessor_FromInternet_EAN13_666_barcodecolormap_gif_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MBaseProcessor\\FromInternet\\EAN13\\666_barcodecolormap.gif"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertNotEquals("012345678900", reader.getFoundBarCodes()[0].getExtended().getOneD().getValue());
        }
    }

    @Test
    //[Category("EAN13")]
    public void test_MBaseProcessor_FromInternet_EAN13_barcode_ean13_gif_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MBaseProcessor\\FromInternet\\EAN13\\barcode_ean13.gif"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("EAN13")]
    public void test_MBaseProcessor_FromInternet_EAN13_ean13_barcode_label_jpg_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MBaseProcessor\\FromInternet\\EAN13\\ean13_barcode_label.jpg"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("ISBN")]
    public void test_MBaseProcessor_FromInternet_ISBN_acwbarcode_gif_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MBaseProcessor\\FromInternet\\ISBN\\acwbarcode.gif"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("ISBN")]
    public void test_MBaseProcessor_FromInternet_ISBN_backcover_jpg_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MBaseProcessor\\FromInternet\\ISBN\\back-cover.jpg"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("ISBN")]
    public void test_MBaseProcessor_FromInternet_ISBN_Bookland_gif_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MBaseProcessor\\FromInternet\\ISBN\\Bookland.gif"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    public void test_MBaseProcessor_FromInternet_ISBN_booklnd2_gif_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MBaseProcessor\\FromInternet\\ISBN\\booklnd2.gif"), DecodeType.ISBN);
        {
            BarCodeResult[] res = reader.readBarCodes();
            Assert.assertEquals(1, res.length);
            Assert.assertEquals("9781556156786", res[0].getCodeText());
        }
    }

    @Test
    //[Category("ISSN")]
    public void test_MBaseProcessor_FromInternet_ISSN_qikan03_clip_image002_gif_ISSN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MBaseProcessor\\FromInternet\\ISSN\\qikan03_clip_image002.gif"), DecodeType.ISSN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("AllSupportedTypes")]
    public void test_MBaseProcessor_FromInternet_UPCA_sunrise2005_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MBaseProcessor\\FromInternet\\UPCA\\sunrise-2005.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("UPCA")]
    public void test_MBaseProcessor_FromInternet_UPCA_untitled2_bmp_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MBaseProcessor\\FromInternet\\UPCA\\untitled2.bmp"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("UPCA")]
    public void test_MBaseProcessor_FromInternet_UPCA_UPCverA_gif_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MBaseProcessor\\FromInternet\\UPCA\\UPCverA.gif"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("Code128")]
    public void test_NBaseProcessor_Code128_577c01b7b6e9001765b9a8e25f681c0e_gif_gif_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "NBaseProcessor\\Code128\\577c01b7b6e9001765b9a8e25f681c0e_gif.gif"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("Code93Extended_Code93Standard")]
    public void test_NBaseProcessor_Code93_Code93_png_Code93Extended_Code93Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "NBaseProcessor\\Code93\\Code93.png"), DecodeType.scanSets(DecodeType.CODE_93, DecodeType.CODE_93));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("Code93Extended_Code93Standard")]
    public void test_NBaseProcessor_Code93_code93extended_gif_Code93Extended_Code93Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "NBaseProcessor\\Code93\\code93extended.gif"), DecodeType.scanSets(DecodeType.CODE_93, DecodeType.CODE_93));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("UPCE")]
    public void test_NBaseProcessor_UPCE_bcupce_gif_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "NBaseProcessor\\UPCE\\bcupce.gif"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("UPCE")]
    public void test_NBaseProcessor_UPCE_UPC_20E_jpg_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "NBaseProcessor\\UPCE\\UPC%20E.jpg"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("UPCE")]
    public void test_NBaseProcessor_UPCE_bytescout_barcode_reader_sdk_247437_jpg_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "NBaseProcessor\\UPCE\\bytescout_barcode_reader_sdk_247437.jpg"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("Codabar")]
    public void test_WBaseProcessor_Codabar_0_png_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "WBaseProcessor\\Codabar\\0.png"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("Codabar")]
    public void test_WBaseProcessor_Codabar_articlenew_ehow_images_a06_tq_n8_fdabarcodespecifications1_1800x800_jpg_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "WBaseProcessor\\Codabar\\article-new_ehow_images_a06_tq_n8_fda-barcode-specifications-1_1-800x800.jpg"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("Codabar")]
    public void test_WBaseProcessor_Codabar_codabar7_jpg_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "WBaseProcessor\\Codabar\\codabar7.jpg"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("Codabar")]
    public void test_WBaseProcessor_Codabar_moroviacodabarbarcodefontware392_jpg_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "WBaseProcessor\\Codabar\\morovia-codabar-barcode-fontware-392.jpg"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("Code11")]
    public void test_WBaseProcessor_Code11_barcodesoft_bmp_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "WBaseProcessor\\Code11\\barcodesoft.bmp"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

    @Test
    //[Category("Code11")]
    public void test_WBaseProcessor_Code11_code11barcodefontscreenshot_jpg_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "WBaseProcessor\\Code11\\code-11-barcode-font-screenshot.jpg"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }
}
