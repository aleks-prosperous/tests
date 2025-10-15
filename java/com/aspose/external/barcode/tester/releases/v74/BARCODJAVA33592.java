package com.aspose.external.barcode.tester.releases.v74;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class BARCODJAVA33592
{
    String folder = Global.getBarcodeJavaIssuesTestImagePath("BARCODJAVA33592");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        String expectedTypeName = "DataMatrix";
        String expectedResult = "doc:3f820419c87d4a878bafd17d2add8d2d009";
        BarCodeReader reader = new BarCodeReader(folder + "image0.jpg", DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        BarCodeResult[] results =  reader.readBarCodes();
        {
            System.out.println(results[0].getCodeTypeName() + " : " + results[0].getCodeText());
            Assert.assertEquals(results[0].getCodeText(), expectedResult);
            Assert.assertEquals(results[0].getCodeTypeName(), expectedTypeName);
        }
    }
}
