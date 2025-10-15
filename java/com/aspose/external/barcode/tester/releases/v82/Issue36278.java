package com.aspose.external.barcode.tester.releases.v82;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.aspose.barcode.barcoderecognition.RecognitionHints;


public class Issue36278
{
    final String _folder = Global.getTestDataFolder("Issues/");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Issue36278_barcode_ab11_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36278\\barcode_ab-1-1.png"), DecodeType.POSTNET);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("21842", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Issue36278_barcode_ab11_png_Postnet2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36278\\barcode_ab-1-1.png"), DecodeType.POSTNET);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("21842", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Issue36278_barcode_ab11_png_Postnet3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36278\\barcode_ab-1-1.png"), DecodeType.POSTNET);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("21842", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Issue36278_barcode_ab11_png_Postnet4()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36278\\barcode_ab-1-1.png"), DecodeType.POSTNET);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("21842", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Issue36278_barcode_ab11_cut_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36278\\barcode_ab-1-1_cut.png"), DecodeType.POSTNET);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("21842", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Issue36278_postnet2_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36278\\postnet2.png"), DecodeType.POSTNET);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("56789", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Issue36278_postnet2_rot_002_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36278\\postnet2_rot_002.png"), DecodeType.POSTNET);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("56789", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Issue36278_postnet2_rot002_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36278\\postnet2_rot002.png"), DecodeType.POSTNET);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("56789", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Issue36278_postnet2_rot088_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36278\\postnet2_rot088.png"), DecodeType.POSTNET);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("56789", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Issue36278_postnet2_rot090_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36278\\postnet2_rot090.png"), DecodeType.POSTNET);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("56789", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Issue36278_postnet2_rot092_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36278\\postnet2_rot092.png"), DecodeType.POSTNET);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("56789", reader.getFoundBarCodes()[0].getCodeText());
    }
}
