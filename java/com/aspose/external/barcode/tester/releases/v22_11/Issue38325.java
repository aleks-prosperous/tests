package com.aspose.external.barcode.tester.releases.v22_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

@Test
public class Issue38325
{
    private String _folder;

    @BeforeMethod
    public void setUp() {
        this._folder = Global.getTestDataFolder("Issues");
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Issue338325_LowQuality2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue38325/LowQuality2.jpg"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(reader.getFoundBarCodes()[0].getCodeText(), "[)>01968011300008400031Z40216252UPSNX647W5075'7F,4+:,50IOZYD'GSFD\"S*LR&64.RGH*0FXJ+\"DNS\n\u001e\u0004");
        }
    }

    @Test
    public void test_Issue38325_LowQualityRotated()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue38325/LowQualityRotated.jpg"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(reader.getFoundBarCodes()[0].getCodeText(), "[)>0196NG85NL8260681Z69879332UPSN6F5Y310791/11N119 BROXTONOTTINGHAM");
        }
    }

    @Test
    public void test_Issue38325_ScreenWithNoises()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue38325/ScreenWithNoises.jpg"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(reader.getFoundBarCodes()[0].getCodeText(), "Wikipedia, the free encyclopedia");
        }
    }

    @Test
    public void test_Issue38325_Document()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue38325/Document.jpg"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(reader.getFoundBarCodes()[0].getCodeText(), "[)>019636821 4840041Z96628065UPSNA780E10671/120NCAMINO REAL DE LO DEGU");
        }
    }

    @Test
    public void test_Issue38325_Small3dDistortion()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue38325/Small3dDistortion.jpg"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(reader.getFoundBarCodes()[0].getCodeText(), "[)>0196NG85NL8260681Z00262475UPSNE5991R1821/11NNOTTINGHAM");
        }
    }

    @Test
    public void test_Issue38325_FourCodes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue38325/FourCodes.png"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 4);
            Assert.assertEquals(reader.getFoundBarCodes()[0].getCodeText(), "In order to fit a non-square area or to handle larger messages than a");
            Assert.assertEquals(reader.getFoundBarCodes()[1].getCodeText(), "re practical in a single symbol, a data message can be distributed ac");
            Assert.assertEquals(reader.getFoundBarCodes()[2].getCodeText(), "ross several symbols. Aztec, Code 16K, DataMatrix, MaxiCode, QR Code,");
            Assert.assertEquals(reader.getFoundBarCodes()[3].getCodeText(), " PDF417, Micro PDF417 symbols may be appended in a structured format.");
        }
    }

    @Test
    public void test_Issue38325_LowQuality()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue38325/LowQuality.jpg"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(reader.getFoundBarCodes()[0].getCodeText(), "[)>01967990718578400061Z83474086UPSN1W81R52641/11N8700 CASTNER DR SUITE BEL PASOTX");
        }
    }

    @Test
    public void test_Issue38325_WithUnwantedLines()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue38325/WithUnwantedLines.png"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(reader.getFoundBarCodes()[0].getCodeText(), "[)>01963032814838400011Z12345675UPSN123X561871/137Y123567GA");
        }
    }

    @Test
    public void test_Issue38325_FourCodesRotated()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue38325/FourCodesRotated.png"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 4);
            Assert.assertEquals(reader.getFoundBarCodes()[0].getCodeText(), "ross several symbols. Aztec, Code 16K, DataMatrix, MaxiCode, QR Code,");
            Assert.assertEquals(reader.getFoundBarCodes()[1].getCodeText(), "In order to fit a non-square area or to handle larger messages than a");
            Assert.assertEquals(reader.getFoundBarCodes()[2].getCodeText(), " PDF417, Micro PDF417 symbols may be appended in a structured format.");
            Assert.assertEquals(reader.getFoundBarCodes()[3].getCodeText(), "re practical in a single symbol, a data message can be distributed ac");
        }
    }
}
