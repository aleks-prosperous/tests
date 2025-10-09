package com.aspose.external.barcode.tester;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Recognition1DReadOnly
{

    private String _folder;

    @BeforeMethod
    public void setupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Recognition\\1D\\");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_Code11_img_gif_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\Code11_img.gif"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Code11_Code1102_gif_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code11\\Code1102.gif"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_EAN13_ean13_barcode_label_jpg_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN13\\ean13_barcode_label.jpg"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("ISMN")]
    public void test_ISMN_images_jpg_ISMN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISMN\\images.jpg"), DecodeType.ISMN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Supplement")]
    public void test_Supplement_sample_bar_code_jpg_Supplement()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Supplement\\sample_bar_code.jpg"), DecodeType.SUPPLEMENT);
        {
            //barcode has incorrect structure for Supplement
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Supplement")]
    public void test_Supplement_13_barcode07_gif_Supplement()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Supplement\\13_barcode07.gif"), DecodeType.SUPPLEMENT);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }
}
