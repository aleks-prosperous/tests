package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33788.")
public class Issue33788
{
    String folder = Global.getIssuesTestImagePath(this.getClass().getSimpleName());


    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test01()
    {
        List<String> values = new ArrayList<String>();
        List<BaseDecodeType> types = new ArrayList<BaseDecodeType>();

        String fileName = Global.pathCombine(folder, "01.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX, DecodeType.CODE_128);
        try
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                types.add(result.getCodeType());
                values.add(result.getCodeText());
            }

            Assert.assertEquals(4, values.size());

            Assert.assertTrue(values.contains("WAW"));
            Assert.assertTrue(values.contains("7530009720911"));

            int ctcount = 0;
            for (String s : (Iterable<String>) values)
            {
                if ("KAZ00000155654".equals(s))
                {
                    ctcount++;
                }
            }
            Assert.assertEquals(2, ctcount);

            Assert.assertTrue(types.contains(DecodeType.DATA_MATRIX));

            int c128count = 0;
            for (BaseDecodeType s : (Iterable<BaseDecodeType>) types)
            {
                if (s == DecodeType.CODE_128)
                {
                    c128count++;
                }
            }
            Assert.assertEquals(3, c128count);
        } finally
        {
        }
    }
}

