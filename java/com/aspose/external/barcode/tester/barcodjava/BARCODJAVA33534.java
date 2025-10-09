package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BARCODJAVA33534
{
    private static final String testFolder = Global.getBarcodeJavaIssuesTestImagePath("BARCODJAVA33534/");

    @BeforeMethod
    public void setUpLicense()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }


    @Test
    public void test34137()
    {
        String[] ethalonData = new String[]
                {
                        "201402251343757",
                        "201402251343803",
                        "201402251343829",
                        "201402251343799",
                        "201402251343861",
                        "201402251343887",
                        "201402251343773",
                        "201402251343744",
                        "201402251343845",
                        "201402251343816",
                        "201402251343760",
                        "201402251343874",
                        "201402251343858",
                        "201402251343832",
                        "201402251343786",
                        "201402251343861",
                        "201402251343887",
                        "201402251343829",
                        "201402251343799",
                        "201402251343773",
                        "201402251343757",
                        "201402251343803",
                        "201402251343744",
                        "201402251343874",
                        "201402251343845",
                        "201402251343760",
                        "201402251343832",
                        "201402251343816",
                        "201402251343858",
                        "201402251343786"
                };

        String file = testFolder + "\\DOC00000012.tif";
        testReader(file, new MultyDecodeType(DecodeType.DATA_MATRIX, DecodeType.CODE_128), ethalonData);
    }

    private void testReader(String path, BaseDecodeType readType, String[] expectedCodes)
    {
        BarCodeReader reader = new BarCodeReader(path, readType);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        testReader(reader, expectedCodes);
    }

    private void testReader(BarCodeReader reader, String[] expectedCodes)
    {
        List<String> actualCodes = new ArrayList<>();
        for (BarCodeResult result : reader.readBarCodes())
        {
            actualCodes.add(result.getCodeText());
        }
        Assert.assertEquals(expectedCodes.length, actualCodes.size());
        for (int i = 0; i < expectedCodes.length; i++)
        {
            Assert.assertTrue(actualCodes.contains(expectedCodes[i]));
        }
    }
}
