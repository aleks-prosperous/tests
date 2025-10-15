package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue34297
{
    final String _folder = Global.getTestDataFolder("Issues/");

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Issue34297_image0_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue34297/image0.jpg"), DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("doc:3f820419c87d4a878bafd17d2add8d2d009", reader.getFoundBarCodes()[0].getCodeText());
    }
}
