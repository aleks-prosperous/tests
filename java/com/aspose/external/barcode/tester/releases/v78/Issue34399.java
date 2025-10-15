package com.aspose.external.barcode.tester.releases.v78;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test
public class Issue34399
{
    final String folder = Global.getTestDataFolder("Issues/Issue34399");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void test_Issue34399_code39_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "code39.png"), DecodeType.CODE_39);
        reader.getQualitySettings().setXDimension( XDimensionMode.SMALL);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("3PRM8N", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("3PRM8N", reader.getFoundBarCodes()[1].getCodeText());
    }

        @Test
    public void test_Issue34399_Datamatrix12_jpg_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Datamatrix12.jpg"), DecodeType.GS_1_DATA_MATRIX);
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Wikipedia on erinomainen tietosanakirja, josta löytyy paljon tietoa mm. viivakood" +
                    "eista.", reader.getFoundBarCodes()[0].getCodeText());
    }
}
