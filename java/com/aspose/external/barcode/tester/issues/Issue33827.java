package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33827.")
public class Issue33827
{
    private final String folder = Global.
            getTestDataFolder("Issues" + File.separator + "Issue33827");

    @BeforeMethod
    public void setUp(Method testMethod)
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void testRotatedCutted()
    {
        List<String> values = new ArrayList<String>();
        List<BaseDecodeType> types = new ArrayList<BaseDecodeType>();

        String fileName = Global.pathCombine(folder, "cutted_and_rotated.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX, DecodeType.CODE_128);
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                types.add(result.getCodeType());
                values.add(result.getCodeText());
            }

            Assert.assertEquals(2, values.size());
            Assert.assertTrue(types.contains(DecodeType.DATA_MATRIX));
            Assert.assertTrue(types.contains(DecodeType.CODE_128));
            Assert.assertTrue(values.get(types.indexOf(DecodeType.DATA_MATRIX)).contains("AZ000000199139"));
            Assert.assertTrue(values.get(types.indexOf(DecodeType.CODE_128)).contains("AZ000000199139"));
        }
    }

        @Test
    public void testAsIs()
    {
        List<String> values = new ArrayList<String>();
        List<BaseDecodeType> types = new ArrayList<BaseDecodeType>();

        String fileName = Global.pathCombine(folder, "00000010_00000003_2.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX, DecodeType.CODE_128);
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                types.add(result.getCodeType());
                values.add(result.getCodeText());
            }

            // Code128 found but not absolutely right"
            Assert.assertEquals(2, values.size(), "It is ok now.");
            //Assert.assertEquals(1, values.size());
            Assert.assertTrue(types.contains(DecodeType.DATA_MATRIX), "It is ok now.");
            Assert.assertTrue(values.get(types.indexOf(DecodeType.DATA_MATRIX)).contains("AZ000000199139"));
            Assert.assertTrue(values.get(types.indexOf(DecodeType.CODE_128)).contains("AZ000000199139"));

        }
    }
}

